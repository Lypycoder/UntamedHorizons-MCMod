package net.kaupenjoe.tutorialmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shinysquare.untamedhorizons.UntamedHorizons;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = UntamedHorizons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new net.shinysquare.untamedhorizons.datagen.ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), net.shinysquare.untamedhorizons.datagen.ModLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new net.shinysquare.untamedhorizons.datagen.ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new net.shinysquare.untamedhorizons.datagen.ModItemModelProvider(packOutput, existingFileHelper));

        net.kaupenjoe.tutorialmod.datagen.ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new net.shinysquare.untamedhorizons.datagen.ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new net.shinysquare.untamedhorizons.datagen.ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}

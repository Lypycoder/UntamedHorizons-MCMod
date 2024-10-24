package net.shinysquare.untamedhorizons.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shinysquare.untamedhorizons.UntamedHorizons;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UntamedHorizons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UH_ORES = CREATIVE_MODE_TABS.register("uh_ores",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLAWED_RUBY.get()))
                    .title(Component.translatable("untamedhorizons.creativetab.uh_ores"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.FLAWED_RUBY.get());
                        pOutput.accept(ModItems.ROUGH_RUBY.get());
                        pOutput.accept(ModItems.FINE_RUBY.get());
                        pOutput.accept(ModItems.FLAWLESS_RUBY.get());
                        pOutput.accept(ModItems.PERFECT_RUBY.get());

                        pOutput.accept(ModItems.FLAWED_SAPPHIRE.get());
                        pOutput.accept(ModItems.ROUGH_SAPPHIRE.get());
                        pOutput.accept(ModItems.FINE_SAPPHIRE.get());
                        pOutput.accept(ModItems.FLAWLESS_SAPPHIRE.get());
                        pOutput.accept(ModItems.PERFECT_SAPPHIRE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}



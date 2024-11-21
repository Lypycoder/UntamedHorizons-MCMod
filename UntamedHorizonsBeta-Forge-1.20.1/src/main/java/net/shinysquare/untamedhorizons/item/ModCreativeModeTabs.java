package net.shinysquare.untamedhorizons.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shinysquare.untamedhorizons.UntamedHorizons;
import net.shinysquare.untamedhorizons.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UntamedHorizons.MOD_ID);

    public static final RegistryObject<CreativeModeTab>GEMSTONE_TAB = CREATIVE_MODE_TABS.register("gemstones",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLAWED_RUBY.get()))
                    .title(Component.translatable("untamedhorizons.creativetab.gemstone_tab"))
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

                        pOutput.accept(ModItems.FLAWED_TOPAZ.get());
                        pOutput.accept(ModItems.ROUGH_TOPAZ.get());
                        pOutput.accept(ModItems.FINE_TOPAZ.get());
                        pOutput.accept(ModItems.FLAWLESS_TOPAZ.get());
                        pOutput.accept(ModItems.PERFECT_TOPAZ.get());

                        pOutput.accept(ModItems.FLAWED_JADE.get());
                        pOutput.accept(ModItems.ROUGH_JADE.get());
                        pOutput.accept(ModItems.FINE_JADE.get());
                        pOutput.accept(ModItems.FLAWLESS_JADE.get());
                        pOutput.accept(ModItems.PERFECT_JADE.get());

                    })
                    .build());

    /*public static final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("more_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANGO.get()))
                    .title(Component.translatable("untamedhorizons.creativetab.foob_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.MANGO.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.BANANA.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab>BLOCK_TAB = CREATIVE_MODE_TABS.register("more_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLAWED_RUBY.get()))
                    .title(Component.translatable("untamedhorizons.creativetab.block_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.HARDSTONE.get());

                    })
                    .build());
public static final RegistryObject<CreativeModeTab>TOOL_TAB = CREATIVE_MODE_TABS.register("more_tools",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_SWORD.get()))
                .title(Component.translatable("untamedhorizons.creativetab.tool_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                    pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                    pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                    pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                    pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
                    pOutput.accept(ModItems.SAPPHIRE_SWORD.get());

                })
                .build());
*/
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


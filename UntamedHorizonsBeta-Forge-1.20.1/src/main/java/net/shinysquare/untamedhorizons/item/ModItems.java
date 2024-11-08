package net.shinysquare.untamedhorizons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shinysquare.untamedhorizons.UntamedHorizons;
import net.shinysquare.untamedhorizons.item.custom.FLAWEDGEMSTONEItem;
import net.shinysquare.untamedhorizons.item.custom.ROUGHGEMSTONEItem;
import net.shinysquare.untamedhorizons.item.custom.FINEGEMSTONEItem;
import net.shinysquare.untamedhorizons.item.custom.FLAWLESSGEMSTONEItem;
import net.shinysquare.untamedhorizons.item.custom.PERFECTGEMSTONEItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UntamedHorizons.MOD_ID);

    public static final RegistryObject<Item> FLAWED_RUBY = ITEMS.register("flawed_ruby",
            FLAWEDGEMSTONEItem::new);
    public static  final RegistryObject<Item> ROUGH_RUBY = ITEMS.register("rough_ruby",
            ROUGHGEMSTONEItem::new);
    public static  final RegistryObject<Item> FINE_RUBY = ITEMS.register("fine_ruby",
            FINEGEMSTONEItem::new);
    public static  final RegistryObject<Item> FLAWLESS_RUBY = ITEMS.register("flawless_ruby",
            FLAWLESSGEMSTONEItem::new);
    public static  final RegistryObject<Item> PERFECT_RUBY = ITEMS.register("perfect_ruby",
            PERFECTGEMSTONEItem::new);

    public static final RegistryObject<Item> FLAWED_SAPPHIRE = ITEMS.register("flawed_sapphire",
            FLAWEDGEMSTONEItem::new);
    public static  final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register("rough_sapphire",
            ROUGHGEMSTONEItem::new);
    public static  final RegistryObject<Item> FINE_SAPPHIRE = ITEMS.register("fine_sapphire",
            FINEGEMSTONEItem::new);
    public static  final RegistryObject<Item> FLAWLESS_SAPPHIRE = ITEMS.register("flawless_sapphire",
            FLAWLESSGEMSTONEItem::new);
    public static  final RegistryObject<Item> PERFECT_SAPPHIRE = ITEMS.register("perfect_sapphire",
            PERFECTGEMSTONEItem::new);

    public static final RegistryObject<Item> FLAWED_TOPAZ = ITEMS.register("flawed_topaz",
            FLAWEDGEMSTONEItem::new);
    public static  final RegistryObject<Item> ROUGH_TOPAZ = ITEMS.register("rough_topaz",
            ROUGHGEMSTONEItem::new);
    public static  final RegistryObject<Item> FINE_TOPAZ = ITEMS.register("fine_topaz",
            FINEGEMSTONEItem::new);
    public static  final RegistryObject<Item> FLAWLESS_TOPAZ = ITEMS.register("flawless_topaz",
            FLAWLESSGEMSTONEItem::new);
    public static  final RegistryObject<Item> PERFECT_TOPAZ = ITEMS.register("perfect_topaz",
            PERFECTGEMSTONEItem::new);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
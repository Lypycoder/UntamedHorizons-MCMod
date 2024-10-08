package net.shinysquare.untamedhorizons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shinysquare.untamedhorizons.UntamedHorizons;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UntamedHorizons.MOD_ID);

    public static final RegistryObject<Item> FLAWED_RUBY = ITEMS.register("flawed_ruby",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> ROUGH_RUBY = ITEMS.register("rough_ruby",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> FINE_RUBY = ITEMS.register("fine_ruby",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> FLAWLESS_RUBY = ITEMS.register("flawless_ruby",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> PERFECT_RUBY = ITEMS.register("perfect_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLAWED_SAPPHIRE = ITEMS.register("flawed_sapphire",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register("rough_sapphire",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> FINE_SAPPHIRE = ITEMS.register("fine_sapphire",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> FLAWLESS_SAPPHIRE = ITEMS.register("flawless_sapphire",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> PERFECT_SAPPHIRE = ITEMS.register("perfect_sapphire",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
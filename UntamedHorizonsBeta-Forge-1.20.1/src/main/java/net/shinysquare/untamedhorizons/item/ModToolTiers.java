package net.shinysquare.untamedhorizons.item;

import net.shinysquare.untamedhorizons.UntamedHorizons;
import net.shinysquare.untamedhorizons.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 500, 10f, 20f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(UntamedHorizons.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());


}

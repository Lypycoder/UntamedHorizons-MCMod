package net.shinysquare.untamedhorizons.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();
    public static final FoodProperties MANGO = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 0.1f).build();
    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.SATURATION,200), 0.9f).build();
}
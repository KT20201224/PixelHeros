package net.kyoungtae.pixelheros.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2)
            .fast()
            .saturationMod(5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300), 0.5f) // pDuration: 효과 지속시간, probability: 발동 확률
            .build();

}

package com.linuxabuser.micicraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents
{
    public static final FoodComponent ITEM_MIC = new FoodComponent.Builder()
            .snack()
            .nutrition(2)
            .saturationModifier(0.2f)
            .build();

    public static final FoodComponent ITEM_MIC_RAW = new FoodComponent.Builder()
            .snack()
            .nutrition(1)
            .saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 0), 0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 300, 0), 0.3f)
            .build();
}

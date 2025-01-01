package com.imxiaoanag.xiaoanmooncake.item;

import net.minecraft.component.type.FoodComponent;

public class MFFoodComponents {
    public static final FoodComponent LOTUS_SEED = new FoodComponent.Builder().nutrition(4).saturationModifier(0.8f).build();

    public static final FoodComponent MOONCAKE_LESS = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).build();
    public static final FoodComponent MOONCAKE_NORMAL = new FoodComponent.Builder().nutrition(6).saturationModifier(1.0f).build();
}

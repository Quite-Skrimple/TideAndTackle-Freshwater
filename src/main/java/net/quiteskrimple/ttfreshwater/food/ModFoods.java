package net.quiteskrimple.ttfreshwater.food;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties RAW_BLUEGILL = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();

    public static final Consumable RAW_BLUEGILL_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6f).build();
}

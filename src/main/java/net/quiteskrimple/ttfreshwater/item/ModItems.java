package net.quiteskrimple.ttfreshwater.item;

import java.util.function.Function;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.quiteskrimple.ttfreshwater.TTFreshwater;
import net.quiteskrimple.ttfreshwater.food.ModFoods;

public class ModItems {
    // Raw Foods
    public static final Item RAW_BLUEGILL = registerItem("raw_bluegill", properties -> new Item(properties.food(ModFoods.RAW_BLUEGILL, ModFoods.RAW_BLUEGILL_CONSUMABLE)));
    
    
    // Cooked Foods
    public static final Item COOKED_BLUEGILL = registerItem("cooked_bluegill", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TTFreshwater.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TTFreshwater.MOD_ID, name)))));
    }

    public static void registerModItems() {
        TTFreshwater.LOGGER.info("Registering Mod Items for " + TTFreshwater.MOD_ID);

        // Raw Foods
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> output.accept(RAW_BLUEGILL));
        
        // Cooked Foods
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> output.accept(COOKED_BLUEGILL));

    }

}


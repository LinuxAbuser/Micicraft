package com.linuxabuser.micicraft.item;

import com.linuxabuser.micicraft.Micicraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item ITEM_MIC = registerItem("item_mic", new Item(new Item.Settings().food(ModFoodComponents.ITEM_MIC)));
    public static final Item ITEM_MIC_RAW = registerItem("item_mic_raw", new Item(new Item.Settings().food(ModFoodComponents.ITEM_MIC_RAW)));
    public static final Item ITEM_GROUND_BEEF = registerItem("item_ground_beef", new Item(new Item.Settings()));
    public static final Item ITEM_GROUND_PORK = registerItem("item_ground_pork", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(Micicraft.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Micicraft.LOGGER.info("Registering mod items for " + Micicraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->
        {
            entries.add(ITEM_MIC);
            entries.add(ITEM_MIC_RAW);
            entries.add(ITEM_GROUND_BEEF);
            entries.add(ITEM_GROUND_PORK);
        });
    }
}

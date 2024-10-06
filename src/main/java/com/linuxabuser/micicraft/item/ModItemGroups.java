package com.linuxabuser.micicraft.item;

import com.linuxabuser.micicraft.Micicraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup MICICRAFT_ITEMS_GROUP = Registry.register
    (
        Registries.ITEM_GROUP, Identifier.of(Micicraft.MOD_ID, "micicraft_items"),
        FabricItemGroup
                .builder()
                .icon(() -> new ItemStack(ModItems.ITEM_MIC))
                .displayName(Text.translatable("itemgroup.micicraft.micicraft_items"))
                .entries((displayContext, entries) ->
                {
                    entries.add(ModItems.ITEM_MIC_RAW);
                    entries.add(ModItems.ITEM_MIC);
                })
                .build()
    );

    public static final ItemGroup MICICRAFT_BLOCKS_GROUP = Registry.register
    (
        Registries.ITEM_GROUP, Identifier.of(Micicraft.MOD_ID, "micicraft_blocks"),
        FabricItemGroup
                .builder()
                //TODO: Add icon for Micicraft blocks: .icon(() -> new ItemStack((ModItems.GRATAR?)));
                .displayName(Text.translatable("itemgroup.micicraft.micicraft_blocks"))
                .build()
    );

    public static void registerItemGroups()
    {
        Micicraft.LOGGER.info("Registering Item Groups for " + Micicraft.MOD_ID);
    }
}

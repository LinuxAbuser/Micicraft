package com.linuxabuser.micicraft.block;

import com.linuxabuser.micicraft.Micicraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block BLOCK_GRATAR =  registerBlock
    (
        "block_gratar",
        new BlockGratar
        (
            AbstractBlock
            .Settings
            .create()
            .mapColor(MapColor.IRON_GRAY)
            .strength(5f, 1200f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .pistonBehavior(PistonBehavior.BLOCK)
        )
    );

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);

        return Registry.register
        (
            Registries.BLOCK, Identifier.of(Micicraft.MOD_ID, name), block
        );
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register
        (
            Registries.ITEM, Identifier.of(Micicraft.MOD_ID, name), new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks()
    {
        Micicraft.LOGGER.info("Registering Mod Blocks for " + Micicraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries ->
        {
            entries.add(ModBlocks.BLOCK_GRATAR);
        });
    }
}

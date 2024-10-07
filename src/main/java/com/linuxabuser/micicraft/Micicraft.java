package com.linuxabuser.micicraft;

import com.linuxabuser.micicraft.block.ModBlocks;
import com.linuxabuser.micicraft.item.ModItemGroups;
import com.linuxabuser.micicraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Micicraft implements ModInitializer
{
	public static final String MOD_ID = "micicraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
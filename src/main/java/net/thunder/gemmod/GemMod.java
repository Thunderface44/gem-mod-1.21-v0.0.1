package net.thunder.gemmod;

import net.fabricmc.api.ModInitializer;

import net.thunder.gemmod.block.ModBlocks;
import net.thunder.gemmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemMod implements ModInitializer {
	public static final String MOD_ID = "gemmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
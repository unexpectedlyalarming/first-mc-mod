package unexpectedlyalarming.firstmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import unexpectedlyalarming.firstmod.item.ModItemGroups;
import unexpectedlyalarming.firstmod.item.ModItems;
import unexpectedlyalarming.firstmod.block.ModBlocks;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "first-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
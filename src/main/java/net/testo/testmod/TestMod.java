package net.testo.testmod;

import net.fabricmc.api.ModInitializer;

import net.testo.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "prueba";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Niggers!");
        ModItems.registerModItems();
	}
}
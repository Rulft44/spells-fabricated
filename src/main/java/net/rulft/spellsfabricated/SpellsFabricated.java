package net.rulft.spellsfabricated;

import net.fabricmc.api.ModInitializer;

import net.rulft.spellsfabricated.init.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpellsFabricated implements ModInitializer {
	public static final String MOD_ID = "spellsfabricated";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Erm 🤓");

		ModItems.registerBooks();
	}
}
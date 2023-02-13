package com.clarkster.animated_armor;

import com.clarkster.animated_armor.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AnimatedArmorMod implements ModInitializer {
	public static final String MOD_ID = "animated_armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

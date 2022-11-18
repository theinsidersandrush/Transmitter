package com.theinsidersandrush.transmitter;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.theinsidersandrush.transmitter.block.ModBlocks;
import com.theinsidersandrush.transmitter.item.ModItems;

public class Transmitter implements ModInitializer {
	public static final String MOD_ID = "transmitter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}

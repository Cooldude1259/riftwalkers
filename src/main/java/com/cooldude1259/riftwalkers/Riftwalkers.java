package com.cooldude1259.riftwalkers;

import com.cooldude1259.riftwalkers.block.ModBlocks;
import com.cooldude1259.riftwalkers.worldgen.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Riftwalkers implements ModInitializer {
	public static final String MOD_ID = "riftwalkers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing riftwalkers...");
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

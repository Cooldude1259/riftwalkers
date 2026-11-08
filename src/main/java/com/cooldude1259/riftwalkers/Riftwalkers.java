package com.cooldude1259.riftwalkers;

import com.cooldude1259.riftwalkers.block.ModBlocks;
import com.cooldude1259.riftwalkers.creativemodetab.ModCreativeModeTabs;
import com.cooldude1259.riftwalkers.entity.MiniGolemEntityRenderer;
import com.cooldude1259.riftwalkers.entity.ModEntityModelLayers;
import com.cooldude1259.riftwalkers.entity.ModEntityTypes;
import com.cooldude1259.riftwalkers.worldgen.gen.ModWorldGeneration;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Riftwalkers implements ModInitializer {
	public static final String MOD_ID = "riftwalkers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing riftwalkers...");
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModEntityTypes.registerModEntityTypes();
		ModEntityTypes.registerAttributes();

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

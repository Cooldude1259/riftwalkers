package com.cooldude1259.riftwalkers.creativemodetab;

import com.cooldude1259.riftwalkers.Riftwalkers;
import com.cooldude1259.riftwalkers.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.core.Registry;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab REFERENCE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Riftwalkers.MOD_ID, "reference_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PORTAL_A))
                    .title(Component.translatable("creativemodetab.riftwalkers.reference_blocks"))
                    .displayItems((context, output) -> {
                        output.accept(ModBlocks.PORTAL_A);
                        output.accept(ModBlocks.BEAR_OTO);
                    }).build()
    );

    public static void registerModCreativeModeTabs() {
        Riftwalkers.LOGGER.info("Registering Mod Creative Mode Tabs for " + Riftwalkers.MOD_ID);
    }
}

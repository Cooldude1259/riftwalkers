package com.lucas.riftwalkers;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class RiftwalkersMod implements ModInitializer {
    public static final String MOD_ID = "riftwalkers";

    @Override
    public void onInitialize() {
        System.out.println("[Riftwalkers] Mod initialized.");

        // Register test command
        RiftCommand.register();
    }

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }
}

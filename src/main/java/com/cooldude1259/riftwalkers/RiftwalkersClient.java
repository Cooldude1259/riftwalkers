package com.cooldude1259.riftwalkers;

import com.cooldude1259.riftwalkers.entity.MiniGolemEntityRenderer;
import com.cooldude1259.riftwalkers.entity.ModEntityModelLayers;
import com.cooldude1259.riftwalkers.entity.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class RiftwalkersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModEntityModelLayers.registerModelLayers();
        EntityRenderers.register(ModEntityTypes.MINI_GOLEM, MiniGolemEntityRenderer::new);
    }
}

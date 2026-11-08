package com.cooldude1259.riftwalkers.entity;

import com.cooldude1259.riftwalkers.Riftwalkers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class MiniGolemEntityRenderer extends MobRenderer<MiniGolemEntity, MiniGolemEntityRenderState, MiniGolemEntityModel> {
    private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath(Riftwalkers.MOD_ID, "textures/entity/mini_golem.png");

    public MiniGolemEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new MiniGolemEntityModel(context.bakeLayer(ModEntityModelLayers.MINI_GOLEM)), 0.375f); // 0.375 shadow radius
    }

    @Override
    public MiniGolemEntityRenderState createRenderState() {
        return new MiniGolemEntityRenderState();
    }

    @Override
    public Identifier getTextureLocation(MiniGolemEntityRenderState state) {
        return TEXTURE;
    }
}
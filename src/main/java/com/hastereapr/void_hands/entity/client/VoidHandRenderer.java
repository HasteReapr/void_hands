package com.hastereapr.void_hands.entity.client;

import com.hastereapr.void_hands.entity.custom.VoidHandEntity;
import com.hastereapr.void_hands.void_hands;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class VoidHandRenderer extends GeoEntityRenderer<VoidHandEntity> {
    public VoidHandRenderer(EntityRendererProvider.Context renderManager){//}, AnimatedGeoModel<VoidHandEntity> modelProvider) {
        super(renderManager, new VoidHandModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(VoidHandEntity instance){
        return new ResourceLocation(void_hands.MODID, "textures/entity/voidhand/voidhand.png");
    }

    @Override
    public RenderType getRenderType(VoidHandEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation){
        stack.scale(8, 8, 8);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

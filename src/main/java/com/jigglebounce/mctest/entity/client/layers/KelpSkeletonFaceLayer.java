package com.jigglebounce.mctest.entity.client.layers;

import com.jigglebounce.mctest.MCTestMod;
import com.jigglebounce.mctest.entity.custom.KelpSkeleton;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

@OnlyIn(Dist.CLIENT)
public class KelpSkeletonFaceLayer extends GeoRenderLayer<KelpSkeleton> {

    private static final ResourceLocation KELP_SKELETON_FACE = ResourceLocation.fromNamespaceAndPath(MCTestMod.MOD_ID, "textures/entity/kelp_skeleton_glowmask.png");

    public KelpSkeletonFaceLayer(GeoRenderer<KelpSkeleton> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, KelpSkeleton animatable, BakedGeoModel bakedModel, RenderType renderType,
                       MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick,
                       int packedLight, int packedOverlay) {
        RenderType eyesRenderType = RenderType.eyes(KELP_SKELETON_FACE);

        getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, eyesRenderType,
                bufferSource.getBuffer(eyesRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY,1);
    }
}




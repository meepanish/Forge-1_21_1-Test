package com.jigglebounce.mctest.entity.client;

import com.jigglebounce.mctest.MCTestMod;
import com.jigglebounce.mctest.entity.client.layers.KelpSkeletonFaceLayer;
import com.jigglebounce.mctest.entity.custom.KelpSkeleton;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class KelpSkeletonGeoRenderer extends GeoEntityRenderer<KelpSkeleton> {
    public KelpSkeletonGeoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KelpSkeletonModel());

        this.shadowRadius = 1.0f;

        addRenderLayer(new KelpSkeletonFaceLayer(this));
        addRenderLayer(new AutoGlowingGeoLayer<>(this));

    }
}

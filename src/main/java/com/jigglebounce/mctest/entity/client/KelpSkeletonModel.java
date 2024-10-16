package com.jigglebounce.mctest.entity.client;

import com.jigglebounce.mctest.MCTestMod;
import com.jigglebounce.mctest.entity.custom.KelpSkeleton;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KelpSkeletonModel extends GeoModel<KelpSkeleton> {
    private final ResourceLocation model = ResourceLocation.fromNamespaceAndPath(MCTestMod.MOD_ID, "geo/kelp_skeleton.geo.json");
    private final ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(MCTestMod.MOD_ID, "textures/entity/kelp_skeleton_texture.png");
    private final ResourceLocation animations = ResourceLocation.fromNamespaceAndPath(MCTestMod.MOD_ID, "animations/kelp_skeleton.animation.json");



    @Override
    public ResourceLocation getModelResource(KelpSkeleton animatable) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(KelpSkeleton animatable) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(KelpSkeleton animatable) {
        return this.animations;
    }

}

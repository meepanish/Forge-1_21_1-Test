package com.jigglebounce.mctest.event;

import com.jigglebounce.mctest.MCTestMod;
import com.jigglebounce.mctest.entity.ModEntities;
import com.jigglebounce.mctest.entity.custom.KelpSkeleton;
import com.jigglebounce.mctest.entity.client.KelpSkeletonGeoRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MCTestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.KELP_SKELETON.get(), KelpSkeletonGeoRenderer::new);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KELP_SKELETON.get(), KelpSkeleton.setAttributes());
    }
}
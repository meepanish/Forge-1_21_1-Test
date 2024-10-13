package com.jigglebounce.mctest.util;

import com.jigglebounce.mctest.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        makeTrident(ModItems.BONE_SPEAR.get());
    }

    private static void makeTrident(Item item) {
        ItemProperties.register(
                item,
                ResourceLocation.withDefaultNamespace("throwing"),
                (p_234996_, p_234997_, p_234998_, p_234999_) -> p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F
        );
    }
}

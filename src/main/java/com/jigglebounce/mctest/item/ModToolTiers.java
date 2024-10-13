package com.jigglebounce.mctest.item;

import com.jigglebounce.mctest.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier BONE = new ForgeTier(1400, 4, 3f, 18,
            ModTags.Blocks.NEEDS_BONE_TOOL, () -> Ingredient.of(ModItems.BONE_SHARD.get()), ModTags.Blocks.INCORRECT_FOR_BONE_TOOL );
}

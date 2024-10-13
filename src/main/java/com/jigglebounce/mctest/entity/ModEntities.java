package com.jigglebounce.mctest.entity;

import com.jigglebounce.mctest.MCTestMod;
import com.jigglebounce.mctest.entity.custom.KelpSkeleton;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MCTestMod.MOD_ID);
    public static final RegistryObject<EntityType<KelpSkeleton>> KELP_SKELETON =
            ENTITY_TYPES.register("kelp_skeleton", () -> EntityType.Builder.of(KelpSkeleton::new, MobCategory.MONSTER)
                    .sized(2.9f, 0.9f).build("kelp_skeleton"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}


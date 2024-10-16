package com.jigglebounce.mctest.item;

import com.jigglebounce.mctest.MCTestMod;
import com.jigglebounce.mctest.entity.ModEntities;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCTestMod.MOD_ID);

    public static final RegistryObject<Item> BONE_SHARD = ITEMS.register("bone_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () -> new PickaxeItem(ModToolTiers.BONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BONE, 1.0F, -2.8F))));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe", () -> new AxeItem(ModToolTiers.BONE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BONE, 5.0F, -3.0F))));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel", () -> new ShovelItem(ModToolTiers.BONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BONE, 1.5F, -3.0F))));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe", () -> new HoeItem(ModToolTiers.BONE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BONE, -3.0F, 0.0F))));
    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword", () -> new SwordItem(ModToolTiers.BONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BONE, 3, -2.4F))));

    public static final RegistryObject<Item> BONE_SPEAR = ITEMS.register("bone_spear_item", () -> new TridentItem(new Item.Properties().rarity(Rarity.EPIC).durability(250).attributes(TridentItem.createAttributes()).component(DataComponents.TOOL, TridentItem.createToolProperties())));

    public static final RegistryObject<Item> KELP_SKELETON_SPAWN_EGG = ITEMS.register("kelp_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.KELP_SKELETON, 0x55a42e, 0x00fffd, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}

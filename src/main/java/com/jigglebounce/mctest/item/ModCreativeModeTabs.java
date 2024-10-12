package com.jigglebounce.mctest.item;

import com.jigglebounce.mctest.MCTestMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCTestMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> SKELETONS_ENHANCED_TAB = CREATIVE_MODE_TABS.register("skeletons_enhanced_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BONE_SHARD.get()))
                    .title(Component.translatable("creativetab.skeletons_enhanced"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BONE_SHARD.get());
                    }).build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}

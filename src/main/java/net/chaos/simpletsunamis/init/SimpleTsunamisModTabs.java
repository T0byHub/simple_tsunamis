
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.chaos.simpletsunamis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.chaos.simpletsunamis.SimpleTsunamisMod;

public class SimpleTsunamisModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleTsunamisMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SIMPLE_TSUNAMI = REGISTRY.register("simple_tsunami",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.simple_tsunamis.simple_tsunami")).icon(() -> new ItemStack(SimpleTsunamisModItems.TSUNAMI_WATER_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SimpleTsunamisModItems.TSUNAMI_WATER_BUCKET.get());
				tabData.accept(SimpleTsunamisModItems.TSUNAMI_LAVA_BUCKET.get());
				tabData.accept(SimpleTsunamisModItems.VOIDFLUIDTYPE_1_BUCKET.get());
			}).build());
}


/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.chaos.simpletsunamis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.chaos.simpletsunamis.fluid.Voidfluidtype2Fluid;
import net.chaos.simpletsunamis.fluid.Voidfluidtype1Fluid;
import net.chaos.simpletsunamis.fluid.TsunamiWaterFluid;
import net.chaos.simpletsunamis.fluid.TsunamiLavaFluid;
import net.chaos.simpletsunamis.SimpleTsunamisMod;

public class SimpleTsunamisModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, SimpleTsunamisMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> TSUNAMI_WATER = REGISTRY.register("tsunami_water", () -> new TsunamiWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TSUNAMI_WATER = REGISTRY.register("flowing_tsunami_water", () -> new TsunamiWaterFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> TSUNAMI_LAVA = REGISTRY.register("tsunami_lava", () -> new TsunamiLavaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TSUNAMI_LAVA = REGISTRY.register("flowing_tsunami_lava", () -> new TsunamiLavaFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> VOIDFLUIDTYPE_1 = REGISTRY.register("voidfluidtype_1", () -> new Voidfluidtype1Fluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_VOIDFLUIDTYPE_1 = REGISTRY.register("flowing_voidfluidtype_1", () -> new Voidfluidtype1Fluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> VOIDFLUIDTYPE_2 = REGISTRY.register("voidfluidtype_2", () -> new Voidfluidtype2Fluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_VOIDFLUIDTYPE_2 = REGISTRY.register("flowing_voidfluidtype_2", () -> new Voidfluidtype2Fluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(TSUNAMI_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TSUNAMI_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(TSUNAMI_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TSUNAMI_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(VOIDFLUIDTYPE_1.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VOIDFLUIDTYPE_1.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(VOIDFLUIDTYPE_2.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VOIDFLUIDTYPE_2.get(), RenderType.translucent());
		}
	}
}

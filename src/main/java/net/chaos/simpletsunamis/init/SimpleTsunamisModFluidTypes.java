
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.chaos.simpletsunamis.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.chaos.simpletsunamis.fluid.types.Voidfluidtype2FluidType;
import net.chaos.simpletsunamis.fluid.types.Voidfluidtype1FluidType;
import net.chaos.simpletsunamis.fluid.types.TsunamiWaterFluidType;
import net.chaos.simpletsunamis.fluid.types.TsunamiLavaFluidType;
import net.chaos.simpletsunamis.SimpleTsunamisMod;

public class SimpleTsunamisModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, SimpleTsunamisMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> TSUNAMI_WATER_TYPE = REGISTRY.register("tsunami_water", () -> new TsunamiWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> TSUNAMI_LAVA_TYPE = REGISTRY.register("tsunami_lava", () -> new TsunamiLavaFluidType());
	public static final DeferredHolder<FluidType, FluidType> VOIDFLUIDTYPE_1_TYPE = REGISTRY.register("voidfluidtype_1", () -> new Voidfluidtype1FluidType());
	public static final DeferredHolder<FluidType, FluidType> VOIDFLUIDTYPE_2_TYPE = REGISTRY.register("voidfluidtype_2", () -> new Voidfluidtype2FluidType());
}

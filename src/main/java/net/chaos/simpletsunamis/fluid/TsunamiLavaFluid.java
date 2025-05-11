
package net.chaos.simpletsunamis.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.chaos.simpletsunamis.init.SimpleTsunamisModItems;
import net.chaos.simpletsunamis.init.SimpleTsunamisModFluids;
import net.chaos.simpletsunamis.init.SimpleTsunamisModFluidTypes;
import net.chaos.simpletsunamis.init.SimpleTsunamisModBlocks;

public abstract class TsunamiLavaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> SimpleTsunamisModFluidTypes.TSUNAMI_LAVA_TYPE.get(), () -> SimpleTsunamisModFluids.TSUNAMI_LAVA.get(),
			() -> SimpleTsunamisModFluids.FLOWING_TSUNAMI_LAVA.get()).explosionResistance(100f).tickRate(30).bucket(() -> SimpleTsunamisModItems.TSUNAMI_LAVA_BUCKET.get()).block(() -> (LiquidBlock) SimpleTsunamisModBlocks.TSUNAMI_LAVA.get());

	private TsunamiLavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_LAVA;
	}

	public static class Source extends TsunamiLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TsunamiLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

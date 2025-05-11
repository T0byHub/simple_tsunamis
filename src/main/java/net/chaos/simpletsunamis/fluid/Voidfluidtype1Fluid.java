
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

public abstract class Voidfluidtype1Fluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> SimpleTsunamisModFluidTypes.VOIDFLUIDTYPE_1_TYPE.get(), () -> SimpleTsunamisModFluids.VOIDFLUIDTYPE_1.get(),
			() -> SimpleTsunamisModFluids.FLOWING_VOIDFLUIDTYPE_1.get()).explosionResistance(2147483647f).slopeFindDistance(16).bucket(() -> SimpleTsunamisModItems.VOIDFLUIDTYPE_1_BUCKET.get())
			.block(() -> (LiquidBlock) SimpleTsunamisModBlocks.VOIDFLUIDTYPE_1.get());

	private Voidfluidtype1Fluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.REVERSE_PORTAL;
	}

	public static class Source extends Voidfluidtype1Fluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends Voidfluidtype1Fluid {
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

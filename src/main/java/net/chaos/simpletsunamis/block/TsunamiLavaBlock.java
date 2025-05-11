
package net.chaos.simpletsunamis.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.chaos.simpletsunamis.procedures.TsunamiLavaMobplayerCollidesBlockProcedure;
import net.chaos.simpletsunamis.procedures.LavaTsunamiFlowProcedure;
import net.chaos.simpletsunamis.init.SimpleTsunamisModFluids;

public class TsunamiLavaBlock extends LiquidBlock {
	public TsunamiLavaBlock(BlockBehaviour.Properties properties) {
		super(SimpleTsunamisModFluids.TSUNAMI_LAVA.get(), properties.mapColor(MapColor.COLOR_ORANGE).strength(100f).lightLevel(s -> 15).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 20);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		LavaTsunamiFlowProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 20);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier applier) {
		super.entityInside(blockstate, world, pos, entity, applier);
		TsunamiLavaMobplayerCollidesBlockProcedure.execute(entity);
	}
}

package net.chaos.simpletsunamis.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.chaos.simpletsunamis.init.SimpleTsunamisModBlocks;
import net.chaos.simpletsunamis.SimpleTsunamisMod;

public class TsunamiFlowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x - 1, y, z), SimpleTsunamisModBlocks.TSUNAMI_WATER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x + 1, y, z), SimpleTsunamisModBlocks.TSUNAMI_WATER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z - 1), SimpleTsunamisModBlocks.TSUNAMI_WATER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z + 1), SimpleTsunamisModBlocks.TSUNAMI_WATER.get().defaultBlockState(), 3);
		}
		SimpleTsunamisMod.queueServerWork(40, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
		});
	}
}

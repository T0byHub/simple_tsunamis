package net.chaos.simpletsunamis.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.chaos.simpletsunamis.init.SimpleTsunamisModBlocks;

public class VoidTsunamiFlowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number_randomT = 0;
		double number_randomB = 0;
		number_randomB = Math.random();
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
			if (number_randomB <= 0.7) {
				world.setBlock(BlockPos.containing(x - 1, y, z), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_1.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x - 1, y, z), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_2.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
			if (number_randomB <= 0.7) {
				world.setBlock(BlockPos.containing(x + 1, y, z), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_1.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x + 1, y, z), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_2.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
			if (number_randomB <= 0.7) {
				world.setBlock(BlockPos.containing(x, y, z - 1), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_1.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z - 1), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_2.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
			if (number_randomB <= 0.7) {
				world.setBlock(BlockPos.containing(x, y, z + 1), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_1.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z + 1), SimpleTsunamisModBlocks.VOIDFLUIDTYPE_2.get().defaultBlockState(), 3);
			}
		}
		number_randomT = Math.random();
		if (number_randomT <= 0.0001) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
				entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

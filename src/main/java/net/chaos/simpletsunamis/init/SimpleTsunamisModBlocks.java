
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.chaos.simpletsunamis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.chaos.simpletsunamis.block.Voidfluidtype2Block;
import net.chaos.simpletsunamis.block.Voidfluidtype1Block;
import net.chaos.simpletsunamis.block.TsunamiWaterBlock;
import net.chaos.simpletsunamis.block.TsunamiLavaBlock;
import net.chaos.simpletsunamis.SimpleTsunamisMod;

import java.util.function.Function;

public class SimpleTsunamisModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SimpleTsunamisMod.MODID);
	public static final DeferredBlock<Block> TSUNAMI_WATER = register("tsunami_water", TsunamiWaterBlock::new);
	public static final DeferredBlock<Block> TSUNAMI_LAVA = register("tsunami_lava", TsunamiLavaBlock::new);
	public static final DeferredBlock<Block> VOIDFLUIDTYPE_1 = register("voidfluidtype_1", Voidfluidtype1Block::new);
	public static final DeferredBlock<Block> VOIDFLUIDTYPE_2 = register("voidfluidtype_2", Voidfluidtype2Block::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}

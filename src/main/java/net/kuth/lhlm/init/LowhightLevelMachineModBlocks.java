/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kuth.lhlm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.kuth.lhlm.block.NajOreBlock;
import net.kuth.lhlm.block.NajBlockBlock;
import net.kuth.lhlm.LowhightLevelMachineMod;

import java.util.function.Function;

public class LowhightLevelMachineModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LowhightLevelMachineMod.MODID);
	public static final DeferredBlock<Block> NAJ_ORE;
	public static final DeferredBlock<Block> NAJ_BLOCK;
	static {
		NAJ_ORE = register("naj_ore", NajOreBlock::new);
		NAJ_BLOCK = register("naj_block", NajBlockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}
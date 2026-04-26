/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kuth.lhlm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.kuth.lhlm.block.*;
import net.kuth.lhlm.LowhightLevelMachineMod;

import java.util.function.Function;

public class LowhightLevelMachineModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LowhightLevelMachineMod.MODID);
	public static final DeferredBlock<Block> NAJ_ORE;
	public static final DeferredBlock<Block> SERBO_ORE;
	public static final DeferredBlock<Block> BONZ_ORE;
	public static final DeferredBlock<Block> XRIN_ORE;
	public static final DeferredBlock<Block> FLIG_ORE;
	public static final DeferredBlock<Block> FLIG_BLOCK;
	public static final DeferredBlock<Block> VIGIN_ORE;
	public static final DeferredBlock<Block> VIGIN_BLOCK;
	public static final DeferredBlock<Block> SELUM_ORE;
	static {
		NAJ_ORE = register("naj_ore", NajOreBlock::new);
		SERBO_ORE = register("serbo_ore", SerboOreBlock::new);
		BONZ_ORE = register("bonz_ore", BonzOreBlock::new);
		XRIN_ORE = register("xrin_ore", XrinOreBlock::new);
		FLIG_ORE = register("flig_ore", FligOreBlock::new);
		FLIG_BLOCK = register("flig_block", FligBlockBlock::new);
		VIGIN_ORE = register("vigin_ore", ViginOreBlock::new);
		VIGIN_BLOCK = register("vigin_block", ViginBlockBlock::new);
		SELUM_ORE = register("selum_ore", SelumOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}
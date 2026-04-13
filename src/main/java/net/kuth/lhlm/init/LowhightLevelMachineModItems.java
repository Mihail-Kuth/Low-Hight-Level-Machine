/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kuth.lhlm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.kuth.lhlm.item.TABICOITEMItem;
import net.kuth.lhlm.item.NajItem;
import net.kuth.lhlm.LowhightLevelMachineMod;

import java.util.function.Function;

public class LowhightLevelMachineModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LowhightLevelMachineMod.MODID);
	public static final DeferredItem<Item> TABICOITEM;
	public static final DeferredItem<Item> NAJ;
	public static final DeferredItem<Item> NAJ_ORE;
	public static final DeferredItem<Item> NAJ_BLOCK;
	static {
		TABICOITEM = register("tabicoitem", TABICOITEMItem::new);
		NAJ = register("naj", NajItem::new);
		NAJ_ORE = block(LowhightLevelMachineModBlocks.NAJ_ORE);
		NAJ_BLOCK = block(LowhightLevelMachineModBlocks.NAJ_BLOCK);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}
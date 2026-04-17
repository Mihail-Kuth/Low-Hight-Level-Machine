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

import net.kuth.lhlm.item.XrinIngotItem;
import net.kuth.lhlm.item.TABICOITEMItem;
import net.kuth.lhlm.item.SerboIngotItem;
import net.kuth.lhlm.item.NajItem;
import net.kuth.lhlm.item.BonzIngotItem;
import net.kuth.lhlm.LowhightLevelMachineMod;

import java.util.function.Function;

public class LowhightLevelMachineModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LowhightLevelMachineMod.MODID);
	public static final DeferredItem<Item> TABICOITEM;
	public static final DeferredItem<Item> NAJ;
	public static final DeferredItem<Item> NAJ_ORE;
	public static final DeferredItem<Item> SERBO_INGOT;
	public static final DeferredItem<Item> SERBO_ORE;
	public static final DeferredItem<Item> BONZ_INGOT;
	public static final DeferredItem<Item> BONZ_ORE;
	public static final DeferredItem<Item> XRIN_INGOT;
	public static final DeferredItem<Item> XRIN_ORE;
	static {
		TABICOITEM = register("tabicoitem", TABICOITEMItem::new);
		NAJ = register("naj", NajItem::new);
		NAJ_ORE = block(LowhightLevelMachineModBlocks.NAJ_ORE);
		SERBO_INGOT = register("serbo_ingot", SerboIngotItem::new);
		SERBO_ORE = block(LowhightLevelMachineModBlocks.SERBO_ORE);
		BONZ_INGOT = register("bonz_ingot", BonzIngotItem::new);
		BONZ_ORE = block(LowhightLevelMachineModBlocks.BONZ_ORE);
		XRIN_INGOT = register("xrin_ingot", XrinIngotItem::new);
		XRIN_ORE = block(LowhightLevelMachineModBlocks.XRIN_ORE);
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
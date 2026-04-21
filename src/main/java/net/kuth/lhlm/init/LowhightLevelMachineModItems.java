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

import net.kuth.lhlm.item.*;
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
	public static final DeferredItem<Item> FLIG_DUST;
	public static final DeferredItem<Item> FLIG_ORE;
	public static final DeferredItem<Item> FLIG_BLOCK;
	public static final DeferredItem<Item> FLIG_GLASS;
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
		FLIG_DUST = register("flig_dust", FligDustItem::new);
		FLIG_ORE = block(LowhightLevelMachineModBlocks.FLIG_ORE);
		FLIG_BLOCK = block(LowhightLevelMachineModBlocks.FLIG_BLOCK);
		FLIG_GLASS = register("flig_glass", FligGlassItem::new);
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
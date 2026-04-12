/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kuth.lhlm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.kuth.lhlm.item.TABICOITEMItem;
import net.kuth.lhlm.LowhightLevelMachineMod;

import java.util.function.Function;

public class LowhightLevelMachineModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LowhightLevelMachineMod.MODID);
	public static final DeferredItem<Item> TABICOITEM;
	static {
		TABICOITEM = register("tabicoitem", TABICOITEMItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
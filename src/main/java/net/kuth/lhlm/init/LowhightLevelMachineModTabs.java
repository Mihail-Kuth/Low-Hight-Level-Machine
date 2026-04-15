/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kuth.lhlm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.kuth.lhlm.LowhightLevelMachineMod;

@EventBusSubscriber
public class LowhightLevelMachineModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LowhightLevelMachineMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = REGISTRY.register("creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lowhight_level_machine.creative_tab")).icon(() -> new ItemStack(LowhightLevelMachineModItems.TABICOITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LowhightLevelMachineModItems.NAJ.get());
				tabData.accept(LowhightLevelMachineModBlocks.NAJ_ORE.get().asItem());
				tabData.accept(LowhightLevelMachineModItems.SERBO_INGOT.get());
				tabData.accept(LowhightLevelMachineModBlocks.SERBO_ORE.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LowhightLevelMachineModItems.BONZ_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LowhightLevelMachineModBlocks.BONZ_ORE.get().asItem());
		}
	}
}
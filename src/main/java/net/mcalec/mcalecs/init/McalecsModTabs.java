
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcalec.mcalecs.McAlecs;

public class McalecsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McAlecs.MODID);
	public static final RegistryObject<CreativeModeTab> MC_ALEC = REGISTRY.register("mc_alec",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcalecs.mc_alec")).icon(() -> new ItemStack(Blocks.ANVIL)).displayItems((parameters, tabData) -> {
				tabData.accept(McalecsModItems.MC_ALEC_ARMOUR_HELMET.get());
				tabData.accept(McalecsModItems.MC_ALEC_ARMOUR_CHESTPLATE.get());
				tabData.accept(McalecsModItems.MC_ALEC_ARMOUR_LEGGINGS.get());
				tabData.accept(McalecsModItems.MC_ALEC_ARMOUR_BOOTS.get());
				tabData.accept(McalecsModItems.VILLAGER_SPAWN_EGG.get());
				tabData.accept(McalecsModItems.MCALEC_SPAWN_EGG.get());
				tabData.accept(McalecsModItems.BOYKISSER_SPAWN_EGG.get());
				tabData.accept(McalecsModItems.BOYKISSER_MAID_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PAINITE_TAB = REGISTRY.register("painite_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcalecs.painite_tab")).icon(() -> new ItemStack(McalecsModBlocks.PAINITE_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McalecsModItems.PAINITE.get());
				tabData.accept(McalecsModBlocks.PAINITE_ORE.get().asItem());
				tabData.accept(McalecsModBlocks.PAINITE_BLOCK.get().asItem());
				tabData.accept(McalecsModItems.PAINITE_ARMOR_HELMET.get());
				tabData.accept(McalecsModItems.PAINITE_ARMOR_CHESTPLATE.get());
				tabData.accept(McalecsModItems.PAINITE_ARMOR_LEGGINGS.get());
				tabData.accept(McalecsModItems.PAINITE_ARMOR_BOOTS.get());
				tabData.accept(McalecsModItems.PAINITE_SWORD.get());
				tabData.accept(McalecsModItems.PAINITE_AXE.get());
				tabData.accept(McalecsModItems.PAINITE_PICKAXE.get());
				tabData.accept(McalecsModItems.PAINITE_SHOVEL.get());
				tabData.accept(McalecsModItems.PAINITE_HOE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MUSIC_TAB = REGISTRY.register("music_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcalecs.music_tab")).icon(() -> new ItemStack(McalecsModBlocks.ADVANCED_JUKEBOX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McalecsModBlocks.ADVANCED_JUKEBOX.get().asItem());
				tabData.accept(McalecsModItems.JAMIROQUAI_VIRTUAL_INSANITY.get());
				tabData.accept(McalecsModItems.MATTHEW_WILDER_BREAK_MY_STRIDE.get());
				tabData.accept(McalecsModItems.FRIZK_ALL_MY_FELLAS.get());
				tabData.accept(McalecsModItems.ED_HELMS_HOW_BAD_CAN_I_BE.get());
				tabData.accept(McalecsModItems.C418_DRAGON_FISH.get());
				tabData.accept(McalecsModItems.GROOVYDOMINOES52_BEE.get());
				tabData.accept(McalecsModItems.SURASSHU_EEK.get());
				tabData.accept(McalecsModItems.SUPER_MARIO_ODYSSEY_JUMP_UP_SUPER_STAR.get());
				tabData.accept(McalecsModItems.THE_LIVING_TOMBSTONE_FIVE_NIGHTS_AT_FREDDYS.get());
				tabData.accept(McalecsModItems.THE_NEWTON_BROTHERS_FIVE_NIGHTS_AT_FREDDYS.get());
				tabData.accept(McalecsModItems.SUPER_MARIO_GALAXY_ROSALINA_IN_THE_OBSERVATORY.get());
				tabData.accept(McalecsModItems.SUPER_SMASH_BROS_ULTIMATE_MENU.get());
				tabData.accept(McalecsModItems.SUPER_MARIO_GALAXY_GUSTY_GARDEN_GALAXY.get());
			})

					.build());
}

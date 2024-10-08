
package net.mcalec.mcalecs.item;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public class SuperMarioGalaxyGustyGardenGalaxyItem extends RecordItem {
	public SuperMarioGalaxyGustyGardenGalaxyItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecs:super_mario_galaxy_gusty_garden_galaxy")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 9360);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}

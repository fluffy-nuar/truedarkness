
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class DarknessSpruceShieldItem extends ShieldItem {
	public DarknessSpruceShieldItem() {
		super(new Item.Properties().durability(250));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(TruedarknessModBlocks.DARKNESS_SPRUCE_PLANKS.get())).test(repairitem);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}

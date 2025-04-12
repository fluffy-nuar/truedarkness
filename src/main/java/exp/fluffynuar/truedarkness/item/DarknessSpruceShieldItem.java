
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class DarknessSpruceShieldItem extends ShieldItem {
	public DarknessSpruceShieldItem() {
		super(new Item.Properties().durability(250));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(TruedarknessModBlocks.DARKNESS_SPRUCE_PLANKS.get())).test(repairitem);
	}
}

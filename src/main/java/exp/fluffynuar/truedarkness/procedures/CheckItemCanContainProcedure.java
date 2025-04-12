package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class CheckItemCanContainProcedure {
	public static ItemStack execute(ItemStack itemstack) {
		if (itemstack.getItem() == Items.BUCKET) {
			return new ItemStack(TruedarknessModItems.BUCKET_BLOOD.get());
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))) {
			return itemstack;
		}
		return ItemStack.EMPTY;
	}
}

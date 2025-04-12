package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class MaximumCanContainItemProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getItem() == Items.BUCKET) {
			return 100;
		}
		return 0;
	}
}

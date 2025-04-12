package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class BrewingPriceGetProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModBlocks.CORRUPTED_VINES_2.get().asItem()) {
			return 3;
		} else if (itemstack.getItem() == Items.BLAZE_POWDER) {
			return 1;
		} else if (itemstack.getItem() == Blocks.GOLD_BLOCK.asItem()) {
			return 13;
		} else if (itemstack.getItem() == Blocks.ICE.asItem()) {
			return 1;
		} else if (itemstack.getItem() == Items.HONEYCOMB) {
			return 10;
		} else if (itemstack.getItem() == Items.PUFFERFISH) {
			return 10;
		} else if (itemstack.getItem() == Items.QUARTZ) {
			return 2;
		} else if (itemstack.getItem() == Items.CAKE) {
			return 13;
		}
		return 0;
	}
}

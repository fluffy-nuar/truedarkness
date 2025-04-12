package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class BrewingTimerGetProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModBlocks.CORRUPTED_VINES_2.get().asItem()) {
			return 200;
		} else if (itemstack.getItem() == Items.BLAZE_POWDER) {
			return 140;
		} else if (itemstack.getItem() == Blocks.GOLD_BLOCK.asItem()) {
			return 280;
		} else if (itemstack.getItem() == Blocks.ICE.asItem()) {
			return 140;
		} else if (itemstack.getItem() == Items.HONEYCOMB) {
			return 300;
		} else if (itemstack.getItem() == Items.PUFFERFISH) {
			return 300;
		} else if (itemstack.getItem() == Items.QUARTZ) {
			return 80;
		} else if (itemstack.getItem() == Items.CAKE) {
			return 500;
		} else if (itemstack.getItem() == ItemStack.EMPTY.getItem()) {
			return 0;
		}
		return 0;
	}
}

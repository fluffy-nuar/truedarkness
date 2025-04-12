package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class BrewingTypeGetProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModBlocks.CORRUPTED_VINES_2.get().asItem()) {
			return "corrupt";
		} else if (itemstack.getItem() == Items.BLAZE_POWDER) {
			return "flame";
		} else if (itemstack.getItem() == Blocks.GOLD_BLOCK.asItem()) {
			return "golden";
		} else if (itemstack.getItem() == Blocks.ICE.asItem()) {
			return "ice";
		} else if (itemstack.getItem() == Items.HONEYCOMB) {
			return "unpoison";
		} else if (itemstack.getItem() == Items.PUFFERFISH) {
			return "fish";
		} else if (itemstack.getItem() == Items.QUARTZ) {
			return "haste";
		} else if (itemstack.getItem() == Items.CAKE) {
			return "better";
		}
		return "";
	}
}

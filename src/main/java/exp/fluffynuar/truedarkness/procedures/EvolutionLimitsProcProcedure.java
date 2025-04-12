package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class EvolutionLimitsProcProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			return 4;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			return 5;
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_LEATHER.get()) {
			return 3;
		}
		return 0;
	}
}

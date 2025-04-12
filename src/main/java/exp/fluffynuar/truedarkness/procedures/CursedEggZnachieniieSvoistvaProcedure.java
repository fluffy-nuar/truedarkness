package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

public class CursedEggZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("Extract") ? 1 : 0;
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

public class SkrezhalZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("Tablet_accept")) {
			return 1;
		}
		return 0;
	}
}

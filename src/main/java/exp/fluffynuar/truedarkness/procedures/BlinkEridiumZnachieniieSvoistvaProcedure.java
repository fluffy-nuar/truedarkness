package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

public class BlinkEridiumZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("blink");
	}
}

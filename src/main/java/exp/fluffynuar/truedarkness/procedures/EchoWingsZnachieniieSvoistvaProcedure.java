package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

public class EchoWingsZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("trimsTag");
	}
}

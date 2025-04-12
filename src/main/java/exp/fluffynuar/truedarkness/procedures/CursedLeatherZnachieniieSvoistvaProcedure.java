package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

public class CursedLeatherZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("ActiveStage");
	}
}

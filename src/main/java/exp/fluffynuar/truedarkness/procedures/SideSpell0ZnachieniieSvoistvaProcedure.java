package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

public class SideSpell0ZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("Corrupted")) {
			return 1;
		}
		return 0;
	}
}

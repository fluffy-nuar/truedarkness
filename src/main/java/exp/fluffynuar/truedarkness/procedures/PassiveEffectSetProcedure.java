package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class PassiveEffectSetProcedure {
	public static ItemStack execute(String passive) {
		if (passive == null)
			return ItemStack.EMPTY;
		if ((passive).equals("steal")) {
			return new ItemStack(TruedarknessModItems.STEEL_FANGS.get());
		} else if ((passive).equals("sneak")) {
			return new ItemStack(TruedarknessModItems.SNEAKY_FANGS.get());
		} else if ((passive).equals("hunter")) {
			return new ItemStack(TruedarknessModItems.HARD_FANGS.get());
		} else if ((passive).equals("vision")) {
			return new ItemStack(TruedarknessModItems.MOONLIGHT_FANGS.get());
		} else if ((passive).equals("wither")) {
			return new ItemStack(TruedarknessModItems.WITHERED_FANGS.get());
		} else if ((passive).equals("terror")) {
			return new ItemStack(TruedarknessModItems.CREEPY_FANGS.get());
		}
		return ItemStack.EMPTY;
	}
}

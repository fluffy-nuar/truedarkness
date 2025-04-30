package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class PassiveEffectGetProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.STEEL_FANGS.get()) {
			return "steal";
		} else if (itemstack.getItem() == TruedarknessModItems.SNEAKY_FANGS.get()) {
			return "sneak";
		} else if (itemstack.getItem() == TruedarknessModItems.HARD_FANGS.get()) {
			return "hunter";
		} else if (itemstack.getItem() == TruedarknessModItems.MOONLIGHT_FANGS.get()) {
			return "vision";
		} else if (itemstack.getItem() == TruedarknessModItems.WITHERED_FANGS.get()) {
			return "debuffs";
		} else if (itemstack.getItem() == TruedarknessModItems.CREEPY_FANGS.get()) {
			return "terror";
		} else if (itemstack.getItem() == ItemStack.EMPTY.getItem()) {
			return "";
		}
		return "";
	}
}

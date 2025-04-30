package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class KakiePredmetyYAvliautsyaAddonamiProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.CURSED_BOWL.get()) {
			return "catch";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_REEL.get()) {
			return "remnant";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_CUP.get()) {
			return "jump";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_BUCKET.get()) {
			return "push";
		}
		return "";
	}
}

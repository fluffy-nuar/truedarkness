package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class PoluchitePredmetProcedure {
	public static ItemStack execute(String addon) {
		if (addon == null)
			return ItemStack.EMPTY;
		if ((addon).equals("catch")) {
			return new ItemStack(TruedarknessModItems.CURSED_BOWL.get());
		} else if ((addon).equals("remnant")) {
			return new ItemStack(TruedarknessModItems.CURSED_REEL.get());
		} else if ((addon).equals("jump")) {
			return new ItemStack(TruedarknessModItems.CURSED_CUP.get());
		} else if ((addon).equals("push")) {
			return new ItemStack(TruedarknessModItems.CURSED_BUCKET.get());
		}
		return ItemStack.EMPTY;
	}
}

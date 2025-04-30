package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class BookAddonSetProcedure {
	public static ItemStack execute(String book) {
		if (book == null)
			return ItemStack.EMPTY;
		if ((book).equals("speed")) {
			return new ItemStack(TruedarknessModItems.CURSED_SANDGLASS.get());
		} else if ((book).equals("resting")) {
			return new ItemStack(TruedarknessModItems.CURSED_EGG.get());
		} else if ((book).equals("food")) {
			return new ItemStack(TruedarknessModItems.ERIDIUM_GLASS_SHARD.get());
		} else if ((book).equals("armor")) {
			return new ItemStack(TruedarknessModItems.CURSED_LEATHER.get());
		} else if ((book).equals("blood")) {
			return new ItemStack(TruedarknessModItems.CURSED_MAGNIFIER.get());
		} else if ((book).equals("limit")) {
			return new ItemStack(TruedarknessModItems.CURSED_SCROLL.get());
		}
		return ItemStack.EMPTY;
	}
}

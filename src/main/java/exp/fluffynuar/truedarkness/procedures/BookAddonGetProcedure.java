package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class BookAddonGetProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.CURSED_SANDGLASS.get()) {
			return "speed";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_EGG.get()) {
			return "resting";
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_GLASS_SHARD.get()) {
			return "food";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_LEATHER.get()) {
			return "armor";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_MAGNIFIER.get()) {
			return "blood";
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_SCROLL.get()) {
			return "limit";
		}
		return "";
	}
}

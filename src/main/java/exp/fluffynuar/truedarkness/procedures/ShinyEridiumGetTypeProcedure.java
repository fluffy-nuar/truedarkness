package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class ShinyEridiumGetTypeProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_STREAM.get()) {
			return "stream";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SMELT.get()) {
			return "smelt";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_TREAD.get()) {
			return "tread";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SEER.get()) {
			return "seer";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SHOT.get()) {
			return "shot";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_LIGHTNING.get()) {
			return "lightning";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_RINGING.get()) {
			return "ringing";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_FANGS.get()) {
			return "fangs";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_UNDEAD.get()) {
			return "undead";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_GREED.get()) {
			return "greed";
		}
		return "";
	}
}

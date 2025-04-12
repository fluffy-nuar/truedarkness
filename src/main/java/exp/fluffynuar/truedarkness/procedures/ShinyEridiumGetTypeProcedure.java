package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class ShinyEridiumGetTypeProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_STREAM.get()) {
			return "stream";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SEER.get()) {
			return "seer";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_UNDYING.get()) {
			return "undying";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_RUNE.get()) {
			return "rune";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_TREAD.get()) {
			return "tread";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_ECHO.get()) {
			return "echo";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SMELT.get()) {
			return "smelt";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_TOOL.get()) {
			return "tool";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SKULL.get()) {
			return "skull";
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_LIGHT.get()) {
			return "light";
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:spell")))) {
			return SelectSpellProcProcedure.execute(itemstack);
		}
		return "";
	}
}

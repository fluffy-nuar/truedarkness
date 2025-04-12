package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class SnihyEridiumGetActiveTimeProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_STREAM.get()) {
			return Math.round(2 - 0.75 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(2 - 0.75 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SEER.get()) {
			return Math.round(5 - 1.25 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(5 - 1.25 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_UNDYING.get()) {
			return Math.round(3 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(3 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_RUNE.get()) {
			return Math.round(3 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(3 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_TREAD.get()) {
			return Math.round(5 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(5 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_ECHO.get()) {
			return Math.round(4 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(4 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_TOOL.get()) {
			return Math.round(5 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(5 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SMELT.get()) {
			return Math.round(5 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(5 - 1.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_SKULL.get()) {
			return Math.round(2 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(2 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		} else if (itemstack.getItem() == TruedarknessModItems.SHINY_ERIDIUM_LIGHT.get()) {
			return Math.round(2 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage")) < 0 ? 0 : Math.round(2 - 0.5 * itemstack.getOrCreateTag().getDouble("ActiveStage"));
		}
		return 0;
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class EffectGetProcProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == Items.GOLDEN_CARROT) {
			return "minecraft:night_vision";
		} else if (itemstack.getItem() == Items.RABBIT_FOOT) {
			return "minecraft:jump_boost";
		} else if (itemstack.getItem() == Items.MAGMA_CREAM) {
			return "minecraft:fire_resistance";
		} else if (itemstack.getItem() == Items.SUGAR) {
			return "minecraft:speed";
		} else if (itemstack.getItem() == Items.PUFFERFISH) {
			return "minecraft:water_breathing";
		} else if (itemstack.getItem() == Items.SPIDER_EYE) {
			return "minecraft:poison";
		} else if (itemstack.getItem() == Items.GHAST_TEAR) {
			return "minecraft:regeneration";
		} else if (itemstack.getItem() == Items.BLAZE_POWDER) {
			return "minecraft:strength";
		} else if (itemstack.getItem() == Items.FERMENTED_SPIDER_EYE) {
			return "minecraft:weakness";
		}
		return "";
	}
}

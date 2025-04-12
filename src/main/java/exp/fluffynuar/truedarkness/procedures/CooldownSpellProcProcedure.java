package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class CooldownSpellProcProcedure {
	public static double execute(ItemStack itemstack, boolean sandglass, double add, double legend) {
		if (itemstack.getItem() == TruedarknessModItems.SPELL_BLINK.get()) {
			return sandglass ? 120 : 240;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_HASTE.get()) {
			return sandglass ? 160 : 320;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_PETS.get()) {
			return sandglass ? 140 : 280;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_DISO.get()) {
			return sandglass ? 140 : 280;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_HUNGER.get()) {
			return sandglass ? 140 : 280;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_AFRAID.get()) {
			return sandglass ? 330 : 660;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_GUST.get()) {
			return sandglass ? 80 : 160;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_WEATHER.get()) {
			return sandglass ? 330 : 660;
		}
		if (itemstack.getItem() == TruedarknessModItems.SPELL_SHOT.get()) {
			return sandglass ? 80 : 160;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_DASH.get()) {
			return sandglass ? 40 : 80;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_MEET.get()) {
			return sandglass ? 160 : 320;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_BOMB.get()) {
			return sandglass ? 160 : 320;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_TELEPORT.get()) {
			return sandglass ? 140 : 280;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_POTION.get()) {
			return sandglass ? 140 : 280;
		} else if (itemstack.getItem() == TruedarknessModItems.SIDE_NATURE.get()) {
			return sandglass ? 10 : 20;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_LINE.get()) {
			return add * ((sandglass ? 7 : 14) - legend) + 10;
		}
		if (itemstack.getItem() == TruedarknessModItems.SPELL_DIVE.get()) {
			return sandglass ? 100 : 200;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_FEET.get()) {
			return sandglass ? 400 : 800;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_HIDE.get()) {
			return sandglass ? 300 : 600;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_FANG.get()) {
			return sandglass ? 100 : 200;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_AQUA.get()) {
			return sandglass ? 300 : 600;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_REGEN.get()) {
			return sandglass ? 300 : 600;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_EYE.get()) {
			return sandglass ? 200 : 400;
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_SMELT.get()) {
			if (sandglass) {
				return legend >= 1 ? 20 : 90;
			}
			return legend >= 1 ? 40 : 180;
		}
		return 0;
	}
}

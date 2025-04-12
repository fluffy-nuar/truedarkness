package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class SelectSpellProcProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getItem() == TruedarknessModItems.SPELL_BLINK.get()) {
			return "blink";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_HASTE.get()) {
			return "haste";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_PETS.get()) {
			return "pets";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_DISO.get()) {
			return "diso";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_HUNGER.get()) {
			return "hunger";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_AFRAID.get()) {
			return "afraid";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_GUST.get()) {
			return "gust";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_WEATHER.get()) {
			return "weather";
		}
		if (itemstack.getItem() == TruedarknessModItems.SPELL_SHOT.get()) {
			return "shot";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_DASH.get()) {
			return "dash";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_MEET.get()) {
			return "meet";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_BOMB.get()) {
			return "bomb";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_TELEPORT.get()) {
			return "teleport";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_POTION.get()) {
			return "potion";
		} else if (itemstack.getItem() == TruedarknessModItems.SIDE_NATURE.get()) {
			return "nature";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_LINE.get()) {
			return "line";
		}
		if (itemstack.getItem() == TruedarknessModItems.SPELL_DIVE.get()) {
			return "dive";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_FEET.get()) {
			return "feet";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_HIDE.get()) {
			return "hide";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_FANG.get()) {
			return "fang";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_AQUA.get()) {
			return "aqua";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_REGEN.get()) {
			return "regen";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_EYE.get()) {
			return "eye";
		} else if (itemstack.getItem() == TruedarknessModItems.SPELL_SMELT.get()) {
			return "smelt";
		}
		return "";
	}
}

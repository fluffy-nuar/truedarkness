package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

public class SideSpell0TextProcedure {
	public static String execute(ItemStack itemstack) {
		if (Screen.hasShiftDown()) {
			if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
				return Component.translatable("item.truedarkness.spell.desc").getString();
			} else {
				return Component.translatable("item.truedarkness.metenite_crystal.desc").getString();
			}
		}
		return "\u00A77" + Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString();
	}
}

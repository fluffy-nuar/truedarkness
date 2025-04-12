package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

public class ManuscriptDopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		if (Screen.hasShiftDown()) {
			if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
				return Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString();
			} else {
				return Component.translatable("item.truedarkness.metenite_crystal.desc").getString();
			}
		} else if (!(itemstack.getOrCreateTag().getString("manuscript_desc")).contains(".desc") && !(itemstack.getOrCreateTag().getString("manuscript_desc")).contains(".met")
				&& !(itemstack.getOrCreateTag().getString("manuscript_desc")).contains(".dark")) {
			return "\u00A77" + Component.translatable("item.truedarkness.magnifier.empty").getString();
		}
		return "\u00A77" + Component.translatable((itemstack.getOrCreateTag().getString("manuscript_desc"))).getString();
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

public class ShinyEridiumDashDopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("ActiveStage") == 10) {
			return "\u00A77" + Component.translatable("item.truedarkness.shiny_eridium_sus").getString();
		}
		if (Screen.hasShiftDown()) {
			if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
				return Component.translatable("item.truedarkness.shiny_eridium.desc").getString();
			} else {
				return Component.translatable("item.truedarkness.dark_crystal.desc").getString();
			}
		}
		return "\u00A77" + Component.translatable(("item.truedarkness." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).substring(13) + ".desc")).getString() + " "
				+ (itemstack.getOrCreateTag().getDouble("ActiveStage") == 0 ? "I" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 1 ? "II" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 2 ? "III" : "")
				+ (itemstack.getOrCreateTag().getDouble("ActiveStage") == 3 ? "IV" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 4 ? "V" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 5 ? "VI" : "")
				+ (itemstack.getOrCreateTag().getDouble("ActiveStage") == 6 ? "VII" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 7 ? "VIII" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 8 ? "IX" : "");
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class CursedChains1DopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
			return Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString();
		}
		return Component.translatable("item.truedarkness.dark_crystal.desc").getString();
	}
}

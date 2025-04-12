package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class CarvingKnifeDopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		if ((itemstack.getOrCreateTag().getString("Type")).equals("bricks")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.bricks").getString();
		} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.wall").getString();
		} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.stairs").getString();
		} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.slab").getString();
		} else if ((itemstack.getOrCreateTag().getString("Type")).equals("chiseled")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.chiseled").getString();
		} else if ((itemstack.getOrCreateTag().getString("Type")).equals("smooth")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.smooth").getString();
		} else if ((itemstack.getOrCreateTag().getString("Type")).equals("polished")) {
			return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.polished").getString();
		}
		return "\u00A77" + Component.translatable("item.truedarkness.carving_knife.none").getString();
	}
}

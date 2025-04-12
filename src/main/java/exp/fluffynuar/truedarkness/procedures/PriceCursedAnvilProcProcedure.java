package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class PriceCursedAnvilProcProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			return 79;
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))) {
			return 98;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			return 79;
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_LEATHER.get()) {
			return 112;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_HEART.get()) {
			return 68;
		} else if (itemstack.getItem() == TruedarknessModItems.ANCIENT_REGULATION.get()) {
			return 160;
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:firenite_tools")))) {
			return 56;
		} else if (itemstack.getItem() == TruedarknessModItems.REEL.get()) {
			return 112;
		} else if (itemstack.getItem() == TruedarknessModItems.CUP.get()) {
			return 100;
		} else if (itemstack.getItem() == Items.LEATHER) {
			return 112;
		} else if (itemstack.getItem() == Items.BOWL) {
			return 100;
		} else if (itemstack.getItem() == Items.BUCKET) {
			return 100;
		} else if (itemstack.getItem() == TruedarknessModItems.SANDGLASS.get()) {
			return 109;
		} else if (itemstack.getItem() == TruedarknessModBlocks.CORRUPTED_SCULK_CATALYST.get().asItem()) {
			return 110;
		} else if (itemstack.getItem() == TruedarknessModItems.DARK_MAGNIFIER.get()) {
			return 109;
		} else if (itemstack.getItem() == TruedarknessModItems.EMPTY_CHISELED_GLASS_SHARD.get()) {
			return 109;
		}
		return 0;
	}
}

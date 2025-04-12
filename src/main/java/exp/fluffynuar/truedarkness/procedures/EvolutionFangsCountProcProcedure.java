package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class EvolutionFangsCountProcProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			return 1;
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))) {
			return 1;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_LEATHER.get()) {
			return 2;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_HEART.get()) {
			return 2;
		} else if (itemstack.getItem() == TruedarknessModItems.ANCIENT_REGULATION.get()) {
			return 8;
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:firenite_tools")))) {
			return 4;
		} else if (itemstack.getItem() == TruedarknessModItems.REEL.get()) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModItems.CUP.get()) {
			return 3;
		} else if (itemstack.getItem() == Items.LEATHER) {
			return 2;
		} else if (itemstack.getItem() == Items.BOWL) {
			return 2;
		} else if (itemstack.getItem() == Items.BUCKET) {
			return 1;
		} else if (itemstack.getItem() == TruedarknessModItems.SANDGLASS.get()) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModBlocks.CORRUPTED_SCULK_CATALYST.get().asItem()) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModItems.DARK_MAGNIFIER.get()) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModItems.EMPTY_CHISELED_GLASS_SHARD.get()) {
			return 3;
		}
		return 0;
	}
}

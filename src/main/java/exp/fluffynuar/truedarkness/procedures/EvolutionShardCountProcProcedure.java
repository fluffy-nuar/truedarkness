package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class EvolutionShardCountProcProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			return 3;
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			return 5;
		} else if (itemstack.getItem() == TruedarknessModItems.CURSED_LEATHER.get()) {
			return 4;
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_HEART.get()) {
			return 3;
		} else if (itemstack.getItem() == TruedarknessModItems.ANCIENT_REGULATION.get()) {
			return 14;
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:firenite_tools")))) {
			return 6;
		} else if (itemstack.getItem() == TruedarknessModItems.REEL.get()) {
			return 13;
		} else if (itemstack.getItem() == TruedarknessModItems.CUP.get()) {
			return 9;
		} else if (itemstack.getItem() == Items.LEATHER) {
			return 4;
		} else if (itemstack.getItem() == Items.BOWL) {
			return 7;
		} else if (itemstack.getItem() == Items.BUCKET) {
			return 11;
		} else if (itemstack.getItem() == TruedarknessModItems.SANDGLASS.get()) {
			return 5;
		} else if (itemstack.getItem() == TruedarknessModBlocks.CORRUPTED_SCULK_CATALYST.get().asItem()) {
			return 5;
		} else if (itemstack.getItem() == TruedarknessModItems.DARK_MAGNIFIER.get()) {
			return 12;
		} else if (itemstack.getItem() == TruedarknessModItems.EMPTY_CHISELED_GLASS_SHARD.get()) {
			return 12;
		}
		return 0;
	}
}

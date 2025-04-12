package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import java.util.List;

import exp.fluffynuar.truedarkness.jei_recipes.ConvertingRecipe;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class EchoCarvingKnifePriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((itemstack.getOrCreateTag().getString("Type")).equals("bricks")) {
				itemstack.getOrCreateTag().putString("Type", "polished");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.polished").getString())), true);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("polished")) {
				itemstack.getOrCreateTag().putString("Type", "smooth");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.smooth").getString())), true);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("smooth")) {
				itemstack.getOrCreateTag().putString("Type", "chiseled");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.chiseled").getString())), true);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("chiseled")) {
				itemstack.getOrCreateTag().putString("Type", "stairs");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.stairs").getString())), true);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs")) {
				itemstack.getOrCreateTag().putString("Type", "slab");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.slab").getString())), true);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab")) {
				itemstack.getOrCreateTag().putString("Type", "wall");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.wall").getString())), true);
			} else {
				itemstack.getOrCreateTag().putString("Type", "bricks");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.carving_knife.bricks").getString())), true);
			}
		} else {
			if (!blockstate.is(BlockTags.create(new ResourceLocation("truedarkness:blacklist_carving")))) {
				if (!(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":stripped_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_stairs")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
						&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
								(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_stairs"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks")
						&& !(ForgeRegistries.BLOCKS.getValue(
								new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "stairs"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_slab")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
						&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
								(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_slab"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "slab"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_wall")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
						&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
								(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_wall"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "fence"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("chiseled") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":chiseled_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("polished") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":polished_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("smooth") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":smooth_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("bricks") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_bricks")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if (!((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
							for (ConvertingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
									continue;
								if (!ingredients.get(1).test(itemstack))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == Blocks.AIR.asItem())) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				} else if (!((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
							for (ConvertingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
									continue;
								if (!ingredients.get(1).test(new ItemStack(TruedarknessModItems.CARVING_KNIFE.get())))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == Blocks.AIR.asItem())) {
					CarvingWorkingProcProcedure.execute(world, x, y, z, blockstate, entity, itemstack);
				}
			}
		}
	}
}

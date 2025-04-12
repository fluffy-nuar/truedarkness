package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.NonNullList;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;

import exp.fluffynuar.truedarkness.jei_recipes.SamovarRecipeTypeRecipe;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEnchantments;

public class SamovarGUIPokaEtotGUIOtkrytProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.CHARCOAL
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.COAL) {
			if (!((new Object() {
				public ItemStack getResult() {
					if (world instanceof Level _lvl) {
						net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
						List<SamovarRecipeTypeRecipe> recipes = rm.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
						for (SamovarRecipeTypeRecipe recipe : recipes) {
							NonNullList<Ingredient> ingredients = recipe.getIngredients();
							if (!ingredients.get(0).test(new ItemStack(TruedarknessModItems.MILK_CUP.get())))
								continue;
							if (!ingredients.get(1).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)))
								continue;
							if (!ingredients.get(2).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)))
								continue;
							return recipe.getResultItem(null);
						}
					}
					return ItemStack.EMPTY;
				}
			}.getResult()).getItem() == Blocks.AIR.asItem())) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.MILK_BUCKET
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CUP
								.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == TruedarknessModItems.MILK_CUP.get()) {
					if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == (new Object() {
						public ItemStack getResult() {
							if (world instanceof Level _lvl) {
								net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
								List<SamovarRecipeTypeRecipe> recipes = rm.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
								for (SamovarRecipeTypeRecipe recipe : recipes) {
									NonNullList<Ingredient> ingredients = recipe.getIngredients();
									if (!ingredients.get(0).test(new ItemStack(TruedarknessModItems.MILK_CUP.get())))
										continue;
									if (!ingredients.get(1).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)))
										continue;
									if (!ingredients.get(2).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)))
										continue;
									return recipe.getResultItem(null);
								}
							}
							return ItemStack.EMPTY;
						}
					}.getResult()).getItem())) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<SamovarRecipeTypeRecipe> recipes = rm.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
										for (SamovarRecipeTypeRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test(new ItemStack(TruedarknessModItems.MILK_CUP.get())))
												continue;
											if (!ingredients.get(1)
													.test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)))
												continue;
											if (!ingredients.get(2)
													.test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()).copy();
							_setstack.setCount(1);
							((Slot) _slots.get(6)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						{
							Map<Enchantment, Integer> _enchantments = EnchantmentHelper
									.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY));
							if (_enchantments.containsKey(TruedarknessModEnchantments.BEST_VESSEL.get())) {
								_enchantments.remove(TruedarknessModEnchantments.BEST_VESSEL.get());
								EnchantmentHelper.setEnchantments(_enchantments,
										(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY));
							}
						}
					} else {
						if (!(EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.BEST_VESSEL.get(),
								(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)) != 0)) {
							(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
									.enchant(TruedarknessModEnchantments.BEST_VESSEL.get(), 1);
						}
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(6)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if (!((new Object() {
				public ItemStack getResult() {
					if (world instanceof Level _lvl) {
						net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
						List<SamovarRecipeTypeRecipe> recipes = rm.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
						for (SamovarRecipeTypeRecipe recipe : recipes) {
							NonNullList<Ingredient> ingredients = recipe.getIngredients();
							if (!ingredients.get(0).test(new ItemStack(TruedarknessModItems.CUP_WATER.get())))
								continue;
							if (!ingredients.get(1).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)))
								continue;
							if (!ingredients.get(2).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)))
								continue;
							return recipe.getResultItem(null);
						}
					}
					return ItemStack.EMPTY;
				}
			}.getResult()).getItem() == Blocks.AIR.asItem())) {
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.POWDER_SNOW_BUCKET)
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CUP
								.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == TruedarknessModItems.CUP_WATER.get()) {
					if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == (new Object() {
						public ItemStack getResult() {
							if (world instanceof Level _lvl) {
								net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
								List<SamovarRecipeTypeRecipe> recipes = rm.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
								for (SamovarRecipeTypeRecipe recipe : recipes) {
									NonNullList<Ingredient> ingredients = recipe.getIngredients();
									if (!ingredients.get(0).test(new ItemStack(TruedarknessModItems.CUP_WATER.get())))
										continue;
									if (!ingredients.get(1).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)))
										continue;
									if (!ingredients.get(2).test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)))
										continue;
									return recipe.getResultItem(null);
								}
							}
							return ItemStack.EMPTY;
						}
					}.getResult()).getItem())) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<SamovarRecipeTypeRecipe> recipes = rm.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
										for (SamovarRecipeTypeRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test(new ItemStack(TruedarknessModItems.CUP_WATER.get())))
												continue;
											if (!ingredients.get(1)
													.test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)))
												continue;
											if (!ingredients.get(2)
													.test((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()).copy();
							_setstack.setCount(1);
							((Slot) _slots.get(6)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						{
							Map<Enchantment, Integer> _enchantments = EnchantmentHelper
									.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY));
							if (_enchantments.containsKey(TruedarknessModEnchantments.BEST_VESSEL.get())) {
								_enchantments.remove(TruedarknessModEnchantments.BEST_VESSEL.get());
								EnchantmentHelper.setEnchantments(_enchantments,
										(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY));
							}
						}
					} else {
						if (!(EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.BEST_VESSEL.get(),
								(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)) != 0)) {
							(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
									.enchant(TruedarknessModEnchantments.BEST_VESSEL.get(), 1);
						}
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(6)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(6)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(6)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}


package exp.fluffynuar.truedarkness.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

import exp.fluffynuar.truedarkness.jei_recipes.SamovarRecipeTypeRecipeCategory;
import exp.fluffynuar.truedarkness.jei_recipes.SamovarRecipeTypeRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.CursedSmeltingRecipeCategory;
import exp.fluffynuar.truedarkness.jei_recipes.CursedSmeltingRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.CursedAnvilRecipeTypeRecipeCategory;
import exp.fluffynuar.truedarkness.jei_recipes.CursedAnvilRecipeTypeRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.ConvertingRecipeCategory;
import exp.fluffynuar.truedarkness.jei_recipes.ConvertingRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.BlacksmiteForgeRecipeTypeRecipeCategory;
import exp.fluffynuar.truedarkness.jei_recipes.BlacksmiteForgeRecipeTypeRecipe;

@JeiPlugin
public class TruedarknessModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<BlacksmiteForgeRecipeTypeRecipe> BlacksmiteForgeRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(BlacksmiteForgeRecipeTypeRecipeCategory.UID, BlacksmiteForgeRecipeTypeRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<SamovarRecipeTypeRecipe> SamovarRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(SamovarRecipeTypeRecipeCategory.UID, SamovarRecipeTypeRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<ConvertingRecipe> Converting_Type = new mezz.jei.api.recipe.RecipeType<>(ConvertingRecipeCategory.UID, ConvertingRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CursedAnvilRecipeTypeRecipe> CursedAnvilRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(CursedAnvilRecipeTypeRecipeCategory.UID, CursedAnvilRecipeTypeRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CursedSmeltingRecipe> CursedSmelting_Type = new mezz.jei.api.recipe.RecipeType<>(CursedSmeltingRecipeCategory.UID, CursedSmeltingRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("truedarkness:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new BlacksmiteForgeRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new SamovarRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new ConvertingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CursedAnvilRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CursedSmeltingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<BlacksmiteForgeRecipeTypeRecipe> BlacksmiteForgeRecipeTypeRecipes = recipeManager.getAllRecipesFor(BlacksmiteForgeRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(BlacksmiteForgeRecipeType_Type, BlacksmiteForgeRecipeTypeRecipes);
		List<SamovarRecipeTypeRecipe> SamovarRecipeTypeRecipes = recipeManager.getAllRecipesFor(SamovarRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(SamovarRecipeType_Type, SamovarRecipeTypeRecipes);
		List<ConvertingRecipe> ConvertingRecipes = recipeManager.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
		registration.addRecipes(Converting_Type, ConvertingRecipes);
		List<CursedAnvilRecipeTypeRecipe> CursedAnvilRecipeTypeRecipes = recipeManager.getAllRecipesFor(CursedAnvilRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(CursedAnvilRecipeType_Type, CursedAnvilRecipeTypeRecipes);
		List<CursedSmeltingRecipe> CursedSmeltingRecipes = recipeManager.getAllRecipesFor(CursedSmeltingRecipe.Type.INSTANCE);
		registration.addRecipes(CursedSmelting_Type, CursedSmeltingRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(TruedarknessModBlocks.BLACKSMITE_FORGE.get().asItem()), BlacksmiteForgeRecipeType_Type);
		registration.addRecipeCatalyst(new ItemStack(TruedarknessModBlocks.SAMOVAR.get().asItem()), SamovarRecipeType_Type);
		registration.addRecipeCatalyst(new ItemStack(TruedarknessModBlocks.CURSED_ANVIL.get().asItem()), CursedAnvilRecipeType_Type);
		registration.addRecipeCatalyst(new ItemStack(TruedarknessModBlocks.CURSED_FURNACE.get().asItem()), CursedSmelting_Type);
	}
}

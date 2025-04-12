
package exp.fluffynuar.truedarkness.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiBrewingRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class TruedarknessModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("truedarkness:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		List<ItemStack> ingredientStack = new ArrayList<>();
		List<ItemStack> inputStack = new ArrayList<>();
		ingredientStack.add(new ItemStack(TruedarknessModBlocks.CORRUPT.get()));
		inputStack.add(new ItemStack(Items.GLASS_BOTTLE));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(TruedarknessModItems.GLASS_BOTTLE_CORRUPT.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(TruedarknessModBlocks.SWAMP_SEAWEED.get()));
		inputStack.add(new ItemStack(Items.INK_SAC));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(Items.GLOW_INK_SAC)));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(TruedarknessModItems.SCULKED_APPLE.get()));
		inputStack.add(new ItemStack(Items.GLASS_BOTTLE));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(TruedarknessModItems.SCULK_MANA_BOTTLE.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(TruedarknessModItems.SOUL_CRYSTAL.get()));
		inputStack.add(new ItemStack(Items.GLASS_BOTTLE));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(TruedarknessModItems.SOUL_BOTTLE.get())));
		inputStack.clear();
		ingredientStack.clear();
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}

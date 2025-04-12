
package exp.fluffynuar.truedarkness.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

import exp.fluffynuar.truedarkness.init.TruedarknessModJeiPlugin;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class BlacksmiteForgeRecipeTypeRecipeCategory implements IRecipeCategory<BlacksmiteForgeRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("truedarkness", "blacksmite_forge_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("truedarkness", "textures/screens/blacksmite_forge_recipe.png");
	private final IDrawable background;
	private final IDrawable icon;

	public BlacksmiteForgeRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 126, 73);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TruedarknessModBlocks.BLACKSMITE_FORGE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<BlacksmiteForgeRecipeTypeRecipe> getRecipeType() {
		return TruedarknessModJeiPlugin.BlacksmiteForgeRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Forging");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, BlacksmiteForgeRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 47).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 47).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 47).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 55, 9).addItemStack(recipe.getResultItem(null));
	}
}

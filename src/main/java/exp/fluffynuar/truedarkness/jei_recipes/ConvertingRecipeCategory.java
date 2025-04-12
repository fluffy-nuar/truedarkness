
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
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class ConvertingRecipeCategory implements IRecipeCategory<ConvertingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("truedarkness", "converting");
	public final static ResourceLocation TEXTURE = new ResourceLocation("truedarkness", "textures/screens/converting.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ConvertingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 112, 80);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TruedarknessModItems.CONVERTING_GUI_ITEM.get()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ConvertingRecipe> getRecipeType() {
		return TruedarknessModJeiPlugin.Converting_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Converting");
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
	public void setRecipe(IRecipeLayoutBuilder builder, ConvertingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 21, 43).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 48, 21).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 75, 43).addItemStack(recipe.getResultItem(null));
	}
}

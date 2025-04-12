
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

public class SamovarRecipeTypeRecipeCategory implements IRecipeCategory<SamovarRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("truedarkness", "samovar_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("truedarkness", "textures/screens/samovar_recipe.png");
	private final IDrawable background;
	private final IDrawable icon;

	public SamovarRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 112, 80);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TruedarknessModBlocks.SAMOVAR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<SamovarRecipeTypeRecipe> getRecipeType() {
		return TruedarknessModJeiPlugin.SamovarRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Samovar Recipe Type");
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
	public void setRecipe(IRecipeLayoutBuilder builder, SamovarRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 30, 48).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 48, 48).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 66, 48).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 48, 11).addItemStack(recipe.getResultItem(null));
	}
}

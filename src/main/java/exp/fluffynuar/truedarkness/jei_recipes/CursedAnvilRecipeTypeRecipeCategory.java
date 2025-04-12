
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

public class CursedAnvilRecipeTypeRecipeCategory implements IRecipeCategory<CursedAnvilRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("truedarkness", "cursed_anvil_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("truedarkness", "textures/screens/cursed_anvil_jei_gui_layer.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CursedAnvilRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 162, 52);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TruedarknessModBlocks.CURSED_ANVIL.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CursedAnvilRecipeTypeRecipe> getRecipeType() {
		return TruedarknessModJeiPlugin.CursedAnvilRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Cursed Upgrade");
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
	public void setRecipe(IRecipeLayoutBuilder builder, CursedAnvilRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 18, 18).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 18).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 18).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 128, 18).addItemStack(recipe.getResultItem(null));
	}
}

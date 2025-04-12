
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

public class CursedSmeltingRecipeCategory implements IRecipeCategory<CursedSmeltingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("truedarkness", "cursed_smelting");
	public final static ResourceLocation TEXTURE = new ResourceLocation("truedarkness", "textures/screens/cursed_furnace_recipe.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CursedSmeltingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 119, 38);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TruedarknessModBlocks.CURSED_FURNACE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CursedSmeltingRecipe> getRecipeType() {
		return TruedarknessModJeiPlugin.CursedSmelting_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Cursed Smelting");
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
	public void setRecipe(IRecipeLayoutBuilder builder, CursedSmeltingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 13, 11).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 31, 11).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 11).addItemStack(recipe.getResultItem(null));
	}
}

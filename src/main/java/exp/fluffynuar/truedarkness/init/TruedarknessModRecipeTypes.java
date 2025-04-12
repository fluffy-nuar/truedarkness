package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import exp.fluffynuar.truedarkness.jei_recipes.SamovarRecipeTypeRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.CursedSmeltingRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.CursedAnvilRecipeTypeRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.ConvertingRecipe;
import exp.fluffynuar.truedarkness.jei_recipes.BlacksmiteForgeRecipeTypeRecipe;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(modid = TruedarknessMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "truedarkness");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("blacksmite_forge_recipe_type", () -> BlacksmiteForgeRecipeTypeRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("samovar_recipe_type", () -> SamovarRecipeTypeRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("converting", () -> ConvertingRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("cursed_anvil_recipe_type", () -> CursedAnvilRecipeTypeRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("cursed_smelting", () -> CursedSmeltingRecipe.Serializer.INSTANCE);
		});
	}
}

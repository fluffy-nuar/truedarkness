
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import exp.fluffynuar.truedarkness.world.features.VinesOfTearsFeature;
import exp.fluffynuar.truedarkness.world.features.VinesOfTears0Feature;
import exp.fluffynuar.truedarkness.world.features.UnclearSandOfMissingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.TrapSandOfMissingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SwampWastelandGenerationFeature;
import exp.fluffynuar.truedarkness.world.features.SwampSoilFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SwampSeaweedFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SwampClayFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SeekerPlantGenFeature;
import exp.fluffynuar.truedarkness.world.features.SeaweadOfyteriaFeature;
import exp.fluffynuar.truedarkness.world.features.SeaweadOfyteria1Feature;
import exp.fluffynuar.truedarkness.world.features.SeaweadOfyteria0Feature;
import exp.fluffynuar.truedarkness.world.features.SandstoneOfMissingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.PoisonerGenerationFeature;
import exp.fluffynuar.truedarkness.world.features.NeaskyTreeFeature;
import exp.fluffynuar.truedarkness.world.features.MeaskyTreeGenFeature;
import exp.fluffynuar.truedarkness.world.features.MeaskyTreeBoneMealFeature;
import exp.fluffynuar.truedarkness.world.features.LampsFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.KelpOfYteriaFeature;
import exp.fluffynuar.truedarkness.world.features.KelpOfYteria1Feature;
import exp.fluffynuar.truedarkness.world.features.KelpOfYteria0Feature;
import exp.fluffynuar.truedarkness.world.features.HangingCorruptFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.HangingCorruptAnotherBiomeFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.GlowVineFeature;
import exp.fluffynuar.truedarkness.world.features.DarknessSpruceBoxFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.CryingForestTreesFeature;
import exp.fluffynuar.truedarkness.world.features.CorruptedVinesFeature;
import exp.fluffynuar.truedarkness.world.features.CorruptedBushGenFeature;
import exp.fluffynuar.truedarkness.world.features.CorruptFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Corrupt1FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Corrupt0FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.BubbleYteriaFeature;
import exp.fluffynuar.truedarkness.world.features.BubbleYteria0Feature;
import exp.fluffynuar.truedarkness.world.features.BigLightFungusFeature;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber
public class TruedarknessModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TruedarknessMod.MODID);
	public static final RegistryObject<Feature<?>> BIG_LIGHT_FUNGUS = REGISTRY.register("big_light_fungus", BigLightFungusFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_WASTELAND_GENERATION = REGISTRY.register("swamp_wasteland_generation", SwampWastelandGenerationFeature::new);
	public static final RegistryObject<Feature<?>> VINES_OF_TEARS = REGISTRY.register("vines_of_tears", VinesOfTearsFeature::new);
	public static final RegistryObject<Feature<?>> VINES_OF_TEARS_0 = REGISTRY.register("vines_of_tears_0", VinesOfTears0Feature::new);
	public static final RegistryObject<Feature<?>> KELP_OF_YTERIA = REGISTRY.register("kelp_of_yteria", KelpOfYteriaFeature::new);
	public static final RegistryObject<Feature<?>> KELP_OF_YTERIA_0 = REGISTRY.register("kelp_of_yteria_0", KelpOfYteria0Feature::new);
	public static final RegistryObject<Feature<?>> KELP_OF_YTERIA_1 = REGISTRY.register("kelp_of_yteria_1", KelpOfYteria1Feature::new);
	public static final RegistryObject<Feature<?>> SEAWEAD_OFYTERIA = REGISTRY.register("seawead_ofyteria", SeaweadOfyteriaFeature::new);
	public static final RegistryObject<Feature<?>> SEAWEAD_OFYTERIA_0 = REGISTRY.register("seawead_ofyteria_0", SeaweadOfyteria0Feature::new);
	public static final RegistryObject<Feature<?>> SEAWEAD_OFYTERIA_1 = REGISTRY.register("seawead_ofyteria_1", SeaweadOfyteria1Feature::new);
	public static final RegistryObject<Feature<?>> BUBBLE_YTERIA = REGISTRY.register("bubble_yteria", BubbleYteriaFeature::new);
	public static final RegistryObject<Feature<?>> BUBBLE_YTERIA_0 = REGISTRY.register("bubble_yteria_0", BubbleYteria0Feature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_FEATURE = REGISTRY.register("corrupt_feature", CorruptFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_SOIL_FEATURE = REGISTRY.register("swamp_soil_feature", SwampSoilFeatureFeature::new);
	public static final RegistryObject<Feature<?>> HANGING_CORRUPT_FEATURE = REGISTRY.register("hanging_corrupt_feature", HangingCorruptFeatureFeature::new);
	public static final RegistryObject<Feature<?>> HANGING_CORRUPT_ANOTHER_BIOME_FEATURE = REGISTRY.register("hanging_corrupt_another_biome_feature", HangingCorruptAnotherBiomeFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_SEAWEED_FEATURE = REGISTRY.register("swamp_seaweed_feature", SwampSeaweedFeatureFeature::new);
	public static final RegistryObject<Feature<?>> TRAP_SAND_OF_MISSING_FEATURE = REGISTRY.register("trap_sand_of_missing_feature", TrapSandOfMissingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> UNCLEAR_SAND_OF_MISSING_FEATURE = REGISTRY.register("unclear_sand_of_missing_feature", UnclearSandOfMissingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SANDSTONE_OF_MISSING_FEATURE = REGISTRY.register("sandstone_of_missing_feature", SandstoneOfMissingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> LAMPS_FEATURE = REGISTRY.register("lamps_feature", LampsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> DARKNESS_SPRUCE_BOX_FEATURE = REGISTRY.register("darkness_spruce_box_feature", DarknessSpruceBoxFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_CLAY_FEATURE = REGISTRY.register("swamp_clay_feature", SwampClayFeatureFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_1_FEATURE = REGISTRY.register("corrupt_1_feature", Corrupt1FeatureFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_0_FEATURE = REGISTRY.register("corrupt_0_feature", Corrupt0FeatureFeature::new);
	public static final RegistryObject<Feature<?>> GLOW_VINE = REGISTRY.register("glow_vine", GlowVineFeature::new);
	public static final RegistryObject<Feature<?>> SEEKER_PLANT_GEN = REGISTRY.register("seeker_plant_gen", SeekerPlantGenFeature::new);
	public static final RegistryObject<Feature<?>> NEASKY_TREE = REGISTRY.register("neasky_tree", NeaskyTreeFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPTED_BUSH_GEN = REGISTRY.register("corrupted_bush_gen", CorruptedBushGenFeature::new);
	public static final RegistryObject<Feature<?>> MEASKY_TREE_GEN = REGISTRY.register("measky_tree_gen", MeaskyTreeGenFeature::new);
	public static final RegistryObject<Feature<?>> CRYING_FOREST_TREES = REGISTRY.register("crying_forest_trees", CryingForestTreesFeature::new);
	public static final RegistryObject<Feature<?>> POISONER_GENERATION = REGISTRY.register("poisoner_generation", PoisonerGenerationFeature::new);
	public static final RegistryObject<Feature<?>> MEASKY_TREE_BONE_MEAL = REGISTRY.register("measky_tree_bone_meal", MeaskyTreeBoneMealFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPTED_VINES = REGISTRY.register("corrupted_vines", CorruptedVinesFeature::new);
}

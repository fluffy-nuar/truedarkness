
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
import exp.fluffynuar.truedarkness.world.features.VineFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine7FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine6FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine5FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine4FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine3FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine2FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine1FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine16FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Vine14FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.UnclearSandOfMissingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.TrapSandOfMissingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SwampWastelandGenerationFeature;
import exp.fluffynuar.truedarkness.world.features.SwampSoilFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SwampSeaweedFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SwampClayFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.SeaweadOfyteriaFeature;
import exp.fluffynuar.truedarkness.world.features.SeaweadOfyteria1Feature;
import exp.fluffynuar.truedarkness.world.features.SeaweadOfyteria0Feature;
import exp.fluffynuar.truedarkness.world.features.SandstoneOfMissingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.RuinedPortalFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.PrismarinumCoralWaveFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.PrismarinumCoralRichFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.PrismarinumCoralFlashingFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.PrismarinumCoralDarknessFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.PrismarinumCoralColourlessFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.OldShipFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.LampsFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.KelpOfYteriaFeature;
import exp.fluffynuar.truedarkness.world.features.KelpOfYteria1Feature;
import exp.fluffynuar.truedarkness.world.features.KelpOfYteria0Feature;
import exp.fluffynuar.truedarkness.world.features.KelpFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Kelp3FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Kelp2FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Kelp1FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.HangingCorruptFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.HangingCorruptAnotherBiomeFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.DarknessSpruceBoxFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.CorruptFeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Corrupt1FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.Corrupt0FeatureFeature;
import exp.fluffynuar.truedarkness.world.features.CoralFeature;
import exp.fluffynuar.truedarkness.world.features.BubbleYteriaFeature;
import exp.fluffynuar.truedarkness.world.features.BubbleYteria0Feature;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber
public class TruedarknessModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TruedarknessMod.MODID);
	public static final RegistryObject<Feature<?>> SWAMP_WASTELAND_GENERATION = REGISTRY.register("swamp_wasteland_generation", SwampWastelandGenerationFeature::new);
	public static final RegistryObject<Feature<?>> VINES_OF_TEARS = REGISTRY.register("vines_of_tears", VinesOfTearsFeature::new);
	public static final RegistryObject<Feature<?>> VINES_OF_TEARS_0 = REGISTRY.register("vines_of_tears_0", VinesOfTears0Feature::new);
	public static final RegistryObject<Feature<?>> KELP_OF_YTERIA = REGISTRY.register("kelp_of_yteria", KelpOfYteriaFeature::new);
	public static final RegistryObject<Feature<?>> KELP_OF_YTERIA_0 = REGISTRY.register("kelp_of_yteria_0", KelpOfYteria0Feature::new);
	public static final RegistryObject<Feature<?>> KELP_OF_YTERIA_1 = REGISTRY.register("kelp_of_yteria_1", KelpOfYteria1Feature::new);
	public static final RegistryObject<Feature<?>> SEAWEAD_OFYTERIA = REGISTRY.register("seawead_ofyteria", SeaweadOfyteriaFeature::new);
	public static final RegistryObject<Feature<?>> SEAWEAD_OFYTERIA_0 = REGISTRY.register("seawead_ofyteria_0", SeaweadOfyteria0Feature::new);
	public static final RegistryObject<Feature<?>> SEAWEAD_OFYTERIA_1 = REGISTRY.register("seawead_ofyteria_1", SeaweadOfyteria1Feature::new);
	public static final RegistryObject<Feature<?>> CORAL = REGISTRY.register("coral", CoralFeature::new);
	public static final RegistryObject<Feature<?>> BUBBLE_YTERIA = REGISTRY.register("bubble_yteria", BubbleYteriaFeature::new);
	public static final RegistryObject<Feature<?>> BUBBLE_YTERIA_0 = REGISTRY.register("bubble_yteria_0", BubbleYteria0Feature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_FEATURE = REGISTRY.register("corrupt_feature", CorruptFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_SOIL_FEATURE = REGISTRY.register("swamp_soil_feature", SwampSoilFeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_FEATURE = REGISTRY.register("vine_feature", VineFeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_1_FEATURE = REGISTRY.register("vine_1_feature", Vine1FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_2_FEATURE = REGISTRY.register("vine_2_feature", Vine2FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_3_FEATURE = REGISTRY.register("vine_3_feature", Vine3FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_4_FEATURE = REGISTRY.register("vine_4_feature", Vine4FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_5_FEATURE = REGISTRY.register("vine_5_feature", Vine5FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_6_FEATURE = REGISTRY.register("vine_6_feature", Vine6FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_7_FEATURE = REGISTRY.register("vine_7_feature", Vine7FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_14_FEATURE = REGISTRY.register("vine_14_feature", Vine14FeatureFeature::new);
	public static final RegistryObject<Feature<?>> VINE_16_FEATURE = REGISTRY.register("vine_16_feature", Vine16FeatureFeature::new);
	public static final RegistryObject<Feature<?>> HANGING_CORRUPT_FEATURE = REGISTRY.register("hanging_corrupt_feature", HangingCorruptFeatureFeature::new);
	public static final RegistryObject<Feature<?>> HANGING_CORRUPT_ANOTHER_BIOME_FEATURE = REGISTRY.register("hanging_corrupt_another_biome_feature", HangingCorruptAnotherBiomeFeatureFeature::new);
	public static final RegistryObject<Feature<?>> OLD_SHIP_FEATURE = REGISTRY.register("old_ship_feature", OldShipFeatureFeature::new);
	public static final RegistryObject<Feature<?>> KELP_FEATURE = REGISTRY.register("kelp_feature", KelpFeatureFeature::new);
	public static final RegistryObject<Feature<?>> KELP_1_FEATURE = REGISTRY.register("kelp_1_feature", Kelp1FeatureFeature::new);
	public static final RegistryObject<Feature<?>> KELP_2_FEATURE = REGISTRY.register("kelp_2_feature", Kelp2FeatureFeature::new);
	public static final RegistryObject<Feature<?>> KELP_3_FEATURE = REGISTRY.register("kelp_3_feature", Kelp3FeatureFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_SEAWEED_FEATURE = REGISTRY.register("swamp_seaweed_feature", SwampSeaweedFeatureFeature::new);
	public static final RegistryObject<Feature<?>> TRAP_SAND_OF_MISSING_FEATURE = REGISTRY.register("trap_sand_of_missing_feature", TrapSandOfMissingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> UNCLEAR_SAND_OF_MISSING_FEATURE = REGISTRY.register("unclear_sand_of_missing_feature", UnclearSandOfMissingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SANDSTONE_OF_MISSING_FEATURE = REGISTRY.register("sandstone_of_missing_feature", SandstoneOfMissingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> LAMPS_FEATURE = REGISTRY.register("lamps_feature", LampsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> DARKNESS_SPRUCE_BOX_FEATURE = REGISTRY.register("darkness_spruce_box_feature", DarknessSpruceBoxFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RUINED_PORTAL_FEATURE = REGISTRY.register("ruined_portal_feature", RuinedPortalFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SWAMP_CLAY_FEATURE = REGISTRY.register("swamp_clay_feature", SwampClayFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PRISMARINUM_CORAL_COLOURLESS_FEATURE = REGISTRY.register("prismarinum_coral_colourless_feature", PrismarinumCoralColourlessFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PRISMARINUM_CORAL_FLASHING_FEATURE = REGISTRY.register("prismarinum_coral_flashing_feature", PrismarinumCoralFlashingFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PRISMARINUM_CORAL_WAVE_FEATURE = REGISTRY.register("prismarinum_coral_wave_feature", PrismarinumCoralWaveFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PRISMARINUM_CORAL_RICH_FEATURE = REGISTRY.register("prismarinum_coral_rich_feature", PrismarinumCoralRichFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PRISMARINUM_CORAL_DARKNESS_FEATURE = REGISTRY.register("prismarinum_coral_darkness_feature", PrismarinumCoralDarknessFeatureFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_1_FEATURE = REGISTRY.register("corrupt_1_feature", Corrupt1FeatureFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_0_FEATURE = REGISTRY.register("corrupt_0_feature", Corrupt0FeatureFeature::new);
}

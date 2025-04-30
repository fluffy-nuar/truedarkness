
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.potion.TrialMobEffect;
import exp.fluffynuar.truedarkness.potion.ToxicVapourMobEffect;
import exp.fluffynuar.truedarkness.potion.ToolProtectionMobEffect;
import exp.fluffynuar.truedarkness.potion.TheAliveMobEffect;
import exp.fluffynuar.truedarkness.potion.TargetMobEffect;
import exp.fluffynuar.truedarkness.potion.StoryMobEffect;
import exp.fluffynuar.truedarkness.potion.StopRestodingMobEffect;
import exp.fluffynuar.truedarkness.potion.SoulstealWingsCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.SoulstealSpoolCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.SoulstealHeartCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.SnakeMasterMobEffect;
import exp.fluffynuar.truedarkness.potion.SkrezhalBreakingMobEffect;
import exp.fluffynuar.truedarkness.potion.ScratchMobEffect;
import exp.fluffynuar.truedarkness.potion.RuneProtectionMobEffect;
import exp.fluffynuar.truedarkness.potion.RuneDrawingMobEffect;
import exp.fluffynuar.truedarkness.potion.RemnantUsingMobEffect;
import exp.fluffynuar.truedarkness.potion.ReducedVisibilityMobEffect;
import exp.fluffynuar.truedarkness.potion.ReaperRestoreUpMobEffect;
import exp.fluffynuar.truedarkness.potion.ReactorRadientMobEffect;
import exp.fluffynuar.truedarkness.potion.PhantomProtectionMobEffect;
import exp.fluffynuar.truedarkness.potion.ParanoidMobEffect;
import exp.fluffynuar.truedarkness.potion.NosediveEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.HuntingMobEffect;
import exp.fluffynuar.truedarkness.potion.HarpEchoMobEffect;
import exp.fluffynuar.truedarkness.potion.FallingEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.EchoNosediveEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.EarthHungerEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.DealCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.CrystalTravelingEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.CorruptedRemnantUsingMobEffect;
import exp.fluffynuar.truedarkness.potion.CorruptedEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.CalmMobEffect;
import exp.fluffynuar.truedarkness.potion.BloodshedMobEffect;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TruedarknessMod.MODID);
	public static final RegistryObject<MobEffect> CORRUPTING = REGISTRY.register("corrupting", () -> new TheAliveMobEffect());
	public static final RegistryObject<MobEffect> CALM = REGISTRY.register("calm", () -> new CalmMobEffect());
	public static final RegistryObject<MobEffect> THE_ALIVE = REGISTRY.register("the_alive", () -> new CorruptedEffectMobEffect());
	public static final RegistryObject<MobEffect> REDUCED_VISIBILITY = REGISTRY.register("reduced_visibility", () -> new ReducedVisibilityMobEffect());
	public static final RegistryObject<MobEffect> STORY = REGISTRY.register("story", () -> new StoryMobEffect());
	public static final RegistryObject<MobEffect> PHANTOM_PROTECTION = REGISTRY.register("phantom_protection", () -> new PhantomProtectionMobEffect());
	public static final RegistryObject<MobEffect> TOOL_PROTECTION = REGISTRY.register("tool_protection", () -> new ToolProtectionMobEffect());
	public static final RegistryObject<MobEffect> TABLET_BREAKING = REGISTRY.register("tablet_breaking", () -> new SkrezhalBreakingMobEffect());
	public static final RegistryObject<MobEffect> FALLING_EFFECT = REGISTRY.register("falling_effect", () -> new FallingEffectMobEffect());
	public static final RegistryObject<MobEffect> NOSEDIVE_EFFECT = REGISTRY.register("nosedive_effect", () -> new NosediveEffectMobEffect());
	public static final RegistryObject<MobEffect> SOULSTEAL_HEART_COOLDOWN = REGISTRY.register("soulsteal_heart_cooldown", () -> new SoulstealHeartCooldownMobEffect());
	public static final RegistryObject<MobEffect> SOULSTEAL_WINGS_COOLDOWN = REGISTRY.register("soulsteal_wings_cooldown", () -> new SoulstealWingsCooldownMobEffect());
	public static final RegistryObject<MobEffect> SOULSTEAL_SPOOL_COOLDOWN = REGISTRY.register("soulsteal_spool_cooldown", () -> new SoulstealSpoolCooldownMobEffect());
	public static final RegistryObject<MobEffect> HARP_ECHO = REGISTRY.register("harp_echo", () -> new HarpEchoMobEffect());
	public static final RegistryObject<MobEffect> DEAL_COOLDOWN = REGISTRY.register("deal_cooldown", () -> new DealCooldownMobEffect());
	public static final RegistryObject<MobEffect> TARGET = REGISTRY.register("target", () -> new TargetMobEffect());
	public static final RegistryObject<MobEffect> SNAKE_MASTER = REGISTRY.register("snake_master", () -> new SnakeMasterMobEffect());
	public static final RegistryObject<MobEffect> ECHO_NOSEDIVE_EFFECT = REGISTRY.register("echo_nosedive_effect", () -> new EchoNosediveEffectMobEffect());
	public static final RegistryObject<MobEffect> EARTH_HUNGER_EFFECT = REGISTRY.register("earth_hunger_effect", () -> new EarthHungerEffectMobEffect());
	public static final RegistryObject<MobEffect> PARANOID = REGISTRY.register("paranoid", () -> new ParanoidMobEffect());
	public static final RegistryObject<MobEffect> HUNTING = REGISTRY.register("hunting", () -> new HuntingMobEffect());
	public static final RegistryObject<MobEffect> STOP_RESTORING = REGISTRY.register("stop_restoring", () -> new StopRestodingMobEffect());
	public static final RegistryObject<MobEffect> RUNE_DRAWING = REGISTRY.register("rune_drawing", () -> new RuneDrawingMobEffect());
	public static final RegistryObject<MobEffect> RUNE_PROTECTION = REGISTRY.register("rune_protection", () -> new RuneProtectionMobEffect());
	public static final RegistryObject<MobEffect> BLOODSHED = REGISTRY.register("bloodshed", () -> new BloodshedMobEffect());
	public static final RegistryObject<MobEffect> REMNANT_USING = REGISTRY.register("remnant_using", () -> new RemnantUsingMobEffect());
	public static final RegistryObject<MobEffect> TRIAL = REGISTRY.register("trial", () -> new TrialMobEffect());
	public static final RegistryObject<MobEffect> CORRUPTED_REMNANT_USING = REGISTRY.register("corrupted_remnant_using", () -> new CorruptedRemnantUsingMobEffect());
	public static final RegistryObject<MobEffect> SCRATCH = REGISTRY.register("scratch", () -> new ScratchMobEffect());
	public static final RegistryObject<MobEffect> REACTOR_RADIENT = REGISTRY.register("reactor_radient", () -> new ReactorRadientMobEffect());
	public static final RegistryObject<MobEffect> TOXIC_VAPOUR = REGISTRY.register("toxic_vapour", () -> new ToxicVapourMobEffect());
	public static final RegistryObject<MobEffect> CRYSTAL_TRAVELING_EFFECT = REGISTRY.register("crystal_traveling_effect", () -> new CrystalTravelingEffectMobEffect());
	public static final RegistryObject<MobEffect> REAPER_RESTORE_UP = REGISTRY.register("reaper_restore_up", () -> new ReaperRestoreUpMobEffect());
}

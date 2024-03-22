
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.potion.ToolProtectionMobEffect;
import exp.fluffynuar.truedarkness.potion.TheAliveMobEffect;
import exp.fluffynuar.truedarkness.potion.TargetMobEffect;
import exp.fluffynuar.truedarkness.potion.StoryMobEffect;
import exp.fluffynuar.truedarkness.potion.SoulstealWingsCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.SoulstealSpoolCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.SoulstealHeartCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.SnakeMasterMobEffect;
import exp.fluffynuar.truedarkness.potion.SkrezhalBreakingMobEffect;
import exp.fluffynuar.truedarkness.potion.ReducedVisibilityMobEffect;
import exp.fluffynuar.truedarkness.potion.PhantomProtectionMobEffect;
import exp.fluffynuar.truedarkness.potion.NosediveEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.HarpEchoMobEffect;
import exp.fluffynuar.truedarkness.potion.FallingEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.EchoNosediveEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.EarthSaturationMobEffect;
import exp.fluffynuar.truedarkness.potion.EarthHungerEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.DealCooldownMobEffect;
import exp.fluffynuar.truedarkness.potion.CorruptedEffectMobEffect;
import exp.fluffynuar.truedarkness.potion.CalmMobEffect;
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
	public static final RegistryObject<MobEffect> SKREZHAL_BREAKING = REGISTRY.register("skrezhal_breaking", () -> new SkrezhalBreakingMobEffect());
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
	public static final RegistryObject<MobEffect> EARTH_SATURATION = REGISTRY.register("earth_saturation", () -> new EarthSaturationMobEffect());
	public static final RegistryObject<MobEffect> EARTH_HUNGER_EFFECT = REGISTRY.register("earth_hunger_effect", () -> new EarthHungerEffectMobEffect());
}

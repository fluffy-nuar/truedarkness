
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<SimpleParticleType> SAMP_POLLEN = REGISTRY.register("samp_pollen", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> WASTELAND_POLLEN = REGISTRY.register("wasteland_pollen", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> DUST = REGISTRY.register("dust", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CORRUPT_POLLEN = REGISTRY.register("corrupt_pollen", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FIRE_FLIES = REGISTRY.register("fire_flies", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FIREFLIES_PARTICLE = REGISTRY.register("fireflies_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CORRUPTED_SOUL = REGISTRY.register("corrupted_soul", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CORRUPTED_SPELL = REGISTRY.register("corrupted_spell", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CORRUPTED_BUBBLE_POP = REGISTRY.register("corrupted_bubble_pop", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> VANILLA_BUBBLE = REGISTRY.register("vanilla_bubble", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> MINE_GLOW = REGISTRY.register("mine_glow", () -> new SimpleParticleType(false));
}

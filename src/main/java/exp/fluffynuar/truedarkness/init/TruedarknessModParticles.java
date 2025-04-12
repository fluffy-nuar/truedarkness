
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import exp.fluffynuar.truedarkness.client.particle.WastelandPollenParticle;
import exp.fluffynuar.truedarkness.client.particle.VanillaBubbleParticle;
import exp.fluffynuar.truedarkness.client.particle.StarsParticle;
import exp.fluffynuar.truedarkness.client.particle.SoulyParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.SoulFlamePlayerParticle;
import exp.fluffynuar.truedarkness.client.particle.SoulFeatherParticle;
import exp.fluffynuar.truedarkness.client.particle.SmallSwampStarParticle;
import exp.fluffynuar.truedarkness.client.particle.SampPollenParticle;
import exp.fluffynuar.truedarkness.client.particle.RuneParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.PoisonSmokeParticle;
import exp.fluffynuar.truedarkness.client.particle.NeaskyParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.NeaskyLeavesParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.MineGlowParticle;
import exp.fluffynuar.truedarkness.client.particle.EridiumParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.EridiumFireParticle;
import exp.fluffynuar.truedarkness.client.particle.EchoBubbleParticle;
import exp.fluffynuar.truedarkness.client.particle.DustParticle;
import exp.fluffynuar.truedarkness.client.particle.CursedExplodeParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedSpellParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedSoulParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedSmellParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedPollenParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedLeavesParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedBubblePopParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptPollenParticle;
import exp.fluffynuar.truedarkness.client.particle.BloodParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.BadCorruptionParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TruedarknessModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(TruedarknessModParticleTypes.SAMP_POLLEN.get(), SampPollenParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.WASTELAND_POLLEN.get(), WastelandPollenParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.DUST.get(), DustParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPT_POLLEN.get(), CorruptPollenParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_SOUL.get(), CorruptedSoulParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_SPELL.get(), CorruptedSpellParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get(), CorruptedBubblePopParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.VANILLA_BUBBLE.get(), VanillaBubbleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.MINE_GLOW.get(), MineGlowParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.SOUL_FEATHER.get(), SoulFeatherParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.RUNE_PARTICLE.get(), RuneParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.ECHO_BUBBLE.get(), EchoBubbleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.BAD_CORRUPTION.get(), BadCorruptionParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.SOULY_PARTICLE.get(), SoulyParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.SOUL_FLAME_PLAYER.get(), SoulFlamePlayerParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.ERIDIUM_FIRE.get(), EridiumFireParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.STARS.get(), StarsParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_POLLEN_PARTICLE.get(), CorruptedPollenParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.SMALL_SWAMP_STAR.get(), SmallSwampStarParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_LEAVES_PARTICLE.get(), CorruptedLeavesParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.ERIDIUM_PARTICLE.get(), EridiumParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CURSED_EXPLODE.get(), CursedExplodeParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.NEASKY_LEAVES_PARTICLE.get(), NeaskyLeavesParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.NEASKY_PARTICLE.get(), NeaskyParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_SMELL.get(), CorruptedSmellParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.BLOOD_PARTICLE.get(), BloodParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.POISON_SMOKE.get(), PoisonSmokeParticle::provider);
	}
}


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
import exp.fluffynuar.truedarkness.client.particle.SampPollenParticle;
import exp.fluffynuar.truedarkness.client.particle.MineGlowParticle;
import exp.fluffynuar.truedarkness.client.particle.FirefliesParticleParticle;
import exp.fluffynuar.truedarkness.client.particle.FireFliesParticle;
import exp.fluffynuar.truedarkness.client.particle.DustParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedSpellParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedSoulParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptedBubblePopParticle;
import exp.fluffynuar.truedarkness.client.particle.CorruptPollenParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TruedarknessModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(TruedarknessModParticleTypes.SAMP_POLLEN.get(), SampPollenParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.WASTELAND_POLLEN.get(), WastelandPollenParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.DUST.get(), DustParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPT_POLLEN.get(), CorruptPollenParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.FIRE_FLIES.get(), FireFliesParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.FIREFLIES_PARTICLE.get(), FirefliesParticleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_SOUL.get(), CorruptedSoulParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_SPELL.get(), CorruptedSpellParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get(), CorruptedBubblePopParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.VANILLA_BUBBLE.get(), VanillaBubbleParticle::provider);
		event.registerSpriteSet(TruedarknessModParticleTypes.MINE_GLOW.get(), MineGlowParticle::provider);
	}
}

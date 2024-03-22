
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import exp.fluffynuar.truedarkness.client.renderer.WasteRunerRenderer;
import exp.fluffynuar.truedarkness.client.renderer.SoulstealWarriorRenderer;
import exp.fluffynuar.truedarkness.client.renderer.MinerRenderer;
import exp.fluffynuar.truedarkness.client.renderer.GlowBugRenderer;
import exp.fluffynuar.truedarkness.client.renderer.GeneralRenderer;
import exp.fluffynuar.truedarkness.client.renderer.FlowRenderer;
import exp.fluffynuar.truedarkness.client.renderer.EridiumZombieRenderer;
import exp.fluffynuar.truedarkness.client.renderer.EridiumGolemRenderer;
import exp.fluffynuar.truedarkness.client.renderer.CorruptedMageRenderer;
import exp.fluffynuar.truedarkness.client.renderer.CorruptedKnightRenderer;
import exp.fluffynuar.truedarkness.client.renderer.CorruptedHumanRenderer;
import exp.fluffynuar.truedarkness.client.renderer.CorruptedHandRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TruedarknessModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TruedarknessModEntities.GLOW_BUG.get(), GlowBugRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.MINER.get(), MinerRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.FLOW.get(), FlowRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.CORRUPTED_KNIGHT.get(), CorruptedKnightRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.CORRUPTED_HUMAN.get(), CorruptedHumanRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.CORRUPTED_MAGE.get(), CorruptedMageRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.SOULSTEAL_WARRIOR.get(), SoulstealWarriorRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.CORRUPTED_HAND.get(), CorruptedHandRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.GENERAL.get(), GeneralRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.ERIDIUM_ZOMBIE.get(), EridiumZombieRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.WASTE_RUNNER.get(), WasteRunerRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.ERIDIUM_GOLEM.get(), EridiumGolemRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.DARKNESS_SPRUCE_SHIELD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.SCULK_FEATHER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TruedarknessModEntities.SHANDARAH_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}

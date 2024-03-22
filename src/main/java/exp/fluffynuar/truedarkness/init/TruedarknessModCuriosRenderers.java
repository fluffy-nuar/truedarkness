package exp.fluffynuar.truedarkness.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import exp.fluffynuar.truedarkness.client.renderer.AxolotlHatRenderer;
import exp.fluffynuar.truedarkness.client.model.Modelaxolotl_hat;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(TruedarknessModLayerDefinitions.AXOLOTL_HAT, Modelaxolotl_hat::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(TruedarknessModItems.AXOLOTL_HAT.get(), AxolotlHatRenderer::new);
	}
}

package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import exp.fluffynuar.truedarkness.procedures.EchoWingsZnachieniieSvoistvaProcedure;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TruedarknessModCuriosProperties {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(TruedarknessModItems.ECHO_WINGS.get(), new ResourceLocation("truedarkness:echo_wings_trim"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) EchoWingsZnachieniieSvoistvaProcedure.execute(itemStackToRender));
		});
	}
}

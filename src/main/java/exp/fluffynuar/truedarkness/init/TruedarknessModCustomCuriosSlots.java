package exp.fluffynuar.truedarkness.init;

import top.theillusivec4.curios.api.SlotTypeMessage;

import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModCustomCuriosSlots {
	@SubscribeEvent
	public static void enqueueIMC(final InterModEnqueueEvent event) {
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("scroll_slot").icon(new ResourceLocation("curios:slot/scroll_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("heart_slot").icon(new ResourceLocation("curios:slot/heart_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("wings_slot").icon(new ResourceLocation("curios:slot/wings_slot")).size(1).build());
	}
}

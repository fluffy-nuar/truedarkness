
package exp.fluffynuar.truedarkness.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;

import exp.fluffynuar.truedarkness.procedures.ActiveAbility3PriOtpuskaniiKlavishiProcedure;
import exp.fluffynuar.truedarkness.procedures.ActiveAbility3PriNazhatiiKlavishiProcedure;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ActiveAbility3Message {
	int type, pressedms;

	public ActiveAbility3Message(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ActiveAbility3Message(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ActiveAbility3Message message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ActiveAbility3Message message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			ActiveAbility3PriNazhatiiKlavishiProcedure.execute(entity);
		}
		if (type == 1) {

			ActiveAbility3PriOtpuskaniiKlavishiProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TruedarknessMod.addNetworkMessage(ActiveAbility3Message.class, ActiveAbility3Message::buffer, ActiveAbility3Message::new, ActiveAbility3Message::handler);
	}
}

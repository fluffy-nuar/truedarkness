package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.FriendlyByteBuf;

import javax.annotation.Nullable;

import java.util.function.Supplier;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class LMBBlockProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		TruedarknessMod.PACKET_HANDLER.sendToServer(new LMBBlockMessage());
		execute(event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class LMBBlockMessage {
		public LMBBlockMessage() {
		}

		public LMBBlockMessage(FriendlyByteBuf buffer) {
		}

		public static void buffer(LMBBlockMessage message, FriendlyByteBuf buffer) {
		}

		public static void handler(LMBBlockMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getSender().level().hasChunkAt(context.getSender().blockPosition()))
					return;
				execute(context.getSender().level(), context.getSender().getX(), context.getSender().getY(), context.getSender().getZ(), context.getSender());
			});
			context.setPacketHandled(true);
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			TruedarknessMod.addNetworkMessage(LMBBlockMessage.class, LMBBlockMessage::buffer, LMBBlockMessage::new, LMBBlockMessage::handler);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())) {
			MagicEridiumProcedure.execute(world, x, y, z, entity);
		}
	}
}

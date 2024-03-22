package exp.fluffynuar.truedarkness.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		TruedarknessMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.DreamFirst = original.DreamFirst;
			clone.DreamSecond = original.DreamSecond;
			clone.DreamThird = original.DreamThird;
			clone.SculkedMana = original.SculkedMana;
			if (!event.isWasDeath()) {
				clone.MiningFatigue = original.MiningFatigue;
				clone.Charge = original.Charge;
				clone.Trade = original.Trade;
				clone.corrupt_first = original.corrupt_first;
				clone.corrupt_second = original.corrupt_second;
				clone.magic_up = original.magic_up;
				clone.magic_side = original.magic_side;
				clone.magic_down = original.magic_down;
				clone.Dash = original.Dash;
				clone.Jump = original.Jump;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("truedarkness", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean DreamFirst = false;
		public boolean DreamSecond = false;
		public boolean DreamThird = false;
		public double SculkedMana = 0.0;
		public boolean MiningFatigue = true;
		public boolean Charge = false;
		public boolean Trade = false;
		public double corrupt_first = 0;
		public double corrupt_second = 0;
		public String magic_up = "";
		public String magic_side = "";
		public String magic_down = "";
		public boolean Dash = true;
		public boolean Jump = true;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("DreamFirst", DreamFirst);
			nbt.putBoolean("DreamSecond", DreamSecond);
			nbt.putBoolean("DreamThird", DreamThird);
			nbt.putDouble("SculkedMana", SculkedMana);
			nbt.putBoolean("MiningFatigue", MiningFatigue);
			nbt.putBoolean("Charge", Charge);
			nbt.putBoolean("Trade", Trade);
			nbt.putDouble("corrupt_first", corrupt_first);
			nbt.putDouble("corrupt_second", corrupt_second);
			nbt.putString("magic_up", magic_up);
			nbt.putString("magic_side", magic_side);
			nbt.putString("magic_down", magic_down);
			nbt.putBoolean("Dash", Dash);
			nbt.putBoolean("Jump", Jump);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			DreamFirst = nbt.getBoolean("DreamFirst");
			DreamSecond = nbt.getBoolean("DreamSecond");
			DreamThird = nbt.getBoolean("DreamThird");
			SculkedMana = nbt.getDouble("SculkedMana");
			MiningFatigue = nbt.getBoolean("MiningFatigue");
			Charge = nbt.getBoolean("Charge");
			Trade = nbt.getBoolean("Trade");
			corrupt_first = nbt.getDouble("corrupt_first");
			corrupt_second = nbt.getDouble("corrupt_second");
			magic_up = nbt.getString("magic_up");
			magic_side = nbt.getString("magic_side");
			magic_down = nbt.getString("magic_down");
			Dash = nbt.getBoolean("Dash");
			Jump = nbt.getBoolean("Jump");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.DreamFirst = message.data.DreamFirst;
					variables.DreamSecond = message.data.DreamSecond;
					variables.DreamThird = message.data.DreamThird;
					variables.SculkedMana = message.data.SculkedMana;
					variables.MiningFatigue = message.data.MiningFatigue;
					variables.Charge = message.data.Charge;
					variables.Trade = message.data.Trade;
					variables.corrupt_first = message.data.corrupt_first;
					variables.corrupt_second = message.data.corrupt_second;
					variables.magic_up = message.data.magic_up;
					variables.magic_side = message.data.magic_side;
					variables.magic_down = message.data.magic_down;
					variables.Dash = message.data.Dash;
					variables.Jump = message.data.Jump;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

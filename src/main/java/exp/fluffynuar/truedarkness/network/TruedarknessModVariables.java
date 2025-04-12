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

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
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
		TruedarknessMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
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
			clone.Active_corrupt_stage = original.Active_corrupt_stage;
			clone.Active_prey_count = original.Active_prey_count;
			clone.Active_skill_convert = original.Active_skill_convert;
			clone.Active_skill_preselect = original.Active_skill_preselect;
			clone.Active_skill_select = original.Active_skill_select;
			clone.Active_skill_select_corner = original.Active_skill_select_corner;
			clone.Active_skill_selected = original.Active_skill_selected;
			clone.Corrupt_stage = original.Corrupt_stage;
			clone.DreamFirst = original.DreamFirst;
			clone.DreamSecond = original.DreamSecond;
			clone.DreamThird = original.DreamThird;
			clone.Faction = original.Faction;
			clone.Fatigue_restore = original.Fatigue_restore;
			clone.Metenite_shard = original.Metenite_shard;
			clone.Preys = original.Preys;
			clone.Remnant_gm = original.Remnant_gm;
			clone.Remnant_logic = original.Remnant_logic;
			clone.Remnant_x = original.Remnant_x;
			clone.Remnant_y = original.Remnant_y;
			clone.Remnant_z = original.Remnant_z;
			clone.Resting = original.Resting;
			clone.Rift_x = original.Rift_x;
			clone.Rift_y = original.Rift_y;
			clone.Rift_z = original.Rift_z;
			clone.Scroll_logic = original.Scroll_logic;
			clone.SculkedMana = original.SculkedMana;
			clone.Step_height = original.Step_height;
			clone.Tool_0 = original.Tool_0;
			clone.Tool_0_count = original.Tool_0_count;
			clone.Tool_1 = original.Tool_1;
			clone.Tool_1_count = original.Tool_1_count;
			clone.Tool_2 = original.Tool_2;
			clone.Tool_2_count = original.Tool_2_count;
			clone.Tool_anable = original.Tool_anable;
			clone.Tool_selected = original.Tool_selected;
			clone.Using_crystal_x = original.Using_crystal_x;
			clone.Using_crystal_y = original.Using_crystal_y;
			clone.Using_crystal_z = original.Using_crystal_z;
			clone.Yteria_find_block = original.Yteria_find_block;
			clone.Yteria_X = original.Yteria_X;
			clone.Yteria_Y = original.Yteria_Y;
			clone.Yteria_Z = original.Yteria_Z;
			clone.WhitelistPlayer = original.WhitelistPlayer;
			if (!event.isWasDeath()) {
				clone.Active_ability_3_logic = original.Active_ability_3_logic;
				clone.Active_armor = original.Active_armor;
				clone.Active_skill = original.Active_skill;
				clone.Active_skill_item = original.Active_skill_item;
				clone.Charge = original.Charge;
				clone.corrupt_first = original.corrupt_first;
				clone.corrupt_second = original.corrupt_second;
				clone.Dash = original.Dash;
				clone.Fatigue_first = original.Fatigue_first;
				clone.Fatigue_second = original.Fatigue_second;
				clone.Jump = original.Jump;
				clone.Key_charge = original.Key_charge;
				clone.Key_get = original.Key_get;
				clone.Key_ready = original.Key_ready;
				clone.magic_down = original.magic_down;
				clone.magic_down_type = original.magic_down_type;
				clone.magic_item = original.magic_item;
				clone.magic_side = original.magic_side;
				clone.magic_side_type = original.magic_side_type;
				clone.magic_up = original.magic_up;
				clone.magic_up_type = original.magic_up_type;
				clone.MiningFatigue = original.MiningFatigue;
				clone.Passive_skill = original.Passive_skill;
				clone.Prays = original.Prays;
				clone.Remnant_2_x = original.Remnant_2_x;
				clone.Remnant_2_y = original.Remnant_2_y;
				clone.Remnant_2_z = original.Remnant_2_z;
				clone.Remnant_axis = original.Remnant_axis;
				clone.Remnant_head = original.Remnant_head;
				clone.Remnant_teleport = original.Remnant_teleport;
				clone.Remnant_vx = original.Remnant_vx;
				clone.Remnant_vy = original.Remnant_vy;
				clone.Remnant_vz = original.Remnant_vz;
				clone.Spell_cast = original.Spell_cast;
				clone.Trade = original.Trade;
				clone.Trial_category = original.Trial_category;
				clone.Trial_count = original.Trial_count;
				clone.Trial_item = original.Trial_item;
				clone.Trial_logic = original.Trial_logic;
				clone.Trial_progress = original.Trial_progress;
				clone.Trial_tier = original.Trial_tier;
				clone.Trial_x = original.Trial_x;
				clone.Trial_y = original.Trial_y;
				clone.Trial_z = original.Trial_z;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "truedarkness_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "truedarkness_mapvars";
		public ItemStack Metenite_shard_global = ItemStack.EMPTY;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			Metenite_shard_global = ItemStack.of(nbt.getCompound("Metenite_shard_global"));
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.put("Metenite_shard_global", Metenite_shard_global.save(new CompoundTag()));
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
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
		public boolean Active_ability_3_logic = false;
		public double Active_armor = 0;
		public double Active_corrupt_stage = 0.0;
		public double Active_prey_count = 0.0;
		public String Active_skill = "";
		public boolean Active_skill_convert = false;
		public ItemStack Active_skill_item = ItemStack.EMPTY;
		public double Active_skill_preselect = 0;
		public boolean Active_skill_select = false;
		public double Active_skill_select_corner = 0;
		public double Active_skill_selected = 0;
		public boolean Charge = false;
		public double corrupt_first = 0.0;
		public double corrupt_second = 0.0;
		public double Corrupt_stage = 0.0;
		public boolean Dash = true;
		public boolean DreamFirst = false;
		public boolean DreamSecond = false;
		public boolean DreamThird = false;
		public String Faction = "";
		public double Fatigue_first = 0.0;
		public boolean Fatigue_restore = true;
		public double Fatigue_second = 5.0;
		public boolean Jump = true;
		public double Key_charge = 0.0;
		public boolean Key_get = false;
		public boolean Key_ready = false;
		public String magic_down = "";
		public double magic_down_type = 0;
		public ItemStack magic_item = ItemStack.EMPTY;
		public String magic_side = "";
		public double magic_side_type = 0;
		public String magic_up = "";
		public double magic_up_type = 0;
		public ItemStack Metenite_shard = ItemStack.EMPTY;
		public boolean MiningFatigue = true;
		public String Passive_skill = "";
		public double Prays = 0.0;
		public double Preys = 0.0;
		public double Remnant_2_x = 0;
		public double Remnant_2_y = 0;
		public double Remnant_2_z = 0;
		public double Remnant_axis = 0;
		public String Remnant_gm = "";
		public double Remnant_head = 0;
		public boolean Remnant_logic = false;
		public boolean Remnant_teleport = false;
		public double Remnant_vx = 0;
		public double Remnant_vy = 0;
		public double Remnant_vz = 0;
		public double Remnant_x = 0.0;
		public double Remnant_y = 0.0;
		public double Remnant_z = 0.0;
		public boolean Resting = false;
		public double Rift_x = 0;
		public double Rift_y = 0;
		public double Rift_z = 0;
		public boolean Scroll_logic = true;
		public double SculkedMana = 0.0;
		public String Spell_cast = "";
		public double Step_height = 0.0;
		public ItemStack Tool_0 = ItemStack.EMPTY;
		public double Tool_0_count = 0.0;
		public ItemStack Tool_1 = ItemStack.EMPTY;
		public double Tool_1_count = 0.0;
		public ItemStack Tool_2 = ItemStack.EMPTY;
		public double Tool_2_count = 0.0;
		public double Tool_anable = 0;
		public double Tool_selected = 0.0;
		public boolean Trade = false;
		public double Trial_category = 0;
		public double Trial_count = 0;
		public ItemStack Trial_item = ItemStack.EMPTY;
		public boolean Trial_logic = false;
		public double Trial_progress = 0;
		public double Trial_tier = 0.0;
		public double Trial_x = 0;
		public double Trial_y = 0.0;
		public double Trial_z = 0.0;
		public double Using_crystal_x = 0;
		public double Using_crystal_y = 0;
		public double Using_crystal_z = 0;
		public boolean Yteria_find_block = false;
		public double Yteria_X = 0;
		public double Yteria_Y = 0;
		public double Yteria_Z = 0;
		public ItemStack WhitelistPlayer = ItemStack.EMPTY;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				TruedarknessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("Active_ability_3_logic", Active_ability_3_logic);
			nbt.putDouble("Active_armor", Active_armor);
			nbt.putDouble("Active_corrupt_stage", Active_corrupt_stage);
			nbt.putDouble("Active_prey_count", Active_prey_count);
			nbt.putString("Active_skill", Active_skill);
			nbt.putBoolean("Active_skill_convert", Active_skill_convert);
			nbt.put("Active_skill_item", Active_skill_item.save(new CompoundTag()));
			nbt.putDouble("Active_skill_preselect", Active_skill_preselect);
			nbt.putBoolean("Active_skill_select", Active_skill_select);
			nbt.putDouble("Active_skill_select_corner", Active_skill_select_corner);
			nbt.putDouble("Active_skill_selected", Active_skill_selected);
			nbt.putBoolean("Charge", Charge);
			nbt.putDouble("corrupt_first", corrupt_first);
			nbt.putDouble("corrupt_second", corrupt_second);
			nbt.putDouble("Corrupt_stage", Corrupt_stage);
			nbt.putBoolean("Dash", Dash);
			nbt.putBoolean("DreamFirst", DreamFirst);
			nbt.putBoolean("DreamSecond", DreamSecond);
			nbt.putBoolean("DreamThird", DreamThird);
			nbt.putString("Faction", Faction);
			nbt.putDouble("Fatigue_first", Fatigue_first);
			nbt.putBoolean("Fatigue_restore", Fatigue_restore);
			nbt.putDouble("Fatigue_second", Fatigue_second);
			nbt.putBoolean("Jump", Jump);
			nbt.putDouble("Key_charge", Key_charge);
			nbt.putBoolean("Key_get", Key_get);
			nbt.putBoolean("Key_ready", Key_ready);
			nbt.putString("magic_down", magic_down);
			nbt.putDouble("magic_down_type", magic_down_type);
			nbt.put("magic_item", magic_item.save(new CompoundTag()));
			nbt.putString("magic_side", magic_side);
			nbt.putDouble("magic_side_type", magic_side_type);
			nbt.putString("magic_up", magic_up);
			nbt.putDouble("magic_up_type", magic_up_type);
			nbt.put("Metenite_shard", Metenite_shard.save(new CompoundTag()));
			nbt.putBoolean("MiningFatigue", MiningFatigue);
			nbt.putString("Passive_skill", Passive_skill);
			nbt.putDouble("Prays", Prays);
			nbt.putDouble("Preys", Preys);
			nbt.putDouble("Remnant_2_x", Remnant_2_x);
			nbt.putDouble("Remnant_2_y", Remnant_2_y);
			nbt.putDouble("Remnant_2_z", Remnant_2_z);
			nbt.putDouble("Remnant_axis", Remnant_axis);
			nbt.putString("Remnant_gm", Remnant_gm);
			nbt.putDouble("Remnant_head", Remnant_head);
			nbt.putBoolean("Remnant_logic", Remnant_logic);
			nbt.putBoolean("Remnant_teleport", Remnant_teleport);
			nbt.putDouble("Remnant_vx", Remnant_vx);
			nbt.putDouble("Remnant_vy", Remnant_vy);
			nbt.putDouble("Remnant_vz", Remnant_vz);
			nbt.putDouble("Remnant_x", Remnant_x);
			nbt.putDouble("Remnant_y", Remnant_y);
			nbt.putDouble("Remnant_z", Remnant_z);
			nbt.putBoolean("Resting", Resting);
			nbt.putDouble("Rift_x", Rift_x);
			nbt.putDouble("Rift_y", Rift_y);
			nbt.putDouble("Rift_z", Rift_z);
			nbt.putBoolean("Scroll_logic", Scroll_logic);
			nbt.putDouble("SculkedMana", SculkedMana);
			nbt.putString("Spell_cast", Spell_cast);
			nbt.putDouble("Step_height", Step_height);
			nbt.put("Tool_0", Tool_0.save(new CompoundTag()));
			nbt.putDouble("Tool_0_count", Tool_0_count);
			nbt.put("Tool_1", Tool_1.save(new CompoundTag()));
			nbt.putDouble("Tool_1_count", Tool_1_count);
			nbt.put("Tool_2", Tool_2.save(new CompoundTag()));
			nbt.putDouble("Tool_2_count", Tool_2_count);
			nbt.putDouble("Tool_anable", Tool_anable);
			nbt.putDouble("Tool_selected", Tool_selected);
			nbt.putBoolean("Trade", Trade);
			nbt.putDouble("Trial_category", Trial_category);
			nbt.putDouble("Trial_count", Trial_count);
			nbt.put("Trial_item", Trial_item.save(new CompoundTag()));
			nbt.putBoolean("Trial_logic", Trial_logic);
			nbt.putDouble("Trial_progress", Trial_progress);
			nbt.putDouble("Trial_tier", Trial_tier);
			nbt.putDouble("Trial_x", Trial_x);
			nbt.putDouble("Trial_y", Trial_y);
			nbt.putDouble("Trial_z", Trial_z);
			nbt.putDouble("Using_crystal_x", Using_crystal_x);
			nbt.putDouble("Using_crystal_y", Using_crystal_y);
			nbt.putDouble("Using_crystal_z", Using_crystal_z);
			nbt.putBoolean("Yteria_find_block", Yteria_find_block);
			nbt.putDouble("Yteria_X", Yteria_X);
			nbt.putDouble("Yteria_Y", Yteria_Y);
			nbt.putDouble("Yteria_Z", Yteria_Z);
			nbt.put("WhitelistPlayer", WhitelistPlayer.save(new CompoundTag()));
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			Active_ability_3_logic = nbt.getBoolean("Active_ability_3_logic");
			Active_armor = nbt.getDouble("Active_armor");
			Active_corrupt_stage = nbt.getDouble("Active_corrupt_stage");
			Active_prey_count = nbt.getDouble("Active_prey_count");
			Active_skill = nbt.getString("Active_skill");
			Active_skill_convert = nbt.getBoolean("Active_skill_convert");
			Active_skill_item = ItemStack.of(nbt.getCompound("Active_skill_item"));
			Active_skill_preselect = nbt.getDouble("Active_skill_preselect");
			Active_skill_select = nbt.getBoolean("Active_skill_select");
			Active_skill_select_corner = nbt.getDouble("Active_skill_select_corner");
			Active_skill_selected = nbt.getDouble("Active_skill_selected");
			Charge = nbt.getBoolean("Charge");
			corrupt_first = nbt.getDouble("corrupt_first");
			corrupt_second = nbt.getDouble("corrupt_second");
			Corrupt_stage = nbt.getDouble("Corrupt_stage");
			Dash = nbt.getBoolean("Dash");
			DreamFirst = nbt.getBoolean("DreamFirst");
			DreamSecond = nbt.getBoolean("DreamSecond");
			DreamThird = nbt.getBoolean("DreamThird");
			Faction = nbt.getString("Faction");
			Fatigue_first = nbt.getDouble("Fatigue_first");
			Fatigue_restore = nbt.getBoolean("Fatigue_restore");
			Fatigue_second = nbt.getDouble("Fatigue_second");
			Jump = nbt.getBoolean("Jump");
			Key_charge = nbt.getDouble("Key_charge");
			Key_get = nbt.getBoolean("Key_get");
			Key_ready = nbt.getBoolean("Key_ready");
			magic_down = nbt.getString("magic_down");
			magic_down_type = nbt.getDouble("magic_down_type");
			magic_item = ItemStack.of(nbt.getCompound("magic_item"));
			magic_side = nbt.getString("magic_side");
			magic_side_type = nbt.getDouble("magic_side_type");
			magic_up = nbt.getString("magic_up");
			magic_up_type = nbt.getDouble("magic_up_type");
			Metenite_shard = ItemStack.of(nbt.getCompound("Metenite_shard"));
			MiningFatigue = nbt.getBoolean("MiningFatigue");
			Passive_skill = nbt.getString("Passive_skill");
			Prays = nbt.getDouble("Prays");
			Preys = nbt.getDouble("Preys");
			Remnant_2_x = nbt.getDouble("Remnant_2_x");
			Remnant_2_y = nbt.getDouble("Remnant_2_y");
			Remnant_2_z = nbt.getDouble("Remnant_2_z");
			Remnant_axis = nbt.getDouble("Remnant_axis");
			Remnant_gm = nbt.getString("Remnant_gm");
			Remnant_head = nbt.getDouble("Remnant_head");
			Remnant_logic = nbt.getBoolean("Remnant_logic");
			Remnant_teleport = nbt.getBoolean("Remnant_teleport");
			Remnant_vx = nbt.getDouble("Remnant_vx");
			Remnant_vy = nbt.getDouble("Remnant_vy");
			Remnant_vz = nbt.getDouble("Remnant_vz");
			Remnant_x = nbt.getDouble("Remnant_x");
			Remnant_y = nbt.getDouble("Remnant_y");
			Remnant_z = nbt.getDouble("Remnant_z");
			Resting = nbt.getBoolean("Resting");
			Rift_x = nbt.getDouble("Rift_x");
			Rift_y = nbt.getDouble("Rift_y");
			Rift_z = nbt.getDouble("Rift_z");
			Scroll_logic = nbt.getBoolean("Scroll_logic");
			SculkedMana = nbt.getDouble("SculkedMana");
			Spell_cast = nbt.getString("Spell_cast");
			Step_height = nbt.getDouble("Step_height");
			Tool_0 = ItemStack.of(nbt.getCompound("Tool_0"));
			Tool_0_count = nbt.getDouble("Tool_0_count");
			Tool_1 = ItemStack.of(nbt.getCompound("Tool_1"));
			Tool_1_count = nbt.getDouble("Tool_1_count");
			Tool_2 = ItemStack.of(nbt.getCompound("Tool_2"));
			Tool_2_count = nbt.getDouble("Tool_2_count");
			Tool_anable = nbt.getDouble("Tool_anable");
			Tool_selected = nbt.getDouble("Tool_selected");
			Trade = nbt.getBoolean("Trade");
			Trial_category = nbt.getDouble("Trial_category");
			Trial_count = nbt.getDouble("Trial_count");
			Trial_item = ItemStack.of(nbt.getCompound("Trial_item"));
			Trial_logic = nbt.getBoolean("Trial_logic");
			Trial_progress = nbt.getDouble("Trial_progress");
			Trial_tier = nbt.getDouble("Trial_tier");
			Trial_x = nbt.getDouble("Trial_x");
			Trial_y = nbt.getDouble("Trial_y");
			Trial_z = nbt.getDouble("Trial_z");
			Using_crystal_x = nbt.getDouble("Using_crystal_x");
			Using_crystal_y = nbt.getDouble("Using_crystal_y");
			Using_crystal_z = nbt.getDouble("Using_crystal_z");
			Yteria_find_block = nbt.getBoolean("Yteria_find_block");
			Yteria_X = nbt.getDouble("Yteria_X");
			Yteria_Y = nbt.getDouble("Yteria_Y");
			Yteria_Z = nbt.getDouble("Yteria_Z");
			WhitelistPlayer = ItemStack.of(nbt.getCompound("WhitelistPlayer"));
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
					variables.Active_ability_3_logic = message.data.Active_ability_3_logic;
					variables.Active_armor = message.data.Active_armor;
					variables.Active_corrupt_stage = message.data.Active_corrupt_stage;
					variables.Active_prey_count = message.data.Active_prey_count;
					variables.Active_skill = message.data.Active_skill;
					variables.Active_skill_convert = message.data.Active_skill_convert;
					variables.Active_skill_item = message.data.Active_skill_item;
					variables.Active_skill_preselect = message.data.Active_skill_preselect;
					variables.Active_skill_select = message.data.Active_skill_select;
					variables.Active_skill_select_corner = message.data.Active_skill_select_corner;
					variables.Active_skill_selected = message.data.Active_skill_selected;
					variables.Charge = message.data.Charge;
					variables.corrupt_first = message.data.corrupt_first;
					variables.corrupt_second = message.data.corrupt_second;
					variables.Corrupt_stage = message.data.Corrupt_stage;
					variables.Dash = message.data.Dash;
					variables.DreamFirst = message.data.DreamFirst;
					variables.DreamSecond = message.data.DreamSecond;
					variables.DreamThird = message.data.DreamThird;
					variables.Faction = message.data.Faction;
					variables.Fatigue_first = message.data.Fatigue_first;
					variables.Fatigue_restore = message.data.Fatigue_restore;
					variables.Fatigue_second = message.data.Fatigue_second;
					variables.Jump = message.data.Jump;
					variables.Key_charge = message.data.Key_charge;
					variables.Key_get = message.data.Key_get;
					variables.Key_ready = message.data.Key_ready;
					variables.magic_down = message.data.magic_down;
					variables.magic_down_type = message.data.magic_down_type;
					variables.magic_item = message.data.magic_item;
					variables.magic_side = message.data.magic_side;
					variables.magic_side_type = message.data.magic_side_type;
					variables.magic_up = message.data.magic_up;
					variables.magic_up_type = message.data.magic_up_type;
					variables.Metenite_shard = message.data.Metenite_shard;
					variables.MiningFatigue = message.data.MiningFatigue;
					variables.Passive_skill = message.data.Passive_skill;
					variables.Prays = message.data.Prays;
					variables.Preys = message.data.Preys;
					variables.Remnant_2_x = message.data.Remnant_2_x;
					variables.Remnant_2_y = message.data.Remnant_2_y;
					variables.Remnant_2_z = message.data.Remnant_2_z;
					variables.Remnant_axis = message.data.Remnant_axis;
					variables.Remnant_gm = message.data.Remnant_gm;
					variables.Remnant_head = message.data.Remnant_head;
					variables.Remnant_logic = message.data.Remnant_logic;
					variables.Remnant_teleport = message.data.Remnant_teleport;
					variables.Remnant_vx = message.data.Remnant_vx;
					variables.Remnant_vy = message.data.Remnant_vy;
					variables.Remnant_vz = message.data.Remnant_vz;
					variables.Remnant_x = message.data.Remnant_x;
					variables.Remnant_y = message.data.Remnant_y;
					variables.Remnant_z = message.data.Remnant_z;
					variables.Resting = message.data.Resting;
					variables.Rift_x = message.data.Rift_x;
					variables.Rift_y = message.data.Rift_y;
					variables.Rift_z = message.data.Rift_z;
					variables.Scroll_logic = message.data.Scroll_logic;
					variables.SculkedMana = message.data.SculkedMana;
					variables.Spell_cast = message.data.Spell_cast;
					variables.Step_height = message.data.Step_height;
					variables.Tool_0 = message.data.Tool_0;
					variables.Tool_0_count = message.data.Tool_0_count;
					variables.Tool_1 = message.data.Tool_1;
					variables.Tool_1_count = message.data.Tool_1_count;
					variables.Tool_2 = message.data.Tool_2;
					variables.Tool_2_count = message.data.Tool_2_count;
					variables.Tool_anable = message.data.Tool_anable;
					variables.Tool_selected = message.data.Tool_selected;
					variables.Trade = message.data.Trade;
					variables.Trial_category = message.data.Trial_category;
					variables.Trial_count = message.data.Trial_count;
					variables.Trial_item = message.data.Trial_item;
					variables.Trial_logic = message.data.Trial_logic;
					variables.Trial_progress = message.data.Trial_progress;
					variables.Trial_tier = message.data.Trial_tier;
					variables.Trial_x = message.data.Trial_x;
					variables.Trial_y = message.data.Trial_y;
					variables.Trial_z = message.data.Trial_z;
					variables.Using_crystal_x = message.data.Using_crystal_x;
					variables.Using_crystal_y = message.data.Using_crystal_y;
					variables.Using_crystal_z = message.data.Using_crystal_z;
					variables.Yteria_find_block = message.data.Yteria_find_block;
					variables.Yteria_X = message.data.Yteria_X;
					variables.Yteria_Y = message.data.Yteria_Y;
					variables.Yteria_Z = message.data.Yteria_Z;
					variables.WhitelistPlayer = message.data.WhitelistPlayer;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

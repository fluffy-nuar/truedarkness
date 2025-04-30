
package exp.fluffynuar.truedarkness.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.BookAltarGuiMenu;
import exp.fluffynuar.truedarkness.procedures.SlotsOfEridiumProcedure;
import exp.fluffynuar.truedarkness.procedures.PriIzmeneniiSlota1Procedure;
import exp.fluffynuar.truedarkness.procedures.AAAAAAAABookProcedure;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BookAltarGuiSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public BookAltarGuiSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public BookAltarGuiSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(BookAltarGuiSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(BookAltarGuiSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BookAltarGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 0) {

			AAAAAAAABookProcedure.execute(world, entity);
		}
		if (slot == 1 && changeType == 0) {

			PriIzmeneniiSlota1Procedure.execute(world, entity, slot);
		}
		if (slot == 2 && changeType == 0) {

			PriIzmeneniiSlota1Procedure.execute(world, entity, slot);
		}
		if (slot == 3 && changeType == 0) {

			PriIzmeneniiSlota1Procedure.execute(world, entity, slot);
		}
		if (slot == 5 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 6 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 7 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 8 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 9 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 10 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 11 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 12 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 13 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
		if (slot == 14 && changeType == 0) {

			SlotsOfEridiumProcedure.execute(world, entity, slot);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TruedarknessMod.addNetworkMessage(BookAltarGuiSlotMessage.class, BookAltarGuiSlotMessage::buffer, BookAltarGuiSlotMessage::new, BookAltarGuiSlotMessage::handler);
	}
}

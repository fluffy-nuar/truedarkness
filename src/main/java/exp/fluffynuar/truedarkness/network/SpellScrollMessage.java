package exp.fluffynuar.truedarkness.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.TruedarknessMod;
import exp.fluffynuar.truedarkness.procedures.ActiveStageGetToMouseEventProcedure;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpellScrollMessage {
    int direction;

    public SpellScrollMessage(int direction) {
        this.direction = direction;
    }

    public SpellScrollMessage(FriendlyByteBuf buffer) {
        this.direction = buffer.readInt();
    }

    public static void buffer(SpellScrollMessage message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.direction);
    }

    public static void handler(SpellScrollMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            handleAction(context.getSender(), message.direction);
        });
        context.setPacketHandled(true);
    }

    private static void handleAction(Player player, int direction) {
        if (player != null) {
            player.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                double newVal = capability.SelectedLine + direction;
                double minVal = 0;
                double maxVal = ActiveStageGetToMouseEventProcedure.execute(player);
                boolean scroll_through = true;
                
                // Range limitation and actions when out of range
                if (newVal < minVal) newVal = scroll_through ? maxVal : minVal;
                if (newVal > maxVal) newVal = scroll_through ? minVal : maxVal;;
                capability.SelectedLine = newVal;
                capability.syncPlayerVariables(player);
            });
        }
    }

    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        TruedarknessMod.addNetworkMessage(SpellScrollMessage.class, SpellScrollMessage::buffer, SpellScrollMessage::new, SpellScrollMessage::handler);
    }
}
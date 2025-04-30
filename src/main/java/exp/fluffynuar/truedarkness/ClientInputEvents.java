package exp.fluffynuar.truedarkness;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.TruedarknessMod;
import exp.fluffynuar.truedarkness.network.SpellScrollMessage;
import exp.fluffynuar.truedarkness.procedures.ExpirienceHideBarProcedure;

@Mod.EventBusSubscriber(modid = "truedarkness", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ClientInputEvents {

    @SubscribeEvent
    public static void clientMouseScrolled(InputEvent.MouseScrollingEvent event) {
        Player player = Minecraft.getInstance().player;

        if (Minecraft.getInstance().screen == null) {
        	boolean condition = ExpirienceHideBarProcedure.execute(player);
            if (condition) {
                
                int direction = Mth.clamp((int) event.getScrollDelta(), -1, 1);
                
                // Sending packet
                if (direction != 0) {
                    TruedarknessMod.PACKET_HANDLER.sendToServer(new SpellScrollMessage(direction * -1)); // Sending the direction to the server
                }

                event.setCanceled(true);
            }
        }
    }
}
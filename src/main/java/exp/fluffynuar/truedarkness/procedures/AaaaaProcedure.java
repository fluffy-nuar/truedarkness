package exp.fluffynuar.truedarkness.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

@Mod.EventBusSubscriber
public class AaaaaProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer(), event.getRawText());
	}

	public static void execute(Entity entity, String text) {
		execute(null, entity, text);
	}

	private static void execute(@Nullable Event event, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		{
			double _setval = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(text);
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ProgressBar = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

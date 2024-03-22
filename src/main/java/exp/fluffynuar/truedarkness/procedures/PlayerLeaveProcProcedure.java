package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

@Mod.EventBusSubscriber
public class PlayerLeaveProcProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.CORRUPTING.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.CORRUPTING.get());
		}
		if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.CALM.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.CALM.get());
		}
	}
}

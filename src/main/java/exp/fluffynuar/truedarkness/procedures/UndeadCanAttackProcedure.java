package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

@Mod.EventBusSubscriber
public class UndeadCanAttackProcedure {
	@SubscribeEvent
	public static void onLivingChangeTarget(LivingChangeTargetEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getOriginalTarget(), event.getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.TARGET.get())) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_creatures")))) {
				if (!(sourceentity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.TARGET.get()))
						&& !((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
				}
			}
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:undead_corrupted")))) {
			if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if (!(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(TruedarknessModMobEffects.TARGET.get())) && !(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if (!(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(TruedarknessModMobEffects.BLOODSHED.get())) && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if (sourceentity instanceof TamableAnimal _tamIsTamedBy && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}

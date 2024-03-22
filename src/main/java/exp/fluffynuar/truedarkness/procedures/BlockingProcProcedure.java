package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

@Mod.EventBusSubscriber
public class BlockingProcProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.isBlocking()) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
				if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.GENERAL_WINGS.get(), lv).isPresent() : false) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 120, 0, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, false, true));
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 60);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 60);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 60);
				}
			}
		}
		if (!(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get())) && Mth.nextInt(RandomSource.create(), 1, 100) >= 75) {
			if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.CURSED_MARK.get(), lv).isPresent() : false) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get(), 60, 0, false, false));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.CURSED_MARK.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.WARRIOR_HEART.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_SPOOL.get(), 60);
			}
		}
	}
}

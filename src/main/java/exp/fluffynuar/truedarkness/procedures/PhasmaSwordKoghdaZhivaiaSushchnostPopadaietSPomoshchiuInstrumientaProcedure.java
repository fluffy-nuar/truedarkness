package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class PhasmaSwordKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.PHANTOM_PROTECTION.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.PHANTOM_PROTECTION.get(), (int) (20 * 30 * 1), 0, false, false));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(TruedarknessModItems.AQUAMARINE_SWORD.get(), (int) (20 * 60 * 10));
			if (entity instanceof Player _player)
				_player.causeFoodExhaustion((float) 0.5);
		}
	}
}

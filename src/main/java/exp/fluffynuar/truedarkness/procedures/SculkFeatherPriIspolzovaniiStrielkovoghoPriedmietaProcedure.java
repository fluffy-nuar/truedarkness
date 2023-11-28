package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class SculkFeatherPriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 0, false, false));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(TruedarknessModItems.SCULK_FEATHER_SPELL.get(), 100);
	}
}

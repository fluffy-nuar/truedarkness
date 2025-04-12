package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class SoulstealWingsCooldownKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()).getDuration() : 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()).getDuration() : 0);
	}
}

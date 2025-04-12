package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CooldownWithWingsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()).getDuration() : 0) != 0
				&& WingsNoneEquippedProcedure.execute(entity)) {
			return true;
		}
		return false;
	}
}

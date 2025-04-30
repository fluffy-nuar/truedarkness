package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CorruptedCreationsCanAttackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()) && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.TARGET.get()) && !(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false);
	}
}

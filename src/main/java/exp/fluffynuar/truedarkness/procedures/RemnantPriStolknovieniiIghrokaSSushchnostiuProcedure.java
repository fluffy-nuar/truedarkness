package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.ArrayList;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class RemnantPriStolknovieniiIghrokaSSushchnostiuProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString()) && entityiterator instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.REMNANT_USING.get())) {
				if (sourceentity == entityiterator) {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			} else {
				if (sourceentity == entityiterator) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.removeEffect(TruedarknessModMobEffects.REMNANT_USING.get());
				}
			}
		}
	}
}

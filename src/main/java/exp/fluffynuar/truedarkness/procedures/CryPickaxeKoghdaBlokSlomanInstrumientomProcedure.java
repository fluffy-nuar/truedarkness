package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CryPickaxeKoghdaBlokSlomanInstrumientomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (40 <= Mth.nextInt(RandomSource.create(), 1, 100) && !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.TOOL_PROTECTION.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TOOL_PROTECTION.get(), 200, 0, false, false));
		}
	}
}

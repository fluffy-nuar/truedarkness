package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class ShandarahKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.CORRUPTING.get(), Mth.nextInt(RandomSource.create(), 20, 100), 0, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, Mth.nextInt(RandomSource.create(), 0, 60), 0, false, false));
	}
}

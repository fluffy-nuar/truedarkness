package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class KnifeKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SCRATCH.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SCRATCH.get()).getAmplifier() : 0) != 4) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SCRATCH.get(), 80,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SCRATCH.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SCRATCH.get()).getAmplifier() : 0) + 1), false, false));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.SCRATCH.get());
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ARROW), immediatesourceentity), 1);
		}
	}
}

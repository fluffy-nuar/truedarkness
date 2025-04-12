package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class CalmKoghdaNachatProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria"))) {
			TruedarknessMod.queueServerWork(
					(int) (20 + 20 * (19 - Math.round(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.CALM.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.CALM.get()).getAmplifier() : 0))), () -> {
						if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(TruedarknessModMobEffects.CALM.get())) {
							CalmKoghdaNachatProcedure.execute(world, entity);
							if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_second > 0) {
								{
									double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_second - 1;
									entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.corrupt_second = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						}
					});
		}
	}
}

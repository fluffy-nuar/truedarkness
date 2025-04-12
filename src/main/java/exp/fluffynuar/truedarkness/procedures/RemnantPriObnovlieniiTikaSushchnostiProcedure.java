package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class RemnantPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 100) <= 29) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.SOULY_PARTICLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)), (y + Mth.nextDouble(RandomSource.create(), -0.3, 0.3) + 0.75),
					(z + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)), 0, 0.01, 0);
		}
		entity.setCustomName(Component.literal((entity.getPersistentData().getString("Remnant"))));
	}
}

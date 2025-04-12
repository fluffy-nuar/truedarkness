package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CorruptyLeavesFlowerSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double x_1 = 0;
		double z_1 = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_POLLEN_PARTICLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.5, 0.5) + 0.5),
					(z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.04, 0.04)), 0.02, (Mth.nextDouble(RandomSource.create(), -0.04, 0.04)));
		}
	}
}

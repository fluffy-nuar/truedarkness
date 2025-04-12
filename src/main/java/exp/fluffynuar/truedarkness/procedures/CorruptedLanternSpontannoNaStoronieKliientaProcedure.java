package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CorruptedLanternSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.ERIDIUM_PARTICLE.get()), (x + Mth.nextDouble(RandomSource.create(), -25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -25, 0.25) + 0.5),
						(z + Mth.nextDouble(RandomSource.create(), -25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.004, 0.004)), 0.001, (Mth.nextDouble(RandomSource.create(), -0.004, 0.004)));
			}
		}
	}
}

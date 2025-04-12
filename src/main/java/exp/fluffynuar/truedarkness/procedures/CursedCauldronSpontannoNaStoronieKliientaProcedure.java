package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CursedCauldronSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.75),
				(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.009, 0.009)), (Mth.nextDouble(RandomSource.create(), -0.06, 0)), (Mth.nextDouble(RandomSource.create(), -0.009, 0.009)));
	}
}

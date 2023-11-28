package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class FirefliesOakLogObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.FIRE_FLIES.get()), (x + Mth.nextInt(RandomSource.create(), -3, 3)), (y + Mth.nextInt(RandomSource.create(), -3, 3)), (z + Mth.nextInt(RandomSource.create(), -3, 3)), 0, 1,
				0);
	}
}

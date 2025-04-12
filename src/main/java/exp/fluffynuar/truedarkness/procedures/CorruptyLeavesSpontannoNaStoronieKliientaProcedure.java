package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CorruptyLeavesSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_LEAVES_PARTICLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.1, 0.15) + 0.25),
					(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), 0.1, (-0.04), 0.1);
		}
	}
}

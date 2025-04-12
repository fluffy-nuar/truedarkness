package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class PoisonerSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp1 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getbp1)
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || !world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			PoisonerSpontannoNaStoronieKliientaProcedure.execute(world, x, y + 1, z);
		} else {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.POISON_SMOKE.get()), (x + 0.5 + Mth.nextDouble(RandomSource.create(), -0.15, 0.15)), (y + 1), (z + 0.5 + Mth.nextDouble(RandomSource.create(), -0.15, 0.15)),
					(Mth.nextDouble(RandomSource.create(), -0.01, 0.01)), (Mth.nextDouble(RandomSource.create(), 0.03, 0.07)), (Mth.nextDouble(RandomSource.create(), -0.01, 0.01)));
			world.addParticle(ParticleTypes.GLOW_SQUID_INK, (x + 0.5), (y + 1), (z + 0.5), 0, 0, 0);
		}
	}
}

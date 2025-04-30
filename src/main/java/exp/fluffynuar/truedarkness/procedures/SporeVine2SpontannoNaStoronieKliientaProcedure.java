package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;

public class SporeVine2SpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (Mth.nextInt(RandomSource.create(), 1, 6) == 1 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip2 ? blockstate.getValue(_getip2) : -1) == 1) {
			world.addParticle(ParticleTypes.GLOW_SQUID_INK, (x + 0.5), (y + 0.5), (z + 0.5), (Mth.nextDouble(RandomSource.create(), 0, 0)), (Mth.nextDouble(RandomSource.create(), 0.01, 0)), (Mth.nextDouble(RandomSource.create(), 0, 0)));
		}
	}
}

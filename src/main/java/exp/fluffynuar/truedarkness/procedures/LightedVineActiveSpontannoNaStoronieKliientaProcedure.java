package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class LightedVineActiveSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) >= 2) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.SMALL_SWAMP_STAR.get()), (x + Mth.nextDouble(RandomSource.create(), -6.5, 6.5) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.4, 0.5) + 0.5),
					(z + Mth.nextDouble(RandomSource.create(), -6.5, 6.5) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.04, 0.04)), 0.02, (Mth.nextDouble(RandomSource.create(), -0.04, 0.04)));
		}
	}
}

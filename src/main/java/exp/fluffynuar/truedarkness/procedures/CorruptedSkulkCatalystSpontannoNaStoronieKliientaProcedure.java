package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CorruptedSkulkCatalystSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("Prey") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) >= 1) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), (x + 0.5 + 0.25), (y + 1.5), (z + 0.5 + 0), 0, 0.01, 0);
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("Prey") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip4) : -1) >= 2) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), (x + 0.5 + -0.25), (y + 1.5), (z + 0.5 + 0), 0, 0.01, 0);
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("Prey") instanceof IntegerProperty _getip7 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip7) : -1) >= 3) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), (x + 0.5 + 0), (y + 1.5), (z + 0.5 + 0.25), 0, 0.01, 0);
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("Prey") instanceof IntegerProperty _getip10 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip10) : -1) >= 4) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), (x + 0.5 + 0), (y + 1.5), (z + 0.5 + -0.25), 0, 0.01, 0);
		}
	}
}

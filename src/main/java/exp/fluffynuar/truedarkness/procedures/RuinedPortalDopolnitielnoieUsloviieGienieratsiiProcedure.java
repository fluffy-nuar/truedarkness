package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RuinedPortalDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 7, y, z + 2)).canOcclude() && world.getBlockState(BlockPos.containing(x + 2, y, z + 8)).canOcclude()) {
			return true;
		}
		return false;
	}
}

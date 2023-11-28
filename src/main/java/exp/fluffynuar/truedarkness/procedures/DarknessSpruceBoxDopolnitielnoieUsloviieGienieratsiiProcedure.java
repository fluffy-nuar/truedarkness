package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DarknessSpruceBoxDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0)).canOcclude() && world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0)).canOcclude() && world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0)).canOcclude() && world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1)).canOcclude()) {
			return true;
		}
		return false;
	}
}

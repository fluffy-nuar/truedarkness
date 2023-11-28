package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SwampSoilDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.SWAMP_STONE.get().defaultBlockState()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.SWAMP_SOIL.get().defaultBlockState()) {
			return true;
		}
		return false;
	}
}

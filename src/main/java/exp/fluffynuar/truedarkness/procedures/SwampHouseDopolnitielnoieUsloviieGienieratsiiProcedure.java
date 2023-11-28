package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SwampHouseDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 0, y - 0, z + 6))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 6, y - 0, z + 0))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 0, y - 0, z + 0))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 6, y - 0, z + 6))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()) {
			return true;
		}
		return true;
	}
}

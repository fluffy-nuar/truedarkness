package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SwampFlowerProcedureGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y) {
		if ((world.getBlockState(BlockPos.containing(x + 3, y - 1, x + 3))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 2, y - 1, x + 3))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, x + 3))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 3, y - 1, x + 2))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 2, y - 1, x + 2))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, x + 2))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 3, y - 1, x + 1))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 2, y - 1, x + 1))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()
				&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, x + 1))) == TruedarknessModBlocks.SWAMP_BLACK_SOIL.get().defaultBlockState()) {
			return true;
		}
		return true;
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SmallCorruptDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && !((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.CORRUPT.get().defaultBlockState())) {
			return true;
		}
		return false;
	}
}

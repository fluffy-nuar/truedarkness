package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LightMushroomStructureDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 0, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z))
				&& world.isEmptyBlock(BlockPos.containing(x, y + 3, z))) {
			return true;
		}
		return false;
	}
}

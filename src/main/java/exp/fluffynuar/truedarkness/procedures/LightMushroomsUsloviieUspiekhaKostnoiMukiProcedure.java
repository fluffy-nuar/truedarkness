package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class LightMushroomsUsloviieUspiekhaKostnoiMukiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.LIGHT_MUSHROOMS_ACTIVE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.LIGHT_MUSHROOMS_DISABLE.get()) && Mth.nextInt(RandomSource.create(), 1, 10) <= 2 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			return true;
		}
		return false;
	}
}

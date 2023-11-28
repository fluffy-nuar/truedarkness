package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class LightMushroomTopUsloviieUspiekhaKostnoiMukiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y + 0, z))).getBlock() == TruedarknessModBlocks.LIGHT_MUSHROOM_TOP.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.LIGHT_MUSHROOM_TOP_1.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TruedarknessModBlocks.LIGHT_MUSHROOM_TOP.get()
						&& (world.getBlockState(BlockPos.containing(x, y + 0, z))).getBlock() == TruedarknessModBlocks.LIGHT_MUSHROOM_TOP_1.get())
				&& Mth.nextInt(RandomSource.create(), 1, 10) <= 4) {
			return true;
		}
		return false;
	}
}

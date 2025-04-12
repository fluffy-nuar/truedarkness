package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class NeaskyVinesUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.CAVE_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && Blocks.WEEPING_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z))) {
			return true;
		}
		return false;
	}
}

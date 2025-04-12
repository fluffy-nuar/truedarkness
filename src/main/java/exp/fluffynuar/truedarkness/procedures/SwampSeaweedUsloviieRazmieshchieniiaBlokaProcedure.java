package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SwampSeaweedUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (Blocks.SEAGRASS.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp2 && blockstate.getValue(_getbp2)) {
			return true;
		}
		return false;
	}
}

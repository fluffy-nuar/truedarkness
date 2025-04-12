package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class LightedVine2UsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TruedarknessModBlocks.TEAR_BERRY_BLOCK.get()) {
			if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4
					? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip4)
					: -1) == 0 && TruedarknessModBlocks.TEAR_BERRY_BLOCK.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
			return true;
		}
		return false;
	}
}

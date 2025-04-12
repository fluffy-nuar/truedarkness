package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SwampKelpTopUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP) || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_KELP.get())
				&& blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp4 && blockstate.getValue(_getbp4)) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_KELP.get()) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y - 1, z);
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

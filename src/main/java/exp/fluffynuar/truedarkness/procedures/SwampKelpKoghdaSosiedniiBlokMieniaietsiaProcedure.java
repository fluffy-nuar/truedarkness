package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class SwampKelpKoghdaSosiedniiBlokMieniaietsiaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		TruedarknessMod.queueServerWork(1, () -> {
			if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)
					&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_KELP.get())) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		});
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip6 ? blockstate.getValue(_getip6) : -1) == 1
				&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_KELP.get())) {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}

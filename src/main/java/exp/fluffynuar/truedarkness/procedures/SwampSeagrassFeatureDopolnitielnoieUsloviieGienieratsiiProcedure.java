package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SwampSeagrassFeatureDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER)
				&& world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)) {
			world.setBlock(BlockPos.containing(x, y, z),
					(TruedarknessModBlocks.SWAMP_KELP.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp5
							? TruedarknessModBlocks.SWAMP_KELP.get().defaultBlockState().setValue(_withbp5, true)
							: TruedarknessModBlocks.SWAMP_KELP.get().defaultBlockState()),
					3);
			if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) && Mth.nextInt(RandomSource.create(), 1, 20) <= 16) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				world.setBlock(BlockPos.containing(x, y + 1, z),
						(TruedarknessModBlocks.SWAMP_KELP.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp13
								? TruedarknessModBlocks.SWAMP_KELP.get().defaultBlockState().setValue(_withbp13, true)
								: TruedarknessModBlocks.SWAMP_KELP.get().defaultBlockState()),
						3);
				KelpNaPrimierieStrukturySghienierirovanoProcedure.execute(world, x, y + 1, z);
			}
			return true;
		}
		return false;
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class SporeVinePriIzmienieniiSosiednieghoBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		TruedarknessMod.queueServerWork(1, () -> {
			if (!(Blocks.CAVE_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && Blocks.WEEPING_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)))
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TruedarknessModBlocks.GLOW_VINE.get())) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		});
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.GLOW_VINE.get())) {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.GLOW_VINE.get().defaultBlockState()
				&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip12 ? blockstate.getValue(_getip12) : -1) == 0) {
			{
				int _value = Mth.nextInt(RandomSource.create(), 1, 3);
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SporeVine2UsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TruedarknessModBlocks.GLOW_VINE.get()
				|| Blocks.CAVE_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && Blocks.WEEPING_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z))) {
			if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5
					? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip5)
					: -1) == 0 && TruedarknessModBlocks.GLOW_VINE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
				{
					int _value = Mth.nextInt(RandomSource.create(), 1, 3);
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

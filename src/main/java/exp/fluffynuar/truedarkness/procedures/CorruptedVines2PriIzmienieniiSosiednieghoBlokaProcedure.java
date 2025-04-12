package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class CorruptedVines2PriIzmienieniiSosiednieghoBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TruedarknessMod.queueServerWork(1, () -> {
			if (!(Blocks.CAVE_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && Blocks.WEEPING_VINES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)))
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TruedarknessModBlocks.CORRUPTED_VINES_2.get())) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		});
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.CORRUPTED_VINES_2.get())) {
			if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp9
					? (world.getBlockState(BlockPos.containing(x, y, z))).setValue(_withbp9, false)
					: (world.getBlockState(BlockPos.containing(x, y, z)))) == (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(TruedarknessModBlocks.CORRUPTED_VINES_2.get().defaultBlockState(), "blockstate", 3))) {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp14
					? (world.getBlockState(BlockPos.containing(x, y, z))).setValue(_withbp14, false)
					: (world.getBlockState(BlockPos.containing(x, y, z)))) == (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(TruedarknessModBlocks.CORRUPTED_VINES_2.get().defaultBlockState(), "blockstate", 1))) {
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
}

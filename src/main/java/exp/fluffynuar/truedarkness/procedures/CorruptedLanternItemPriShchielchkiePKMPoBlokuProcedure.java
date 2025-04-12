package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class CorruptedLanternItemPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		double x_add = 0;
		double y_add = 0;
		double z_add = 0;
		x_add = x;
		y_add = y;
		z_add = z;
		if (direction == Direction.DOWN) {
			y_add = y - 1;
		} else if (direction == Direction.UP) {
			y_add = y + 1;
		} else if (direction == Direction.WEST) {
			x_add = x - 1;
		} else if (direction == Direction.EAST) {
			x_add = x + 1;
		} else if (direction == Direction.SOUTH) {
			z_add = z + 1;
		} else if (direction == Direction.NORTH) {
			z_add = z - 1;
		}
		if (Blocks.LANTERN.defaultBlockState().canSurvive(world, BlockPos.containing(x_add, y_add, z_add))) {
			{
				BlockPos _bp = BlockPos.containing(x_add, y_add, z_add);
				BlockState _bs = (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0));
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((Blocks.LANTERN.getStateDefinition().getProperty("hanging") instanceof BooleanProperty _withbp9 ? Blocks.LANTERN.defaultBlockState().setValue(_withbp9, true) : Blocks.LANTERN.defaultBlockState()).canSurvive(world,
				BlockPos.containing(x_add, y_add, z_add))) {
			{
				BlockPos _bp = BlockPos.containing(x_add, y_add, z_add);
				BlockState _bs = (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 1));
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}

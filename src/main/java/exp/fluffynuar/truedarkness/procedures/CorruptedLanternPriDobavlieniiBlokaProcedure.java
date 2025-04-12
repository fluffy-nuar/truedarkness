package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class CorruptedLanternPriDobavlieniiBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState oldState, Entity entity) {
		if (entity == null)
			return;
		if (Blocks.LANTERN.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z))) {
			if (entity.getXRot() < 0 && (Blocks.LANTERN.getStateDefinition().getProperty("hanging") instanceof BooleanProperty _withbp2 ? Blocks.LANTERN.defaultBlockState().setValue(_withbp2, true) : Blocks.LANTERN.defaultBlockState())
					.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), (oldState.getBlock() == Blocks.WATER ? ((new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 1)).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp6 ? (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 1)).setValue(_withbp6, true) : (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 1))) : (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 1))), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), (oldState.getBlock() == Blocks.WATER ? ((new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0)).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp11 ? (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0)).setValue(_withbp11, true) : (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0))) : (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0))), 3);
			}
		} else if ((Blocks.LANTERN.getStateDefinition().getProperty("hanging") instanceof BooleanProperty _withbp14 ? Blocks.LANTERN.defaultBlockState().setValue(_withbp14, true) : Blocks.LANTERN.defaultBlockState()).canSurvive(world,
				BlockPos.containing(x, y, z))) {
			world.setBlock(BlockPos.containing(x, y, z), (oldState.getBlock() == Blocks.WATER ? ((new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0)).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp18 ? (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0)).setValue(_withbp18, true) : (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0))) : (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(TruedarknessModBlocks.CORRUPTED_LANTERN.get().defaultBlockState(), "blockstate", 0))), 3);
		}
	}
}

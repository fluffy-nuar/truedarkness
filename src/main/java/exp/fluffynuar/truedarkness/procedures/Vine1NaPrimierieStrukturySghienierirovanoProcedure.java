package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class Vine1NaPrimierieStrukturySghienierirovanoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			if (world.isEmptyBlock(BlockPos.containing(x, y - 2, z)) && 2 <= Mth.nextDouble(RandomSource.create(), 1, 10)) {
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
					BlockState _bs = (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(TruedarknessModBlocks.TEAR_BERRY_BLOCK.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 1, 3)));
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
				Vine1NaPrimierieStrukturySghienierirovanoProcedure.execute(world, x, y - 1, z);
			} else {
				world.setBlock(BlockPos.containing(x, y - 1, z), TruedarknessModBlocks.TEAR_BERRY_BLOCK.get().defaultBlockState(), 3);
			}
		} else {
			world.setBlock(BlockPos.containing(x, y, z), TruedarknessModBlocks.TEAR_BERRY_BLOCK.get().defaultBlockState(), 3);
		}
	}
}

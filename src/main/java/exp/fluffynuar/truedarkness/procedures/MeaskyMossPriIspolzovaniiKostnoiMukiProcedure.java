package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class MeaskyMossPriIspolzovaniiKostnoiMukiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double try_count = 0;
		double moss_block_count = 0;
		double x_add = 0;
		double y_add = 0;
		double z_add = 0;
		while (!(try_count == 78) && !(moss_block_count == 56)) {
			x_add = x + Mth.nextInt(RandomSource.create(), (int) ((-1) - Math.round(moss_block_count) / 8), (int) (1 + Math.round(moss_block_count) / 8));
			y_add = y + Mth.nextInt(RandomSource.create(), -1, 1);
			z_add = z + Mth.nextInt(RandomSource.create(), (int) ((-1) - Math.round(moss_block_count) / 8), (int) (1 + Math.round(moss_block_count) / 8));
			if ((world.getBlockState(BlockPos.containing(x_add, y_add, z_add))).getBlock() == TruedarknessModBlocks.NEASKY_MOSS.get()) {
				moss_block_count = moss_block_count + 0.2;
			}
			if ((world.getBlockState(BlockPos.containing(x_add, y_add, z_add))).is(BlockTags.create(new ResourceLocation("minecraft:dirt"))) && !world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add)).canOcclude()) {
				{
					BlockPos _bp = BlockPos.containing(x_add, y_add, z_add);
					BlockState _bs = TruedarknessModBlocks.NEASKY_MOSS.get().defaultBlockState();
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
				moss_block_count = moss_block_count + 1;
			}
			if ((world.getBlockState(BlockPos.containing(x_add, y_add, z_add))).getBlock() == TruedarknessModBlocks.NEASKY_MOSS.get()) {
				if (((world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add))).is(BlockTags.create(new ResourceLocation("truedarkness:grass_blocks"))) || world.isEmptyBlock(BlockPos.containing(x_add, y_add + 1, z_add)))
						&& Mth.nextInt(RandomSource.create(), 1, 10) <= 3) {
					{
						BlockPos _bp = BlockPos.containing(x_add, y_add + 1, z_add);
						BlockState _bs = TruedarknessModBlocks.MEASKY_CARPET.get().defaultBlockState();
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
					continue;
				} else if (((world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add))).is(BlockTags.create(new ResourceLocation("truedarkness:grass_blocks"))) || world.isEmptyBlock(BlockPos.containing(x_add, y_add + 1, z_add)))
						&& Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
					{
						BlockPos _bp = BlockPos.containing(x_add, y_add + 1, z_add);
						BlockState _bs = TruedarknessModBlocks.MEASKY_TREE.get().defaultBlockState();
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
					continue;
				} else if (((world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add))).is(BlockTags.create(new ResourceLocation("truedarkness:grass_blocks"))) || world.isEmptyBlock(BlockPos.containing(x_add, y_add + 1, z_add)))
						&& Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
					{
						BlockPos _bp = BlockPos.containing(x_add, y_add + 1, z_add);
						BlockState _bs = TruedarknessModBlocks.SKYSTAR_FERN.get().defaultBlockState();
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
					continue;
				} else if (((world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add))).is(BlockTags.create(new ResourceLocation("truedarkness:grass_blocks"))) || world.isEmptyBlock(BlockPos.containing(x_add, y_add + 1, z_add)))
						&& Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
					{
						BlockPos _bp = BlockPos.containing(x_add, y_add + 1, z_add);
						BlockState _bs = TruedarknessModBlocks.SKYSTAR_SMALL_ROOTS.get().defaultBlockState();
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
					continue;
				} else if (((world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add))).is(BlockTags.create(new ResourceLocation("truedarkness:grass_blocks"))) || world.isEmptyBlock(BlockPos.containing(x_add, y_add + 1, z_add)))
						&& ((world.getBlockState(BlockPos.containing(x_add, y_add + 2, z_add))).is(BlockTags.create(new ResourceLocation("truedarkness:grass_blocks"))) || world.isEmptyBlock(BlockPos.containing(x_add, y_add + 2, z_add)))
						&& Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
					world.setBlock(BlockPos.containing(x_add, y_add + 1, z_add), TruedarknessModBlocks.SKYSTAR_LARGE_FERN.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x_add, y_add + 2, z_add), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(TruedarknessModBlocks.SKYSTAR_LARGE_FERN.get().defaultBlockState(), "half", "upper")), 3);
					continue;
				}
				continue;
			}
			try_count = try_count + 1;
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class BushyGrapeAzaleaLeavesObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))) == Blocks.AZALEA_LEAVES.defaultBlockState() || (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))) == Blocks.AZALEA_LEAVES.defaultBlockState()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))) == Blocks.AZALEA_LEAVES.defaultBlockState() || (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))) == Blocks.AZALEA_LEAVES.defaultBlockState()) {
			TruedarknessMod.queueServerWork(Mth.nextInt(RandomSource.create(), (int) (20 * 60 * 3), (int) (20 * 60 * 15)), () -> {
				if (((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))) == Blocks.AZALEA_LEAVES.defaultBlockState() || (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))) == Blocks.AZALEA_LEAVES.defaultBlockState()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))) == Blocks.AZALEA_LEAVES.defaultBlockState() || (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))) == Blocks.AZALEA_LEAVES.defaultBlockState())
						&& (world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.BUSHY_GRAPE_AZALEA_LEAVES.get().defaultBlockState()) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
							{
								BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
								BlockState _bs = TruedarknessModBlocks.GRAPE_AZALEA_LEAVES.get().defaultBlockState();
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
						} else {
							{
								BlockPos _bp = BlockPos.containing(x - 1, y, z - 1);
								BlockState _bs = TruedarknessModBlocks.GRAPE_AZALEA_LEAVES.get().defaultBlockState();
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
					} else {
						if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
							{
								BlockPos _bp = BlockPos.containing(x + 1, y, z - 1);
								BlockState _bs = TruedarknessModBlocks.GRAPE_AZALEA_LEAVES.get().defaultBlockState();
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
						} else {
							{
								BlockPos _bp = BlockPos.containing(x - 1, y, z + 1);
								BlockState _bs = TruedarknessModBlocks.GRAPE_AZALEA_LEAVES.get().defaultBlockState();
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
			});
		}
	}
}

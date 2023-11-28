package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class ShandarahKoghdaSnariadPrisdfziemliaietsiaNaBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 23; index0++) {
			ShandarahKoghdaSnariadPriziemliaietsiaNaBlokProcedure.execute(world, (Mth.nextInt(RandomSource.create(), -5, 5) + x), (Mth.nextInt(RandomSource.create(), -5, 5) + y), (Mth.nextInt(RandomSource.create(), -5, 5) + z));
		}
		if ((world.getBlockState(BlockPos.containing(x - 0, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:can_be_corrupted")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
				{
					BlockPos _bp = BlockPos.containing(x - 0, y + 0, z - 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPTED_SCULK.get().defaultBlockState();
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
					BlockPos _bp = BlockPos.containing(x - 0, y + 0, z - 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPT.get().defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x - 0, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:can_be_corrupted")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
				{
					BlockPos _bp = BlockPos.containing(x - 0, y + 0, z + 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPTED_SCULK.get().defaultBlockState();
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
					BlockPos _bp = BlockPos.containing(x - 0, y + 0, z + 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPT.get().defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:can_be_corrupted")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y + 0, z + 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPTED_SCULK.get().defaultBlockState();
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
					BlockPos _bp = BlockPos.containing(x - 1, y + 0, z + 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPT.get().defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:can_be_corrupted")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y + 0, z + 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPTED_SCULK.get().defaultBlockState();
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
					BlockPos _bp = BlockPos.containing(x + 1, y + 0, z + 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPT.get().defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:can_be_corrupted")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y + 0, z - 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPTED_SCULK.get().defaultBlockState();
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
					BlockPos _bp = BlockPos.containing(x + 1, y + 0, z - 1);
					BlockState _bs = TruedarknessModBlocks.CORRUPT.get().defaultBlockState();
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
}

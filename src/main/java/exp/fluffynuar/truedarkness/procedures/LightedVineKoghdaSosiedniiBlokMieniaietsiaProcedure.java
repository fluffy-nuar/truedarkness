package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class LightedVineKoghdaSosiedniiBlokMieniaietsiaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TruedarknessMod.queueServerWork(1, () -> {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		});
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.LIGHTED_VINE_2.get().defaultBlockState())
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.LIGHTED_VINE.get().defaultBlockState())
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.LIGHTED_VINE_ACTIVE.get().defaultBlockState())) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = TruedarknessModBlocks.LIGHTED_VINE_2.get().defaultBlockState();
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

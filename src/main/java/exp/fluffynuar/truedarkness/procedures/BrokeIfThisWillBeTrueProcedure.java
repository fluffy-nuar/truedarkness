package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class BrokeIfThisWillBeTrueProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.GLOW_FUNGUS_0.get().defaultBlockState() && (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) || world.isEmptyBlock(BlockPos.containing(x, y - 1, z)))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.GLOW_FUNGUS_1.get().defaultBlockState() && (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) || world.isEmptyBlock(BlockPos.containing(x, y + 1, z)))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.GLOW_FUNGUS_2.get().defaultBlockState() && (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) || world.isEmptyBlock(BlockPos.containing(x, y + 1, z)))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.LIGHT_SHROOM_3.get().defaultBlockState()
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))) == TruedarknessModBlocks.GLOW_FUNGUS_2.get().defaultBlockState())) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
	}
}

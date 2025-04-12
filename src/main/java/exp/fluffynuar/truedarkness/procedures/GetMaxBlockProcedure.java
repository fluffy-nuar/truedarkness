package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class GetMaxBlockProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_WORKBENCH.get()) {
			return 100;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_FURNACE.get()) {
			return 100;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_PIPE.get()) {
			return 20;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.BLOOD_CONTAINER.get()) {
			return 400;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CORRUPTED_REACTOR.get()) {
			return 100;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_CAULDRON.get()) {
			return 100;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_SCALE.get()) {
			return 100;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CORRUPTED_CAMPFIRE.get()) {
			return 40;
		}
		return 0;
	}
}

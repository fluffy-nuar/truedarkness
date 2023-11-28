package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class BlindVineTopPriIzmienieniiSosiednieghoBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TruedarknessMod.queueServerWork(2, () -> {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		});
	}
}

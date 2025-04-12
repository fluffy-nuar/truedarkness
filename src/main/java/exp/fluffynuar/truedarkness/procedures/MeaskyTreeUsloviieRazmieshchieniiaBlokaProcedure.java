package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class MeaskyTreeUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.COBBLED_ACCUSTONE.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.NEASKY_MOSS.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.UNDESKY_BLACKSOIL.get();
	}
}

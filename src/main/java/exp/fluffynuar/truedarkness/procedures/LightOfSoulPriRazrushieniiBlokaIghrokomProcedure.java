package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class LightOfSoulPriRazrushieniiBlokaIghrokomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 0, 1); index0++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.SOUL_CRYSTAL.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 4); index1++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.SOUL_GRAIN.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

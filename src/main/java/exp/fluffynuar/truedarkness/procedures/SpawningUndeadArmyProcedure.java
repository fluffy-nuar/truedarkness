package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class SpawningUndeadArmyProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		boolean logic = false;
		if (!world.getBlockState(BlockPos.containing(x, y + 2, z)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_SKELETON.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			return 1;
		}
		return 0;
	}
}

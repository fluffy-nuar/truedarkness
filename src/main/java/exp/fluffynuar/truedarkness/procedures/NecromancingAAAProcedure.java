package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class NecromancingAAAProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_SKELETON.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}

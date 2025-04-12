package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

public class SpawningCooldwonProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("spawning");
	}
}

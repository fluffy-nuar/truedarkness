package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

public class AttackPlayerProcUndeadProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("spawning") == false) {
			return entity.getPersistentData().getBoolean("aggresive");
		}
		return entity.getPersistentData().getBoolean("aggresive");
	}
}

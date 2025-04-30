package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GlowBugPriNachalnomPrizyvieSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("size", (Mth.nextDouble(RandomSource.create(), 0.5, 1)));
	}
}

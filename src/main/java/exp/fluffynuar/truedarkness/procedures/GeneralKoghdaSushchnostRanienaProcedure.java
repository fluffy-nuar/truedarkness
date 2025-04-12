package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

public class GeneralKoghdaSushchnostRanienaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double x_0 = 0;
		double y_0 = 0;
		double z_0 = 0;
		double count = 0;
		double x_add = 0;
		double y_add = 0;
		double player = 0;
		double z_add = 0;
		if (entity.getPersistentData().getDouble("aggresion") + 8 <= 100) {
			entity.getPersistentData().putDouble("aggresion", (entity.getPersistentData().getDouble("aggresion") + 8));
		} else {
			entity.getPersistentData().putDouble("aggresion", 100);
		}
	}
}

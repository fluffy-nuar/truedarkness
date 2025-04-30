package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class AAAAAAAABookProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double add_number = 0;
		TruedarknessMod.queueServerWork(1, () -> {
			BookAltarGuiKazhdyiTikPokaIntierfieisOtkrytProcedure.execute(entity);
		});
	}
}

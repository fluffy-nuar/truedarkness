package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import java.util.ArrayList;

public class HuntingPriIstiechieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			for (Entity entityiterator : new ArrayList<>(entity.getPassengers())) {
				entityiterator.stopRiding();
			}
		}
	}
}

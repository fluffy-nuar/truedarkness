package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class LightedBerryIghrokZakanchivaietIspolzovaniiePriedmietaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 10) <= 3) {
			{
				double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupted + 1;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Corrupted = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

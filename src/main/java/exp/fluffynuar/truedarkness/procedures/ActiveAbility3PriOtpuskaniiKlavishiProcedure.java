package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ActiveAbility3PriOtpuskaniiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HoldAbility3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar != 0) {
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ProgressBar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class VisualProgress7Procedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar >= 10 * 7) {
			return 5;
		}
		return Math.floor(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar - 10 * 6) / 2);
	}
}

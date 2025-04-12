package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ReadyNoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TruedarknessModVariables.PlayerVariables())).Preys >= ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage + 6) * 20)) {
			return true;
		}
		return false;
	}
}

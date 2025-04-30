package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ActiveStageGetToMouseEventProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getDouble("ActiveStage") + 1;
	}
}

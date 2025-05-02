package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class GetTypeOfPerk9Procedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double add_int = 0;
		add_int = 9;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getDouble("ActiveStage") >= add_int - 1) {
			return SetSpellOverlayProcedure.execute(entity, add_int);
		}
		return 0;
	}
}
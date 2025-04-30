package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class GetTypeOfPerk1Procedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double add_int = 0;
		add_int = 1;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getDouble("ActiveStage") >= add_int - 1) {
			if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))).equals("stream")) {
				return 2;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int))))
					.equals("smelt")) {
				return 3;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int))))
					.equals("tread")) {
				return 4;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))).equals("seer")) {
				return 5;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))).equals("shot")) {
				return 6;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int))))
					.equals("lightning")) {
				return 7;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int))))
					.equals("ringing")) {
				return 8;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int))))
					.equals("fangs")) {
				return 9;
			} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int))))
					.equals("undead")) {
				return 10;
			}
			return 1;
		}
		return 0;
	}
}

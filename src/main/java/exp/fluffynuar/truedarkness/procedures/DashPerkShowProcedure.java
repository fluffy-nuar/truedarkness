package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class DashPerkShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((LineGetEridiumProcedure.execute(entity)).equals("dash") && !(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_select
				|| (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_item).getOrCreateTag()
						.getString(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_preselect)))).equals("dash")
						&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_select) {
			return true;
		}
		return false;
	}
}

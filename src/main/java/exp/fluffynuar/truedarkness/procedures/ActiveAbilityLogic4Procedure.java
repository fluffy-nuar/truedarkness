package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ActiveAbilityLogic4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return CountOfPerksProcedure.execute(entity) >= 6 && (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_select;
	}
}

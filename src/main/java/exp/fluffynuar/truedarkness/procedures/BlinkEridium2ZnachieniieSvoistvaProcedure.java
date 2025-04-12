package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class BlinkEridium2ZnachieniieSvoistvaProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			return 1;
		}
		return 0;
	}
}

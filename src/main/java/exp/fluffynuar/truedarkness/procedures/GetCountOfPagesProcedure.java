package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class GetCountOfPagesProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line1")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line2")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line3")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line4")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line5")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line6")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line7")).equals("") ? 0 : 1)
				+ ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line8")).equals("") ? 0 : 1);
	}
}

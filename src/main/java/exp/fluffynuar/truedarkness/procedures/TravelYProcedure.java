package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class TravelYProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag()
				.getDouble(("y_" + Math.round(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag().getDouble("SelectedCategory"))
						+ "_" + Math.round(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag().getDouble("SelectedLine"))));
	}
}

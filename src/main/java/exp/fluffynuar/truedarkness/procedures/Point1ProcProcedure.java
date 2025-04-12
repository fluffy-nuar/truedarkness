package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class Point1ProcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag().putDouble("SelectedLine", 1);
		((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag().putBoolean("Selected", true);
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ShowHideScrollPriNazhatiiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = !(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ScrollToggle;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ScrollToggle = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

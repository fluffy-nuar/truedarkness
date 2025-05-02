package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class SetSpellOverlayProcedure {
	public static double execute(Entity entity, double SelectedSlot) {
		if (entity == null)
			return 0;
		if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot)))).equals("stream")) {
			return 2;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("smelt")) {
			return 3;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("tread")) {
			return 4;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("seer")) {
			return 5;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("shot")) {
			return 6;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("lightning")) {
			return 7;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("ringing")) {
			return 8;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("fangs")) {
			return 9;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("undead")) {
			return 10;
		} else if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(SelectedSlot))))
				.equals("greed")) {
			return 11;
		}
		return 1;
	}
}

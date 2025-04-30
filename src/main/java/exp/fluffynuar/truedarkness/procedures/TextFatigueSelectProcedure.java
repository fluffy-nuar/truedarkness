package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class TextFatigueSelectProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Component.translatable(("item.truedarkness.shiny_eridium_" + ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
				.getString(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_preselect))) + ".desc")).getString();
	}
}

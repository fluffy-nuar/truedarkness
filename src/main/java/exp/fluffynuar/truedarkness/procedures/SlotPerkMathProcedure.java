package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class SlotPerkMathProcedure {
	public static double execute(Entity entity, double F) {
		if (entity == null)
			return 0;
		double add_count = 0;
		double second_sount = 0;
		while (!(add_count == F)) {
			if (!(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_item).getOrCreateTag().getString(("Line" + Math.round(add_count))))
					.equals("")) {
				add_count = add_count + 1;
				continue;
			}
			second_sount = second_sount + 1;
			continue;
		}
		return second_sount;
	}
}

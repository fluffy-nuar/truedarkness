package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ShinyEridiumBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ItemStack _setval = ItemStack.EMPTY;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PerkItem = _setval.copy();
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

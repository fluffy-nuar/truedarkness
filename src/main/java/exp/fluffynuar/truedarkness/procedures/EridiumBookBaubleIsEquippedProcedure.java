package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class EridiumBookBaubleIsEquippedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			ItemStack _setval = itemstack;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Active_skill_item = _setval.copy();
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = itemstack.getOrCreateTag().getDouble("SelectedLine");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Active_skill_selected = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

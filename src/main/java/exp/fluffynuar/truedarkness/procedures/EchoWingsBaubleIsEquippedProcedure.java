package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class EchoWingsBaubleIsEquippedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			String _setval = itemstack.getOrCreateTag().getString("sideTag");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic_side = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = itemstack.getOrCreateTag().getString("upTag");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic_up = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = itemstack.getOrCreateTag().getString("downTag");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic_down = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

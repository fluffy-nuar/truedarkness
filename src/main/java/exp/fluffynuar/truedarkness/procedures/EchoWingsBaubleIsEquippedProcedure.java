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
			double _setval = itemstack.getOrCreateTag().getDouble("sideCount");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic_side_type = _setval;
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
			double _setval = itemstack.getOrCreateTag().getDouble("upCount");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic_up_type = _setval;
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
		{
			double _setval = itemstack.getOrCreateTag().getDouble("downCount");
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic_down_type = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

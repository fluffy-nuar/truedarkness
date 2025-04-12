package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class DDDSneakyFangsBaubleIsEquippedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == TruedarknessModItems.STEEL_FANGS.get()) {
			{
				String _setval = "steel";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Passive_skill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == TruedarknessModItems.SNEAKY_FANGS.get()) {
			{
				String _setval = "hide";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Passive_skill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == TruedarknessModItems.WITHERED_FANGS.get()) {
			{
				String _setval = "wither";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Passive_skill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == TruedarknessModItems.HARD_FANGS.get()) {
			{
				String _setval = "bone";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Passive_skill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == TruedarknessModItems.CREEPY_FANGS.get()) {
			{
				String _setval = "fear";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Passive_skill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == TruedarknessModItems.MOONLIGHT_FANGS.get()) {
			{
				String _setval = "moon";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Passive_skill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(TruedarknessModMobEffects.HUNTING.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.HUNTING.get());
		}
	}
}

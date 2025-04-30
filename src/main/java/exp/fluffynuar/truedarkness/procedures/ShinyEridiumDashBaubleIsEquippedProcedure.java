package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ShinyEridiumDashBaubleIsEquippedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			{
				ItemStack _setval = itemstack;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PerkItem = _setval.copy();
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

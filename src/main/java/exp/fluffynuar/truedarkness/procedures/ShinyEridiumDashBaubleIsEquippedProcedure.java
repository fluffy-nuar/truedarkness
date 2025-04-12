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
			itemstack.getOrCreateTag().putString("Line0", ShinyEridiumGetTypeProcedure.execute(itemstack));
			itemstack.getOrCreateTag().putDouble("Line0Tier", (itemstack.getOrCreateTag().getDouble("ActiveStage") + 1));
			itemstack.getOrCreateTag().putDouble("Line0Activetime", SnihyEridiumGetActiveTimeProcedure.execute(itemstack));
			{
				ItemStack _setval = itemstack;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Active_skill_item = _setval.copy();
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

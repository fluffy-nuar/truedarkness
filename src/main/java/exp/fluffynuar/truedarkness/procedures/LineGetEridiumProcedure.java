package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class LineGetEridiumProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String Active_skill = "";
		Entity entity_1 = null;
		boolean find = false;
		ItemStack tool_hand = ItemStack.EMPTY;
		double add_count = 0;
		double Active_stage = 0;
		double Active_time = 0;
		double tool_count_hand = 0;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			return ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("Line0");
		} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			return ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
					.getString(("Line" + Math.round(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getDouble("SelectedLine"))));
		}
		return "";
	}
}

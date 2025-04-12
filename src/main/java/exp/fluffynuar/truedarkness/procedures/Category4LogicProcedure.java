package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class Category4LogicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		ItemStack Metenite_shard = ItemStack.EMPTY;
		double un_selected_again = 0;
		double un_selected = 0;
		return !(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag().getString(
				("Category" + Math.round(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).getOrCreateTag().getDouble("CategoryPage") * 6 + 4))))
				.equals("");
	}
}

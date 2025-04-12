package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class DeletePointProcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack metenite = ItemStack.EMPTY;
		double un_selected = 0;
		double un_selected_category = 0;
		metenite = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).copy();
		if (!(metenite.getOrCreateTag().getString(("Line" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedLine"))))).equals("")) {
			un_selected = metenite.getOrCreateTag().getDouble("SelectedLine");
			while (!(metenite.getOrCreateTag().getString(("Line" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected)))).equals("")) {
				metenite.getOrCreateTag().putString(("Line" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected)),
						(metenite.getOrCreateTag().getString(("Line" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected + 1)))));
				metenite.getOrCreateTag().putDouble(("x_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected)),
						(metenite.getOrCreateTag().getDouble(("x_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected + 1)))));
				metenite.getOrCreateTag().putDouble(("y_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected)),
						(metenite.getOrCreateTag().getDouble(("y_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected + 1)))));
				metenite.getOrCreateTag().putDouble(("z_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected)),
						(metenite.getOrCreateTag().getDouble(("z_" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(un_selected + 1)))));
				un_selected = un_selected + 1;
			}
			if ((metenite.getOrCreateTag().getString(("Line" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory")) + "_" + Math.round(0)))).equals("")) {
				metenite.getOrCreateTag().putString(("Category" + Math.round(metenite.getOrCreateTag().getDouble("SelectedCategory"))), "");
				metenite.getOrCreateTag().putDouble("SelectedCategory", (metenite.getOrCreateTag().getDouble("SelectedCategory") + (metenite.getOrCreateTag().getDouble("SelectedCategory") > 0 ? -1 : 1)));
			}
		}
		metenite.getOrCreateTag().putDouble("SelectedLine", (-1));
		{
			ItemStack _setval = metenite;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Metenite_shard = _setval.copy();
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

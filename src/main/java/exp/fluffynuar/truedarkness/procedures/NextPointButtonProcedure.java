package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class NextPointButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack Metenite_shard = ItemStack.EMPTY;
		double un_selected = 0;
		double un_selected_again = 0;
		if (!(Metenite_shard.getItem() == TruedarknessModItems.METENITE_CRYSTAL.get())) {
			Metenite_shard = new ItemStack(TruedarknessModItems.METENITE_CRYSTAL.get()).copy();
		}
		Metenite_shard = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).copy();
		un_selected = 0;
		while (!(Metenite_shard.getOrCreateTag().getString(("Category" + Math.round(un_selected)))).equals(new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Category")) && !(Metenite_shard.getOrCreateTag().getString(("Category" + Math.round(un_selected)))).equals("")) {
			un_selected = un_selected + 1;
			continue;
		}
		un_selected_again = 0;
		while (!(Metenite_shard.getOrCreateTag().getString(("Line" + Math.round(un_selected) + "_" + Math.round(un_selected_again)))).equals("") && !(un_selected_again + 1 > 6)) {
			un_selected_again = un_selected_again + 1;
			continue;
		}
		if ((Metenite_shard.getOrCreateTag().getString(("Category" + Math.round(un_selected)))).equals("")) {
			Metenite_shard.getOrCreateTag().putString(("Category" + Math.round(un_selected)), (new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Category")));
		}
		Metenite_shard.getOrCreateTag().putString(("Line" + Math.round(un_selected) + "_" + Math.round(un_selected_again)), (new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Point")));
		Metenite_shard.getOrCreateTag().putDouble(("x_" + Math.round(un_selected) + "_" + Math.round(un_selected_again)), x);
		Metenite_shard.getOrCreateTag().putDouble(("y_" + Math.round(un_selected) + "_" + Math.round(un_selected_again)), y);
		Metenite_shard.getOrCreateTag().putDouble(("z_" + Math.round(un_selected) + "_" + Math.round(un_selected_again)), z);
		{
			ItemStack _setval = Metenite_shard;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Metenite_shard = _setval.copy();
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

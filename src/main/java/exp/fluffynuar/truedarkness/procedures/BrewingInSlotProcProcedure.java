package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class BrewingInSlotProcProcedure {
	public static ItemStack execute(LevelAccessor world, double x, double y, double z, double slot) {
		double add_number = 0;
		ItemStack used_item = ItemStack.EMPTY;
		add_number = 0;
		used_item = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), (int) Math.round(slot))).copy();
		used_item.getOrCreateTag().putBoolean("CursedModify", true);
		while (add_number <= 2) {
			if ((used_item.getOrCreateTag().getString(("Layer" + Math.round(add_number)))).equals(BrewingTypeGetProcedure.execute(new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)))) {
				break;
			}
			if ((used_item.getOrCreateTag().getString(("Layer" + Math.round(add_number)))).equals("")) {
				used_item.getOrCreateTag().putString(("Layer" + Math.round(add_number)), BrewingTypeGetProcedure.execute(new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)));
				break;
			} else {
				add_number = add_number + 1;
				continue;
			}
		}
		return used_item;
	}
}

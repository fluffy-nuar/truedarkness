package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.Map;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class SlotsOfEridiumProcedure {
	public static void execute(LevelAccessor world, Entity entity, double slot) {
		if (entity == null)
			return;
		TruedarknessMod.queueServerWork(1, () -> {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("truedarkness:manuals")))) {
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
						.putString(("Line" + Math.round(slot - 5)), ShinyEridiumGetTypeProcedure
								.execute(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slot)).getItem() : ItemStack.EMPTY));
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble(
						("Line" + Math.round(slot - 5) + "Tier"),
						((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slot)).getItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("ActiveStage")));
			}
		});
	}
}

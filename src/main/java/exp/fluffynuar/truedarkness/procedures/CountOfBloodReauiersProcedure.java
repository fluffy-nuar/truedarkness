package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.function.Supplier;
import java.util.Map;

public class CountOfBloodReauiersProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Component.translatable("block.truedarkness.cursed_anvil.add").getString() + ""
				+ Math.round(PriceCursedAnvilProcProcedure.execute(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY))
				+ " " + Component.translatable("item.truedarkness.corrupted_ritual_knife.prey").getString();
	}
}

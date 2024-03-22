package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DarkCrystalSwordPriShchielchkiePKMProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("" + itemstack.getOrCreateTag().getDouble("upTag"))), false);
		itemstack.getOrCreateTag().putDouble("upTag", (itemstack.getOrCreateTag().getDouble("upTag") + 1));
	}
}

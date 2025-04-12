package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class CursedLeatherPriShchielchkiePKMProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			if (itemstack.getOrCreateTag().getDouble("ActiveStage") != 3) {
				itemstack.getOrCreateTag().putDouble("ActiveStage", (itemstack.getOrCreateTag().getDouble("ActiveStage") + 1));
			} else {
				itemstack.getOrCreateTag().putDouble("ActiveStage", 0);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("" + Math.round(itemstack.getOrCreateTag().getDouble("ActiveStage") + 1))), true);
		}
	}
}

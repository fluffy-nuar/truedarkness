package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class ManaRedactorPlusPriShchielchkiePKMProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
		if (entity.isShiftKeyDown()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A73" + (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana)), true);
		} else {
			if (itemstack.getItem() == TruedarknessModItems.MANA_REDACTOR_PLUS.get()
					&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana + 0.5 <= 8) {
				{
					double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana + 0.5;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SculkedMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (itemstack.getItem() == TruedarknessModItems.MANA_REDACTOR_MINUS.get()
					&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5 >= 0) {
				{
					double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SculkedMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class ChangingSpellKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_select) {
			if (CountOfPerksProcedure.execute(entity) >= 5) {
				if (entity.getXRot() < -50) {
					{
						double _setval = 1;
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Active_skill_preselect = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getXRot() > 50) {
					{
						double _setval = CountOfPerksProcedure.execute(entity);
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Active_skill_preselect = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = Math.round((Math.round(((entity.getXRot() + 50) / 100) * 1000) / 10) / (100 / (CountOfPerksProcedure.execute(entity) - 2))) + 1;
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Active_skill_preselect = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					double _setval = Math.round((((entity.getXRot() + 90) / 180) * 100) / (100 / (CountOfPerksProcedure.execute(entity) - 1))) + 1;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Active_skill_preselect = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.CURSED_SCROLL.get(), lv).isPresent() : false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(""), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("[\u00A7d" + Component.translatable(("item.truedarkness.shiny_eridium_" + LineGetPreselectedProcedure.execute(entity) + ".desc")).getString() + "\u00A7f]")), true);
			}
		}
	}
}

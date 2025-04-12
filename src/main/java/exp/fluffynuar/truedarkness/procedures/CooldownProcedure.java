package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CooldownProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 0) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(),
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()).getDuration() : 0);
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CorruptedRitualKnifePriShchielchkiePKMProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
				&& ((itemstack.getOrCreateTag().getString("Tale3")).equals("steal") || (itemstack.getOrCreateTag().getString("Tale2")).equals("steal") || (itemstack.getOrCreateTag().getString("Tale1")).equals("steal")
						|| (itemstack.getOrCreateTag().getString("Tale3")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale2")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale1")).equals("blood"))) {
			if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
				if (entity.isShiftKeyDown()) {
					if (itemstack.getOrCreateTag().getDouble("Typing") == 1 && itemstack.getOrCreateTag().getDouble("Prey") >= 5) {
						itemstack.getOrCreateTag().putDouble("Typing", 5);
					} else if (itemstack.getOrCreateTag().getDouble("Typing") == 5 && itemstack.getOrCreateTag().getDouble("Prey") >= 10) {
						itemstack.getOrCreateTag().putDouble("Typing", 10);
					} else if (itemstack.getOrCreateTag().getDouble("Typing") == 10 && itemstack.getOrCreateTag().getDouble("Prey") >= 50) {
						itemstack.getOrCreateTag().putDouble("Typing", 50);
					} else if (itemstack.getOrCreateTag().getDouble("Typing") == 50 && itemstack.getOrCreateTag().getDouble("Prey") >= 100) {
						itemstack.getOrCreateTag().putDouble("Typing", 100);
					} else if (itemstack.getOrCreateTag().getDouble("Typing") == 100 && itemstack.getOrCreateTag().getDouble("Prey") >= 500) {
						itemstack.getOrCreateTag().putDouble("Typing", 500);
					} else if (itemstack.getOrCreateTag().getDouble("Typing") == 500 && itemstack.getOrCreateTag().getDouble("Prey") >= 1000) {
						itemstack.getOrCreateTag().putDouble("Typing", 1000);
					} else {
						itemstack.getOrCreateTag().putDouble("Typing", 1);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 2);
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					} else if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A75" + Math.round(itemstack.getOrCreateTag().getDouble("Typing")))), true);
				} else {
					if (itemstack.getOrCreateTag().getDouble("Typing") > 0 && itemstack.getOrCreateTag().getDouble("Prey") > 0) {
						{
							double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count + itemstack.getOrCreateTag().getDouble("Typing");
							entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Active_prey_count = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 35, 0, false, false));
						itemstack.getOrCreateTag().putDouble("Prey", (itemstack.getOrCreateTag().getDouble("Prey") - itemstack.getOrCreateTag().getDouble("Typing")));
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A75+" + Math.round(itemstack.getOrCreateTag().getDouble("Typing")))), true);
						if (itemstack.getOrCreateTag().getDouble("Prey") >= 1) {
							if (itemstack.getOrCreateTag().getDouble("Prey") < 1000 && itemstack.getOrCreateTag().getDouble("Typing") == 1000) {
								itemstack.getOrCreateTag().putDouble("Typing", 500);
							}
							if (itemstack.getOrCreateTag().getDouble("Prey") < 500 && itemstack.getOrCreateTag().getDouble("Typing") == 500) {
								itemstack.getOrCreateTag().putDouble("Typing", 100);
							}
							if (itemstack.getOrCreateTag().getDouble("Prey") < 100 && itemstack.getOrCreateTag().getDouble("Typing") == 100) {
								itemstack.getOrCreateTag().putDouble("Typing", 50);
							}
							if (itemstack.getOrCreateTag().getDouble("Prey") < 50 && itemstack.getOrCreateTag().getDouble("Typing") == 50) {
								itemstack.getOrCreateTag().putDouble("Typing", 10);
							}
							if (itemstack.getOrCreateTag().getDouble("Prey") < 10 && itemstack.getOrCreateTag().getDouble("Typing") == 10) {
								itemstack.getOrCreateTag().putDouble("Typing", 5);
							}
							if (itemstack.getOrCreateTag().getDouble("Prey") < 5 && itemstack.getOrCreateTag().getDouble("Typing") == 5) {
								itemstack.getOrCreateTag().putDouble("Typing", 1);
							}
						} else {
							itemstack.getOrCreateTag().putDouble("Typing", 0);
						}
						if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
						} else if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.OFF_HAND, true);
						}
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
					}
				}
			}
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEnchantments;

@Mod.EventBusSubscriber
public class EnchantmentsToolsProcProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.level().dimension()) == Level.OVERWORLD)
				&& EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.WORLD_BLOCK_BREAKER.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0, false, false));
		}
		if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(TruedarknessModMobEffects.TOOL_PROTECTION.get())) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(-1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.TOOL_PROTECTION.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.TOOL_PROTECTION.get()).getAmplifier() : 0) >= 1
					&& Mth.nextInt(RandomSource.create(), 1, 100) >= 75) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get(), 60, 0, false, false));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_MARK.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_MARK.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.MARINITE_MARK.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.CURSED_MARK.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_SPOOL.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_SPOOL.get(), 60);
			}
		}
	}
}

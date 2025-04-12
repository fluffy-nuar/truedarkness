package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

@Mod.EventBusSubscriber
public class YteriaMilkProcProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		execute(null, world, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria"))
				&& itemstack.getItem() == Items.MILK_BUCKET) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 50);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TABLET_BREAKING.get(), 2000, 0, false, false));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.alive_core.food").getString())), true);
		}
		if (itemstack.getItem().isEdible()) {
			if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
					&& !((itemstack.getOrCreateTag().getString("Layer0")).equals("corrupt") || (itemstack.getOrCreateTag().getString("Layer1")).equals("corrupt") || (itemstack.getOrCreateTag().getString("Layer2")).equals("corrupt"))) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 50);
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - (itemstack.getItem().isEdible() ? itemstack.getItem().getFoodProperties().getNutrition() : 0)));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - (itemstack.getItem().isEdible() ? itemstack.getItem().getFoodProperties().getSaturationModifier() : 0)));
				if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(MobEffects.HUNGER)) {
					if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(MobEffects.CONFUSION)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 3, false, false));
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 600, 3, false, false));
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 600, 7, false, false));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.alive_core.food").getString())), true);
			} else {
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("golden") || (itemstack.getOrCreateTag().getString("Layer1")).equals("golden") || (itemstack.getOrCreateTag().getString("Layer2")).equals("golden")) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 80, 1, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1, false, false));
				}
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("flame") || (itemstack.getOrCreateTag().getString("Layer1")).equals("flame") || (itemstack.getOrCreateTag().getString("Layer2")).equals("flame")) {
					entity.setSecondsOnFire(15);
				}
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("ice") || (itemstack.getOrCreateTag().getString("Layer1")).equals("ice") || (itemstack.getOrCreateTag().getString("Layer2")).equals("ice")) {
					entity.setTicksFrozen(100);
				}
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("fish") || (itemstack.getOrCreateTag().getString("Layer1")).equals("fish") || (itemstack.getOrCreateTag().getString("Layer2")).equals("fish")) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, false, false));
					entity.setAirSupply((int) (entity.getAirSupply() + 1));
				}
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("haste") || (itemstack.getOrCreateTag().getString("Layer1")).equals("haste") || (itemstack.getOrCreateTag().getString("Layer2")).equals("haste")) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 260, 1, false, false));
				}
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("better") || (itemstack.getOrCreateTag().getString("Layer1")).equals("better") || (itemstack.getOrCreateTag().getString("Layer2")).equals("better")) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel(20);
					if (entity instanceof Player _player)
						_player.getFoodData().setSaturation(20);
				}
				if ((itemstack.getOrCreateTag().getString("Layer0")).equals("unpoison") || (itemstack.getOrCreateTag().getString("Layer1")).equals("unpoison") || (itemstack.getOrCreateTag().getString("Layer2")).equals("unpoison")) {
					if (entity instanceof LivingEntity _livEnt87 && _livEnt87.hasEffect(MobEffects.POISON)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.POISON);
					}
					if (entity instanceof LivingEntity _livEnt89 && _livEnt89.hasEffect(MobEffects.WITHER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.WITHER);
					}
					if (entity instanceof LivingEntity _livEnt91 && _livEnt91.hasEffect(MobEffects.CONFUSION)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.CONFUSION);
					}
				}
			}
		}
	}
}

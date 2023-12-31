package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber
public class BeforeAttackProcProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player && (entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) >= 75) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.CORRUPTING.get(), (int) (20 * 5), 0, true, false));
			}
		}
		if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(TruedarknessModItems.CURSED_MIRROR.get())) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (20 * 20), 0, true, false));
		}
		if (sourceentity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(TruedarknessModMobEffects.PARANOIA.get()) && Mth.nextInt(RandomSource.create(), 1, 10) <= 3) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
				entityToSpawn.setPickUpDelay(60);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			TruedarknessMod.queueServerWork(1, () -> {
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			});
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
				&& !(sourceentity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get()))) {
			if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.GENERAL_HEART.get(), lv).isPresent() : false) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 140, 3, true, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 140, 1, true, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get(), 140, 1, true, false));
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_HEART.get(), 140);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_HEART.get(), 140);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_HEART.get(), 140);
			}
		}
		if (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem)
				&& !(sourceentity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get()))) {
			if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.GENERAL_MARK.get(), lv).isPresent() : false) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 3, true, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, true, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get(), 120, 0, true, false));
				TruedarknessMod.queueServerWork(60, () -> {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 50, true, false));
				});
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_SPOOL.get(), 120);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_SPOOL.get(), 120);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_MARK.get(), 120);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_MARK.get(), 120);
			}
		}
		if (entity instanceof LivingEntity _livEnt39 && _livEnt39.hasEffect(TruedarknessModMobEffects.PHANTOM_PROTECTION.get())) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.PLAYERS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.PLAYERS, 1, (float) 0.5, false);
				}
			}
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.isBlocking() : false)) {
				sourceentity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)),
						(float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getMaxDamage()
								* (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.PHANTOM_PROTECTION.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.PHANTOM_PROTECTION.get()).getAmplifier() : 0))));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.PHANTOM_PROTECTION.get());
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.MARINITE_WINGS.get(), lv).isPresent() : false) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 400, 0, false, false));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.MARINITE_WINGS.get(), 400);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 400);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 400);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 400);
			}
		}
	}
}

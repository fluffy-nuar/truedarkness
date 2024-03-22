package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

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
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
				&& !(sourceentity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get()))) {
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
				&& !(sourceentity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get()))) {
			if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.WARRIOR_HEART.get(), lv).isPresent() : false) {
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
					_player.getCooldowns().addCooldown(TruedarknessModItems.WARRIOR_HEART.get(), 120);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_SPOOL.get(), 120);
			}
		}
		if (entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(TruedarknessModMobEffects.PHANTOM_PROTECTION.get())) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.PLAYERS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.PLAYERS, 1, (float) 0.5, false);
				}
			}
			if (!(sourceentity instanceof LivingEntity _livEnt33 && _livEnt33.isBlocking())) {
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
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOTEM_OF_DYING.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOTEM_OF_DYING.get()) && !(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1200, 5, false, false));
		}
	}
}

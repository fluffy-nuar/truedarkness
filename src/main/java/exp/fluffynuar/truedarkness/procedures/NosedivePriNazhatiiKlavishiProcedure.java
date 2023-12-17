package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModGameRules;

public class NosedivePriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.onGround()) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get()))) {
				if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.SOUL_HEART.get(), lv).isPresent() : false) {
					if (!(new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) && (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Jump == true) {
						{
							boolean _setval = false;
							entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Jump = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					entity.setDeltaMovement(new Vec3(0, (-4), 0));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 80, 255, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.NOSEDIVE_EFFECT.get(), 60, 0, false, false));
					if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(TruedarknessModMobEffects.SOUL_SPEED.get())) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)) / 2), 0, false, false));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_HEART.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)) / 2));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_HEART.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)) / 2));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_HEART.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)) / 2));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)), 0, false, false));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_HEART.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_HEART.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_HEART.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.NOSEDIVE_COOLDOWN)));
					}
					if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SoulCount
							+ 1 <= (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.SOUL_COUNT))) {
						if (Mth.nextInt(RandomSource.create(), 1, 100) <= 10) {
							{
								double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SoulCount + 1;
								entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SoulCount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7b" + "+1")), true);
						}
					}
					if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SoulCount >= (world.getLevelData().getGameRules()
							.getInt(TruedarknessModGameRules.SOUL_COUNT))) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7b" + Component.translatable("mana.overdrive").getString())), true);
					}
				}
			}
		} else {
			if (!(entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get()))) {
				if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_HEART.get(), lv).isPresent() : false) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_HEART_COOLDOWN.get(), 280, 0, false, false));
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_HEART.get(), 280);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_HEART.get(), 280);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_HEART.get(), 280);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 120, 198, false, false));
					{
						double _setval = (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.SCULKMANALIMIT));
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SculkedMana = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.roar")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.roar")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			}
		}
	}
}

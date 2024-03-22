package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class DashPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get()))) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.SOUL_STONE.get(), lv).isPresent() : false) {
				if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Dash == true || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity)) {
					if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.SOUL_SPOOL.get(), lv).isPresent() : false) {
						entity.setNoGravity(true);
						TruedarknessMod.queueServerWork(1, () -> {
							entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.5), 0, (entity.getLookAngle().z * 1.5)));
						});
						TruedarknessMod.queueServerWork(8, () -> {
							entity.setNoGravity(false);
						});
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_SPOOL.get(), 20);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get(), 20, 0, false, false));
						TruedarknessMod.queueServerWork(30, () -> {
							if (!world.isEmptyBlock(BlockPos.containing(x, y - 0.01, z))) {
								{
									boolean _setval = true;
									entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Dash = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						});
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
						}.checkGamemode(entity))) {
							{
								boolean _setval = false;
								entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Dash = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "playsound minecraft:item.trident.riptide_3 player @a ~ ~ ~ 0.2 0.6");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:soul_fire_flame ~ ~ ~ 0 0 0 0.1 10 force");
							}
						}
					}
				}
			} else {
				if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Jump == true || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity)) {
					if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.SOUL_SPOOL.get(), lv).isPresent() : false) {
						entity.setNoGravity(true);
						TruedarknessMod.queueServerWork(1, () -> {
							entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.5), 0, (entity.getLookAngle().z * 1.5)));
						});
						TruedarknessMod.queueServerWork(8, () -> {
							entity.setNoGravity(false);
						});
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_SPOOL.get(), 20);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_SPOOL_COOLDOWN.get(), 20, 0, false, false));
						TruedarknessMod.queueServerWork(30, () -> {
							if (!world.isEmptyBlock(BlockPos.containing(x, y - 0.01, z))) {
								{
									boolean _setval = true;
									entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Jump = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						});
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
						}.checkGamemode(entity))) {
							{
								boolean _setval = false;
								entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Jump = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "playsound minecraft:item.trident.riptide_3 player @a ~ ~ ~ 0.2 0.6");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:soul_fire_flame ~ ~ ~ 0 0 0 0.1 10 force");
							}
						}
					}
				}
			}
		}
	}
}

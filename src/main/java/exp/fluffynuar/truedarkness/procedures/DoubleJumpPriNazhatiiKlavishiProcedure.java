package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModGameRules;

public class DoubleJumpPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))
				&& ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Jump == true || new Object() {
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
			if (!entity.onGround() && world.isEmptyBlock(BlockPos.containing(x, y - 0.3, z)) && !(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.SOUL_WINGS.get(), lv).isPresent() : false) {
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
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.1), 0.75, (entity.getLookAngle().z * 0.1)));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.FALLING_EFFECT.get(), 40, 0, false, false));
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:soul ~ ~ ~ 0 0 0 0.1 10 force");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "playsound minecraft:entity.wither.hurt player @a ~ ~ ~ 0.3 0.8");
						}
					}
					if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(TruedarknessModMobEffects.SOUL_SPEED.get())) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)) / 2), 0, false, false));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)) / 2));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)) / 2));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), (int) ((world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)) / 2));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)), 0, false, false));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)));
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.DOUBLE_JUMP_COOLDOWN)));
					}
					if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SoulCount
							+ 1 <= (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.SOUL_COUNT)) && Mth.nextInt(RandomSource.create(), 1, 100) <= 10) {
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
					if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SoulCount >= (world.getLevelData().getGameRules()
							.getInt(TruedarknessModGameRules.SOUL_COUNT))) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7b" + Component.translatable("mana.overdrive").getString())), true);
					}
				}
			}
		}
	}
}

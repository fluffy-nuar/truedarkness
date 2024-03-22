package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;
import exp.fluffynuar.truedarkness.entity.SculkFeatherProjectileEntity;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class UseMagicPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_WINGS.get(), lv).isPresent() : false) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
				if (entity.getXRot() < -80) {
					if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_up).equals("blink")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							TruedarknessMod.queueServerWork(24, () -> {
								{
									final Vec3 _center = new Vec3(x, (y + 7), z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 3);
										TruedarknessMod.queueServerWork(10, () -> {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 7);
											TruedarknessMod.queueServerWork(10, () -> {
												entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 15);
											});
										});
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, x, (y + 7), z, 5, 5, 5, 5, 0.1);
								TruedarknessMod.queueServerWork(10, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, x, (y + 7), z, 5, 5, 5, 5, 0.1);
									TruedarknessMod.queueServerWork(10, () -> {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.FLASH, x, (y + 7), z, 5, 5, 5, 5, 0.1);
									});
								});
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 120);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 120);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 120);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 120, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 240);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 240);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 240);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 240, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_up).equals("haste")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, (int) (20 * 60), 2, false, false));
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 160);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 160);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 160);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 160, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 320);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 320);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 320);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 320, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_up).equals("diso")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 80, 0, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 80, 0, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 0, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0, false, false));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
										world.addParticle(ParticleTypes.FLASH, x, y, z, 0, 0, 0);
									}
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.CONFUSION);
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.GLOWING);
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.BLINDNESS);
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.WEAKNESS);
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 140);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 140);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 140);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 140, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 280);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 280);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 280);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 280, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_up).equals("pets")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 0, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.GLOW, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
									}
								}
							}
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 140);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 140);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 140);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 140, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 240);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 240);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 240);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 200, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, (float) 0.7, false);
								}
							}
						}
					}
				} else if (entity.getXRot() < 80 && entity.getXRot() > -80) {
					if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_side).equals("shot")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new SculkFeatherProjectileEntity(TruedarknessModEntities.SCULK_FEATHER_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 2, 2, (byte) 5);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 7, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 60);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 60);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 60);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 60, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 120);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 120);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 120);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 110, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_side).equals("dash")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							entity.setDeltaMovement(new Vec3((2.5 * entity.getLookAngle().x), (4.5 * entity.getLookAngle().y), (2.5 * entity.getLookAngle().z)));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							world.addParticle(ParticleTypes.SONIC_BOOM, x, y, z, 0, 1, 0);
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 40);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 40);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 40);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 40, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 80);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 80);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 80);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 80, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_side).equals("bomb")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (!(new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
									} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
									}
									return false;
								}
							}.checkGamemode(entity)) && !(new Object() {
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
								if (entity instanceof Player _player) {
									_player.getAbilities().invulnerable = true;
									_player.onUpdateAbilities();
								}
								TruedarknessMod.queueServerWork(5, () -> {
									if (entity instanceof Player _player) {
										_player.getAbilities().invulnerable = false;
										_player.onUpdateAbilities();
									}
								});
							}
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										4, Level.ExplosionInteraction.TNT);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							world.addParticle(ParticleTypes.SONIC_BOOM, x, y, z, 0, 1, 0);
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 160);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 160);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 160);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 160, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 320);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 320);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 320);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 320, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_side).equals("meet")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
										if (entityiterator instanceof Mob _entity)
											_entity.getNavigation()
													.moveTo((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ()),
															1);
									}
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.goat_horn.sound.2")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.goat_horn.sound.2")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 160);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 160);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 160);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 160, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 320);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 320);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 320);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 320, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					}
				} else if (entity.getXRot() > 80) {
					if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_down).equals("dive")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							entity.setDeltaMovement(new Vec3(0, (-4), 0));
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
							}.checkGamemode(entity)) && !(new Object() {
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
								if (entity instanceof Player _player) {
									_player.getAbilities().invulnerable = true;
									_player.onUpdateAbilities();
								}
								TruedarknessMod.queueServerWork(60, () -> {
									if (entity instanceof Player _player) {
										_player.getAbilities().invulnerable = false;
										_player.onUpdateAbilities();
									}
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.ECHO_NOSEDIVE_EFFECT.get(), 60, 0, true, false));
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 100);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 100);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 100);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 100, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 200);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 200);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 200);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 200, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_down).equals("feet")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_sensor.clicking_stop")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_sensor.clicking_stop")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, x, (y + 0.5), z, 25, 0.5, 0.5, 0.5, 1);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SNAKE_MASTER.get(), (int) (20 * 60), 0, false, false));
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 400);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 400);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 400);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 400, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 800);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 800);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 800);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 800, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_down).equals("hide")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1200, 1, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 39, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0, false, false));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
											}
										}
										world.addParticle(ParticleTypes.FLASH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 0, 0, 0);
									}
								}
							}
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 300);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 300);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 300);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 300, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 600);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 600);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 600);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 600, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_down).equals("fang")) {
						if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 0.5 && entity instanceof LivingEntity lv
								? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent()
								: false) || (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana >= 1 || new Object() {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.angry")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.angry")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:block truedarkness:sand_of_missing ~ ~0.5 ~ 0.1 0.1 0.1 1 12 force");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:block truedarkness:sand_of_missing ~1 ~0.5 ~1 0.1 0.1 0.1 1 12 force");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:block truedarkness:sand_of_missing ~1 ~0.5 ~-1 0.1 0.1 0.1 1 12 force");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:block truedarkness:sand_of_missing ~-1 ~0.5 ~-1 0.1 0.1 0.1 1 12 force");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:block truedarkness:sand_of_missing ~-1 ~0.5 ~1 0.1 0.1 0.1 1 12 force");
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
											&& !(entityiterator instanceof LivingEntity _livEnt300 && _livEnt300.hasEffect(TruedarknessModMobEffects.EARTH_SATURATION.get()))) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.EARTH_HUNGER_EFFECT.get(), 60, 0, false, false));
									}
								}
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.EARTH_SATURATION.get(), 80, 0, false, false));
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
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_RING.get(), lv).isPresent() : false) {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 0.5;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana - 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SculkedMana = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 100);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 100);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 100);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 100, 0, false, false));
							} else {
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.ECHO_WINGS.get(), 200);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.SOUL_WINGS.get(), 200);
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(TruedarknessModItems.GENERAL_WINGS.get(), 200);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(), 200, 0, false, false));
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.dont_enough").getString())).getString())), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.ring-dont-work")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					}
				}
			}
		}
	}
}

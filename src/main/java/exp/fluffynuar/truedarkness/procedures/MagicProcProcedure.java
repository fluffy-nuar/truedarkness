package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
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
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class MagicProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double legend, String Casted) {
		if (entity == null || Casted == null)
			return;
		double add_count = 0;
		double fang_count = 0;
		double ticks_of_cooldwon = 0;
		double fangs = 0;
		boolean smelted = false;
		boolean meal = false;
		boolean command = false;
		boolean cooldown_logic = false;
		if ((entity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:spell_" + Casted)).toLowerCase(java.util.Locale.ENGLISH))), 0f) * 100 : 0) == 0) {
			if ((Casted).equals("blink")) {
				if (!(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					TruedarknessMod.queueServerWork(24, () -> {
						{
							final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 3);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
						TruedarknessMod.queueServerWork(10, () -> {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 7);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
							TruedarknessMod.queueServerWork(10, () -> {
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 15);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
							});
						});
					});
					if (legend >= 1) {
						TruedarknessMod.queueServerWork(54, () -> {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 19);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
						});
					}
					if (legend >= 2) {
						TruedarknessMod.queueServerWork(64, () -> {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 23);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
						});
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("haste")) {
				if (!(entity instanceof LivingEntity _livEnt79 && _livEnt79.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, (int) (20 * 60 * (legend + 1)), 2, false, false));
					if (legend >= 1) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.THE_ALIVE.get(), (int) (20 * 60 * (legend + 1)), 2, false, false));
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("diso")) {
				if (!(entity instanceof LivingEntity _livEnt83 && _livEnt83.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((80 + 20 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity) && !(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
								if (legend >= 1) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) (80 + 20 * legend), 0, false, false));
								}
								if (legend >= 2) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (80 + 20 * legend), 0, false, false));
								}
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, (int) (80 + 20 * legend), 0, false, false));
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
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("pets")) {
				if (!(entity instanceof LivingEntity _livEnt93 && _livEnt93.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((40 + 10 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
								if (legend >= 2) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) (60 + 20 * legend), 1, false, false));
								}
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (60 + 20 * legend), 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) (60 + 20 * legend), 2, false, false));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.GLOW, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
								command = true;
							}
						}
					}
				}
				if (command) {
					MagicAddProcProcedure.execute(entity);
					cooldown_logic = true;
				}
			} else if ((Casted).equals("afraid")) {
				if (!(entity instanceof LivingEntity _livEnt105 && _livEnt105.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.deplete")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((20 + 7 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) && !(entityiterator == entity)) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.set_spawn")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.set_spawn")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SCULK_SOUL, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.PARANOID.get(), 360, 0, false, false));
								if (legend >= 1) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 360, 1, false, false));
								}
								if (legend >= 2) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 360, 1, false, false));
								}
							}
						}
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("hunger")) {
				if (!(entity instanceof LivingEntity _livEnt118 && _livEnt118.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.bloom")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.bloom")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					while ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20 || (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						if (entity instanceof Player _player)
							_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
						if (entity instanceof Player _player)
							_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 0.5));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
						}
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("gust")) {
				if (!(entity instanceof LivingEntity _livEnt129 && _livEnt129.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((12 + 5 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								entityiterator.setDeltaMovement(
										new Vec3(((entityiterator.getX() - entity.getX()) * (0.6 + 0.2 * legend)), ((entityiterator.getY() - entity.getY()) * (0.1 + 0.2 * legend)), ((entityiterator.getZ() - entity.getZ()) * (0.6 + 0.2 * legend))));
								world.addParticle(ParticleTypes.SONIC_BOOM, (entity.getX()), (entity.getY()), (entity.getZ()), ((entityiterator.getX() - entity.getX()) * 1.5), ((entityiterator.getY() - entity.getY()) * 0.75),
										((entityiterator.getZ() - entity.getZ()) * 1.5));
							}
						}
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("weather")) {
				if (!(entity instanceof LivingEntity _livEnt150 && _livEnt150.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (legend >= 2) {
						if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
							world.getLevelData().setRaining(false);
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"weather thunder");
						}
					} else {
						world.getLevelData().setRaining((!world.getLevelData().isRaining()));
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			}
			if ((Casted).equals("shot")) {
				if (!(entity instanceof LivingEntity _livEnt157 && _livEnt157.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					add_count = 1;
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, (float) 0.9, (float) 0.9);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, (float) 0.9, (float) 0.9, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 0, false, false));
					while (!(add_count == 24 + 8 * legend)) {
						world.addParticle(ParticleTypes.SONIC_BOOM, (entity.getLookAngle().x * add_count * 1.5 + entity.getX()), (entity.getLookAngle().y * add_count * 1.5 + entity.getY() + 1.7),
								(entity.getLookAngle().z * add_count * 1.5 + entity.getZ()), 0, 0, 0);
						{
							final Vec3 _center = new Vec3((entity.getLookAngle().x * add_count * 1.5 + entity.getX()), (entity.getLookAngle().y * add_count * 1.5 + entity.getY() + 1.7), (entity.getLookAngle().z * add_count * 1.5 + entity.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.SONIC_BOOM)), (float) (14 + 4 * legend));
								}
							}
						}
						add_count = add_count + 1;
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("dash")) {
				if (!(entity instanceof LivingEntity _livEnt178 && _livEnt178.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					entity.setDeltaMovement(new Vec3(((2.5 + legend * 0.2) * entity.getLookAngle().x), ((4.5 + legend * 0.2) * entity.getLookAngle().y), ((2.5 + legend * 0.2) * entity.getLookAngle().z)));
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
					if (legend >= 2) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.FALLING_EFFECT.get(), 120, 1, false, false));
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("bomb")) {
				if (!(entity instanceof LivingEntity _livEnt187 && _livEnt187.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 24, 7, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					TruedarknessMod.queueServerWork(24, () -> {
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
					});
					if (legend == 2) {
						TruedarknessMod.queueServerWork(24, () -> {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(60)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(60)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(60)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										6, Level.ExplosionInteraction.TNT);
						});
					} else if (legend == 1) {
						TruedarknessMod.queueServerWork(24, () -> {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(50)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(50)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(50)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										5, Level.ExplosionInteraction.TNT);
						});
					} else {
						TruedarknessMod.queueServerWork(24, () -> {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										4, Level.ExplosionInteraction.TNT);
						});
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("meet")) {
				if (!(entity instanceof LivingEntity _livEnt214 && _livEnt214.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((30 + 15 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
								if (entityiterator instanceof Mob _entity)
									_entity.getNavigation().moveTo(
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((40 + 10 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((40 + 10 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((40 + 10 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()),
											1);
								command = true;
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
				}
				if (command) {
					cooldown_logic = true;
					MagicAddProcProcedure.execute(entity);
				}
			} else if ((Casted).equals("teleport")) {
				if (!(entity instanceof LivingEntity _livEnt223 && _livEnt223.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (legend == 2) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 24, 7, false, false));
					}
					if (legend < 1) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 24, 7, false, false));
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.launch")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.launch")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					TruedarknessMod.queueServerWork(24, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SCULK_SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 40, 0, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					});
					if (legend == 1) {
						TruedarknessMod.queueServerWork(24, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SCULK_SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							TeleportingLegend1Procedure.execute(world, entity);
						});
					} else if (legend == 2) {
						TruedarknessMod.queueServerWork(24, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SCULK_SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							TeleportingLegend2Procedure.execute(world, entity);
						});
					} else {
						TruedarknessMod.queueServerWork(24, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SCULK_SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							TeleportingProcedure.execute(world, entity);
						});
					}
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("potion")) {
				if (!(entity instanceof LivingEntity _livEnt262 && _livEnt262.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3(
														(entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																		entity))
																.getBlockPos().getX()),
														(entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																		entity))
																.getBlockPos().getY() + 1),
														(entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																		entity))
																.getBlockPos().getZ())),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("summon area_effect_cloud ~ ~ ~ {Particle:glow,Potion:strong_poison,Radius:" + Math.round(2 + legend) + ",Duration:200}"));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null,
									BlockPos.containing(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY() + 1,
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.splash_potion.break")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getY() + 1),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + 4 * legend))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.splash_potion.break")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_bottle.throw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_bottle.throw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 40, 0, false, false));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				cooldown_logic = true;
				MagicAddProcProcedure.execute(entity);
			} else if ((Casted).equals("nature")) {
				if (!(entity instanceof LivingEntity _livEnt277 && _livEnt277.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					meal = false;
					if ((world.getBlockState(new BlockPos(
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
							.getBlock() instanceof BonemealableBlock) {
						meal = true;
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (world instanceof Level _level) {
							BlockPos _bp = new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ());
							if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
								if (!_level.isClientSide())
									_level.levelEvent(2005, _bp, 0);
							}
						}
					}
				}
				if (meal) {
					cooldown_logic = true;
					if (Mth.nextInt(RandomSource.create(), 1, 2) == 2 && legend == 1 || !(legend == 2) || legend == 0) {
						MagicAddProcProcedure.execute(entity);
					}
				}
			} else if ((Casted).equals("line")) {
				if (!(entity instanceof LivingEntity _livEnt289 && _livEnt289.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					add_count = 0;
					fangs = 0;
					while (add_count <= 16 + 3 * legend) {
						add_count = add_count + 1;
						if (!world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()
								&& world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y - 1, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()) {
							if (Math.sqrt(Math.pow(entity.getX() - (entity.getX() + entity.getLookAngle().x * add_count), 2) + Math.pow(entity.getZ() - (entity.getZ() + entity.getLookAngle().z * add_count), 2)) > 2) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y, entity.getZ() + entity.getLookAngle().z * add_count),
											MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								fangs = fangs + 1;
								continue;
							}
							continue;
						} else {
							if (!world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y - 1, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()
									&& world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y - 2, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()) {
								if (Math.sqrt(Math.pow(entity.getX() - (entity.getX() + entity.getLookAngle().x * add_count), 2) + Math.pow(entity.getZ() - (entity.getZ() + entity.getLookAngle().z * add_count), 2)) > 2) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y - 1, entity.getZ() + entity.getLookAngle().z * add_count),
												MobSpawnType.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setDeltaMovement(0, 0, 0);
										}
									}
									fangs = fangs + 1;
									continue;
								}
								continue;
							} else if (!world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y + 1, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()
									&& world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y + 0, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()) {
								if (Math.sqrt(Math.pow(entity.getX() - (entity.getX() + entity.getLookAngle().x * add_count), 2) + Math.pow(entity.getZ() - (entity.getZ() + entity.getLookAngle().z * add_count), 2)) > 2) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y + 1, entity.getZ() + entity.getLookAngle().z * add_count),
												MobSpawnType.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setDeltaMovement(0, 0, 0);
										}
									}
									fangs = fangs + 1;
									continue;
								}
								continue;
							}
							continue;
						}
					}
				}
				cooldown_logic = true;
				if (fangs >= 2) {
					MagicAddProcProcedure.execute(entity);
				}
			}
			if ((Casted).equals("dive")) {
				if (!(entity instanceof LivingEntity _livEnt353 && _livEnt353.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
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
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.ECHO_NOSEDIVE_EFFECT.get(), 60, (int) legend, true, false));
				}
				MagicAddProcProcedure.execute(entity);
				cooldown_logic = true;
			} else if ((Casted).equals("feet")) {
				if (!(entity instanceof LivingEntity _livEnt361 && _livEnt361.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
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
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SNAKE_MASTER.get(), (int) (20 * 60 * (1 + legend)), 0, false, false));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				MagicAddProcProcedure.execute(entity);
				cooldown_logic = true;
			} else if ((Casted).equals("hide")) {
				if (!(entity instanceof LivingEntity _livEnt366 && _livEnt366.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), SoundSource.PLAYERS, 1, (float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((60 + 10 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, (int) (1200 + 100 * legend), 1, false, false));
								if (legend >= 2) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) (1200 + 200 * legend), 0, false, false));
								}
								if (legend < 0) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, (int) (1200 + 100 * legend), 39, false, false));
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								world.addParticle(ParticleTypes.FLASH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 0, 0, 0);
								command = true;
							}
						}
					}
				}
				if (command) {
					MagicAddProcProcedure.execute(entity);
					cooldown_logic = true;
				}
			} else if ((Casted).equals("fang")) {
				if (!(entity instanceof LivingEntity _livEnt378 && _livEnt378.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.angry")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.angry")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((20 + 7 * legend) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) && !(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.EARTH_HUNGER_EFFECT.get(), (int) (40 - 15 * legend), 0, false, false));
								world.levelEvent(2001, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
										Block.getId((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ())))));
							}
						}
					}
				}
				MagicAddProcProcedure.execute(entity);
				cooldown_logic = true;
			} else if ((Casted).equals("aqua")) {
				if (!(entity instanceof LivingEntity _livEnt392 && _livEnt392.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.bloom")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.bloom")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, (int) (580 + 200 * legend), 0, false, false));
					if (legend >= 1) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, (int) (580 + 200 * legend), 0, false, false));
					}
					if (legend >= 2) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, (int) (580 + 200 * legend), 0, false, false));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
						}
					}
				}
				MagicAddProcProcedure.execute(entity);
				cooldown_logic = true;
			} else if ((Casted).equals("regen")) {
				if (!(entity instanceof LivingEntity _livEnt399 && _livEnt399.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.bloom")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.bloom")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
					TruedarknessMod.queueServerWork(20, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						TruedarknessMod.queueServerWork(20, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 3));
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
						});
					});
					if (legend >= 1) {
						TruedarknessMod.queueServerWork(60, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4));
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
						});
					}
					if (legend >= 2) {
						TruedarknessMod.queueServerWork(80, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 5));
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:shriek 0 ~ ~ ~ 0 0 0 0.5 25 normal");
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
						});
					}
				}
				MagicAddProcProcedure.execute(entity);
				cooldown_logic = true;
			} else if ((Casted).equals("eye")) {
				if (!(entity instanceof LivingEntity _livEnt425 && _livEnt425.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.dig")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.dig")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 40, 0, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, (int) (4000 + 200 * legend), 0, false, false));
					if (2 >= legend) {
						TruedarknessMod.queueServerWork(40, () -> {
							if (entity instanceof LivingEntity _livEnt429 && _livEnt429.hasEffect(MobEffects.BLINDNESS)) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(MobEffects.BLINDNESS);
							}
							if (entity instanceof LivingEntity _livEnt431 && _livEnt431.hasEffect(MobEffects.DARKNESS)) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(MobEffects.DARKNESS);
							}
						});
					}
				}
				MagicAddProcProcedure.execute(entity);
				cooldown_logic = true;
			} else if ((Casted).equals("smelt")) {
				if (!(entity instanceof LivingEntity _livEnt434 && _livEnt434.hasEffect(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get()))) {
					smelted = false;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!((world instanceof Level _lvlSmeltResult
									? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _lvlSmeltResult)
											.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
									: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) && entityiterator instanceof ItemEntity) {
								smelted = true;
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SMOKE, (entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator.getZ()), 11, 0.1, 0.1, 0.1, 0.01);
								for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 3, 8); index3++) {
									world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, (Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + entityiterator.getX()), (Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + entityiterator.getY() + 0.25),
											(Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + entityiterator.getZ()), 0, 0.02, 0);
								}
								if (world instanceof ServerLevel _level)
									_level.addFreshEntity(new ExperienceOrb(_level, (entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator.getZ()), Mth.nextInt(RandomSource.create(), 1, 5)));
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator
															.getZ())), Vec2.ZERO, _level, 4, "", Component
																	.literal(""),
															_level.getServer(), null).withSuppressedOutput(),
													("summon item ~ ~ ~ {Item:{id:\"" + ""
															+ (ForgeRegistries.ITEMS.getKey((world instanceof Level _lvlSmeltResult
																	? _lvlSmeltResult.getRecipeManager()
																			.getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _lvlSmeltResult)
																			.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
																	: ItemStack.EMPTY).getItem()).toString())
															+ "\",Count:" + ((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount()) + "}}"));
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
					if (smelted) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
							}
						}
					}
				}
				if (smelted) {
					cooldown_logic = true;
					if (Mth.nextInt(RandomSource.create(), 1, 2) == 2 && legend == 1 || !(legend == 2) || legend == 0) {
						MagicAddProcProcedure.execute(entity);
					}
				}
			}
			if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("echo")) {
				ticks_of_cooldwon = Math.round((ticks_of_cooldwon / 3) * 2);
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SOULSTEAL_WINGS_COOLDOWN.get(),
						(int) (CooldownSpellProcProcedure.execute(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:spell_" + Casted)).toLowerCase(java.util.Locale.ENGLISH)))),
								entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false, fangs, legend) / 5),
						0, false, false));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:spell_" + Casted)).toLowerCase(java.util.Locale.ENGLISH))),
						(int) CooldownSpellProcProcedure.execute(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:spell_" + Casted)).toLowerCase(java.util.Locale.ENGLISH)))),
								entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false, fangs, legend));
			{
				String _setval = "";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Spell_cast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

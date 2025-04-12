package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;
import exp.fluffynuar.truedarkness.entity.GeneralEntity;

public class CorruptedNecromancerPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean spawn_logic = false;
		double count = 0;
		double spawn = 0;
		double x_add = 0;
		double y_add = 0;
		double z_add = 0;
		double player = 0;
		if (entity.getPersistentData().getDouble("timer") == 0) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.TARGET.get())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:undead_corrupted")))) {
							count = count + 1;
						}
						if (entityiterator instanceof Player && entityiterator instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(TruedarknessModMobEffects.TARGET.get())
								&& !(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							player = player + 1;
						}
					}
				}
				if (count <= 5 && entity.getPersistentData().getDouble("limit") > 0) {
					x_add = entity.getX() + Mth.nextInt(RandomSource.create(), -5, 5);
					y_add = entity.getY() + Mth.nextInt(RandomSource.create(), -5, 5);
					z_add = entity.getZ() + Mth.nextInt(RandomSource.create(), -5, 5);
					if (!world.getBlockState(BlockPos.containing(x_add, y_add + 2, z_add)).canOcclude() && !world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add)).canOcclude()
							&& world.getBlockState(BlockPos.containing(x_add, y_add, z_add)).canOcclude()) {
						if (Mth.nextInt(RandomSource.create(), 1, 5) == 2) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_UNFORMED_REMNANTS.get().spawn(_level, BlockPos.containing(x_add, y_add - 0.8, z_add), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_SKELETON.get().spawn(_level, BlockPos.containing(x_add, y_add - 0.8, z_add), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 0, false, false));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 1.2, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 1.2, (float) 0.8, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, x, (y + 1), z, 15, 0.1, 0.1, 0.1, 0.1);
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 40));
					}
				} else if (player >= 1) {
					player = 0;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player && entityiterator instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(TruedarknessModMobEffects.TARGET.get())
									&& !(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.EARTH_HUNGER_EFFECT.get(), 20, 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 0, true, true));
								player = player + 1;
							}
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_attack")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_attack")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 1.2, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 1.2, (float) 0.8, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.WITCH, x, (y + 1), z, 7, 0.1, 0.1, 0.1, 0.1);
					entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 40 * player));
				} else if (count >= 2) {
					count = 0;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:undead_corrupted")))) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 2, 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0, false, false));
								count = count + 1;
							}
						}
					}
					if (count != 0) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, x, (y + 1), z, 2, 0.1, 0.1, 0.1, 0.1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.prepare_mirror")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.prepare_mirror")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8, false);
							}
						}
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 60 * count));
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") - 1));
		}
		if (entity.getPersistentData().getDouble("limit") < 15) {
			if (entity.getPersistentData().getDouble("limit_regeneration") < 15) {
				entity.getPersistentData().putDouble("limit", (entity.getPersistentData().getDouble("limit") + 1));
				entity.getPersistentData().putDouble("limit_regeneration", (entity.getPersistentData().getDouble("limit_regeneration") + 60));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 0.2, (float) 0.8);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 0.2, (float) 0.8, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, x, (y + 1), z, 5, 0.1, 0.1, 0.1, 0.1);
			} else {
				entity.getPersistentData().putDouble("limit_regeneration", (entity.getPersistentData().getDouble("limit_regeneration") - 1));
			}
		}
		if (entity.getPersistentData().getDouble("spawn_time") != 0) {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getPersistentData().getDouble("his_y") + 2.05 - 2.05 * (entity.getPersistentData().getDouble("spawn_time") / 60)), (entity.getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getPersistentData().getDouble("his_y") + 2.05 - 2.05 * (entity.getPersistentData().getDouble("spawn_time") / 60)), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
			}
			entity.getPersistentData().putDouble("spawn_time", (entity.getPersistentData().getDouble("spawn_time") - 1));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMOKE, x, (entity.getPersistentData().getDouble("his_y") + 2.05), z, 9, 0.01, 0.01, 0.01, 0.01);
		} else {
			if (entity.getPersistentData().getBoolean("spawning")) {
				entity.getPersistentData().putBoolean("spawning", false);
				entity.setNoGravity((entity.getPersistentData().getBoolean("spawning")));
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data modify entity @s Invulnerable set value 0");
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.HOSTILE, (float) 1.6, (float) 0.7);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.HOSTILE, (float) 1.6, (float) 0.7, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, x, (entity.getPersistentData().getDouble("his_y") + 2.05), z, 21, 0.01, 0.01, 0.01, 0.1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _livEnt76 && _livEnt76.hasEffect(TruedarknessModMobEffects.TARGET.get()) || entityiterator instanceof GeneralEntity) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TARGET.get(), 6000, 0, false, false));
						}
					}
				}
			}
		}
	}
}

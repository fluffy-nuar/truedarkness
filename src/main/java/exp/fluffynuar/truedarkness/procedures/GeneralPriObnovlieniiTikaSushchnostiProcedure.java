package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class GeneralPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_0 = 0;
		double z_0 = 0;
		double y_0 = 0;
		double count = 0;
		double x_add = 0;
		double y_add = 0;
		double player = 0;
		double z_add = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("timer") <= 0) {
				if (entity.getPersistentData().getDouble("aggresion") >= 100) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 10, 1, false, false));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
					entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 20));
					entity.getPersistentData().putDouble("aggresion", (entity.getPersistentData().getDouble("aggresion") - 40));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
					x_0 = Mth.nextInt(RandomSource.create(), -10, 10) + entity.getX() + 0.5;
					y_0 = Mth.nextInt(RandomSource.create(), -3, 3) + entity.getY() + 0.5;
					z_0 = Mth.nextInt(RandomSource.create(), -10, 10) + entity.getZ() + 0.5;
					if (!world.getBlockState(BlockPos.containing(x_0, y_0, z_0)).canOcclude()) {
						TeleportTrapGeneralProcProcedure.execute(world, x_0, y_0, z_0, 60);
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 40));
						entity.getPersistentData().putDouble("aggresion", (entity.getPersistentData().getDouble("aggresion") - 10));
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities")))) {
								count = count + 1;
							}
						}
					}
					x_add = entity.getX() + Mth.nextInt(RandomSource.create(), -5, 5);
					y_add = entity.getY() + Mth.nextInt(RandomSource.create(), -5, 5);
					z_add = entity.getZ() + Mth.nextInt(RandomSource.create(), -5, 5);
					if (!world.getBlockState(BlockPos.containing(x_add, y_add + 2, z_add)).canOcclude() && !world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add)).canOcclude()
							&& world.getBlockState(BlockPos.containing(x_add, y_add, z_add)).canOcclude()) {
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
						if (entity.getPersistentData().getDouble("aggresion") >= 50) {
							if (Mth.nextInt(RandomSource.create(), 1, 5) <= 2) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_MAGE.get().spawn(_level, BlockPos.containing(x_add, y_add - 0.8, z_add), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							} else if (Mth.nextInt(RandomSource.create(), 1, 5) <= 2) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = TruedarknessModEntities.SOULSTEAL_WARRIOR.get().spawn(_level, BlockPos.containing(x_add, y_add + 1, z_add), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_NECROMANCER.get().spawn(_level, BlockPos.containing(x_add, y_add - 0.8, z_add), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 5) <= 2) {
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
						}
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 40));
						entity.getPersistentData().putDouble("aggresion", (entity.getPersistentData().getDouble("aggresion") - 4));
					}
					if (count >= 2) {
						count = 0;
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities")))) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, false, false));
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
							entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 2 * count));
							entity.getPersistentData().putDouble("aggresion", (entity.getPersistentData().getDouble("aggresion") - 2));
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") - 1));
			}
		}
	}
}

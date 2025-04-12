package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
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

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.entity.CorruptedAssassinEntity;

public class BloodshedPriIstiechieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean spawn = false;
		double add_count = 0;
		double add_x = 0;
		double add_y = 0;
		double add_z = 0;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:undead_corrupted")))) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.TARGET.get()))) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 9999999);
			}
		} else if (entity instanceof CorruptedAssassinEntity) {
			spawn = false;
			while (!spawn && add_count < 50) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(TruedarknessModMobEffects.TARGET.get()) && entityiterator instanceof Player) {
							if (add_count < 30) {
								add_x = entityiterator.getLookAngle().x * Mth.nextInt(RandomSource.create(), 1, 3) * (-1.5) + entityiterator.getX();
								add_z = entityiterator.getLookAngle().z * Mth.nextInt(RandomSource.create(), 1, 3) * (-1.5) + entityiterator.getZ();
								add_y = entityiterator.getY() + Mth.nextInt(RandomSource.create(), -1, 1);
								if (!world.getBlockState(BlockPos.containing(add_x, add_y + 1, add_z)).canOcclude() && !world.getBlockState(BlockPos.containing(add_x, add_y, add_z)).canOcclude()
										&& world.getBlockState(BlockPos.containing(add_x, add_y - 1, add_z)).canOcclude()) {
									spawn = true;
									if (!(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
										continue;
									}
									break;
								}
								add_count = 1 + add_count;
								continue;
							} else {
								add_x = entityiterator.getLookAngle().x * Mth.nextInt(RandomSource.create(), 1, 3) * (-1.5) + entityiterator.getX();
								add_z = entityiterator.getLookAngle().z * Mth.nextInt(RandomSource.create(), 1, 3) * (-1.5) + entityiterator.getZ();
								add_y = entityiterator.getY() + Mth.nextInt(RandomSource.create(), -15, 15);
								if (!world.getBlockState(BlockPos.containing(add_x, add_y + 1, add_z)).canOcclude() && !world.getBlockState(BlockPos.containing(add_x, add_y, add_z)).canOcclude()
										&& world.getBlockState(BlockPos.containing(add_x, add_y - 1, add_z)).canOcclude()) {
									spawn = true;
									if (!(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
										continue;
									}
									break;
								}
								add_count = 1 + add_count;
								continue;
							}
						}
					}
				}
				continue;
			}
			if (spawn) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, x, (y + 0.8), z, 15, 0.1, 0.1, 0.1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, (y + 0.8), z, 3, 0.1, 0.1, 0.1, 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.use")), SoundSource.HOSTILE, (float) 0.8, (float) 0.4);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.use")), SoundSource.HOSTILE, (float) 0.8, (float) 0.4, false);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(add_x, add_y, add_z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(add_x, add_y, add_z, _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 30, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 3, false, false));
				entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 40));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.BLOODSHED.get(), 80, 0, false, false));
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.ability.ready")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.ability.ready")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
	}
}

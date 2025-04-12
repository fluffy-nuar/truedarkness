package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedNecromancerEntity;

public class CorruptedSkeletonPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
						if (entityiterator instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(TruedarknessModMobEffects.TARGET.get()) && entityiterator instanceof CorruptedNecromancerEntity) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TARGET.get(),
										entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.TARGET.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.TARGET.get()).getDuration() : 0, 0, false, false));
						}
						if (entityiterator instanceof GeneralEntity) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TARGET.get(), 6000, 0, false, false));
						}
					}
				}
			}
		}
		if (!(entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(TruedarknessModMobEffects.TARGET.get())) && !(entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.BLOODSHED.get(), 600, 0, false, false));
		}
		if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(TruedarknessModMobEffects.TARGET.get()) && entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(TruedarknessModMobEffects.BLOODSHED.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.BLOODSHED.get());
		}
	}
}

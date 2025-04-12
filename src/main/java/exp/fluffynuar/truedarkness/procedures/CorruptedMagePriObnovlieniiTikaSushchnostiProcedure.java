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

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedMageEntity;

public class CorruptedMagePriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double count = 0;
		if (entity.getPersistentData().getDouble("timer") == 0) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.TARGET.get())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!((entityiterator.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
								&& !entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities"))) && entityiterator instanceof LivingEntity _livEnt3
								&& _livEnt3.hasEffect(TruedarknessModMobEffects.TARGET.get()) && !(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -1, 2),
									entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
							CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -1, 2),
									entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
							CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -1, 2),
									entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
							CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -1, 2),
									entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
							CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -1, 2),
									entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
							entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 80 + Mth.nextInt(RandomSource.create(), -9, 9)));
							count = count + 1;
						} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities"))) && entityiterator instanceof LivingEntity _livEnt39
								&& _livEnt39.hasEffect(TruedarknessModMobEffects.TARGET.get()) && !(entityiterator == entity) && !(entityiterator instanceof CorruptedMageEntity)) {
							if (!(entityiterator instanceof LivingEntity _livEnt42 && _livEnt42.hasEffect(MobEffects.DAMAGE_BOOST))) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 80, 0, false, true));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 80, 0, false, true));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 2, false, true));
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
								entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 10));
								count = count + 1;
							}
						}
					}
				}
				if (count >= 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.HOSTILE, (float) 0.7,
									(float) 0.7);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.HOSTILE, (float) 0.7, (float) 0.7, false);
						}
					}
				}
			} else {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities")))
								&& (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) && !(entityiterator == entity)
								&& !(entityiterator instanceof CorruptedMageEntity)) {
							if (!(entityiterator instanceof LivingEntity _livEnt62 && _livEnt62.hasEffect(MobEffects.DAMAGE_BOOST))) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 80, 1, false, true));
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
								count = count + 1;
								entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 40));
							}
						}
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") - 1));
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
						if (entityiterator instanceof LivingEntity _livEnt91 && _livEnt91.hasEffect(TruedarknessModMobEffects.TARGET.get()) || entityiterator instanceof GeneralEntity) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TARGET.get(), 6000, 0, false, false));
						}
					}
				}
			}
		}
	}
}

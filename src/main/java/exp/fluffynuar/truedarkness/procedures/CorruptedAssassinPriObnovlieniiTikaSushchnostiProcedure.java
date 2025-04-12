package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CorruptedAssassinPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double count = 0;
		if (entity.getPersistentData().getDouble("timer") == 0) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.TARGET.get()) && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player && entityiterator instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(TruedarknessModMobEffects.TARGET.get())) {
							AssasinCheckProcedure.execute(world, x, y, z, entityiterator);
							count = 1 + count;
						}
					}
				}
				if (count == 0) {
					if (!(entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.INVISIBILITY))) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 120, 1, false, false));
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 60));
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") - 1));
			if (entity.getPersistentData().getDouble("timer") == 0) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WITCH, x, (y + 0.75), z, 15, 0.1, 0.1, 0.1, 0);
			}
		}
	}
}

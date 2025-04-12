package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CorruptedHandPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double count = 0;
		Entity man_you_stuck = null;
		if (entity.getPersistentData().getDouble("timer") == 0) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.TARGET.get())) {
				if (entity.isVehicle()) {
					(entity.getFirstPassenger()).hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), entity), 1);
					entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 10));
				} else {
					{
						final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * 2.5), (entity.getY()), (entity.getZ() + entity.getLookAngle().z * 2.5));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!((entityiterator.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
									&& !entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities"))) && entityiterator instanceof LivingEntity _livEnt14
									&& _livEnt14.hasEffect(TruedarknessModMobEffects.TARGET.get()) && entity.getY() == entityiterator.getY()) {
								entityiterator.startRiding(entity);
								entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 17));
							}
						}
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") - 1));
		}
	}
}

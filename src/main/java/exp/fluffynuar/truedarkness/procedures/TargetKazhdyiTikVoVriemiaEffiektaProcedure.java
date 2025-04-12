package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class TargetKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player && !((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(TruedarknessModItems.TABLET.get(), 100);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(TruedarknessModItems.AQUAMARINE_COIN.get(), 100);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.TARGET.get())
							? _livEnt.getEffect(TruedarknessModMobEffects.TARGET.get()).getDuration()
							: 0) != (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.TARGET.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.TARGET.get()).getDuration() : 0)
							|| !(entityiterator instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(TruedarknessModMobEffects.TARGET.get())))
							&& entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities")))) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.TARGET.get(),
									entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.TARGET.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.TARGET.get()).getDuration() : 0, 0));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 0));
					}
				}
			}
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= 20) {
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.BAD_CORRUPTION.get()), (x + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)), (y + Mth.nextDouble(RandomSource.create(), -0.3, 0.3) + 0.25),
						(z + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)), (Mth.nextDouble(RandomSource.create(), -0.01, 0.01)), 0.01, (Mth.nextDouble(RandomSource.create(), -0.01, 0.01)));
			}
		}
	}
}

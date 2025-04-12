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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.entity.CorruptedAssassinEntity;

public class AssasinCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double add_count = 0;
		while (!(add_count > 16)) {
			add_count = add_count + 1;
			{
				final Vec3 _center = new Vec3((entity.getLookAngle().x * add_count * 0.5 + entity.getX()), (entity.getLookAngle().y * add_count * 0.5 + entity.getY() + 1.7), (entity.getLookAngle().z * add_count * 0.5 + entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof CorruptedAssassinEntity) {
						if (!(entityiterator instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_attack")), SoundSource.HOSTILE, 1, (float) 0.8);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_attack")), SoundSource.HOSTILE, 1, (float) 0.8, false);
								}
							}
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.BLOODSHED.get(), 30, 0, false, false));
							entityiterator.getPersistentData().putDouble("timer", (entityiterator.getPersistentData().getDouble("timer") + 100));
							break;
						}
						continue;
					}
					continue;
				}
			}
		}
	}
}

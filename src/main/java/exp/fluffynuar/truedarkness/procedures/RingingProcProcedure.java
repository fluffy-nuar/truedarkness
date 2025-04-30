package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class RingingProcProcedure {
	public static void execute(LevelAccessor world, Entity entity, double add_x, double add_y, double add_z, double progress, double stage, double tier) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(add_x, add_y, add_z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5);
			} else {
				_level.playLocalSound(add_x, add_y, add_z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
			}
		}
		{
			final Vec3 _center = new Vec3(add_x, (add_y + 7), add_z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), (float) (3 + 2 * stage * tier));
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(add_x, add_y, add_z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
			} else {
				_level.playLocalSound(add_x, add_y, add_z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, add_x, (add_y + 7), add_z, 10, 4, 4, 4, 0.1);
		if (progress >= stage * 20 && 3 > stage - Math.floor(tier / 2)) {
			TruedarknessMod.queueServerWork((int) (24 - stage), () -> {
			});
		}
	}
}

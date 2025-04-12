package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.decoration.GlowItemFrame;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class WardenStrikeCursedCupProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity player) {
		if (player == null)
			return;
		double add_count = 0;
		TruedarknessMod.queueServerWork(16, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == player) && !(entityiterator instanceof ItemEntity) && !(entityiterator instanceof GlowItemFrame) && !(entityiterator instanceof ItemFrame) && !(entityiterator instanceof ExperienceOrb)
							&& !(entityiterator instanceof ArmorStand)) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.SONIC_BOOM)), 10);
					}
				}
			}
		});
	}
}

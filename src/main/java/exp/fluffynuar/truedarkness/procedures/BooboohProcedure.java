package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.decoration.GlowItemFrame;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class BooboohProcedure {
	public static void execute(LevelAccessor world, Entity player, double x_add, double y_add, double z_add) {
		if (player == null)
			return;
		TruedarknessMod.queueServerWork(16, () -> {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x_add, y_add, z_add)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3(x_add, y_add, z_add);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(36 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof ArmorStand) && !(entityiterator instanceof ItemEntity) && !(entityiterator instanceof GlowItemFrame) && !(entityiterator instanceof ItemFrame) && !(entityiterator == player)) {
						if (9 - Math.round(Math.sqrt(Math.pow(entityiterator.getX() - x_add, 2) + Math.pow(entityiterator.getY() - y_add, 2) + Math.pow(entityiterator.getZ() - z_add, 2))) > 0) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)),
									(float) (9 - Math.round(Math.sqrt(Math.pow(entityiterator.getX() - x_add, 2) + Math.pow(entityiterator.getY() - y_add, 2) + Math.pow(entityiterator.getZ() - z_add, 2)))));
						}
					}
				}
			}
		});
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ShandarahProjectileKoghdaSnariadPopadaietVIghrokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!((entityiterator.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
						&& !entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:corrupted_entities")))) {
					CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -3, 3),
							entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
					CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -3, 3),
							entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
					CursedSpellProcedure.execute(world, entityiterator.getX() + Mth.nextInt(RandomSource.create(), -3, 3), entityiterator.getY() + Mth.nextInt(RandomSource.create(), -3, 3),
							entityiterator.getZ() + Mth.nextInt(RandomSource.create(), -3, 3));
				}
			}
		}
	}
}

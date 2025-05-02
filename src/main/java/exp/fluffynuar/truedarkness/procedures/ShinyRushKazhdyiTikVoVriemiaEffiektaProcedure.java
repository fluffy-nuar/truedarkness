package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class ShinyRushKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double z_start = 0;
		double x_scan = 0;
		double vx = 0;
		double vy = 0;
		double vz = 0;
		double y_start = 0;
		double speed_modifier = 0;
		double x_start = 0;
		double range = 0;
		double y_scan = 0;
		double z_scan = 0;
		x_start = entity.getX() + Mth.nextDouble(RandomSource.create(), -0.25, 0.25);
		y_start = entity.getY() + Mth.nextDouble(RandomSource.create(), -0.15, 0.15);
		z_start = entity.getZ() + Mth.nextDouble(RandomSource.create(), -0.25, 0.25);
		speed_modifier = Mth.nextDouble(RandomSource.create(), 0.05, 0.1);
		range = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.SHINY_RUSH.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.SHINY_RUSH.get()).getAmplifier() : 0) + 4;
		y_scan = Math.floor(y_start) + 0.5 + range * (-1);
		for (int index0 = 0; index0 < (int) (range * 2 + 1); index0++) {
			x_scan = Math.floor(x_start) + 0.5 + range * (-1);
			for (int index1 = 0; index1 < (int) (range * 2 + 1); index1++) {
				z_scan = Math.floor(z_start) + 0.5 + range * (-1);
				for (int index2 = 0; index2 < (int) (range * 2 + 1); index2++) {
					if ((world.getBlockState(BlockPos.containing(x_scan, y_scan, z_scan))).is(BlockTags.create(new ResourceLocation("truedarkness:valuable_blocks")))) {
						vx = (x_scan - x_start) * speed_modifier;
						vy = (y_scan - y_start) * speed_modifier;
						vz = (z_scan - z_start) * speed_modifier;
						if (Math.random() < (9) / ((float) 17)) {
							world.addParticle(ParticleTypes.END_ROD, x_start, y_start, z_start, vx, vy, vz);
						} else if (Math.random() < (9) / ((float) 17)) {
							world.addParticle(ParticleTypes.SMOKE, x_start, y_start, z_start, vx, vy, vz);
						} else {
							world.addParticle(ParticleTypes.LARGE_SMOKE, x_start, y_start, z_start, vx, vy, vz);
						}
					}
					z_scan = z_scan + 1;
				}
				x_scan = x_scan + 1;
			}
			y_scan = y_scan + 1;
		}
	}
}

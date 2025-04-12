package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CorruptedReactorSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 10) < 3) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.conduit.ambient")), SoundSource.NEUTRAL, (float) 0.3, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.conduit.ambient")), SoundSource.NEUTRAL, (float) 0.3, (float) 0.5, false);
				}
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Time") != 0) {
			world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.ERIDIUM_PARTICLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.7, 0.7) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.7, 0.7) + 0.5),
					(z + Mth.nextDouble(RandomSource.create(), -0.7, 0.7) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.004, 0.004)), 0.02, (Mth.nextDouble(RandomSource.create(), -0.04, 0.04)));
		}
	}
}

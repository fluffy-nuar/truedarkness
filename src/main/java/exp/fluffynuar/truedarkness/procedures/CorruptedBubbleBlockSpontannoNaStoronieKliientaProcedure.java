package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;
import exp.fluffynuar.truedarkness.init.TruedarknessModGameRules;

public class CorruptedBubbleBlockSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double x_1 = 0;
		double z_1 = 0;
		if (world.getLevelData().getGameRules().getBoolean(TruedarknessModGameRules.BUBBLES) == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bubble_column.upwards_ambient")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bubble_column.upwards_ambient")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp3 && (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp3)) == true
					&& world.getLevelData().getGameRules().getBoolean(TruedarknessModGameRules.BUBBLES) == true) {
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.VANILLA_BUBBLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.VANILLA_BUBBLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.VANILLA_BUBBLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.VANILLA_BUBBLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
			} else {
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_BUBBLE_POP.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + 0.7),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)), 0.04, (Mth.nextDouble(RandomSource.create(), -0.02, 0.02)));
			}
		}
	}
}

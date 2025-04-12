package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class CorruptedCampfireSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 1) {
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.ERIDIUM_PARTICLE.get()), (x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (y + Mth.nextDouble(RandomSource.create(), -0.1, 0.15) + 0.25),
						(z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25) + 0.5), (Mth.nextDouble(RandomSource.create(), -0.004, 0.004)), 0.001, (Mth.nextDouble(RandomSource.create(), -0.004, 0.004)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.campfire.crackle")), SoundSource.BLOCKS, (float) 0.5,
								(float) Mth.nextDouble(RandomSource.create(), 0.5, 0.8));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.campfire.crackle")), SoundSource.BLOCKS, (float) 0.5, (float) Mth.nextDouble(RandomSource.create(), 0.5, 0.8), false);
					}
				}
			}
		}
	}
}


package exp.fluffynuar.truedarkness.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import exp.fluffynuar.truedarkness.procedures.GlowVineGenProcProcedure;

public class GlowVineFeature extends RandomPatchFeature {
	public GlowVineFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!GlowVineGenProcProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}

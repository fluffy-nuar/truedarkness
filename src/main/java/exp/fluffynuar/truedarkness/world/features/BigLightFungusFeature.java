
package exp.fluffynuar.truedarkness.world.features;

import net.minecraft.world.level.levelgen.feature.HugeFungusFeature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import exp.fluffynuar.truedarkness.procedures.NeaskyTreeDopolnitielnoieUsloviieGienieratsiiProcedure;

public class BigLightFungusFeature extends HugeFungusFeature {
	public BigLightFungusFeature() {
		super(HugeFungusConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<HugeFungusConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!NeaskyTreeDopolnitielnoieUsloviieGienieratsiiProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}

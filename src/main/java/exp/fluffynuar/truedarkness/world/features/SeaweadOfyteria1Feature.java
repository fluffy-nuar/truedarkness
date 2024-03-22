
package exp.fluffynuar.truedarkness.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.NoOpFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import exp.fluffynuar.truedarkness.procedures.SeaweadOfyteriaDopolnitielnoieUsloviieGienieratsiiProcedure;

public class SeaweadOfyteria1Feature extends NoOpFeature {
	public SeaweadOfyteria1Feature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SeaweadOfyteriaDopolnitielnoieUsloviieGienieratsiiProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}

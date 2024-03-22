
package exp.fluffynuar.truedarkness.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.NoOpFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import exp.fluffynuar.truedarkness.procedures.SwampSeagrassFeatureDopolnitielnoieUsloviieGienieratsiiProcedure;

public class KelpOfYteria1Feature extends NoOpFeature {
	public KelpOfYteria1Feature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SwampSeagrassFeatureDopolnitielnoieUsloviieGienieratsiiProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}

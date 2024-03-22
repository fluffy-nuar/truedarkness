
package exp.fluffynuar.truedarkness.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import exp.fluffynuar.truedarkness.world.features.configurations.StructureFeatureConfiguration;
import exp.fluffynuar.truedarkness.procedures.RuinedPortalDopolnitielnoieUsloviieGienieratsiiProcedure;

public class RuinedPortalFeatureFeature extends StructureFeature {
	public RuinedPortalFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!RuinedPortalDopolnitielnoieUsloviieGienieratsiiProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}

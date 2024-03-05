
package exp.fluffynuar.truedarkness.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import exp.fluffynuar.truedarkness.procedures.OldShipDopolnitielnoieUsloviieGienieratsiiProcedure;

public class OldShipFeatureFeature extends StructureFeature {
	public OldShipFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!OldShipDopolnitielnoieUsloviieGienieratsiiProcedure.execute(y))
			return false;
		return super.place(context);
	}
}

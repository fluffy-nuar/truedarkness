
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import exp.fluffynuar.truedarkness.procedures.SpawningCooldwonProcedure;
import exp.fluffynuar.truedarkness.entity.CorruptedSkeletonEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_skeleton;

public class CorruptedSkeletonRenderer extends MobRenderer<CorruptedSkeletonEntity, Modelcorrupted_skeleton<CorruptedSkeletonEntity>> {
	public CorruptedSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorrupted_skeleton<CorruptedSkeletonEntity>(context.bakeLayer(Modelcorrupted_skeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedSkeletonEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted_necromancer.png");
	}

	@Override
	protected boolean isShaking(CorruptedSkeletonEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return SpawningCooldwonProcedure.execute(entity);
	}
}

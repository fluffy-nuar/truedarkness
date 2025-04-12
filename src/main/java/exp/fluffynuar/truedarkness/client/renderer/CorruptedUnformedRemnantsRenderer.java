
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import exp.fluffynuar.truedarkness.procedures.SpawningCooldwonProcedure;
import exp.fluffynuar.truedarkness.entity.CorruptedUnformedRemnantsEntity;
import exp.fluffynuar.truedarkness.client.model.Modelunformed_corrupted_remnant;

public class CorruptedUnformedRemnantsRenderer extends MobRenderer<CorruptedUnformedRemnantsEntity, Modelunformed_corrupted_remnant<CorruptedUnformedRemnantsEntity>> {
	public CorruptedUnformedRemnantsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunformed_corrupted_remnant<CorruptedUnformedRemnantsEntity>(context.bakeLayer(Modelunformed_corrupted_remnant.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedUnformedRemnantsEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted_necromancer.png");
	}

	@Override
	protected boolean isShaking(CorruptedUnformedRemnantsEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return SpawningCooldwonProcedure.execute(entity);
	}
}

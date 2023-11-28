
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.FlowEntity;
import exp.fluffynuar.truedarkness.client.model.Modelflow;

public class FlowRenderer extends MobRenderer<FlowEntity, Modelflow<FlowEntity>> {
	public FlowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflow(context.bakeLayer(Modelflow.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FlowEntity, Modelflow<FlowEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/flow_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FlowEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/flow.png");
	}
}

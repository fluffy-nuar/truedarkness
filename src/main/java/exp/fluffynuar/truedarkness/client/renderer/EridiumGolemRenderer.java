
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.EridiumGolemEntity;
import exp.fluffynuar.truedarkness.client.model.Modeliridiumoviy_Golem;

public class EridiumGolemRenderer extends MobRenderer<EridiumGolemEntity, Modeliridiumoviy_Golem<EridiumGolemEntity>> {
	public EridiumGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliridiumoviy_Golem(context.bakeLayer(Modeliridiumoviy_Golem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EridiumGolemEntity, Modeliridiumoviy_Golem<EridiumGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/eridium_golem_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EridiumGolemEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/eridium_golem.png");
	}
}

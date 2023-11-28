
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.client.model.Modelgeneral;

public class GeneralRenderer extends MobRenderer<GeneralEntity, Modelgeneral<GeneralEntity>> {
	public GeneralRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeneral(context.bakeLayer(Modelgeneral.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<GeneralEntity, Modelgeneral<GeneralEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/eye_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GeneralEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/eye_texture.png");
	}
}

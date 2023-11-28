
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.CryerEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcryer;

public class CryerRenderer extends MobRenderer<CryerEntity, Modelcryer<CryerEntity>> {
	public CryerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryer(context.bakeLayer(Modelcryer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CryerEntity, Modelcryer<CryerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/cryer_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CryerEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/cryer.png");
	}
}

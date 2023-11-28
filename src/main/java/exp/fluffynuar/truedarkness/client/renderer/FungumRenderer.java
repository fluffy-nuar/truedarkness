
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.FungumEntity;
import exp.fluffynuar.truedarkness.client.model.Modelfungun;

public class FungumRenderer extends MobRenderer<FungumEntity, Modelfungun<FungumEntity>> {
	public FungumRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfungun(context.bakeLayer(Modelfungun.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FungumEntity, Modelfungun<FungumEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/fungum_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FungumEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/fungum.png");
	}
}

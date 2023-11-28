
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.CorruptedHandEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_hand;

public class CorruptedHandRenderer extends MobRenderer<CorruptedHandEntity, Modelcorrupted_hand<CorruptedHandEntity>> {
	public CorruptedHandRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorrupted_hand(context.bakeLayer(Modelcorrupted_hand.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CorruptedHandEntity, Modelcorrupted_hand<CorruptedHandEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/corrupted_hand_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedHandEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted_hand.png");
	}
}

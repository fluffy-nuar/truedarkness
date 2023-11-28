
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.CorruptedKnightEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_knight;

public class CorruptedKnightRenderer extends MobRenderer<CorruptedKnightEntity, Modelcorrupted_knight<CorruptedKnightEntity>> {
	public CorruptedKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorrupted_knight(context.bakeLayer(Modelcorrupted_knight.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CorruptedKnightEntity, Modelcorrupted_knight<CorruptedKnightEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/corrupted_knight_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedKnightEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted_knight.png");
	}
}

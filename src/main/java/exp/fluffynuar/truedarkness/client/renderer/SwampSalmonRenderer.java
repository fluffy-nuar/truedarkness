
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CodModel;

import exp.fluffynuar.truedarkness.entity.SwampSalmonEntity;

public class SwampSalmonRenderer extends MobRenderer<SwampSalmonEntity, CodModel<SwampSalmonEntity>> {
	public SwampSalmonRenderer(EntityRendererProvider.Context context) {
		super(context, new CodModel(context.bakeLayer(ModelLayers.COD)), 0.5f);
		this.addLayer(new EyesLayer<SwampSalmonEntity, CodModel<SwampSalmonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/swamp_cod_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SwampSalmonEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/swamp_cod.png");
	}
}

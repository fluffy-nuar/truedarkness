
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.WasteRunerEntity;
import exp.fluffynuar.truedarkness.client.model.Modelwaster;

public class WasteRunerRenderer extends MobRenderer<WasteRunerEntity, Modelwaster<WasteRunerEntity>> {
	public WasteRunerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwaster(context.bakeLayer(Modelwaster.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<WasteRunerEntity, Modelwaster<WasteRunerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/waste_runer_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(WasteRunerEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/waste_runer.png");
	}
}

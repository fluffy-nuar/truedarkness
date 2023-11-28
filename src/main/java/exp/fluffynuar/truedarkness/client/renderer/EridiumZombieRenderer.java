
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import exp.fluffynuar.truedarkness.entity.EridiumZombieEntity;
import exp.fluffynuar.truedarkness.client.model.Modeleridium_zombie;

public class EridiumZombieRenderer extends MobRenderer<EridiumZombieEntity, Modeleridium_zombie<EridiumZombieEntity>> {
	public EridiumZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleridium_zombie(context.bakeLayer(Modeleridium_zombie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EridiumZombieEntity, Modeleridium_zombie<EridiumZombieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("truedarkness:textures/entities/eridium_zombie_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EridiumZombieEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/eridium_zombie.png");
	}
}


package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.EridiumZombieEntity;
import exp.fluffynuar.truedarkness.client.model.Modeleridium_zombie;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EridiumZombieRenderer extends MobRenderer<EridiumZombieEntity, Modeleridium_zombie<EridiumZombieEntity>> {
	public EridiumZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleridium_zombie<EridiumZombieEntity>(context.bakeLayer(Modeleridium_zombie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<EridiumZombieEntity, Modeleridium_zombie<EridiumZombieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/eridium_zombie_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EridiumZombieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EridiumZombieEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/eridium_zombie.png");
	}
}

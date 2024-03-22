
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.client.model.Modelgeneral;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GeneralRenderer extends MobRenderer<GeneralEntity, Modelgeneral<GeneralEntity>> {
	public GeneralRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeneral(context.bakeLayer(Modelgeneral.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GeneralEntity, Modelgeneral<GeneralEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/eye_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GeneralEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GeneralEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/eye_texture.png");
	}
}

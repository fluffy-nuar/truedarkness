
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.RemnantEntity;
import exp.fluffynuar.truedarkness.client.model.Modelsoul_remnants;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RemnantRenderer extends MobRenderer<RemnantEntity, Modelsoul_remnants<RemnantEntity>> {
	public RemnantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsoul_remnants<RemnantEntity>(context.bakeLayer(Modelsoul_remnants.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<RemnantEntity, Modelsoul_remnants<RemnantEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/soul_remnants_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, RemnantEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(RemnantEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.75f, 0.75f, 0.75f);
	}

	@Override
	public ResourceLocation getTextureLocation(RemnantEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/soul_remnants.png");
	}
}

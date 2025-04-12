
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.CorruptedHumanEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_human;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CorruptedHumanRenderer extends MobRenderer<CorruptedHumanEntity, Modelcorrupted_human<CorruptedHumanEntity>> {
	public CorruptedHumanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorrupted_human<CorruptedHumanEntity>(context.bakeLayer(Modelcorrupted_human.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CorruptedHumanEntity, Modelcorrupted_human<CorruptedHumanEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/corrupted_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CorruptedHumanEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedHumanEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted.png");
	}
}

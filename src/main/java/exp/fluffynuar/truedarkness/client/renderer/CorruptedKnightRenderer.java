
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.CorruptedKnightEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_knight;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CorruptedKnightRenderer extends MobRenderer<CorruptedKnightEntity, Modelcorrupted_knight<CorruptedKnightEntity>> {
	public CorruptedKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorrupted_knight(context.bakeLayer(Modelcorrupted_knight.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CorruptedKnightEntity, Modelcorrupted_knight<CorruptedKnightEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/corrupted_knight_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CorruptedKnightEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedKnightEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted_knight.png");
	}
}

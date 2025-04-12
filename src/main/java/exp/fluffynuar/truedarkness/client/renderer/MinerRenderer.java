
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.MinerEntity;
import exp.fluffynuar.truedarkness.client.model.Modelminer;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MinerRenderer extends MobRenderer<MinerEntity, Modelminer<MinerEntity>> {
	public MinerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminer<MinerEntity>(context.bakeLayer(Modelminer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<MinerEntity, Modelminer<MinerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/miner_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MinerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MinerEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/miner.png");
	}
}

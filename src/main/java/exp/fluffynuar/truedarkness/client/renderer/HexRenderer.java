
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.HexEntity;
import exp.fluffynuar.truedarkness.client.model.Modelhex;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HexRenderer extends MobRenderer<HexEntity, Modelhex<HexEntity>> {
	public HexRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhex<HexEntity>(context.bakeLayer(Modelhex.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<HexEntity, Modelhex<HexEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/hex_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HexEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HexEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/hex.png");
	}
}

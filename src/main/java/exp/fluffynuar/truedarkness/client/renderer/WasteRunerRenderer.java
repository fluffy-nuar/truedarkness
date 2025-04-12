
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.WasteRunerEntity;
import exp.fluffynuar.truedarkness.client.model.Modelwaste_runner;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WasteRunerRenderer extends MobRenderer<WasteRunerEntity, Modelwaste_runner<WasteRunerEntity>> {
	public WasteRunerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwaste_runner<WasteRunerEntity>(context.bakeLayer(Modelwaste_runner.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<WasteRunerEntity, Modelwaste_runner<WasteRunerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/corrupted_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WasteRunerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(WasteRunerEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted.png");
	}
}

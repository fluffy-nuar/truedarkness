
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.CorruptedAssassinEntity;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_assassin_aggresive;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CorruptedAssassinRenderer extends MobRenderer<CorruptedAssassinEntity, Modelcorrupted_assassin_aggresive<CorruptedAssassinEntity>> {
	public CorruptedAssassinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorrupted_assassin_aggresive<CorruptedAssassinEntity>(context.bakeLayer(Modelcorrupted_assassin_aggresive.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CorruptedAssassinEntity, Modelcorrupted_assassin_aggresive<CorruptedAssassinEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/corrupted_assassin_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CorruptedAssassinEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedAssassinEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted_assassin.png");
	}
}


package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.GlowBugEntity;
import exp.fluffynuar.truedarkness.client.model.Modelglow_bug;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GlowBugRenderer extends MobRenderer<GlowBugEntity, Modelglow_bug<GlowBugEntity>> {
	public GlowBugRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglow_bug<GlowBugEntity>(context.bakeLayer(Modelglow_bug.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GlowBugEntity, Modelglow_bug<GlowBugEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/glow_bug_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlowBugEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowBugEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/glow_bug.png");
	}
}


package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.EridiumGolemEntity;
import exp.fluffynuar.truedarkness.client.model.Modeliridiumoviy_Golem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EridiumGolemRenderer extends MobRenderer<EridiumGolemEntity, Modeliridiumoviy_Golem<EridiumGolemEntity>> {
	public EridiumGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliridiumoviy_Golem(context.bakeLayer(Modeliridiumoviy_Golem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<EridiumGolemEntity, Modeliridiumoviy_Golem<EridiumGolemEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/eridium_golem_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EridiumGolemEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EridiumGolemEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/eridium_golem.png");
	}
}

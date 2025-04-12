
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import exp.fluffynuar.truedarkness.entity.SoulstealWarriorEntity;
import exp.fluffynuar.truedarkness.client.model.Modelsoulsteal_warrior;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SoulstealWarriorRenderer extends MobRenderer<SoulstealWarriorEntity, Modelsoulsteal_warrior<SoulstealWarriorEntity>> {
	public SoulstealWarriorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsoulsteal_warrior<SoulstealWarriorEntity>(context.bakeLayer(Modelsoulsteal_warrior.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<SoulstealWarriorEntity, Modelsoulsteal_warrior<SoulstealWarriorEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/corrupted_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SoulstealWarriorEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SoulstealWarriorEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/corrupted.png");
	}
}

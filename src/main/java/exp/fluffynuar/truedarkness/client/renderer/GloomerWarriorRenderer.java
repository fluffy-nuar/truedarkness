
package exp.fluffynuar.truedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.entity.GloomerWarriorEntity;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer_warrior;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GloomerWarriorRenderer extends MobRenderer<GloomerWarriorEntity, Modelgloomer_warrior<GloomerWarriorEntity>> {
	public GloomerWarriorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgloomer_warrior<GloomerWarriorEntity>(context.bakeLayer(Modelgloomer_warrior.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GloomerWarriorEntity, Modelgloomer_warrior<GloomerWarriorEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/gloomer_warrior_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GloomerWarriorEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelgloomer(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgloomer.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GloomerWarriorEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/gloomer_warrior.png");
	}
}

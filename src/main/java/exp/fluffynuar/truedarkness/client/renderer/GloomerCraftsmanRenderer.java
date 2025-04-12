
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

import exp.fluffynuar.truedarkness.entity.GloomerCraftsmanEntity;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer_craftsman;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GloomerCraftsmanRenderer extends MobRenderer<GloomerCraftsmanEntity, Modelgloomer_craftsman<GloomerCraftsmanEntity>> {
	public GloomerCraftsmanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgloomer_craftsman<GloomerCraftsmanEntity>(context.bakeLayer(Modelgloomer_craftsman.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GloomerCraftsmanEntity, Modelgloomer_craftsman<GloomerCraftsmanEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("truedarkness:textures/entities/gloomer_master_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GloomerCraftsmanEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
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
	public ResourceLocation getTextureLocation(GloomerCraftsmanEntity entity) {
		return new ResourceLocation("truedarkness:textures/entities/gloomer_master.png");
	}
}

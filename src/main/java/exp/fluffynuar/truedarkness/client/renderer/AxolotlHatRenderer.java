package exp.fluffynuar.truedarkness.client.renderer;

import top.theillusivec4.curios.api.client.ICurioRenderer;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.init.TruedarknessModLayerDefinitions;
import exp.fluffynuar.truedarkness.client.model.Modelaxolotl_hat;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AxolotlHatRenderer implements ICurioRenderer {
	private static final ResourceLocation TEXTURE = new ResourceLocation("truedarkness", "textures/entities/axolotl_hat.png");
	private final Modelaxolotl_hat model;

	public AxolotlHatRenderer() {
		this.model = new Modelaxolotl_hat(Minecraft.getInstance().getEntityModels().bakeLayer(TruedarknessModLayerDefinitions.AXOLOTL_HAT));
	}

	@Override
	public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer, int light, float limbSwing,
			float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		LivingEntity entity = slotContext.entity();
		ICurioRenderer.translateIfSneaking(matrixStack, entity);
		this.model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
		this.model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, RenderType.armorCutoutNoCull(TEXTURE), false, stack.hasFoil());
		this.model.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	}
}

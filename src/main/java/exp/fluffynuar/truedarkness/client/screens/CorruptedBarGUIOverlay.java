
package exp.fluffynuar.truedarkness.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.procedures.CorruptedBarProcProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc9Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc8Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc7Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc6Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc5Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc4Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc3Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc2Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarProc1Procedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedBarGUIOtobrazhatOvierlieiVIghrieProcedure;
import exp.fluffynuar.truedarkness.procedures.CB8Procedure;
import exp.fluffynuar.truedarkness.procedures.CB7Procedure;
import exp.fluffynuar.truedarkness.procedures.CB6Procedure;
import exp.fluffynuar.truedarkness.procedures.CB5Procedure;
import exp.fluffynuar.truedarkness.procedures.CB4Procedure;
import exp.fluffynuar.truedarkness.procedures.CB3Procedure;
import exp.fluffynuar.truedarkness.procedures.CB2Procedure;
import exp.fluffynuar.truedarkness.procedures.CB1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CorruptedBarGUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (CorruptedBarGUIOtobrazhatOvierlieiVIghrieProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);

			if (CorruptedBarProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_1_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_2_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_3_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_4_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_5_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_6_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_7_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_8_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_9_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CorruptedBarProc9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_10_0.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_1.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_2.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_3.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_4.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_5.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_6.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_7.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
			if (CB8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/corrupted_bar_0_8.png"), 0, 0, 0, 0, 224, 32, 224, 32);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

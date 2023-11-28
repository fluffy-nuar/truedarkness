
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

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CorruptedBarGUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
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
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);

			if (CorruptedBarProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_1.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_2.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_3.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_4.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_5.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_6.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_7.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_8.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_9.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
			if (CorruptedBarProc9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/cirrupted_bar_10.png"), posX + -108, posY + -121, 0, 0, 216, 42, 216, 42);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

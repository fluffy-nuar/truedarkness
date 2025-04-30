
package exp.fluffynuar.truedarkness.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.procedures.VisualProgress9Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress8Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress7Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress6Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress5Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress4Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress3Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress2Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress1Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualProgress10Procedure;
import exp.fluffynuar.truedarkness.procedures.TextFatigueBloodProcedure;
import exp.fluffynuar.truedarkness.procedures.TextFatigueBloodCountProcedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProcProcedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc9Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc8Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc7Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc6Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc5Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc4Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc3Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc2Procedure;
import exp.fluffynuar.truedarkness.procedures.SpellSelectingAtProc1Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerkProcedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk9Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk8Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk7Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk6Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk5Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk4Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk3Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk2Procedure;
import exp.fluffynuar.truedarkness.procedures.GetTypeOfPerk1Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueBloodCountProcedure;
import exp.fluffynuar.truedarkness.procedures.ExpirienceHideBarProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ProgressGettingReadyOverlay {
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
		if (ExpirienceHideBarProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress.png"), w / 2 + -91, h - 39, 0, 0, 182, 15, 182, 15);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_selecting_bar.png"), w / 2 + -100, h - 22, 0, 0, 203, 22, 203, 22);

			if (SpellSelectingAtProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + -101, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + -81, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + -61, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + -41, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + -21, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + -1, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + 19, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + 39, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + 59, h - 23, 0, 0, 24, 24, 24, 24);
			}
			if (SpellSelectingAtProc9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/selectied_spell.png"), w / 2 + 79, h - 23, 0, 0, 24, 24, 24, 24);
			}

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + -97, h - 19, Mth.clamp((int) GetTypeOfPerkProcedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + -77, h - 19, Mth.clamp((int) GetTypeOfPerk1Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + -57, h - 19, Mth.clamp((int) GetTypeOfPerk2Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + -37, h - 19, Mth.clamp((int) GetTypeOfPerk3Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + -17, h - 19, Mth.clamp((int) GetTypeOfPerk4Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + 3, h - 19, Mth.clamp((int) GetTypeOfPerk5Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + 23, h - 19, Mth.clamp((int) GetTypeOfPerk6Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + 43, h - 19, Mth.clamp((int) GetTypeOfPerk7Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + 63, h - 19, Mth.clamp((int) GetTypeOfPerk8Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/spell_type_bar.png"), w / 2 + 83, h - 19, Mth.clamp((int) GetTypeOfPerk9Procedure.execute(entity) * 16, 0, 160), 0, 16, 16, 176, 16);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_0.png"), w / 2 + -90, h - 28, Mth.clamp((int) VisualProgress1Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_1.png"), w / 2 + -80, h - 28, Mth.clamp((int) VisualProgress2Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_2.png"), w / 2 + -70, h - 28, Mth.clamp((int) VisualProgress3Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_0.png"), w / 2 + -60, h - 28, Mth.clamp((int) VisualProgress4Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_2.png"), w / 2 + -50, h - 28, Mth.clamp((int) VisualProgress5Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_0.png"), w / 2 + -40, h - 28, Mth.clamp((int) VisualProgress6Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_2.png"), w / 2 + -20, h - 28, Mth.clamp((int) VisualProgress8Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_1.png"), w / 2 + -30, h - 28, Mth.clamp((int) VisualProgress7Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_0.png"), w / 2 + -10, h - 28, Mth.clamp((int) VisualProgress9Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/active_progress_bar_0.png"), w / 2 + 0, h - 28, Mth.clamp((int) VisualProgress10Procedure.execute(entity) * 10, 0, 50), 0, 10, 3, 60, 3);

			if (FatigueBloodCountProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextFatigueBloodCountProcedure.execute(entity), w / 2 + 9, h - 49, -12111538, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					TextFatigueBloodProcedure.execute(entity), w / 2 + 14, h - 35, -9087361, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}


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

import exp.fluffynuar.truedarkness.procedures.WitherHuntProcProcedure;
import exp.fluffynuar.truedarkness.procedures.UndyingPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.ToolPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.TextFatigueSelectProcedure;
import exp.fluffynuar.truedarkness.procedures.TextFatigueBloodProcedure;
import exp.fluffynuar.truedarkness.procedures.TextFatigueBloodCountProcedure;
import exp.fluffynuar.truedarkness.procedures.TeleportPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.SteelHuntProcProcedure;
import exp.fluffynuar.truedarkness.procedures.SmeltPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.SkullPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.SeerPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.RunePerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.ReadyProcGuiCorruptProcedure;
import exp.fluffynuar.truedarkness.procedures.MoonHuntProcProcedure;
import exp.fluffynuar.truedarkness.procedures.LightPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.HuntStandartProcProcedure;
import exp.fluffynuar.truedarkness.procedures.HuntBiteProcProcedure;
import exp.fluffynuar.truedarkness.procedures.HideHuntProcProcedure;
import exp.fluffynuar.truedarkness.procedures.HideFatigueProc4Procedure;
import exp.fluffynuar.truedarkness.procedures.FootstepPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.FearHuntProcProcedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProcProcedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc9Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc8Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc7Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc6Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc5Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc4Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc3Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc2Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayerProc1Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer2ProcProcedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1ProcProcedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc8Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc7Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc6Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc5Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc4Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc3Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc2Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueGuiLayer1Proc1Procedure;
import exp.fluffynuar.truedarkness.procedures.FatigueBloodCountProcedure;
import exp.fluffynuar.truedarkness.procedures.EchoPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.DashPerkShowProcedure;
import exp.fluffynuar.truedarkness.procedures.ActiveAbilitySelectProcedure;
import exp.fluffynuar.truedarkness.procedures.ActiveAbilitySelectNotProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FatigueGUIOverlay {
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
		if (FatigueGuiLayer2ProcProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_background.png"), 2, 2, 0, 0, 180, 26, 180, 26);

			if (FatigueGuiLayerProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 2, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 20, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 38, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 56, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 74, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 92, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 110, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 128, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 146, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayerProc9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token.png"), 164, 2, 0, 0, 18, 4, 18, 4);
			}
			if (FatigueGuiLayer1ProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_1.png"), 4, 26, 0, 0, 16, 2, 16, 2);
			}
			if (FatigueGuiLayer1Proc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_2.png"), 4, 24, 0, 0, 16, 4, 16, 4);
			}
			if (FatigueGuiLayer1Proc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_3.png"), 4, 22, 0, 0, 16, 6, 16, 6);
			}
			if (FatigueGuiLayer1Proc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_4.png"), 4, 20, 0, 0, 16, 8, 16, 8);
			}
			if (FatigueGuiLayer1Proc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_5.png"), 4, 18, 0, 0, 16, 10, 16, 10);
			}
			if (FatigueGuiLayer1Proc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_6.png"), 4, 16, 0, 0, 16, 12, 16, 12);
			}
			if (FatigueGuiLayer1Proc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_7.png"), 4, 14, 0, 0, 16, 14, 16, 14);
			}
			if (FatigueGuiLayer1Proc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_8.png"), 4, 12, 0, 0, 16, 16, 16, 16);
			}
			if (FatigueGuiLayer1Proc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_ready.png"), 4, 12, 0, 0, 16, 16, 16, 16);
			}
			if (HideFatigueProc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_token_closed.png"), 2, 2, 0, 0, 178, 4, 178, 4);
			}
			if (ReadyProcGuiCorruptProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_evolution_ready.png"), 0, 30, 0, 0, 24, 14, 24, 14);
			}
			if (UndyingPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_0_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (RunePerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_1_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (DashPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_2_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (SeerPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_3_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (TeleportPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_4_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (FootstepPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_5_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (EchoPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_6_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (LightPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_7_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (ToolPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_8_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (SmeltPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_9_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (SkullPerkShowProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/perk_10_corrupted_gui.png"), 28, 12, 0, 0, 14, 14, 14, 14);
			}
			if (HuntStandartProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/hunt_0_corrupted_gui.png"), 50, 10, 0, 0, 14, 14, 14, 14);
			}
			if (SteelHuntProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/hunt_1_corrupted_gui.png"), 50, 10, 0, 0, 14, 14, 14, 14);
			}
			if (WitherHuntProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/hunt_2_corrupted_gui.png"), 50, 10, 0, 0, 14, 14, 14, 14);
			}
			if (HideHuntProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/hunt_3_corrupted_gui.png"), 50, 10, 0, 0, 14, 14, 14, 14);
			}
			if (HuntBiteProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_bloodshed.png"), 16, 30, 0, 0, 20, 10, 20, 10);
			}
			if (MoonHuntProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/hunt_4_corrupted_gui.png"), 50, 8, 0, 0, 14, 14, 14, 14);
			}
			if (FearHuntProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/hunt_5_corrupted_gui.png"), 50, 8, 0, 0, 14, 14, 14, 14);
			}
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui.png"), 0, 0, 0, 0, 184, 36, 184, 36);

			if (ActiveAbilitySelectProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/reaper_gui_blood_counter.png"), 70, 6, 0, 0, 14, 16, 14, 16);
			}
			if (ActiveAbilitySelectProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextFatigueBloodProcedure.execute(entity), 86, 11, -1854492, false);
			if (ActiveAbilitySelectNotProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextFatigueSelectProcedure.execute(entity), 74, 11, -1854492, false);
			if (FatigueBloodCountProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextFatigueBloodCountProcedure.execute(entity), 86, 25, -5209167, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

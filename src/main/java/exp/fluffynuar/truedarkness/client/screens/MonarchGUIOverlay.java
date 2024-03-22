
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

import exp.fluffynuar.truedarkness.procedures.MonarchbarShellProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarSandglassProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarRingProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarHeartProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchGUIProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchCooldownProcProcedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc8Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc7Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc75Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc6Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc65Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc5Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc55Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc4Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc45Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc3Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc35Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc2Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc25Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc1Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc15Procedure;
import exp.fluffynuar.truedarkness.procedures.ManabarProc05Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU0Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS0Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MonarchGUIOverlay {
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
		if (MonarchGUIProcProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_gui.png"), w - 192, 0, 0, 0, 192, 64, 192, 64);

			if (ManabarProc05Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 26, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 26, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 46, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 46, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc25Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 66, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 66, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc35Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 86, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 86, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc45Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 106, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 106, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc55Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 126, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 126, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc65Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 146, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 146, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc75Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_0.png"), w - 166, 4, 0, 0, 22, 8, 22, 8);
			}
			if (ManabarProc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_mana_1.png"), w - 166, 4, 0, 0, 22, 8, 22, 8);
			}
			if (MonarchbarRingProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_ring_layer.png"), w - 124, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarSandglassProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_sandglass_layer.png"), w - 136, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarHeartProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_heart_layer.png"), w - 160, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarShellProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_shell_layer.png"), w - 148, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MMD0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_0.png"), w - 20, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMD1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_1.png"), w - 20, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMD2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_2.png"), w - 20, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMD3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_3.png"), w - 20, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMS0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_0.png"), w - 44, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMS1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_1.png"), w - 44, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMS2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_2.png"), w - 44, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMS3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_3.png"), w - 44, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMU0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_0.png"), w - 68, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMU1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_1.png"), w - 68, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMU2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_2.png"), w - 68, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MMU3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_3.png"), w - 68, 16, 0, 0, 14, 14, 14, 14);
			}
			if (MonarchCooldownProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_cooldown_gui.png"), w - 192, 0, 0, 0, 192, 64, 192, 64);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

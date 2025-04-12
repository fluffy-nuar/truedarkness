
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

import exp.fluffynuar.truedarkness.procedures.WingsNoneEquippedProcedure;
import exp.fluffynuar.truedarkness.procedures.SpellBarProcProcedure;
import exp.fluffynuar.truedarkness.procedures.SpellBarProcCooldownProcedure;
import exp.fluffynuar.truedarkness.procedures.Ptays0Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse9Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse8Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse7Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse6Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse5Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse4Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse3Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse2Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse1Procedure;
import exp.fluffynuar.truedarkness.procedures.PraysUse10Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays9Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays8Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays7Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays6Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays5Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays4Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays3Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays2Procedure;
import exp.fluffynuar.truedarkness.procedures.Prays1Procedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarShellProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarSandglassProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarRingProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarPaperProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarKeyProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarHeartProcProcedure;
import exp.fluffynuar.truedarkness.procedures.MonarchbarBottleProcProcedure;
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
import exp.fluffynuar.truedarkness.procedures.MMUD7Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD6Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD5Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD4Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMUD0Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU7Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU6Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU5Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU4Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMU0Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD7Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD6Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD5Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD4Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMSD0Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS7Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS6Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS5Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS4Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMS0Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD7Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD6Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD5Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD4Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD3Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD2Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD1Procedure;
import exp.fluffynuar.truedarkness.procedures.MMD0Procedure;
import exp.fluffynuar.truedarkness.procedures.CooldownWithWingsProcedure;

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
			event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_bar.png"), w - 172, 0, 0, 0, 172, 34, 172, 34);

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
			if (MonarchCooldownProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_bar_cooldwon.png"), w - 114, 14, 0, 0, 64, 20, 64, 20);
			}
			if (SpellBarProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_bar.png"), w - 26, 18, 0, 0, 26, 28, 26, 28);
			}
			if (WingsNoneEquippedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_bar_side.png"), w - 50, 18, 0, 0, 26, 28, 26, 28);
			}
			if (WingsNoneEquippedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_bar_up.png"), w - 74, 18, 0, 0, 26, 28, 26, 28);
			}
			if (CooldownWithWingsProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_cooldown_full.png"), w - 70, 38, 0, 0, 70, 8, 70, 8);
			}
			if (MonarchbarHeartProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_heart_layer.png"), w - 160, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarSandglassProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_sandglass_layer.png"), w - 148, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarBottleProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_bottle_layer.png"), w - 148, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarPaperProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_paper_layer.png"), w - 148, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarShellProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_shell_layer.png"), w - 148, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarKeyProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_key_layer.png"), w - 148, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MonarchbarRingProcProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_ring_layer.png"), w - 136, 14, 0, 0, 10, 18, 10, 18);
			}
			if (MMS0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_0.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_1.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_2.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_3.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_4.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_5.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_6.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMS7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_7.png"), w - 44, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_0.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_1.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_2.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_3.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_4.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_5.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_6.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMU7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_7.png"), w - 68, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_0.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_1.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_2.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_3.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_4.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_5.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_6.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMSD7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_side_7.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_0.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_1.png"), 407, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_2.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_3.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_4.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_5.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_6.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMUD7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_up_7.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (WingsNoneEquippedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_bar.png"), w - 26, 18, 0, 0, 26, 28, 26, 28);
			}
			if (MMD0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_0.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_1.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_2.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_3.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_4.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_5.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_6.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (MMD7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_down_7.png"), w - 20, 20, 0, 0, 14, 14, 14, 14);
			}
			if (SpellBarProcCooldownProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/monarch_spell_cooldown.png"), w - 18, 38, 0, 0, 14, 8, 14, 8);
			}
			if (Ptays0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 12, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 22, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 32, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 42, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 52, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 62, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 72, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 82, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 92, 14, 0, 0, 10, 2, 10, 2);
			}
			if (Prays9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays.png"), w - 102, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 102, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 92, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 82, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 72, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 62, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 52, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 42, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 32, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 22, 14, 0, 0, 10, 2, 10, 2);
			}
			if (PraysUse10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("truedarkness:textures/screens/prays_use.png"), w - 12, 14, 0, 0, 10, 2, 10, 2);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

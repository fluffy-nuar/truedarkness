package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.CursedCauldronNewGUIMenu;
import exp.fluffynuar.truedarkness.procedures.TextCauldronProcTextProcedure;
import exp.fluffynuar.truedarkness.procedures.TextCauldronProcProcedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldronProc2Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron9Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron8Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron7Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron6Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron5Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron4Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron3Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron1Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron10Procedure;
import exp.fluffynuar.truedarkness.procedures.ProgressCauldron0Procedure;
import exp.fluffynuar.truedarkness.procedures.CursedAnvilButtomProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedAnvilButtomProcProcedure;
import exp.fluffynuar.truedarkness.procedures.CountOfBloodCauldronProcedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class CursedCauldronNewGUIScreen extends AbstractContainerScreen<CursedCauldronNewGUIMenu> {
	private final static HashMap<String, Object> guistate = CursedCauldronNewGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CursedCauldronNewGUIScreen(CursedCauldronNewGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_new_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (TextCauldronProcProcedure.execute(world, x, y, z))
			if (mouseX > leftPos + 56 && mouseX < leftPos + 80 && mouseY > topPos + 43 && mouseY < topPos + 67)
				guiGraphics.renderTooltip(font, Component.literal(TextCauldronProcTextProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (CursedAnvilButtomProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_anvil_buttom.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 110, 16, 110, 16);
		}
		if (ProgressCauldron0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 57, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldron1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 59, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldronProc2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 61, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldron3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 63, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldron4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 65, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldron5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 67, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldron6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_5.png"), this.leftPos + 69, this.topPos + 46, 0, 0, 2, 16, 2, 16);
		}
		if (ProgressCauldron7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_6.png"), this.leftPos + 59, this.topPos + 46, 0, 0, 14, 16, 14, 16);
		}
		if (ProgressCauldron8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_7.png"), this.leftPos + 59, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ProgressCauldron9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_8.png"), this.leftPos + 59, this.topPos + 46, 0, 0, 18, 16, 18, 16);
		}
		if (ProgressCauldron10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_cauldron_gui_layer_progress_9.png"), this.leftPos + 59, this.topPos + 46, 0, 0, 20, 16, 20, 16);
		}
		if (TextCauldronProcProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_anvil_buttom_disallow.png"), this.leftPos + 54, this.topPos + 44, 0, 0, 28, 21, 28, 21);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_cauldron_new_gui.label_cursed_forging"), 60, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_cauldron_new_gui.label_inventory"), 8, 73, -13421773, false);
		if (CursedAnvilButtomProcProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					CountOfBloodCauldronProcedure.execute(world, x, y, z), 63, 25, -13421773, false);
		if (CursedAnvilButtomProcProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					CountOfBloodCauldronProcedure.execute(world, x, y, z), 62, 24, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

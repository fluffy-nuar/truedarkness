package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.CursedWorkbenchGUIMenu;
import exp.fluffynuar.truedarkness.procedures.CountOfBloodProcedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnaceProcedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnace3Procedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnace2Procedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnace1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class CursedWorkbenchGUIScreen extends AbstractContainerScreen<CursedWorkbenchGUIMenu> {
	private final static HashMap<String, Object> guistate = CursedWorkbenchGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CursedWorkbenchGUIScreen(CursedWorkbenchGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/cursed_workbench_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_workbench_gui_layer.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (CooldownFurnaceProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_workbench_progress_0.png"), this.leftPos + 49, this.topPos + 50, 0, 0, 15, 4, 15, 4);
		}
		if (CooldownFurnace1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_workbench_progress_1.png"), this.leftPos + 49, this.topPos + 47, 0, 0, 15, 7, 15, 7);
		}
		if (CooldownFurnace2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_workbench_progress_2.png"), this.leftPos + 49, this.topPos + 44, 0, 0, 15, 10, 15, 10);
		}
		if (CooldownFurnace3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_workbench_progress_3.png"), this.leftPos + 49, this.topPos + 40, 0, 0, 15, 14, 15, 14);
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
		guiGraphics.drawString(this.font,

				CountOfBloodProcedure.execute(world, x, y, z), 48, 58, -14278828, false);
		guiGraphics.drawString(this.font,

				CountOfBloodProcedure.execute(world, x, y, z), 47, 57, -5635858, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_workbench_gui.label_cursed_forge"), 8, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_workbench_gui.label_inventory"), 8, 73, -13421773, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

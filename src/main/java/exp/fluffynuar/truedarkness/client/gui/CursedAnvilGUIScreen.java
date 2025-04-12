package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.CursedAnvilGUIMenu;
import exp.fluffynuar.truedarkness.procedures.TextCursedAnvilProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedAvilBooldProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedAnvilButtomProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedAnvilButtomProcProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedAnvilButtomDoesntWorkProcedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class CursedAnvilGUIScreen extends AbstractContainerScreen<CursedAnvilGUIMenu> {
	private final static HashMap<String, Object> guistate = CursedAnvilGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CursedAnvilGUIScreen(CursedAnvilGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/cursed_anvil_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (CursedAnvilButtomDoesntWorkProcedure.execute(entity))
			if (mouseX > leftPos + 104 && mouseX < leftPos + 128 && mouseY > topPos + 44 && mouseY < topPos + 68)
				guiGraphics.renderTooltip(font, Component.literal(TextCursedAnvilProcedure.execute(world, entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_anvil_gui_layer.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (CursedAnvilButtomDoesntWorkProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_anvil_buttom_disallow.png"), this.leftPos + 102, this.topPos + 45, 0, 0, 28, 21, 28, 21);
		}
		if (CursedAnvilButtomProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_anvil_buttom.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 110, 16, 110, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_anvil_gui.label_cursed_forging"), 60, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_anvil_gui.label_inventory"), 8, 73, -13421773, false);
		if (CursedAnvilButtomProcProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					CursedAvilBooldProcedure.execute(entity), 63, 25, -13421773, false);
		if (CursedAnvilButtomProcProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					CursedAvilBooldProcedure.execute(entity), 62, 24, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

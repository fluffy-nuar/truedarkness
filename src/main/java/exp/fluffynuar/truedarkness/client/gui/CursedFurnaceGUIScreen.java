package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.CursedFurnaceGUIMenu;
import exp.fluffynuar.truedarkness.procedures.NoCountOfBloodShowFunaceProcedure;
import exp.fluffynuar.truedarkness.procedures.CountOfBloodShowProcFurnaceProcedure;
import exp.fluffynuar.truedarkness.procedures.CountOfBloodProcedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnaceProcedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnace3Procedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnace2Procedure;
import exp.fluffynuar.truedarkness.procedures.CooldownFurnace1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class CursedFurnaceGUIScreen extends AbstractContainerScreen<CursedFurnaceGUIMenu> {
	private final static HashMap<String, Object> guistate = CursedFurnaceGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CursedFurnaceGUIScreen(CursedFurnaceGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/cursed_furnace_gui.png");

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

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_furnace_gui_layer.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (NoCountOfBloodShowFunaceProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_anvil_buttom.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 110, 16, 110, 16);
		}
		if (CooldownFurnaceProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_furnace_fire_1.png"), this.leftPos + 71, this.topPos + 57, 0, 0, 14, 4, 14, 4);
		}
		if (CooldownFurnace1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_furnace_fire_2.png"), this.leftPos + 71, this.topPos + 54, 0, 0, 14, 7, 14, 7);
		}
		if (CooldownFurnace2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_furnace_fire_3.png"), this.leftPos + 71, this.topPos + 51, 0, 0, 14, 10, 14, 10);
		}
		if (CooldownFurnace3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_furnace_fire_4.png"), this.leftPos + 71, this.topPos + 47, 0, 0, 14, 14, 14, 14);
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
		if (CountOfBloodShowProcFurnaceProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font,

					CountOfBloodProcedure.execute(world, x, y, z), 63, 25, -13421773, false);
		if (CountOfBloodShowProcFurnaceProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font,

					CountOfBloodProcedure.execute(world, x, y, z), 62, 24, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_furnace_gui.label_cursed_forge"), 60, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_furnace_gui.label_inventory"), 8, 73, -13421773, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

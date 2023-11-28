package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.BlacksmiteForgeGUIMenu;
import exp.fluffynuar.truedarkness.procedures.LavaProcedure;
import exp.fluffynuar.truedarkness.procedures.BF5Procedure;
import exp.fluffynuar.truedarkness.procedures.BF4Procedure;
import exp.fluffynuar.truedarkness.procedures.BF3Procedure;
import exp.fluffynuar.truedarkness.procedures.BF2Procedure;
import exp.fluffynuar.truedarkness.procedures.BF1Procedure;
import exp.fluffynuar.truedarkness.procedures.BF0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlacksmiteForgeGUIScreen extends AbstractContainerScreen<BlacksmiteForgeGUIMenu> {
	private final static HashMap<String, Object> guistate = BlacksmiteForgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BlacksmiteForgeGUIScreen(BlacksmiteForgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/blacksmite_forge_gui.png");

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

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/blacksmite_forge_graph.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (BF0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/bf_0.png"), this.leftPos + 174, this.topPos + -1, 0, 0, 131, 166, 131, 166);
		}
		if (LavaProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/blacksmite_forge_lava.png"), this.leftPos + 30, this.topPos + 25, 0, 0, 9, 27, 9, 27);
		}
		if (BF1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/ancient_recipe_0.png"), this.leftPos + 192, this.topPos + 20, 0, 0, 98, 18, 98, 18);
		}
		if (BF2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/ancient_recipe_1.png"), this.leftPos + 192, this.topPos + 38, 0, 0, 98, 18, 98, 18);
		}
		if (BF3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/ancient_recipe_2.png"), this.leftPos + 192, this.topPos + 56, 0, 0, 98, 18, 98, 18);
		}
		if (BF4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/ancient_recipe_3.png"), this.leftPos + 192, this.topPos + 74, 0, 0, 98, 18, 98, 18);
		}
		if (BF5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/ancient_recipe_4.png"), this.leftPos + 192, this.topPos + 92, 0, 0, 98, 18, 98, 18);
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.blacksmite_forge_gui.label_blacksmite_forge"), 8, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.blacksmite_forge_gui.label_inventory"), 8, 73, -13421773, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}

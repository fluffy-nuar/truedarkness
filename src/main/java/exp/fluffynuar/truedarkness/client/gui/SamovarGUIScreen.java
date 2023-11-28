package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.SamovarGUIMenu;
import exp.fluffynuar.truedarkness.procedures.S4Procedure;
import exp.fluffynuar.truedarkness.procedures.S3Procedure;
import exp.fluffynuar.truedarkness.procedures.S2Procedure;
import exp.fluffynuar.truedarkness.procedures.S1Procedure;
import exp.fluffynuar.truedarkness.procedures.S0Procedure;
import exp.fluffynuar.truedarkness.procedures.BonfireProcedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class SamovarGUIScreen extends AbstractContainerScreen<SamovarGUIMenu> {
	private final static HashMap<String, Object> guistate = SamovarGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SamovarGUIScreen(SamovarGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/samovar_gui.png");

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

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/samovar_gui_graph.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (BonfireProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/samovar_gui_bonfire.png"), this.leftPos + 123, this.topPos + 51, 0, 0, 19, 16, 19, 16);
		}
		if (S0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/s_0.png"), this.leftPos + -131, this.topPos + 0, 0, 0, 131, 166, 131, 166);
		}
		if (S1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/s_1.png"), this.leftPos + -106, this.topPos + 14, 0, 0, 80, 18, 80, 18);
		}
		if (S2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/s_2.png"), this.leftPos + -106, this.topPos + 32, 0, 0, 80, 18, 80, 18);
		}
		if (S3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/s_3.png"), this.leftPos + -106, this.topPos + 50, 0, 0, 80, 18, 80, 18);
		}
		if (S4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/s_4.png"), this.leftPos + -106, this.topPos + 68, 0, 0, 80, 18, 80, 18);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.samovar_gui.label_samovar"), 8, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.samovar_gui.label_inventory"), 8, 73, -13421773, false);
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

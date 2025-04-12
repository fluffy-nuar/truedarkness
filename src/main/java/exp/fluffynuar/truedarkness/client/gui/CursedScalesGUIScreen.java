package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.CursedScalesGUIMenu;
import exp.fluffynuar.truedarkness.procedures.TypingCountProcProcedure;
import exp.fluffynuar.truedarkness.network.CursedScalesGUIButtonMessage;
import exp.fluffynuar.truedarkness.TruedarknessMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CursedScalesGUIScreen extends AbstractContainerScreen<CursedScalesGUIMenu> {
	private final static HashMap<String, Object> guistate = CursedScalesGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_buttom_gui;
	ImageButton imagebutton_arrow_top_gui;

	public CursedScalesGUIScreen(CursedScalesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/cursed_scales_gui.png");

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

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_scales_gui_layer.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

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

				TypingCountProcProcedure.execute(world, x, y, z), 69, 45, -14278828, false);
		guiGraphics.drawString(this.font,

				TypingCountProcProcedure.execute(world, x, y, z), 68, 44, -5635858, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_scales_gui.label_cursed_forge"), 8, 6, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.cursed_scales_gui.label_inventory"), 8, 73, -13421773, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_buttom_gui = new ImageButton(this.leftPos + 76, this.topPos + 57, 17, 11, 0, 0, 11, new ResourceLocation("truedarkness:textures/screens/atlas/imagebutton_arrow_buttom_gui.png"), 17, 22, e -> {
			if (true) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new CursedScalesGUIButtonMessage(0, x, y, z));
				CursedScalesGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_buttom_gui", imagebutton_arrow_buttom_gui);
		this.addRenderableWidget(imagebutton_arrow_buttom_gui);
		imagebutton_arrow_top_gui = new ImageButton(this.leftPos + 76, this.topPos + 27, 17, 11, 0, 0, 11, new ResourceLocation("truedarkness:textures/screens/atlas/imagebutton_arrow_top_gui.png"), 17, 22, e -> {
			if (true) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new CursedScalesGUIButtonMessage(1, x, y, z));
				CursedScalesGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_top_gui", imagebutton_arrow_top_gui);
		this.addRenderableWidget(imagebutton_arrow_top_gui);
	}
}

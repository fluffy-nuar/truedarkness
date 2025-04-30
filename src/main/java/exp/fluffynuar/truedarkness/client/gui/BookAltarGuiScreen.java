package exp.fluffynuar.truedarkness.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import exp.fluffynuar.truedarkness.world.inventory.BookAltarGuiMenu;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltarProcedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar7Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar6Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar5Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar4Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar3Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar2Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar1Procedure;
import exp.fluffynuar.truedarkness.procedures.VisualLockCursedAltar0Procedure;
import exp.fluffynuar.truedarkness.procedures.EstPredmetV4SLoteProcedure;
import exp.fluffynuar.truedarkness.procedures.EstPredmetV1SLoteProcedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class BookAltarGuiScreen extends AbstractContainerScreen<BookAltarGuiMenu> {
	private final static HashMap<String, Object> guistate = BookAltarGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BookAltarGuiScreen(BookAltarGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("truedarkness:textures/screens/book_altar_gui.png");

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

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer.png"), this.leftPos + -21, this.topPos + 0, 0, 0, 197, 166, 197, 166);

		if (VisualLockCursedAltarProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 84, this.topPos + 16, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltarProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 102, this.topPos + 16, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 120, this.topPos + 16, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 75, this.topPos + 34, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 93, this.topPos + 34, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 111, this.topPos + 34, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 129, this.topPos + 34, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 84, this.topPos + 52, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 102, this.topPos + 52, 0, 0, 18, 18, 18, 18);
		}
		if (VisualLockCursedAltar7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_gui_layer_blocked.png"), this.leftPos + 120, this.topPos + 52, 0, 0, 18, 18, 18, 18);
		}
		if (EstPredmetV1SLoteProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_manual_slot.png"), this.leftPos + 11, this.topPos + 52, 0, 0, 16, 16, 16, 16);
		}

		guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/cursed_altar_fangs_slot.png"), this.leftPos + -15, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		if (EstPredmetV4SLoteProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("truedarkness:textures/screens/slot_addon.png"), this.leftPos + -15, this.topPos + 52, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.book_altar_gui.label_inventory"), 8, 73, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.truedarkness.book_altar_gui.label_bookshelf"), 7, 6, -13421773, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

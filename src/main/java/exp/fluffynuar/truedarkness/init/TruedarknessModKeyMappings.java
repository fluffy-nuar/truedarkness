
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import exp.fluffynuar.truedarkness.network.ShowHideScrollMessage;
import exp.fluffynuar.truedarkness.network.DoubleJumpMessage;
import exp.fluffynuar.truedarkness.network.ActiveAbility3Message;
import exp.fluffynuar.truedarkness.network.ActiveAbility2Message;
import exp.fluffynuar.truedarkness.network.ActiveAbility1Message;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TruedarknessModKeyMappings {
	public static final KeyMapping DOUBLE_JUMP = new KeyMapping("key.truedarkness.double_jump", GLFW.GLFW_KEY_SPACE, "key.categories.truedarkness") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new DoubleJumpMessage(0, 0));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ACTIVE_ABILITY_1 = new KeyMapping("key.truedarkness.active_ability_1", GLFW.GLFW_KEY_RIGHT, "key.categories.truedarkness") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ACTIVE_ABILITY_1_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ACTIVE_ABILITY_1_LASTPRESS);
				TruedarknessMod.PACKET_HANDLER.sendToServer(new ActiveAbility1Message(1, dt));
				ActiveAbility1Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ACTIVE_ABILITY_2 = new KeyMapping("key.truedarkness.active_ability_2", GLFW.GLFW_KEY_M, "key.categories.truedarkness") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new ActiveAbility2Message(0, 0));
				ActiveAbility2Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ACTIVE_ABILITY_2_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ACTIVE_ABILITY_2_LASTPRESS);
				TruedarknessMod.PACKET_HANDLER.sendToServer(new ActiveAbility2Message(1, dt));
				ActiveAbility2Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SHOW_HIDE_SCROLL = new KeyMapping("key.truedarkness.show_hide_scroll", GLFW.GLFW_KEY_UNKNOWN, "key.categories.truedarkness") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new ShowHideScrollMessage(0, 0));
				ShowHideScrollMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ACTIVE_ABILITY_3 = new KeyMapping("key.truedarkness.active_ability_3", GLFW.GLFW_KEY_N, "key.categories.truedarkness") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new ActiveAbility3Message(0, 0));
				ActiveAbility3Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ACTIVE_ABILITY_3_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ACTIVE_ABILITY_3_LASTPRESS);
				TruedarknessMod.PACKET_HANDLER.sendToServer(new ActiveAbility3Message(1, dt));
				ActiveAbility3Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long ACTIVE_ABILITY_1_LASTPRESS = 0;
	private static long ACTIVE_ABILITY_2_LASTPRESS = 0;
	private static long ACTIVE_ABILITY_3_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DOUBLE_JUMP);
		event.register(ACTIVE_ABILITY_1);
		event.register(ACTIVE_ABILITY_2);
		event.register(SHOW_HIDE_SCROLL);
		event.register(ACTIVE_ABILITY_3);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DOUBLE_JUMP.consumeClick();
				ACTIVE_ABILITY_1.consumeClick();
				ACTIVE_ABILITY_2.consumeClick();
				SHOW_HIDE_SCROLL.consumeClick();
				ACTIVE_ABILITY_3.consumeClick();
			}
		}
	}
}

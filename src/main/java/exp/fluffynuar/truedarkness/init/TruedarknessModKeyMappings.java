
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

import exp.fluffynuar.truedarkness.network.UseMagicMessage;
import exp.fluffynuar.truedarkness.network.NosediveMessage;
import exp.fluffynuar.truedarkness.network.DoubleJumpMessage;
import exp.fluffynuar.truedarkness.network.DashMessage;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TruedarknessModKeyMappings {
	public static final KeyMapping DOUBLE_JUMP = new KeyMapping("key.truedarkness.double_jump", GLFW.GLFW_KEY_SPACE, "key.categories.gameplay") {
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
	public static final KeyMapping NOSEDIVE = new KeyMapping("key.truedarkness.nosedive", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new NosediveMessage(0, 0));
				NosediveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DASH = new KeyMapping("key.truedarkness.dash", GLFW.GLFW_KEY_SLASH, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new DashMessage(0, 0));
				DashMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_MAGIC = new KeyMapping("key.truedarkness.use_magic", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TruedarknessMod.PACKET_HANDLER.sendToServer(new UseMagicMessage(0, 0));
				UseMagicMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DOUBLE_JUMP);
		event.register(NOSEDIVE);
		event.register(DASH);
		event.register(USE_MAGIC);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DOUBLE_JUMP.consumeClick();
				NOSEDIVE.consumeClick();
				DASH.consumeClick();
				USE_MAGIC.consumeClick();
			}
		}
	}
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import exp.fluffynuar.truedarkness.client.gui.SamovarGUIScreen;
import exp.fluffynuar.truedarkness.client.gui.DarknessSpruceChestGUIScreen;
import exp.fluffynuar.truedarkness.client.gui.BlacksmiteForgeGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TruedarknessModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TruedarknessModMenus.BLACKSMITE_FORGE_GUI.get(), BlacksmiteForgeGUIScreen::new);
			MenuScreens.register(TruedarknessModMenus.SAMOVAR_GUI.get(), SamovarGUIScreen::new);
			MenuScreens.register(TruedarknessModMenus.DARKNESS_SPRUCE_CHEST_GUI.get(), DarknessSpruceChestGUIScreen::new);
		});
	}
}

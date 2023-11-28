
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import exp.fluffynuar.truedarkness.world.inventory.SamovarGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.DarknessSpruceChestGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.BlacksmiteForgeGUIMenu;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<MenuType<BlacksmiteForgeGUIMenu>> BLACKSMITE_FORGE_GUI = REGISTRY.register("blacksmite_forge_gui", () -> IForgeMenuType.create(BlacksmiteForgeGUIMenu::new));
	public static final RegistryObject<MenuType<SamovarGUIMenu>> SAMOVAR_GUI = REGISTRY.register("samovar_gui", () -> IForgeMenuType.create(SamovarGUIMenu::new));
	public static final RegistryObject<MenuType<DarknessSpruceChestGUIMenu>> DARKNESS_SPRUCE_CHEST_GUI = REGISTRY.register("darkness_spruce_chest_gui", () -> IForgeMenuType.create(DarknessSpruceChestGUIMenu::new));
}

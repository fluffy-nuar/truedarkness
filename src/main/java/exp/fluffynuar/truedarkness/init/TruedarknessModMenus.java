
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
import exp.fluffynuar.truedarkness.world.inventory.CursedWorkbenchGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.CursedScalesGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.CursedFurnaceGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.CursedCauldronNewGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.CursedCauldronGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.CursedAnvilGUIMenu;
import exp.fluffynuar.truedarkness.world.inventory.BlacksmiteForgeGUIMenu;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<MenuType<BlacksmiteForgeGUIMenu>> BLACKSMITE_FORGE_GUI = REGISTRY.register("blacksmite_forge_gui", () -> IForgeMenuType.create(BlacksmiteForgeGUIMenu::new));
	public static final RegistryObject<MenuType<SamovarGUIMenu>> SAMOVAR_GUI = REGISTRY.register("samovar_gui", () -> IForgeMenuType.create(SamovarGUIMenu::new));
	public static final RegistryObject<MenuType<DarknessSpruceChestGUIMenu>> DARKNESS_SPRUCE_CHEST_GUI = REGISTRY.register("darkness_spruce_chest_gui", () -> IForgeMenuType.create(DarknessSpruceChestGUIMenu::new));
	public static final RegistryObject<MenuType<CursedFurnaceGUIMenu>> CURSED_FURNACE_GUI = REGISTRY.register("cursed_furnace_gui", () -> IForgeMenuType.create(CursedFurnaceGUIMenu::new));
	public static final RegistryObject<MenuType<CursedWorkbenchGUIMenu>> CURSED_WORKBENCH_GUI = REGISTRY.register("cursed_workbench_gui", () -> IForgeMenuType.create(CursedWorkbenchGUIMenu::new));
	public static final RegistryObject<MenuType<CursedCauldronGUIMenu>> CURSED_CAULDRON_GUI = REGISTRY.register("cursed_cauldron_gui", () -> IForgeMenuType.create(CursedCauldronGUIMenu::new));
	public static final RegistryObject<MenuType<CursedAnvilGUIMenu>> CURSED_ANVIL_GUI = REGISTRY.register("cursed_anvil_gui", () -> IForgeMenuType.create(CursedAnvilGUIMenu::new));
	public static final RegistryObject<MenuType<CursedScalesGUIMenu>> CURSED_SCALES_GUI = REGISTRY.register("cursed_scales_gui", () -> IForgeMenuType.create(CursedScalesGUIMenu::new));
	public static final RegistryObject<MenuType<CursedCauldronNewGUIMenu>> CURSED_CAULDRON_NEW_GUI = REGISTRY.register("cursed_cauldron_new_gui", () -> IForgeMenuType.create(CursedCauldronNewGUIMenu::new));
}

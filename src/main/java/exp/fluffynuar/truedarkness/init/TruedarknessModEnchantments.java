
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import exp.fluffynuar.truedarkness.enchantment.FastCarvingEnchantment;
import exp.fluffynuar.truedarkness.enchantment.CurseOfMutingEnchantment;
import exp.fluffynuar.truedarkness.enchantment.BestVesselEnchantment;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TruedarknessMod.MODID);
	public static final RegistryObject<Enchantment> CURSE_OF_MUTING = REGISTRY.register("curse_of_muting", () -> new CurseOfMutingEnchantment());
	public static final RegistryObject<Enchantment> BEST_VESSEL = REGISTRY.register("best_vessel", () -> new BestVesselEnchantment());
	public static final RegistryObject<Enchantment> FAST_CARVING = REGISTRY.register("fast_carving", () -> new FastCarvingEnchantment());
}

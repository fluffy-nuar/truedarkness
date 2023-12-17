
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import exp.fluffynuar.truedarkness.enchantment.WorldBlockBreakerEnchantment;
import exp.fluffynuar.truedarkness.enchantment.CurseOfMutingEnchantment;
import exp.fluffynuar.truedarkness.enchantment.CurseOfFangEnchantment;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TruedarknessMod.MODID);
	public static final RegistryObject<Enchantment> WORLD_BLOCK_BREAKER = REGISTRY.register("world_block_breaker", () -> new WorldBlockBreakerEnchantment());
	public static final RegistryObject<Enchantment> CURSE_OF_FANG = REGISTRY.register("curse_of_fang", () -> new CurseOfFangEnchantment());
	public static final RegistryObject<Enchantment> CURSE_OF_MUTING = REGISTRY.register("curse_of_muting", () -> new CurseOfMutingEnchantment());
}

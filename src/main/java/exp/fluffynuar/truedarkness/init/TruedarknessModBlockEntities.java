
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import exp.fluffynuar.truedarkness.block.entity.SamovarActiveBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.DarknessSpruceChestBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedBubbleEmptyBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedBubbleBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedBubbleBlockBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.BlacksmiteForgeBlockEntity;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_BUBBLE_BLOCK = register("corrupted_bubble_block", TruedarknessModBlocks.CORRUPTED_BUBBLE_BLOCK, CorruptedBubbleBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_BUBBLE_EMPTY = register("corrupted_bubble_empty", TruedarknessModBlocks.CORRUPTED_BUBBLE_EMPTY, CorruptedBubbleEmptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACKSMITE_FORGE = register("blacksmite_forge", TruedarknessModBlocks.BLACKSMITE_FORGE, BlacksmiteForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARKNESS_SPRUCE_CHEST = register("darkness_spruce_chest", TruedarknessModBlocks.DARKNESS_SPRUCE_CHEST, DarknessSpruceChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SAMOVAR_ACTIVE = register("samovar_active", TruedarknessModBlocks.SAMOVAR_ACTIVE, SamovarActiveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_BUBBLE = register("corrupted_bubble", TruedarknessModBlocks.CORRUPTED_BUBBLE, CorruptedBubbleBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

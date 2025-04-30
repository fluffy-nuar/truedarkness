
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import exp.fluffynuar.truedarkness.block.entity.UnclearSandOfMissingBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.UnclearRenteriaSandBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.UnclearDeepslateSandBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.StarTeleporterBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.SamovarActiveBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.DarknessSpruceChestBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CursedWorkbenchBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CursedPipeBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CursedLecternBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CursedFurnaceBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CursedCauldronBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CursedAnvilBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedSculkCatalystBloomingBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedSculkBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedReactorBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedLightBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedCampfireBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedBubbleEmptyBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.CorruptedBubbleBlockBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.BloodContainerBlockEntity;
import exp.fluffynuar.truedarkness.block.entity.BlacksmiteForgeBlockEntity;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TruedarknessModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DARKNESS_SPRUCE_CHEST = register("darkness_spruce_chest", TruedarknessModBlocks.DARKNESS_SPRUCE_CHEST, DarknessSpruceChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACKSMITE_FORGE = register("blacksmite_forge", TruedarknessModBlocks.BLACKSMITE_FORGE, BlacksmiteForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNCLEAR_SAND_OF_MISSING = register("unclear_sand_of_missing", TruedarknessModBlocks.UNCLEAR_SAND_OF_MISSING, UnclearSandOfMissingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SAMOVAR_ACTIVE = register("samovar_active", TruedarknessModBlocks.SAMOVAR_ACTIVE, SamovarActiveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNCLEAR_CORRUPT = register("unclear_corrupt", TruedarknessModBlocks.UNCLEAR_CORRUPT, CorruptedSculkBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_BUBBLE_BLOCK = register("corrupted_bubble_block", TruedarknessModBlocks.CORRUPTED_BUBBLE_BLOCK, CorruptedBubbleBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_BUBBLE_EMPTY = register("corrupted_bubble_empty", TruedarknessModBlocks.CORRUPTED_BUBBLE_EMPTY, CorruptedBubbleEmptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNCLEAR_RENTERIA_SAND = register("unclear_renteria_sand", TruedarknessModBlocks.UNCLEAR_RENTERIA_SAND, UnclearRenteriaSandBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_REACTOR = register("corrupted_reactor", TruedarknessModBlocks.CORRUPTED_REACTOR, CorruptedReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNCLEAR_DEEPSLATE_SAND = register("unclear_deepslate_sand", TruedarknessModBlocks.UNCLEAR_DEEPSLATE_SAND, UnclearDeepslateSandBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_SCULK_CATALYST_BLOOMING = register("corrupted_sculk_catalyst_blooming", TruedarknessModBlocks.CORRUPTED_SCULK_CATALYST_BLOOMING, CorruptedSculkCatalystBloomingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_FURNACE = register("cursed_furnace", TruedarknessModBlocks.CURSED_FURNACE, CursedFurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLOOD_CONTAINER = register("blood_container", TruedarknessModBlocks.BLOOD_CONTAINER, BloodContainerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_PIPE = register("cursed_pipe", TruedarknessModBlocks.CURSED_PIPE, CursedPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STAR_TELEPORTER = register("star_teleporter", TruedarknessModBlocks.STAR_TELEPORTER, StarTeleporterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_WORKBENCH = register("cursed_workbench", TruedarknessModBlocks.CURSED_WORKBENCH, CursedWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_CAULDRON = register("cursed_cauldron", TruedarknessModBlocks.CURSED_CAULDRON, CursedCauldronBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_ANVIL = register("cursed_anvil", TruedarknessModBlocks.CURSED_ANVIL, CursedAnvilBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_LIGHT = register("corrupted_light", TruedarknessModBlocks.CORRUPTED_LIGHT, CorruptedLightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORRUPTED_CAMPFIRE = register("corrupted_campfire", TruedarknessModBlocks.CORRUPTED_CAMPFIRE, CorruptedCampfireBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_LECTERN = register("cursed_lectern", TruedarknessModBlocks.CURSED_LECTERN, CursedLecternBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

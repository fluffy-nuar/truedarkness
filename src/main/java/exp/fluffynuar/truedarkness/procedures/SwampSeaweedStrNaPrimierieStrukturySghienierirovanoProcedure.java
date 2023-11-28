package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SwampSeaweedStrNaPrimierieStrukturySghienierirovanoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 0)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_seaweed"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 1, y, z + 0), BlockPos.containing(x + 1, y, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_seaweed"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 1, y, z + 1), BlockPos.containing(x + 1, y, z + 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (world.getBlockState(BlockPos.containing(x + 0, y - 1, z - 1)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_seaweed"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 0, y, z - 1), BlockPos.containing(x + 0, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_seaweed"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_seaweed"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 1, y, z - 1), BlockPos.containing(x + 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CoralDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.WATER.defaultBlockState() || (world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.WATER.defaultBlockState())
				&& world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "coral_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, x - 2), BlockPos.containing(x - 2, y, x - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			return true;
		}
		return false;
	}
}

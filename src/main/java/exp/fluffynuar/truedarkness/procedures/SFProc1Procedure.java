package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SFProc1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 10) < 6) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
						}
					}
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
						}
					}
				}
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
						}
					}
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
						}
					}
				}
			}
		}
	}
}

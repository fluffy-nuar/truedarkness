package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class DarkCrystalAxePriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			TruedarknessMod.queueServerWork(80, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					world.addParticle(ParticleTypes.FLASH, x, (y + 1), z, 0, 0, 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					DarkCrystalAxePriShchielchkiePKMPoBlokuProcedure.execute(world, x, y, z);
				}
			});
		}
	}
}

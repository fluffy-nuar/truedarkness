package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.TruedarknessMod;

public class CursedSpellProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Direction random = Direction.NORTH;
		double add_count = 0;
		random = Direction.getRandom(RandomSource.create());
		if (Direction.getRandom(RandomSource.create()) == Direction.NORTH || Direction.getRandom(RandomSource.create()) == Direction.SOUTH) {
			add_count = 0;
			while (add_count < 24) {
				add_count = add_count + 1;
				AddAddProjectileProcProcedure.execute(world, x, y, z - 6 + add_count * 0.5);
			}
		} else if (Direction.getRandom(RandomSource.create()) == Direction.EAST || Direction.getRandom(RandomSource.create()) == Direction.WEST) {
			add_count = 0;
			while (add_count < 24) {
				add_count = add_count + 1;
				AddAddProjectileProcProcedure.execute(world, x - 6 + add_count * 0.5, y, z);
			}
		} else if (Direction.getRandom(RandomSource.create()) == Direction.DOWN || Direction.getRandom(RandomSource.create()) == Direction.UP) {
			while (add_count < 24) {
				AddAddProjectileProcProcedure.execute(world, x, y - 6 + add_count * 0.5, z);
				add_count = add_count + 1;
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.HOSTILE, (float) 0.5, (float) 0.5);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.HOSTILE, (float) 0.5, (float) 0.5, false);
			}
		}
		TruedarknessMod.queueServerWork(16, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.HOSTILE, (float) 0.5, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.HOSTILE, (float) 0.5, (float) 0.5, false);
				}
			}
		});
	}
}

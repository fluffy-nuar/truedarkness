package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class DarknessSpruceBoxKoghdaBlokRazrushienIghrokomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.DARKNESS_SPRUCE_BOX.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= 3) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
						for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.AQUAMARINE_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 2); index1++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CVETALIY_GRAIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
						for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 0, 1); index2++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.DARK_CRYSTAL_SHARD.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
						for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 1, 1); index3++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.LAVENDER_PETAL.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 3) {
						for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 1, 4); index4++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.SAND));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 6) {
						for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 1, 10); index5++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.COBBLESTONE));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index6 = 0; index6 < Mth.nextInt(RandomSource.create(), 1, 4); index6++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.SWAMP_POLLEN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index7 = 0; index7 < Mth.nextInt(RandomSource.create(), 3, 5); index7++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SWAMP_SAND.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index8 = 0; index8 < Mth.nextInt(RandomSource.create(), 2, 4); index8++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.LIGHTED_BERRY.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index9 = 0; index9 < Mth.nextInt(RandomSource.create(), 3, 8); index9++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SANDSTONE_OF_MISSING.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index10 = 0; index10 < Mth.nextInt(RandomSource.create(), 3, 10); index10++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SWAMP_LILY.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index11 = 0; index11 < Mth.nextInt(RandomSource.create(), 4, 8); index11++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.SWAMP_POLLEN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index12 = 0; index12 < Mth.nextInt(RandomSource.create(), 2, 4); index12++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.LIGHTED_BERRY.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= 8) {
						for (int index13 = 0; index13 < Mth.nextInt(RandomSource.create(), 3, 5); index13++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SWAMP_SAND.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}

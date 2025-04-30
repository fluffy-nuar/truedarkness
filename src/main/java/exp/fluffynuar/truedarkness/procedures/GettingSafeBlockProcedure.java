package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class GettingSafeBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (y < 128 && y > 0 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.getBlockState(BlockPos.containing(x, y + 0, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, y, z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
			}
			{
				double _setval = x;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.YteriaSpawnX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = y;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.YteriaSpawnY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = z;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.YteriaSpawnZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.YteriaSafeBlock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:ambient.strange_gorn")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:ambient.strange_gorn")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
		}
	}
}

package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CorruptedSkeletonPriNachalnomPrizyvieSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.7, z)).canOcclude()) {
			entity.getPersistentData().putBoolean("spawning", true);
			entity.getPersistentData().putDouble("his_y", (entity.getY()));
			entity.getPersistentData().putDouble("spawn_time", 60);
			entity.setNoGravity((entity.getPersistentData().getBoolean("spawning")));
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data modify entity @s Invulnerable set value 1");
				}
			}
		}
	}
}

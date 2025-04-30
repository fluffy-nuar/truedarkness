package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

public class GlowBugPriShchielchkiePKMPoSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) && sourceentity.isShiftKeyDown()) {
			if (entity.getPersistentData().getBoolean("sit") == true) {
				entity.getPersistentData().putBoolean("sit", false);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.GLOW, x, y, z, 15, 0.1, 0.1, 0.1, 0.02);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("entity.truedarkness.glow_bug.command.sit").getString())), true);
			} else if (entity.getPersistentData().getBoolean("sit") == false) {
				entity.getPersistentData().putBoolean("sit", true);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.GLOW, x, y, z, 15, 0.1, 0.1, 0.1, 0.02);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("entity.truedarkness.glow_bug.command.follow").getString())), true);
			}
		}
	}
}

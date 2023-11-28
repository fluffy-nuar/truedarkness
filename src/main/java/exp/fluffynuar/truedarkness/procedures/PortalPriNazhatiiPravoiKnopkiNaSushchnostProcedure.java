package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;

public class PortalPriNazhatiiPravoiKnopkiNaSushchnostProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}

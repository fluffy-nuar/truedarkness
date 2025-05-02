package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class GetTyleOfCooldown8Procedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double add_int = 0;
		double cooldown_max = 0;
		double add_int_1 = 0;
		add_int = 8;
		cooldown_max = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getDouble(("Line" + Math.round(add_int) + "Cooldown"));
		if ((entity instanceof Player _plrCldRem3
				? _plrCldRem3.getCooldowns()
						.getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:shiny_eridium_"
								+ ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))))
								.toLowerCase(java.util.Locale.ENGLISH))), 0f)
						* 100
				: 0) == 0) {
			return 0;
		} else {
			while (((entity instanceof Player _plrCldRem6
					? _plrCldRem6.getCooldowns()
							.getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:shiny_eridium_"
									+ ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))))
									.toLowerCase(java.util.Locale.ENGLISH))), 0f)
							* 100
					: 0)) > (((cooldown_max / 18) * add_int_1))
					&& ((entity instanceof Player _plrCldRem6
							? _plrCldRem6.getCooldowns().getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:shiny_eridium_"
									+ ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))))
									.toLowerCase(java.util.Locale.ENGLISH))), 0f) * 100
							: 0)) < (((cooldown_max / 18) * (add_int_1 + 1)))) {
				add_int_1 = add_int_1 + 1;
				if (!(((entity instanceof Player _plrCldRem10
						? _plrCldRem10.getCooldowns().getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:shiny_eridium_"
								+ ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString(("Line" + Math.round(add_int)))))
								.toLowerCase(java.util.Locale.ENGLISH))), 0f) * 100
						: 0)) > (((cooldown_max / 18) * add_int_1))
						&& ((entity instanceof Player _plrCldRem10
								? _plrCldRem10.getCooldowns()
										.getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation(
												(("truedarkness:shiny_eridium_" + ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
														.getString(("Line" + Math.round(add_int))))).toLowerCase(java.util.Locale.ENGLISH))),
												0f)
										* 100
								: 0)) < (((cooldown_max / 18) * (add_int_1 + 1))))) {
					return add_int_1;
				}
				continue;
			}
		}
		return 0;
	}
}

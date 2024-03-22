
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> INFOABOUTSKREZHAL = GameRules.register("infoAboutSkrezhal", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> DISTABILIZATORWORK = GameRules.register("distabilizatorWork", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> SANDREMNANTSSUCCES = GameRules.register("sandRemnantsSucces", GameRules.Category.DROPS, GameRules.IntegerValue.create(50));
	public static final GameRules.Key<GameRules.BooleanValue> BUBBLES = GameRules.register("bubbles", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}

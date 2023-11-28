
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> INFOABOUTSKREZHAL = GameRules.register("infoAboutSkrezhal", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SKREZHALWAYFROMYTERIA = GameRules.register("skrezhalWayFromYteria", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DISTABILIZATORWORK = GameRules.register("distabilizatorWork", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> SCULKMANALIMIT = GameRules.register("sculkManaLimit", GameRules.Category.PLAYER, GameRules.IntegerValue.create(50));
	public static final GameRules.Key<GameRules.IntegerValue> SANDREMNANTSSUCCES = GameRules.register("sandRemnantsSucces", GameRules.Category.DROPS, GameRules.IntegerValue.create(50));
	public static final GameRules.Key<GameRules.BooleanValue> DESIRETOTEST = GameRules.register("desireToTest", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> SOUL_COUNT = GameRules.register("soulCount", GameRules.Category.PLAYER, GameRules.IntegerValue.create(15));
	public static final GameRules.Key<GameRules.IntegerValue> DASH_COOLDOWN = GameRules.register("dashCooldown", GameRules.Category.PLAYER, GameRules.IntegerValue.create(30));
	public static final GameRules.Key<GameRules.IntegerValue> NOSEDIVE_COOLDOWN = GameRules.register("nosediveCooldown", GameRules.Category.PLAYER, GameRules.IntegerValue.create(200));
	public static final GameRules.Key<GameRules.IntegerValue> DOUBLE_JUMP_COOLDOWN = GameRules.register("doubleJumpCooldown", GameRules.Category.PLAYER, GameRules.IntegerValue.create(60));
	public static final GameRules.Key<GameRules.IntegerValue> HIDE_MODE_COOLDOWN = GameRules.register("hideModeCooldown", GameRules.Category.PLAYER, GameRules.IntegerValue.create(300));
	public static final GameRules.Key<GameRules.BooleanValue> BUBBLES = GameRules.register("bubbles", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}

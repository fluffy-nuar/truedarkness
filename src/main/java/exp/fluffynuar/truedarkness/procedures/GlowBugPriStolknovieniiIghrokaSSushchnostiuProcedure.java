package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class GlowBugPriStolknovieniiIghrokaSSushchnostiuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.THE_ALIVE.get(), 60, 1));
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 1));
					if (!(entityiterator instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:friend_of_pickaxe_advancement"))).isDone())) {
						if (entityiterator instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:friend_of_pickaxe_advancement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		}
	}
}


package exp.fluffynuar.truedarkness.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.procedures.CorruptedHandUsloviieGienieratsiiSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedHandNaNachalnomPoiavlieniiSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedHandKoghdaSushchnostUmiraietProcedure;
import exp.fluffynuar.truedarkness.procedures.AttackPlayerProcProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class CorruptedHandEntity extends Monster {
	public CorruptedHandEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TruedarknessModEntities.CORRUPTED_HAND.get(), world);
	}

	public CorruptedHandEntity(EntityType<CorruptedHandEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CorruptedHandEntity.this.getX();
				double y = CorruptedHandEntity.this.getY();
				double z = CorruptedHandEntity.this.getZ();
				Entity entity = CorruptedHandEntity.this;
				Level world = CorruptedHandEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedHandEntity.this.getX();
				double y = CorruptedHandEntity.this.getY();
				double z = CorruptedHandEntity.this.getZ();
				Entity entity = CorruptedHandEntity.this;
				Level world = CorruptedHandEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(TruedarknessModBlocks.CORRUPT.get()));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER))
			return false;
		if (damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		CorruptedHandKoghdaSushchnostUmiraietProcedure.execute(source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		CorruptedHandNaNachalnomPoiavlieniiSushchnostiProcedure.execute(this);
		return retval;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init() {
		SpawnPlacements.register(TruedarknessModEntities.CORRUPTED_HAND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return CorruptedHandUsloviieGienieratsiiSushchnostiProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 500);
		builder = builder.add(Attributes.ARMOR, 64);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 19);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 10);
		return builder;
	}
}

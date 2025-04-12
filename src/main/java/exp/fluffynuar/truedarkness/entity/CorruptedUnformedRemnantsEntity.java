
package exp.fluffynuar.truedarkness.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.procedures.SpawningCooldownProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedSkeletonPriObnovlieniiTikaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedSkeletonPriNachalnomPrizyvieSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedHumanPriRanieniiSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.AttackPlayerProcUndeadProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class CorruptedUnformedRemnantsEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_aggresive = SynchedEntityData.defineId(CorruptedUnformedRemnantsEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_spawning = SynchedEntityData.defineId(CorruptedUnformedRemnantsEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.defineId(CorruptedUnformedRemnantsEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_his_y = SynchedEntityData.defineId(CorruptedUnformedRemnantsEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_spawn_time = SynchedEntityData.defineId(CorruptedUnformedRemnantsEntity.class, EntityDataSerializers.INT);

	public CorruptedUnformedRemnantsEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TruedarknessModEntities.CORRUPTED_UNFORMED_REMNANTS.get(), world);
	}

	public CorruptedUnformedRemnantsEntity(EntityType<CorruptedUnformedRemnantsEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_aggresive, false);
		this.entityData.define(DATA_spawning, true);
		this.entityData.define(DATA_timer, 60);
		this.entityData.define(DATA_his_y, 0);
		this.entityData.define(DATA_spawn_time, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canUse() && SpawningCooldownProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canContinueToUse() && SpawningCooldownProcedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canUse() && SpawningCooldownProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canContinueToUse() && SpawningCooldownProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.5) {
			@Override
			public boolean canUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canUse() && SpawningCooldownProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canContinueToUse() && SpawningCooldownProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canUse() && SpawningCooldownProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canContinueToUse() && SpawningCooldownProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canUse() && AttackPlayerProcUndeadProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedUnformedRemnantsEntity.this.getX();
				double y = CorruptedUnformedRemnantsEntity.this.getY();
				double z = CorruptedUnformedRemnantsEntity.this.getZ();
				Entity entity = CorruptedUnformedRemnantsEntity.this;
				Level world = CorruptedUnformedRemnantsEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcUndeadProcedure.execute(entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_skeleton.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_skeleton.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_seleton.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_skeleton.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		CorruptedHumanPriRanieniiSushchnostiProcedure.execute(world, x, y, z, sourceentity);
		return super.hurt(damagesource, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		CorruptedSkeletonPriNachalnomPrizyvieSushchnostiProcedure.execute(world, this.getX(), this.getZ(), this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Dataaggresive", this.entityData.get(DATA_aggresive));
		compound.putBoolean("Dataspawning", this.entityData.get(DATA_spawning));
		compound.putInt("Datatimer", this.entityData.get(DATA_timer));
		compound.putInt("Datahis_y", this.entityData.get(DATA_his_y));
		compound.putInt("Dataspawn_time", this.entityData.get(DATA_spawn_time));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataaggresive"))
			this.entityData.set(DATA_aggresive, compound.getBoolean("Dataaggresive"));
		if (compound.contains("Dataspawning"))
			this.entityData.set(DATA_spawning, compound.getBoolean("Dataspawning"));
		if (compound.contains("Datatimer"))
			this.entityData.set(DATA_timer, compound.getInt("Datatimer"));
		if (compound.contains("Datahis_y"))
			this.entityData.set(DATA_his_y, compound.getInt("Datahis_y"));
		if (compound.contains("Dataspawn_time"))
			this.entityData.set(DATA_spawn_time, compound.getInt("Dataspawn_time"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CorruptedSkeletonPriObnovlieniiTikaSushchnostiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.31);
		builder = builder.add(Attributes.MAX_HEALTH, 7);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 22);
		return builder;
	}
}


package exp.fluffynuar.truedarkness.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
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
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import exp.fluffynuar.truedarkness.procedures.EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedAssassinPriObnovlieniiTikaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.AttackPlayerProcProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class CorruptedAssassinEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_aggresive = SynchedEntityData.defineId(CorruptedAssassinEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.defineId(CorruptedAssassinEntity.class, EntityDataSerializers.INT);

	public CorruptedAssassinEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TruedarknessModEntities.CORRUPTED_ASSASSIN.get(), world);
	}

	public CorruptedAssassinEntity(EntityType<CorruptedAssassinEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 8;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_aggresive, false);
		this.entityData.define(DATA_timer, 0);
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
				double x = CorruptedAssassinEntity.this.getX();
				double y = CorruptedAssassinEntity.this.getY();
				double z = CorruptedAssassinEntity.this.getZ();
				Entity entity = CorruptedAssassinEntity.this;
				Level world = CorruptedAssassinEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedAssassinEntity.this.getX();
				double y = CorruptedAssassinEntity.this.getY();
				double z = CorruptedAssassinEntity.this.getZ();
				Entity entity = CorruptedAssassinEntity.this;
				Level world = CorruptedAssassinEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CorruptedAssassinEntity.this.getX();
				double y = CorruptedAssassinEntity.this.getY();
				double z = CorruptedAssassinEntity.this.getZ();
				Entity entity = CorruptedAssassinEntity.this;
				Level world = CorruptedAssassinEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedAssassinEntity.this.getX();
				double y = CorruptedAssassinEntity.this.getY();
				double z = CorruptedAssassinEntity.this.getZ();
				Entity entity = CorruptedAssassinEntity.this;
				Level world = CorruptedAssassinEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_skeleton.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_creature.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_creature.death"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Dataaggresive", this.entityData.get(DATA_aggresive));
		compound.putInt("Datatimer", this.entityData.get(DATA_timer));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataaggresive"))
			this.entityData.set(DATA_aggresive, compound.getBoolean("Dataaggresive"));
		if (compound.contains("Datatimer"))
			this.entityData.set(DATA_timer, compound.getInt("Datatimer"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CorruptedAssassinPriObnovlieniiTikaSushchnostiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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
		SpawnPlacements.register(TruedarknessModEntities.CORRUPTED_ASSASSIN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.execute();
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.28);
		builder = builder.add(Attributes.MAX_HEALTH, 21);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

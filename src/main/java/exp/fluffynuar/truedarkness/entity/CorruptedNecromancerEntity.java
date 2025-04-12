
package exp.fluffynuar.truedarkness.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
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

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.procedures.EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedNecromancerPriObnovlieniiTikaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedNecromancerPriNachalnomPrizyvieSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedHumanPriRanieniiSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.AttackPlayerProcProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class CorruptedNecromancerEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.defineId(CorruptedNecromancerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_aggresive = SynchedEntityData.defineId(CorruptedNecromancerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_limit_regeneration = SynchedEntityData.defineId(CorruptedNecromancerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_limit = SynchedEntityData.defineId(CorruptedNecromancerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_spawn_time = SynchedEntityData.defineId(CorruptedNecromancerEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();

	public CorruptedNecromancerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TruedarknessModEntities.CORRUPTED_NECROMANCER.get(), world);
	}

	public CorruptedNecromancerEntity(EntityType<CorruptedNecromancerEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 15;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TruedarknessModItems.DARK_CRYSTAL_SHARD.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(TruedarknessModItems.ERIDIUM_SHARD.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_timer, 0);
		this.entityData.define(DATA_aggresive, false);
		this.entityData.define(DATA_limit_regeneration, 0);
		this.entityData.define(DATA_limit, 0);
		this.entityData.define(DATA_spawn_time, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, (float) 4, 1, 1.5) {
			@Override
			public boolean canUse() {
				double x = CorruptedNecromancerEntity.this.getX();
				double y = CorruptedNecromancerEntity.this.getY();
				double z = CorruptedNecromancerEntity.this.getZ();
				Entity entity = CorruptedNecromancerEntity.this;
				Level world = CorruptedNecromancerEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedNecromancerEntity.this.getX();
				double y = CorruptedNecromancerEntity.this.getY();
				double z = CorruptedNecromancerEntity.this.getZ();
				Entity entity = CorruptedNecromancerEntity.this;
				Level world = CorruptedNecromancerEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 10) {
			@Override
			public boolean canUse() {
				double x = CorruptedNecromancerEntity.this.getX();
				double y = CorruptedNecromancerEntity.this.getY();
				double z = CorruptedNecromancerEntity.this.getZ();
				Entity entity = CorruptedNecromancerEntity.this;
				Level world = CorruptedNecromancerEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedNecromancerEntity.this.getX();
				double y = CorruptedNecromancerEntity.this.getY();
				double z = CorruptedNecromancerEntity.this.getZ();
				Entity entity = CorruptedNecromancerEntity.this;
				Level world = CorruptedNecromancerEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.5));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.corrupted_creature.ambient"));
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
		CorruptedNecromancerPriNachalnomPrizyvieSushchnostiProcedure.execute(world, this.getX(), this.getZ(), this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datatimer", this.entityData.get(DATA_timer));
		compound.putBoolean("Dataaggresive", this.entityData.get(DATA_aggresive));
		compound.putInt("Datalimit_regeneration", this.entityData.get(DATA_limit_regeneration));
		compound.putInt("Datalimit", this.entityData.get(DATA_limit));
		compound.putInt("Dataspawn_time", this.entityData.get(DATA_spawn_time));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datatimer"))
			this.entityData.set(DATA_timer, compound.getInt("Datatimer"));
		if (compound.contains("Dataaggresive"))
			this.entityData.set(DATA_aggresive, compound.getBoolean("Dataaggresive"));
		if (compound.contains("Datalimit_regeneration"))
			this.entityData.set(DATA_limit_regeneration, compound.getInt("Datalimit_regeneration"));
		if (compound.contains("Datalimit"))
			this.entityData.set(DATA_limit, compound.getInt("Datalimit"));
		if (compound.contains("Dataspawn_time"))
			this.entityData.set(DATA_spawn_time, compound.getInt("Dataspawn_time"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CorruptedNecromancerPriObnovlieniiTikaSushchnostiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
		SpawnPlacements.register(TruedarknessModEntities.CORRUPTED_NECROMANCER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.execute();
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.32);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

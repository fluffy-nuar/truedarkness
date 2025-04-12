
package exp.fluffynuar.truedarkness.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
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
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
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

import exp.fluffynuar.truedarkness.procedures.EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedSkeletonPriNachalnomPrizyvieSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedMagePriObnovlieniiTikaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedHumanPriRanieniiSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.AttackPlayerProcProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class CorruptedMageEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_aggresive = SynchedEntityData.defineId(CorruptedMageEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.defineId(CorruptedMageEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_spawn_time = SynchedEntityData.defineId(CorruptedMageEntity.class, EntityDataSerializers.INT);

	public CorruptedMageEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TruedarknessModEntities.CORRUPTED_MAGE.get(), world);
	}

	public CorruptedMageEntity(EntityType<CorruptedMageEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 12;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(TruedarknessModItems.ERIDIUM_BONE.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.LEATHER_HELMET));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(TruedarknessModItems.ERIDIUM_SHARD.get()));
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
		this.entityData.define(DATA_spawn_time, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, (float) 4, 1, 1.5) {
			@Override
			public boolean canUse() {
				double x = CorruptedMageEntity.this.getX();
				double y = CorruptedMageEntity.this.getY();
				double z = CorruptedMageEntity.this.getZ();
				Entity entity = CorruptedMageEntity.this;
				Level world = CorruptedMageEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedMageEntity.this.getX();
				double y = CorruptedMageEntity.this.getY();
				double z = CorruptedMageEntity.this.getZ();
				Entity entity = CorruptedMageEntity.this;
				Level world = CorruptedMageEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 10) {
			@Override
			public boolean canUse() {
				double x = CorruptedMageEntity.this.getX();
				double y = CorruptedMageEntity.this.getY();
				double z = CorruptedMageEntity.this.getZ();
				Entity entity = CorruptedMageEntity.this;
				Level world = CorruptedMageEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedMageEntity.this.getX();
				double y = CorruptedMageEntity.this.getY();
				double z = CorruptedMageEntity.this.getZ();
				Entity entity = CorruptedMageEntity.this;
				Level world = CorruptedMageEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
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
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk.step")), 0.15f, 1);
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
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
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
		compound.putInt("Datatimer", this.entityData.get(DATA_timer));
		compound.putInt("Dataspawn_time", this.entityData.get(DATA_spawn_time));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataaggresive"))
			this.entityData.set(DATA_aggresive, compound.getBoolean("Dataaggresive"));
		if (compound.contains("Datatimer"))
			this.entityData.set(DATA_timer, compound.getInt("Datatimer"));
		if (compound.contains("Dataspawn_time"))
			this.entityData.set(DATA_spawn_time, compound.getInt("Dataspawn_time"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CorruptedMagePriObnovlieniiTikaSushchnostiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
		SpawnPlacements.register(TruedarknessModEntities.CORRUPTED_MAGE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.execute();
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 11);
		return builder;
	}
}

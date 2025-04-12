
package exp.fluffynuar.truedarkness.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.procedures.EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedHumanPriRanieniiSushchnostiProcedure;
import exp.fluffynuar.truedarkness.procedures.AttackPlayerProcProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;

public class CorruptedHumanEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_aggresive = SynchedEntityData.defineId(CorruptedHumanEntity.class, EntityDataSerializers.BOOLEAN);

	public CorruptedHumanEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TruedarknessModEntities.CORRUPTED_HUMAN.get(), world);
	}

	public CorruptedHumanEntity(EntityType<CorruptedHumanEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 6;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.STONE_PICKAXE));
		this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.STONE_SWORD));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.CHAINMAIL_BOOTS));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_aggresive, false);
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
				double x = CorruptedHumanEntity.this.getX();
				double y = CorruptedHumanEntity.this.getY();
				double z = CorruptedHumanEntity.this.getZ();
				Entity entity = CorruptedHumanEntity.this;
				Level world = CorruptedHumanEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedHumanEntity.this.getX();
				double y = CorruptedHumanEntity.this.getY();
				double z = CorruptedHumanEntity.this.getZ();
				Entity entity = CorruptedHumanEntity.this;
				Level world = CorruptedHumanEntity.this.level();
				return super.canContinueToUse() && AttackPlayerProcProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CorruptedHumanEntity.this.getX();
				double y = CorruptedHumanEntity.this.getY();
				double z = CorruptedHumanEntity.this.getZ();
				Entity entity = CorruptedHumanEntity.this;
				Level world = CorruptedHumanEntity.this.level();
				return super.canUse() && AttackPlayerProcProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CorruptedHumanEntity.this.getX();
				double y = CorruptedHumanEntity.this.getY();
				double z = CorruptedHumanEntity.this.getZ();
				Entity entity = CorruptedHumanEntity.this;
				Level world = CorruptedHumanEntity.this.level();
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
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Dataaggresive", this.entityData.get(DATA_aggresive));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataaggresive"))
			this.entityData.set(DATA_aggresive, compound.getBoolean("Dataaggresive"));
	}

	public static void init() {
		SpawnPlacements.register(TruedarknessModEntities.CORRUPTED_HUMAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.execute();
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.15);
		builder = builder.add(Attributes.MAX_HEALTH, 8);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 5);
		return builder;
	}
}

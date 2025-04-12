
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.entity.WasteRunerEntity;
import exp.fluffynuar.truedarkness.entity.SoulstealWarriorEntity;
import exp.fluffynuar.truedarkness.entity.ShandarahProjectileEntity;
import exp.fluffynuar.truedarkness.entity.RemnantEntity;
import exp.fluffynuar.truedarkness.entity.MinerEntity;
import exp.fluffynuar.truedarkness.entity.HexEntity;
import exp.fluffynuar.truedarkness.entity.GlowBugEntity;
import exp.fluffynuar.truedarkness.entity.GloomerWarriorEntity;
import exp.fluffynuar.truedarkness.entity.GloomerElderEntity;
import exp.fluffynuar.truedarkness.entity.GloomerCraftsmanEntity;
import exp.fluffynuar.truedarkness.entity.GloomerChillerEntity;
import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.entity.FlowEntity;
import exp.fluffynuar.truedarkness.entity.EridiumZombieEntity;
import exp.fluffynuar.truedarkness.entity.EridiumGolemEntity;
import exp.fluffynuar.truedarkness.entity.DarknessSpruceShieldProjectileEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedUnformedRemnantsEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedSkeletonEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedNecromancerEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedMageEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedKnightEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedHumanEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedHandEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedAssassinEntity;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<EntityType<FlowEntity>> FLOW = register("flow",
			EntityType.Builder.<FlowEntity>of(FlowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WasteRunerEntity>> WASTE_RUNNER = register("waste_runner",
			EntityType.Builder.<WasteRunerEntity>of(WasteRunerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WasteRunerEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<CorruptedKnightEntity>> CORRUPTED_KNIGHT = register("corrupted_knight",
			EntityType.Builder.<CorruptedKnightEntity>of(CorruptedKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(CorruptedKnightEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<EridiumZombieEntity>> ERIDIUM_ZOMBIE = register("eridium_zombie", EntityType.Builder.<EridiumZombieEntity>of(EridiumZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EridiumZombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GeneralEntity>> GENERAL = register("general",
			EntityType.Builder.<GeneralEntity>of(GeneralEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeneralEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<EridiumGolemEntity>> ERIDIUM_GOLEM = register("eridium_golem", EntityType.Builder.<EridiumGolemEntity>of(EridiumGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EridiumGolemEntity::new).fireImmune().sized(2f, 2.9f));
	public static final RegistryObject<EntityType<CorruptedHandEntity>> CORRUPTED_HAND = register("corrupted_hand", EntityType.Builder.<CorruptedHandEntity>of(CorruptedHandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CorruptedHandEntity::new).fireImmune().sized(1f, 4.8f));
	public static final RegistryObject<EntityType<DarknessSpruceShieldProjectileEntity>> DARKNESS_SPRUCE_SHIELD_PROJECTILE = register("darkness_spruce_shield_projectile",
			EntityType.Builder.<DarknessSpruceShieldProjectileEntity>of(DarknessSpruceShieldProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DarknessSpruceShieldProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShandarahProjectileEntity>> SHANDARAH_PROJECTILE = register("shandarah_projectile", EntityType.Builder.<ShandarahProjectileEntity>of(ShandarahProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShandarahProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GlowBugEntity>> GLOW_BUG = register("glow_bug",
			EntityType.Builder.<GlowBugEntity>of(GlowBugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowBugEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<MinerEntity>> MINER = register("miner",
			EntityType.Builder.<MinerEntity>of(MinerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedHumanEntity>> CORRUPTED_HUMAN = register("corrupted_human",
			EntityType.Builder.<CorruptedHumanEntity>of(CorruptedHumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(10).setUpdateInterval(3).setCustomClientFactory(CorruptedHumanEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<CorruptedMageEntity>> CORRUPTED_MAGE = register("corrupted_mage",
			EntityType.Builder.<CorruptedMageEntity>of(CorruptedMageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9).setUpdateInterval(3).setCustomClientFactory(CorruptedMageEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SoulstealWarriorEntity>> SOULSTEAL_WARRIOR = register("soulsteal_warrior",
			EntityType.Builder.<SoulstealWarriorEntity>of(SoulstealWarriorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9).setUpdateInterval(3).setCustomClientFactory(SoulstealWarriorEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<GloomerCraftsmanEntity>> GLOOMER_CRAFTSMAN = register("gloomer_craftsman", EntityType.Builder.<GloomerCraftsmanEntity>of(GloomerCraftsmanEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GloomerCraftsmanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloomerWarriorEntity>> GLOOMER_WARRIOR = register("gloomer_warrior", EntityType.Builder.<GloomerWarriorEntity>of(GloomerWarriorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GloomerWarriorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloomerElderEntity>> GLOOMER_ELDER = register("gloomer_elder", EntityType.Builder.<GloomerElderEntity>of(GloomerElderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GloomerElderEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RemnantEntity>> REMNANT = register("remnant",
			EntityType.Builder.<RemnantEntity>of(RemnantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RemnantEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<HexEntity>> HEX = register("hex",
			EntityType.Builder.<HexEntity>of(HexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(HexEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<CorruptedNecromancerEntity>> CORRUPTED_NECROMANCER = register("corrupted_necromancer",
			EntityType.Builder.<CorruptedNecromancerEntity>of(CorruptedNecromancerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CorruptedNecromancerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedSkeletonEntity>> CORRUPTED_SKELETON = register("corrupted_skeleton",
			EntityType.Builder.<CorruptedSkeletonEntity>of(CorruptedSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptedSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedUnformedRemnantsEntity>> CORRUPTED_UNFORMED_REMNANTS = register("corrupted_unformed_remnants",
			EntityType.Builder.<CorruptedUnformedRemnantsEntity>of(CorruptedUnformedRemnantsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CorruptedUnformedRemnantsEntity::new)

					.sized(0.4f, 1.4f));
	public static final RegistryObject<EntityType<CorruptedAssassinEntity>> CORRUPTED_ASSASSIN = register("corrupted_assassin",
			EntityType.Builder.<CorruptedAssassinEntity>of(CorruptedAssassinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptedAssassinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloomerChillerEntity>> GLOOMER_CHILLER = register("gloomer_chiller", EntityType.Builder.<GloomerChillerEntity>of(GloomerChillerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GloomerChillerEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FlowEntity.init();
			WasteRunerEntity.init();
			CorruptedKnightEntity.init();
			EridiumZombieEntity.init();
			GeneralEntity.init();
			EridiumGolemEntity.init();
			CorruptedHandEntity.init();
			GlowBugEntity.init();
			MinerEntity.init();
			CorruptedHumanEntity.init();
			CorruptedMageEntity.init();
			SoulstealWarriorEntity.init();
			GloomerCraftsmanEntity.init();
			GloomerWarriorEntity.init();
			GloomerElderEntity.init();
			RemnantEntity.init();
			HexEntity.init();
			CorruptedNecromancerEntity.init();
			CorruptedSkeletonEntity.init();
			CorruptedUnformedRemnantsEntity.init();
			CorruptedAssassinEntity.init();
			GloomerChillerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FLOW.get(), FlowEntity.createAttributes().build());
		event.put(WASTE_RUNNER.get(), WasteRunerEntity.createAttributes().build());
		event.put(CORRUPTED_KNIGHT.get(), CorruptedKnightEntity.createAttributes().build());
		event.put(ERIDIUM_ZOMBIE.get(), EridiumZombieEntity.createAttributes().build());
		event.put(GENERAL.get(), GeneralEntity.createAttributes().build());
		event.put(ERIDIUM_GOLEM.get(), EridiumGolemEntity.createAttributes().build());
		event.put(CORRUPTED_HAND.get(), CorruptedHandEntity.createAttributes().build());
		event.put(GLOW_BUG.get(), GlowBugEntity.createAttributes().build());
		event.put(MINER.get(), MinerEntity.createAttributes().build());
		event.put(CORRUPTED_HUMAN.get(), CorruptedHumanEntity.createAttributes().build());
		event.put(CORRUPTED_MAGE.get(), CorruptedMageEntity.createAttributes().build());
		event.put(SOULSTEAL_WARRIOR.get(), SoulstealWarriorEntity.createAttributes().build());
		event.put(GLOOMER_CRAFTSMAN.get(), GloomerCraftsmanEntity.createAttributes().build());
		event.put(GLOOMER_WARRIOR.get(), GloomerWarriorEntity.createAttributes().build());
		event.put(GLOOMER_ELDER.get(), GloomerElderEntity.createAttributes().build());
		event.put(REMNANT.get(), RemnantEntity.createAttributes().build());
		event.put(HEX.get(), HexEntity.createAttributes().build());
		event.put(CORRUPTED_NECROMANCER.get(), CorruptedNecromancerEntity.createAttributes().build());
		event.put(CORRUPTED_SKELETON.get(), CorruptedSkeletonEntity.createAttributes().build());
		event.put(CORRUPTED_UNFORMED_REMNANTS.get(), CorruptedUnformedRemnantsEntity.createAttributes().build());
		event.put(CORRUPTED_ASSASSIN.get(), CorruptedAssassinEntity.createAttributes().build());
		event.put(GLOOMER_CHILLER.get(), GloomerChillerEntity.createAttributes().build());
	}
}


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
import exp.fluffynuar.truedarkness.entity.SculkFeatherProjectileEntity;
import exp.fluffynuar.truedarkness.entity.MinerEntity;
import exp.fluffynuar.truedarkness.entity.GlowBugEntity;
import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.entity.FlowEntity;
import exp.fluffynuar.truedarkness.entity.EridiumZombieEntity;
import exp.fluffynuar.truedarkness.entity.EridiumGolemEntity;
import exp.fluffynuar.truedarkness.entity.DarknessSpruceShieldProjectileEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedMageEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedKnightEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedHumanEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedHandEntity;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<EntityType<GlowBugEntity>> GLOW_BUG = register("glow_bug",
			EntityType.Builder.<GlowBugEntity>of(GlowBugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowBugEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<MinerEntity>> MINER = register("miner",
			EntityType.Builder.<MinerEntity>of(MinerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlowEntity>> FLOW = register("flow",
			EntityType.Builder.<FlowEntity>of(FlowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedKnightEntity>> CORRUPTED_KNIGHT = register("corrupted_knight",
			EntityType.Builder.<CorruptedKnightEntity>of(CorruptedKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(CorruptedKnightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedHumanEntity>> CORRUPTED_HUMAN = register("corrupted_human",
			EntityType.Builder.<CorruptedHumanEntity>of(CorruptedHumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(10).setUpdateInterval(3).setCustomClientFactory(CorruptedHumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedMageEntity>> CORRUPTED_MAGE = register("corrupted_mage",
			EntityType.Builder.<CorruptedMageEntity>of(CorruptedMageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9).setUpdateInterval(3).setCustomClientFactory(CorruptedMageEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoulstealWarriorEntity>> SOULSTEAL_WARRIOR = register("soulsteal_warrior",
			EntityType.Builder.<SoulstealWarriorEntity>of(SoulstealWarriorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9).setUpdateInterval(3).setCustomClientFactory(SoulstealWarriorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedHandEntity>> CORRUPTED_HAND = register("corrupted_hand", EntityType.Builder.<CorruptedHandEntity>of(CorruptedHandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CorruptedHandEntity::new).fireImmune().sized(1f, 3.8f));
	public static final RegistryObject<EntityType<GeneralEntity>> GENERAL = register("general",
			EntityType.Builder.<GeneralEntity>of(GeneralEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeneralEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<EridiumZombieEntity>> ERIDIUM_ZOMBIE = register("eridium_zombie", EntityType.Builder.<EridiumZombieEntity>of(EridiumZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EridiumZombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WasteRunerEntity>> WASTE_RUNNER = register("waste_runner",
			EntityType.Builder.<WasteRunerEntity>of(WasteRunerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WasteRunerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EridiumGolemEntity>> ERIDIUM_GOLEM = register("eridium_golem", EntityType.Builder.<EridiumGolemEntity>of(EridiumGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EridiumGolemEntity::new).fireImmune().sized(2f, 2.9f));
	public static final RegistryObject<EntityType<DarknessSpruceShieldProjectileEntity>> DARKNESS_SPRUCE_SHIELD_PROJECTILE = register("projectile_darkness_spruce_shield_projectile",
			EntityType.Builder.<DarknessSpruceShieldProjectileEntity>of(DarknessSpruceShieldProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DarknessSpruceShieldProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SculkFeatherProjectileEntity>> SCULK_FEATHER_PROJECTILE = register("projectile_sculk_feather_projectile",
			EntityType.Builder.<SculkFeatherProjectileEntity>of(SculkFeatherProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SculkFeatherProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShandarahProjectileEntity>> SHANDARAH_PROJECTILE = register("projectile_shandarah_projectile", EntityType.Builder.<ShandarahProjectileEntity>of(ShandarahProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShandarahProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GlowBugEntity.init();
			MinerEntity.init();
			FlowEntity.init();
			CorruptedKnightEntity.init();
			CorruptedHumanEntity.init();
			CorruptedMageEntity.init();
			SoulstealWarriorEntity.init();
			CorruptedHandEntity.init();
			GeneralEntity.init();
			EridiumZombieEntity.init();
			WasteRunerEntity.init();
			EridiumGolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GLOW_BUG.get(), GlowBugEntity.createAttributes().build());
		event.put(MINER.get(), MinerEntity.createAttributes().build());
		event.put(FLOW.get(), FlowEntity.createAttributes().build());
		event.put(CORRUPTED_KNIGHT.get(), CorruptedKnightEntity.createAttributes().build());
		event.put(CORRUPTED_HUMAN.get(), CorruptedHumanEntity.createAttributes().build());
		event.put(CORRUPTED_MAGE.get(), CorruptedMageEntity.createAttributes().build());
		event.put(SOULSTEAL_WARRIOR.get(), SoulstealWarriorEntity.createAttributes().build());
		event.put(CORRUPTED_HAND.get(), CorruptedHandEntity.createAttributes().build());
		event.put(GENERAL.get(), GeneralEntity.createAttributes().build());
		event.put(ERIDIUM_ZOMBIE.get(), EridiumZombieEntity.createAttributes().build());
		event.put(WASTE_RUNNER.get(), WasteRunerEntity.createAttributes().build());
		event.put(ERIDIUM_GOLEM.get(), EridiumGolemEntity.createAttributes().build());
	}
}

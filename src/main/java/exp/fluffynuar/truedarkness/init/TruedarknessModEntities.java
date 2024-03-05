
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
import exp.fluffynuar.truedarkness.entity.SwampSalmonEntity;
import exp.fluffynuar.truedarkness.entity.ShandarahProjectileEntity;
import exp.fluffynuar.truedarkness.entity.SculkFeatherProjectileEntity;
import exp.fluffynuar.truedarkness.entity.GeneralEntity;
import exp.fluffynuar.truedarkness.entity.FungumEntity;
import exp.fluffynuar.truedarkness.entity.FlowEntity;
import exp.fluffynuar.truedarkness.entity.EridiumZombieEntity;
import exp.fluffynuar.truedarkness.entity.EridiumGolemEntity;
import exp.fluffynuar.truedarkness.entity.DarknessSpruceShieldProjectileEntity;
import exp.fluffynuar.truedarkness.entity.CryerEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedKnightEntity;
import exp.fluffynuar.truedarkness.entity.CorruptedHandEntity;
import exp.fluffynuar.truedarkness.TruedarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TruedarknessModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TruedarknessMod.MODID);
	public static final RegistryObject<EntityType<SwampSalmonEntity>> SWAMP_COD_ENTITY = register("swamp_cod_entity",
			EntityType.Builder.<SwampSalmonEntity>of(SwampSalmonEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwampSalmonEntity::new)

					.sized(0.5f, 0.3f));
	public static final RegistryObject<EntityType<FlowEntity>> FLOW = register("flow",
			EntityType.Builder.<FlowEntity>of(FlowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptedKnightEntity>> CORRUPTED_KNIGHT = register("corrupted_knight",
			EntityType.Builder.<CorruptedKnightEntity>of(CorruptedKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(CorruptedKnightEntity::new)

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
	public static final RegistryObject<EntityType<CryerEntity>> CRYER = register("cryer",
			EntityType.Builder.<CryerEntity>of(CryerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CryerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FungumEntity>> FUNGUM = register("fungum",
			EntityType.Builder.<FungumEntity>of(FungumEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FungumEntity::new)

					.sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<SculkFeatherProjectileEntity>> SCULK_FEATHER_PROJECTILE = register("projectile_sculk_feather_projectile",
			EntityType.Builder.<SculkFeatherProjectileEntity>of(SculkFeatherProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SculkFeatherProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarknessSpruceShieldProjectileEntity>> DARKNESS_SPRUCE_SHIELD_PROJECTILE = register("projectile_darkness_spruce_shield_projectile",
			EntityType.Builder.<DarknessSpruceShieldProjectileEntity>of(DarknessSpruceShieldProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DarknessSpruceShieldProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShandarahProjectileEntity>> SHANDARAH_PROJECTILE = register("projectile_shandarah_projectile", EntityType.Builder.<ShandarahProjectileEntity>of(ShandarahProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShandarahProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SwampSalmonEntity.init();
			FlowEntity.init();
			CorruptedKnightEntity.init();
			CorruptedHandEntity.init();
			GeneralEntity.init();
			EridiumZombieEntity.init();
			WasteRunerEntity.init();
			EridiumGolemEntity.init();
			CryerEntity.init();
			FungumEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SWAMP_COD_ENTITY.get(), SwampSalmonEntity.createAttributes().build());
		event.put(FLOW.get(), FlowEntity.createAttributes().build());
		event.put(CORRUPTED_KNIGHT.get(), CorruptedKnightEntity.createAttributes().build());
		event.put(CORRUPTED_HAND.get(), CorruptedHandEntity.createAttributes().build());
		event.put(GENERAL.get(), GeneralEntity.createAttributes().build());
		event.put(ERIDIUM_ZOMBIE.get(), EridiumZombieEntity.createAttributes().build());
		event.put(WASTE_RUNNER.get(), WasteRunerEntity.createAttributes().build());
		event.put(ERIDIUM_GOLEM.get(), EridiumGolemEntity.createAttributes().build());
		event.put(CRYER.get(), CryerEntity.createAttributes().build());
		event.put(FUNGUM.get(), FungumEntity.createAttributes().build());
	}
}

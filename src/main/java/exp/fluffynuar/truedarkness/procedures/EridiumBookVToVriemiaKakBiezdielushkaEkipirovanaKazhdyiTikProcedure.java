package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class EridiumBookVToVriemiaKakBiezdielushkaEkipirovanaKazhdyiTikProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double add_int = 0;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (!(itemstack.getOrCreateTag().getString("BookAddon")).equals("armor")
					|| itemstack.getOrCreateTag().getDouble("BookAddonLevel") < (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getCount()
							+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getCount()
							+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getCount()
							+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getCount()) {
				add_int = 0;
				for (int index0 = 0; index0 < (int) (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getCount()
						+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getCount()
						+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getCount()
						+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getCount()) - itemstack.getOrCreateTag().getDouble("BookAddonLevel")); index0++) {
					if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) add_int)) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) add_int)) : ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set((int) add_int, new ItemStack(Blocks.AIR));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) add_int), new ItemStack(Blocks.AIR));
							}
						}
					}
					add_int = add_int + 1;
				}
			}
			if (!(entity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
				if (!(entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get()))
						&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).HoldAbility3) {
					TruedarknessMod.queueServerWork(10, () -> {
						if (!(entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get()))
								&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).HoldAbility3) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.summon")), SoundSource.PLAYERS, (float) 0.6, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.summon")), SoundSource.PLAYERS, (float) 0.6, 1, false);
								}
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get(), 999999999, 0, false, false));
						}
					});
				}
			} else {
				{
					boolean _setval = false;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Remnant_logic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get());
				{
					double _setval = 0;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ProgressBar = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count != 0
					&& !(entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get()))) {
				{
					double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Preys
							+ PreyCountPereschetProcedure.execute((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count);
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Preys = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count
							- PreyCountPereschetProcedure.execute((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count);
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Active_prey_count = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("SelectedLine") != (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SelectedLine) {
				itemstack.getOrCreateTag().putDouble("SelectedLine", ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SelectedLine));
			}
		}
	}
}

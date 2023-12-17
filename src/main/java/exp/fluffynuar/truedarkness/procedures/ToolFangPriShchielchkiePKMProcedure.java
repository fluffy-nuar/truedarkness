package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import java.util.UUID;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEnchantments;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class ToolFangPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.FANG_PICKAXE.get())) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOOL_FANG.get()
					&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem)
					&& !(EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.CURSE_OF_FANG.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.TOOL_FANG.get(), 40);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20, 1, false, false));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), x, (y + 0.5), z, 10, 0, 0, 0, 0.05);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, (float) 0.3, (float) 0.3);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, (float) 0.3, (float) 0.3, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				TruedarknessMod.queueServerWork(20, () -> {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOOL_FANG.get()
							&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
									|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
									|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem
									|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem)
							&& !(EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.CURSE_OF_FANG.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20, 1, false, false));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), x, (y + 0.5), z, 10, 0, 0, 0, 0.05);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, (float) 0.3, (float) 0.3);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, (float) 0.3, (float) 0.3, false);
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						TruedarknessMod.queueServerWork(20, () -> {
							if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.HEART_ERIDIUM.get(), lv).isPresent() : false) {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOOL_FANG.get()
										&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
												|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
												|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem
												|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem)
										&& !(EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.CURSE_OF_FANG.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 1, false, false));
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20, 1, false, false));
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), x, (y + 0.5), z, 10, 0, 0, 0, 0.05);
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.PLAYERS, (float) 0.5, (float) 0.5);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.PLAYERS, (float) 0.5, (float) 0.5, false);
										}
									}
									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY) != ItemStack.EMPTY) {
										CompoundTag _tag = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getOrCreateTag();
										if (!_tag.contains("AttributeModifiers", 9)) {
											_tag.put("AttributeModifiers", new ListTag());
										}
										ListTag _listtag = _tag.getList("AttributeModifiers", 10);
										CompoundTag _compoundtag = (new AttributeModifier(UUID.fromString("d089b9c6-70c9-11ee-b962-0242ac120002"), "fang_tool", 1.5, AttributeModifier.Operation.ADDITION)).save();
										int _index = -1;
										for (int _i = 0; _i < _listtag.size(); _i++) {
											if ((_listtag.get(_i) instanceof CompoundTag _e
													&& AttributeModifier.load(_e).equals((new AttributeModifier(UUID.fromString("d089b9c6-70c9-11ee-b962-0242ac120002"), "fang_tool", 1.5, AttributeModifier.Operation.ADDITION))))) {
												_index = _i;
												break;
											}
										}
										if (_index != -1) {
											_listtag.remove(_index);
										}
										_compoundtag.putString("AttributeName", ForgeMod.BLOCK_REACH.getId().toString());
										_compoundtag.putString("Slot", EquipmentSlot.MAINHAND.getName());
										_listtag.add(_compoundtag);
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(TruedarknessModEnchantments.CURSE_OF_FANG.get(), 1);
									if (entity instanceof LivingEntity _entity)
										_entity.swing(InteractionHand.OFF_HAND, true);
									if (entity instanceof LivingEntity _entity)
										_entity.swing(InteractionHand.MAIN_HAND, true);
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Blocks.AIR);
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									if (entity instanceof Player _player)
										_player.getCooldowns().addCooldown(TruedarknessModItems.TOOL_FANG.get(), 80);
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), x, (y + 0.5), z, 10, 0, 0, 0, 0.05);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.PLAYERS, (float) 0.5, (float) 0.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.PLAYERS, (float) 0.5, (float) 0.5, false);
									}
								}
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.OFF_HAND, true);
							}
						});
					}
				});
			}
		} else {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(TruedarknessModItems.TOOL_FANG.get(), 160);
		}
	}
}

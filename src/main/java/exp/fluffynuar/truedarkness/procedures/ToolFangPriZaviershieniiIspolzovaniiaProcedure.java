package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import java.util.UUID;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class ToolFangPriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOOL_FANG.get()
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.PLAYERS, 1, 1, false);
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
					if ((_listtag.get(_i) instanceof CompoundTag _e && AttributeModifier.load(_e).equals((new AttributeModifier(UUID.fromString("d089b9c6-70c9-11ee-b962-0242ac120002"), "fang_tool", 1.5, AttributeModifier.Operation.ADDITION))))) {
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
		}
	}
}

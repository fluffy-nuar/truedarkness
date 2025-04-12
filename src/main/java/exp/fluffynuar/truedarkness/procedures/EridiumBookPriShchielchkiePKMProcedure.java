package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class EridiumBookPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double selected = 0;
		double can_be_selected = 0;
		double un_selected = 0;
		ItemStack eridium = ItemStack.EMPTY;
		ItemStack eridium_replace = ItemStack.EMPTY;
		if (entity.isShiftKeyDown()) {
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				un_selected = itemstack.getOrCreateTag().getDouble("ActiveStage") + 2;
				while (!(itemstack.getOrCreateTag().getString(("Line" + Math.round(un_selected)))).equals("") && !(un_selected >= 7)) {
					un_selected = un_selected + 1;
				}
				itemstack.getOrCreateTag().putDouble("ActiveStage", (un_selected - 2));
			}
			if (itemstack.getOrCreateTag().getDouble("SelectedLine") + 1 <= itemstack.getOrCreateTag().getDouble("ActiveStage") + 2) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.book.page_turn")), SoundSource.PLAYERS, 1, (float) 1.2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.book.page_turn")), SoundSource.PLAYERS, 1, (float) 1.2, false);
					}
				}
				itemstack.getOrCreateTag().putDouble("SelectedLine", (itemstack.getOrCreateTag().getDouble("SelectedLine") + 1));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")))), true);
			} else {
				itemstack.getOrCreateTag().putDouble("SelectedLine", 1);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")))), true);
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
				if (itemstack.getOrCreateTag().getDouble("SelectedLine") < 1) {
					itemstack.getOrCreateTag().putDouble("SelectedLine", 1);
				}
				if (!(itemstack.getOrCreateTag().getString(("Line" + itemstack.getOrCreateTag().getDouble("SelectedLine")))).equals("")) {
					eridium_replace = new ItemStack(ForgeRegistries.ITEMS
							.getValue(new ResourceLocation((("truedarkness:shiny_eridium_" + itemstack.getOrCreateTag().getString(("Line" + itemstack.getOrCreateTag().getDouble("SelectedLine"))))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
					eridium_replace.getOrCreateTag().putDouble("ActiveStage", (itemstack.getOrCreateTag().getDouble(("Line" + itemstack.getOrCreateTag().getDouble("SelectedLine") + "Tier"))));
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.book.page_turn")), SoundSource.PLAYERS, 1, (float) 0.8);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.book.page_turn")), SoundSource.PLAYERS, 1, (float) 0.8, false);
					}
				}
				eridium = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
				selected = itemstack.getOrCreateTag().getDouble("SelectedLine");
				itemstack.getOrCreateTag().putString(("Line" + Math.round(selected)), ShinyEridiumGetTypeProcedure.execute(eridium));
				itemstack.getOrCreateTag().putDouble(("Line" + Math.round(selected) + "Tier"), (eridium.getOrCreateTag().getDouble("ActiveStage") + 1));
				itemstack.getOrCreateTag().putDouble(("Line" + Math.round(selected) + "ActiveTime"), SnihyEridiumGetActiveTimeProcedure.execute(eridium));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (!(eridium_replace.getItem() == ItemStack.EMPTY.getItem())) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = eridium_replace.copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}

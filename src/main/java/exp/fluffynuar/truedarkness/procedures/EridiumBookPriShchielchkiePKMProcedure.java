package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
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
				itemstack.getOrCreateTag().putDouble("SelectedLine", 0);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")))), true);
			}
		}
	}
}

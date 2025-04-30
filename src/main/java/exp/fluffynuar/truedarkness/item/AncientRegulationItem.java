
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.ChatFormatting;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import vazkii.patchouli.api.PatchouliAPI;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class AncientRegulationItem extends Item {

@Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(getEdition().copy().withStyle(ChatFormatting.GRAY));
    }
    // Открыть GUI книжки при использовании
    @NotNull
    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack stack = playerIn.getItemInHand(handIn);

        if (playerIn instanceof ServerPlayer player) {
            PatchouliAPI.get().openBookGUI(player, BuiltInRegistries.ITEM.getKey(this));
        }

        return InteractionResultHolder.sidedSuccess(stack, worldIn.isClientSide());
    }
    // Взять издание книжки из конфига
    public static Component getEdition() {
        try {
            return PatchouliAPI.get().getSubtitle(BuiltInRegistries.ITEM.getKey(TruedarknessModItems.ANCIENT_REGULATION.get())); // << Твой предмет вместо DistantWorldsModItems.TEST_BOOK.get(): можно сделать простую процедуру и скопировать часть кода (кину скрины)
        } catch (IllegalArgumentException e) {
            return Component.literal(""); // << На всякий, если ошибка
        }
    }
	public AncientRegulationItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}

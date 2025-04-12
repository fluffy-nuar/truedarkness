package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

@Mod.EventBusSubscriber
public class CursedPapyrusDopolnitielnaiaInformatsiiaProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getEntity(), event.getItemStack(), event.getToolTip());
	}

	public static void execute(Entity entity, ItemStack itemstack, List<Component> tooltip) {
		execute(null, entity, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack, List<Component> tooltip) {
		if (entity == null || tooltip == null)
			return;
		if (itemstack.getItem() == TruedarknessModItems.CURSED_SCROLL.get()) {
			if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
				if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
					tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc1")).getString())));
				} else {
					tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.dark_crystal.desc").getString())));
				}
			} else {
				if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
					tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
				} else {
					tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.metenite_crystal.desc").getString())));
				}
			}
		}
	}
}

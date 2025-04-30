package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.Map;

public class BookAltarGuiKazhdyiTikPokaIntierfieisOtkrytProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double add_number = 0;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("truedarkness:manuals")))) {
			if (!(PoluchitePredmetProcedure.execute(
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("SecondAbility"))
					.getItem() == ItemStack.EMPTY.getItem())) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = PoluchitePredmetProcedure
							.execute((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
									.getString("SecondAbility"))
							.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (!(PassiveEffectSetProcedure.execute(
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("PassiveSkill"))
					.getItem() == ItemStack.EMPTY.getItem())) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = PassiveEffectSetProcedure
							.execute((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
									.getString("PassiveSkill"))
							.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (!(BookAddonSetProcedure
					.execute(
							(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("BookAddon"))
					.getItem() == ItemStack.EMPTY.getItem())) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = BookAddonSetProcedure.execute(
							(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("BookAddon"))
							.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (!(ForgeRegistries.ITEMS.getValue(new ResourceLocation(
					(("truedarkness:shiny_eridium_" + ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
							.getOrCreateTag().getString(("Line" + Math.round(add_number)))))).toLowerCase(java.util.Locale.ENGLISH))) == ItemStack.EMPTY.getItem())) {
				while (add_number <= (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
						.getDouble("ActiveStage") + 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(
								(("truedarkness:shiny_eridium_" + ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getOrCreateTag().getString(("Line" + Math.round(add_number)))))).toLowerCase(java.util.Locale.ENGLISH))))
								.copy();
						_setstack.setCount(1);
						((Slot) _slots.get((int) (add_number + 5))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) (add_number + 5))).getItem() : ItemStack.EMPTY).getOrCreateTag()
							.putDouble("ActiveStage", ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
									.getOrCreateTag().getDouble(("Line" + Math.round(add_number) + "Tier"))));
					add_number = add_number + 1;
					continue;
				}
			}
		} else {
			while (!(add_number == 15)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = ItemStack.EMPTY.copy();
					_setstack.setCount(1);
					((Slot) _slots.get((int) add_number)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				add_number = add_number + 1;
			}
		}
	}
}

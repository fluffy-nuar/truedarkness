package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class DarkCrystalClasterPriShchielchkiePKMProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:diamond_chestplate{enchantments:[{id:binding_curse,lvl:1},{id:binding_curse,lvl:1}],hideflags:1}"))));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:diamond_chestplate{enchantments:[{id:binding_curse,lvl:1},{id:binding_curse,lvl:1}],hideflags:1}"))));
			}
		}
	}
}

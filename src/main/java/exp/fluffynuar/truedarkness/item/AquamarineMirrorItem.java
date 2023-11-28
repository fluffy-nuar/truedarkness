
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import exp.fluffynuar.truedarkness.procedures.AquamarineMirrorPriNazhatiiPravoiKnopkoiMyshiProcedure;

public class AquamarineMirrorItem extends Item {
	public AquamarineMirrorItem() {
		super(new Item.Properties().durability(100).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		AquamarineMirrorPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}

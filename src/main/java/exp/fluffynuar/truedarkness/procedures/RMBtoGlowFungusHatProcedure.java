package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

@Mod.EventBusSubscriber
public class RMBtoGlowFungusHatProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity(), event.getItemStack(), usehand);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack, String usehand) {
		execute(null, world, x, y, z, entity, itemstack, usehand);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack, String usehand) {
		if (entity == null || usehand == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (new Object() {
			public BlockState with(BlockState _bs, String _property, int _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
			}
		}.with(TruedarknessModBlocks.GLOW_FUNGUS_HAT_0.get().defaultBlockState(), "blockstate", 1)).getBlock() && itemstack.getItem() == TruedarknessModItems.IGNIME.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = TruedarknessModEntities.GLOW_BUG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
						_toTame.tame(_owner);
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (usehand.equals("offhand")) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}

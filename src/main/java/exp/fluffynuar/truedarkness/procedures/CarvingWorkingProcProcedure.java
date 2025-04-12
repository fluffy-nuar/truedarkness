package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;
import java.util.List;

import exp.fluffynuar.truedarkness.jei_recipes.ConvertingRecipe;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEnchantments;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class CarvingWorkingProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((itemstack.getOrCreateTag().getString("BlockDim")).equals("" + (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)))
				&& itemstack.getOrCreateTag().getDouble("BlockX") == x && itemstack.getOrCreateTag().getDouble("BlockY") == y && itemstack.getOrCreateTag().getDouble("BlockZ") == z && itemstack.getOrCreateTag().getDouble("BlockStage") == 1) {
			itemstack.getOrCreateTag().putDouble("BlockStage", 2);
			CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
		} else if ((itemstack.getOrCreateTag().getString("BlockDim")).equals("" + (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)))
				&& itemstack.getOrCreateTag().getDouble("BlockX") == x && itemstack.getOrCreateTag().getDouble("BlockY") == y && itemstack.getOrCreateTag().getDouble("BlockZ") == z && itemstack.getOrCreateTag().getDouble("BlockStage") == 2) {
			if (!(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":stripped_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":stripped_"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
					&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
							(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_stairs"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_stairs"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					Direction _dir = (entity.getDirection());
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_stairs")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_stairs")).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					Direction _dir = (entity.getDirection());
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "stairs"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "stairs"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					Direction _dir = (entity.getDirection());
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_wall")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_wall")).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
					&& !(ForgeRegistries.BLOCKS.getValue(
							new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_wall"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_wall"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "fence"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "fence"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_slab")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_slab")).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					String _value = "double";
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
						world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
					&& !(ForgeRegistries.BLOCKS.getValue(
							new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_slab"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_slab"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					String _value = "double";
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
						world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "slab"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "slab"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					String _value = "double";
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
						world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("chiseled") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":chiseled_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":chiseled_"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("polished") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":polished_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":polished_"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("bricks") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_bricks")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_bricks")).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if ((itemstack.getOrCreateTag().getString("Type")).equals("smooth") && !(ForgeRegistries.BLOCKS
					.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":smooth_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
				itemstack.getOrCreateTag().putDouble("BlockStage", 0);
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS
							.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":smooth_"))).toLowerCase(java.util.Locale.ENGLISH)))
							.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			} else if (!((new Object() {
				public ItemStack getResult() {
					if (world instanceof Level _lvl) {
						net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
						List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
						for (ConvertingRecipe recipe : recipes) {
							NonNullList<Ingredient> ingredients = recipe.getIngredients();
							if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
								continue;
							if (!ingredients.get(1).test(itemstack))
								continue;
							return recipe.getResultItem(null);
						}
					}
					return ItemStack.EMPTY;
				}
			}.getResult()).getItem() == Blocks.AIR.asItem())) {
				if ((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
							for (ConvertingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
									continue;
								if (!ingredients.get(1).test(itemstack))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == TruedarknessModItems.LOOT_TABLE.get()) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					TruedarknessMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString() + "_loot")).toLowerCase(java.util.Locale.ENGLISH))))
											.getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					});
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					TruedarknessMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
										for (ConvertingRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test((new ItemStack(blockstate.getBlock()))))
												continue;
											if (!ingredients.get(1).test(itemstack))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					});
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				}
			} else if (!((new Object() {
				public ItemStack getResult() {
					if (world instanceof Level _lvl) {
						net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
						List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
						for (ConvertingRecipe recipe : recipes) {
							NonNullList<Ingredient> ingredients = recipe.getIngredients();
							if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
								continue;
							if (!ingredients.get(1).test(new ItemStack(TruedarknessModItems.CARVING_KNIFE.get())))
								continue;
							return recipe.getResultItem(null);
						}
					}
					return ItemStack.EMPTY;
				}
			}.getResult()).getItem() == Blocks.AIR.asItem())) {
				if ((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
							for (ConvertingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
									continue;
								if (!ingredients.get(1).test(new ItemStack(TruedarknessModItems.CARVING_KNIFE.get())))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == TruedarknessModItems.LOOT_TABLE.get()) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					TruedarknessMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString() + "_loot")).toLowerCase(java.util.Locale.ENGLISH))))
											.getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					});
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					TruedarknessMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
										for (ConvertingRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test((new ItemStack(blockstate.getBlock()))))
												continue;
											if (!ingredients.get(1).test(itemstack))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					});
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				}
			}
			world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 1);
		} else {
			if (EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.FAST_CARVING.get(), itemstack) != 0 && itemstack.getEnchantmentLevel(TruedarknessModEnchantments.FAST_CARVING.get()) == 2) {
				if (!(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":stripped_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":stripped_"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
						&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
								(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_stairs"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_stairs"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						Direction _dir = (entity.getDirection());
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_stairs")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_stairs")).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						Direction _dir = (entity.getDirection());
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("stairs") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks")
						&& !(ForgeRegistries.BLOCKS.getValue(
								new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "stairs"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "stairs"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						Direction _dir = (entity.getDirection());
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_wall")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_wall")).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
						&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
								(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_wall"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_wall"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("wall") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "fence"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "fence"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_slab")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_slab")).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						String _value = "double";
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
							world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("bricks")
						&& !(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(
								(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_slab"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("bricks", "brick_slab"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						String _value = "double";
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
							world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("slab") && (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).contains("planks") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "slab"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("planks", "slab"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						String _value = "double";
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
							world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("chiseled") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":chiseled_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":chiseled_"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("polished") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":polished_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":polished_"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("bricks") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_bricks")).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString() + "_bricks")).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if ((itemstack.getOrCreateTag().getString("Type")).equals("smooth") && !(ForgeRegistries.BLOCKS
						.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":smooth_"))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					itemstack.getOrCreateTag().putDouble("BlockStage", 0);
					CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS
								.getValue(new ResourceLocation((((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace(":", ":smooth_"))).toLowerCase(java.util.Locale.ENGLISH)))
								.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				} else if (!((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
							for (ConvertingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
									continue;
								if (!ingredients.get(1).test(itemstack))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == Blocks.AIR.asItem())) {
					if ((new Object() {
						public ItemStack getResult() {
							if (world instanceof Level _lvl) {
								net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
								List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
								for (ConvertingRecipe recipe : recipes) {
									NonNullList<Ingredient> ingredients = recipe.getIngredients();
									if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
										continue;
									if (!ingredients.get(1).test(itemstack))
										continue;
									return recipe.getResultItem(null);
								}
							}
							return ItemStack.EMPTY;
						}
					}.getResult()).getItem() == TruedarknessModItems.LOOT_TABLE.get()) {
						itemstack.getOrCreateTag().putDouble("BlockStage", 0);
						CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
						TruedarknessMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString() + "_loot")).toLowerCase(java.util.Locale.ENGLISH))))
												.getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
								entityToSpawn.setPickUpDelay(0);
								_level.addFreshEntity(entityToSpawn);
							}
						});
						world.destroyBlock(BlockPos.containing(x, y, z), false);
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
					} else {
						itemstack.getOrCreateTag().putDouble("BlockStage", 0);
						CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
						TruedarknessMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new Object() {
									public ItemStack getResult() {
										if (world instanceof Level _lvl) {
											net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
											List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
											for (ConvertingRecipe recipe : recipes) {
												NonNullList<Ingredient> ingredients = recipe.getIngredients();
												if (!ingredients.get(0).test((new ItemStack(blockstate.getBlock()))))
													continue;
												if (!ingredients.get(1).test(itemstack))
													continue;
												return recipe.getResultItem(null);
											}
										}
										return ItemStack.EMPTY;
									}
								}.getResult()));
								entityToSpawn.setPickUpDelay(0);
								_level.addFreshEntity(entityToSpawn);
							}
						});
						world.destroyBlock(BlockPos.containing(x, y, z), false);
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
					}
				} else if (!((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
							for (ConvertingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
									continue;
								if (!ingredients.get(1).test(new ItemStack(TruedarknessModItems.CARVING_KNIFE.get())))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == Blocks.AIR.asItem())) {
					if ((new Object() {
						public ItemStack getResult() {
							if (world instanceof Level _lvl) {
								net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
								List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
								for (ConvertingRecipe recipe : recipes) {
									NonNullList<Ingredient> ingredients = recipe.getIngredients();
									if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
										continue;
									if (!ingredients.get(1).test(new ItemStack(TruedarknessModItems.CARVING_KNIFE.get())))
										continue;
									return recipe.getResultItem(null);
								}
							}
							return ItemStack.EMPTY;
						}
					}.getResult()).getItem() == TruedarknessModItems.LOOT_TABLE.get()) {
						itemstack.getOrCreateTag().putDouble("BlockStage", 0);
						CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
						TruedarknessMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString() + "_loot")).toLowerCase(java.util.Locale.ENGLISH))))
												.getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
								entityToSpawn.setPickUpDelay(0);
								_level.addFreshEntity(entityToSpawn);
							}
						});
						world.destroyBlock(BlockPos.containing(x, y, z), false);
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
					} else {
						itemstack.getOrCreateTag().putDouble("BlockStage", 0);
						CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
						TruedarknessMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new Object() {
									public ItemStack getResult() {
										if (world instanceof Level _lvl) {
											net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
											List<ConvertingRecipe> recipes = rm.getAllRecipesFor(ConvertingRecipe.Type.INSTANCE);
											for (ConvertingRecipe recipe : recipes) {
												NonNullList<Ingredient> ingredients = recipe.getIngredients();
												if (!ingredients.get(0).test((new ItemStack(blockstate.getBlock()))))
													continue;
												if (!ingredients.get(1).test(itemstack))
													continue;
												return recipe.getResultItem(null);
											}
										}
										return ItemStack.EMPTY;
									}
								}.getResult()));
								entityToSpawn.setPickUpDelay(0);
								_level.addFreshEntity(entityToSpawn);
							}
						});
						world.destroyBlock(BlockPos.containing(x, y, z), false);
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
					}
				}
				world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 1);
			} else {
				itemstack.getOrCreateTag().putString("BlockDim", ("" + (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))));
				itemstack.getOrCreateTag().putDouble("BlockStage", (1 + itemstack.getEnchantmentLevel(TruedarknessModEnchantments.FAST_CARVING.get())));
				CarvingAdditionsProcedure.execute(world, x, y, z, entity, itemstack);
				itemstack.getOrCreateTag().putDouble("BlockX", x);
				itemstack.getOrCreateTag().putDouble("BlockY", y);
				itemstack.getOrCreateTag().putDouble("BlockZ", z);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			}
		}
	}
}

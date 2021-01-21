package net.alwinfy.mana2rf.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import vazkii.botania.api.mana.IManaItem;
import vazkii.botania.common.item.equipment.bauble.ItemManaRing;
import vazkii.botania.common.item.ItemManaTablet;

import net.alwinfy.mana2rf.ItemStackMixinUtil;

@Mixin({ ItemManaRing.class, ItemManaTablet.class })
public abstract class MixinInventoryManaDispensers extends Item implements IManaItem {
	protected MixinInventoryManaDispensers() {
		super(new Item.Properties());
		throw new AssertionError();
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
		ItemStackMixinUtil.tickItem(this, stack, entity);
	}


}

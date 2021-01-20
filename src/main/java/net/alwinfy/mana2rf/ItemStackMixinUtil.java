package net.alwinfy.mana2rf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.energy.CapabilityEnergy;

import vazkii.botania.api.mana.IManaItem;

import net.alwinfy.mana2rf.FEItemWrapper;

public final class ItemStackMixinUtil {
	public static final String TARGET = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;";

	public static final Item energyItemWrapper = new FEItemWrapper();
	public static Item redirGetItem(ItemStack in) {
		return in.getCapability(CapabilityEnergy.ENERGY).isPresent() ? energyItemWrapper : in.getItem();
	}
}
package de.cheaterpaul.morebiomes.util.etc.coloredfurnace;

import de.cheaterpaul.morebiomes.util.tileentitys.TileEntityColoredFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotColoredFurnaceFuel extends Slot{

	public SlotColoredFurnaceFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityColoredFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}

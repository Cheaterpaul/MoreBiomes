package de.cheaterpaul.morebiomes.util.etc;

import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreBiomesItemsTab extends CreativeTabs{

	public MoreBiomesItemsTab() {
		super("morebiomes_items_tab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.BLUE_INGOT);
	}

}

package de.cheaterpaul.morebiomes.util.etc;

import de.cheaterpaul.morebiomes.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreBiomesBlocksTab extends CreativeTabs{

	public MoreBiomesBlocksTab() {
		super("morebiomes_blocks_tab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Grass), 1, 3);
	}

}

package de.cheaterpaul.morebiomes.objects.blocks.simpleblocks;

import java.util.Random;

import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.objects.blocks.ColoredBlockBase;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class ColoredStone extends ColoredBlockBase implements IHasModel{
	

	public ColoredStone(String name) {
		super(name, Material.ROCK);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {

		return Item.getItemFromBlock(BlockInit.Colored_Cobblestone);
    }
}

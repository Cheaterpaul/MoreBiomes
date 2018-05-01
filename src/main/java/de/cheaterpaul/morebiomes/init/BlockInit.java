package de.cheaterpaul.morebiomes.init;

import java.util.ArrayList;
import java.util.List;

import de.cheaterpaul.morebiomes.objects.blocks.ColoredFlower;
import de.cheaterpaul.morebiomes.objects.blocks.machines.ColoredFurnace;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredBlock;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredDirt;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredGrass;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredOre;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredStone;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredStonebrick;
import net.minecraft.block.Block;


public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	// World Generation
	
	public static final Block Colored_Dirt = new ColoredDirt("block_dirt");
	
	public static final Block Colored_Grass = new ColoredGrass("block_grass");
	
	public static final Block Colored_Ore = new ColoredOre("ore_overworld", "overworld");
	
	public static final Block Colored_Flower = new ColoredFlower("flower");
	
	// Crafting
	
	public static final Block Colored_Stone = new ColoredStone("block_stone");
	
	public static final Block Colored_Stonebrick = new ColoredStonebrick("block_stonebrick");
	
	public static final Block Colored_Cobblestone = new ColoredStonebrick("block_cobblestone");
	
	public static final Block Colored_Block = new ColoredBlock("block_block");
	
	
	//Machines
	
	public static final Block Colored_Furnace = new ColoredFurnace("colored_furnace", null);
		
}

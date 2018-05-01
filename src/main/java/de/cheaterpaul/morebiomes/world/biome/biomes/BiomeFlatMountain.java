package de.cheaterpaul.morebiomes.world.biome.biomes;


import net.minecraft.block.state.IBlockState;
import net.minecraft.world.biome.Biome;

public class BiomeFlatMountain extends Biome{
	private IBlockState replacement;

	public BiomeFlatMountain(IBlockState topBlock, IBlockState fillerBlock, int watercolor, int variant){	
		super (new BiomeProperties("Flat Mountain").setBaseHeight(1.4F).setHeightVariation(2.0F).setTemperature(0.4F).setSnowEnabled().setWaterColor(watercolor));
		
		this.decorator = this.createBiomeDecorator();
		this.topBlock = topBlock;
		this.fillerBlock = fillerBlock;
		
		this.decorator.treesPerChunk = 0;
	}
}


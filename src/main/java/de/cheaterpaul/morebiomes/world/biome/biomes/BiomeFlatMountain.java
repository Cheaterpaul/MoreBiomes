package de.cheaterpaul.morebiomes.world.biome.biomes;


import java.util.ArrayList;
import java.util.List;

import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.util.handlers.EnumHandler.EnumFlowerType;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeFlatMountain extends Biome{

	public BiomeFlatMountain(IBlockState topBlock, IBlockState fillerBlock, int watercolor, String color){	
		super (new BiomeProperties("Flat Mountain").setBaseHeight(1.4F).setHeightVariation(2.0F).setTemperature(0.4F).setSnowEnabled().setWaterColor(watercolor));
		
		this.decorator = this.createBiomeDecorator();
		this.topBlock = topBlock;
		this.fillerBlock = fillerBlock;
		this.decorator.treesPerChunk = 0;
		decorateWithFlowers(color);
	}
	
	private void decorateWithFlowers(String color) {
		List<IBlockState> flower = new ArrayList<IBlockState>();
		
		switch(color) {
		case "yellow":
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Kelp));
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Goldenrod));
			flower.add(Blocks.YELLOW_FLOWER.getDefaultState());
			break;
		case "red":
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Bromeliad));
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Marigold));
			flower.add(Blocks.RED_FLOWER.getDefaultState());
			break;
		case "blue":
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Cornflower));
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.IcyIris));
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.BlueHydrangea));
			break;
		case "green":
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Hydrangea));
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Zinnia));
			flower.add(BlockInit.Colored_Flower.getDefaultState().withProperty(BlockInit.TYPE, EnumFlowerType.Daylily));
			break;
		}
		
		while (flower.size() >= 1){
			this.addFlower(flower.get(0), 10);
			flower.remove(0);
		}
	}
}


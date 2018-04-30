package de.cheaterpaul.morebiomes.world.gen;

import java.util.Random;

import de.cheaterpaul.morebiomes.init.BiomInit;
import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.objects.blocks.simpleblocks.ColoredOre;
import de.cheaterpaul.morebiomes.util.handlers.EnumHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{

	private WorldGenerator ore_overworld_yellow, ore_overworld_red, ore_overworld_blue, ore_overworld_green;
	
	public WorldGenCustomOres() {
		ore_overworld_yellow = new WorldGenMinable(BlockInit.Colored_Ore.getDefaultState().withProperty(ColoredOre.VARIANT, EnumHandler.EnumType.YELLOW), 9);
		ore_overworld_blue = new WorldGenMinable(BlockInit.Colored_Ore.getDefaultState().withProperty(ColoredOre.VARIANT, EnumHandler.EnumType.BLUE), 9);
		ore_overworld_red = new WorldGenMinable(BlockInit.Colored_Ore.getDefaultState().withProperty(ColoredOre.VARIANT, EnumHandler.EnumType.RED), 9);
		ore_overworld_green = new WorldGenMinable(BlockInit.Colored_Ore.getDefaultState().withProperty(ColoredOre.VARIANT, EnumHandler.EnumType.GREEN), 9);
	}
	
	public void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.getBiome(new BlockPos(chunkX*16, 0, chunkZ*16)) == BiomInit.FLATMOUNTAINBLUE){
			runGenerator(ore_overworld_blue, world, random, chunkX, chunkZ, 50, 0, 100);
		}else if(world.getBiome(new BlockPos(chunkX*16, 0, chunkZ*16)) == BiomInit.FLATMOUNTAINRED){
			runGenerator(ore_overworld_red, world, random, chunkX, chunkZ, 50, 0, 100);
		}else if(world.getBiome(new BlockPos(chunkX*16, 0, chunkZ*16)) == BiomInit.FLATMOUNTAINYELLOW){
			runGenerator(ore_overworld_yellow, world, random, chunkX, chunkZ, 50, 0, 100);
		}else if(world.getBiome(new BlockPos(chunkX*16, 0, chunkZ*16)) == BiomInit.FLATMOUNTAINGREEN){
			runGenerator(ore_overworld_green, world, random, chunkX, chunkZ, 50, 0, 100);
		}
	}

}

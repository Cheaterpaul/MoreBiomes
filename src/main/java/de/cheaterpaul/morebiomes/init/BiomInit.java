package de.cheaterpaul.morebiomes.init;

import de.cheaterpaul.morebiomes.util.handlers.EnumHandler;
import de.cheaterpaul.morebiomes.world.biome.biomes.BiomeFlatMountain;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomInit {
	
	public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.<EnumHandler.EnumType>create("variant", EnumHandler.EnumType.class);
	
	public static final Biome FLATMOUNTAINYELLOW = new BiomeFlatMountain(BlockInit.Colored_Grass.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.YELLOW), BlockInit.Colored_Dirt.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.YELLOW), 16763904, 1);
	public static final Biome FLATMOUNTAINRED = new BiomeFlatMountain(BlockInit.Colored_Grass.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.RED), BlockInit.Colored_Dirt.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.RED), 16711680, 2);
	public static final Biome FLATMOUNTAINBLUE = new BiomeFlatMountain(BlockInit.Colored_Grass.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.BLUE), BlockInit.Colored_Dirt.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.BLUE), 255, 3);
	public static final Biome FLATMOUNTAINGREEN = new BiomeFlatMountain(BlockInit.Colored_Grass.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.GREEN), BlockInit.Colored_Dirt.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.GREEN), 65280, 4);
	
	public static void registerBiomes(){
		
		initBiome(FLATMOUNTAINRED,"Flat Mountain Red", BiomeType.DESERT, Type.MOUNTAIN, Type.JUNGLE, Type.HILLS);
		initBiome(FLATMOUNTAINGREEN,"Flat Mountain Green", BiomeType.WARM, Type.MOUNTAIN, Type.BEACH, Type.HILLS);
		initBiome(FLATMOUNTAINBLUE,"Flat Mountain Blue", BiomeType.COOL, Type.MOUNTAIN, Type.RIVER, Type.HILLS);
		initBiome(FLATMOUNTAINYELLOW,"Flat Mountain Yellow", BiomeType.WARM, Type.MOUNTAIN, Type.BEACH, Type.HILLS);
	}
	
	private static Biome initBiome(Biome biome, String name , BiomeType biomeType, Type... types){
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 90));
		BiomeManager.addSpawnBiome(biome);
		return biome;
	}
}

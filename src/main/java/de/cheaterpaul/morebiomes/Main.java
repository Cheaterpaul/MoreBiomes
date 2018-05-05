package de.cheaterpaul.morebiomes;

import de.cheaterpaul.morebiomes.proxy.ServerProxy;
import de.cheaterpaul.morebiomes.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs MoreBiomesBlocksTab = new de.cheaterpaul.morebiomes.util.etc.MoreBiomesBlocksTab();
	public static final CreativeTabs MoreBiomesItemsTab = new de.cheaterpaul.morebiomes.util.etc.MoreBiomesItemsTab();

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static ServerProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries();
	}

	@EventHandler
	public static void postinit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries();
	}
}

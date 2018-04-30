package de.cheaterpaul.morebiomes.util.handlers;

import de.cheaterpaul.morebiomes.util.tileentitys.TileEntityColoredFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityColoredFurnace.class, "colored");
	}
}

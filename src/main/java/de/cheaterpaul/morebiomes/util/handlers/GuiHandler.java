package de.cheaterpaul.morebiomes.util.handlers;

import de.cheaterpaul.morebiomes.util.container.ContainerColoredFurnace;
import de.cheaterpaul.morebiomes.util.gui.GuiColoredFurnace;
import de.cheaterpaul.morebiomes.util.tileentitys.TileEntityColoredFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	public static final int GUI_COLORED_FURNACE = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUI_COLORED_FURNACE) return new ContainerColoredFurnace(player.inventory, (TileEntityColoredFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUI_COLORED_FURNACE) return new GuiColoredFurnace(player.inventory, (TileEntityColoredFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

}

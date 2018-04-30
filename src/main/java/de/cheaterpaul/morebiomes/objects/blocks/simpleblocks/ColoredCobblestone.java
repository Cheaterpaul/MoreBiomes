package de.cheaterpaul.morebiomes.objects.blocks.simpleblocks;

import de.cheaterpaul.morebiomes.objects.blocks.ColoredBlockBase;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;

public class ColoredCobblestone extends ColoredBlockBase implements IHasModel{

	
	public ColoredCobblestone(String name) {
		super(name, Material.ROCK);
	}
}

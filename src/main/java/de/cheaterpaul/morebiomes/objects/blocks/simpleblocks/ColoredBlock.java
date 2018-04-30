package de.cheaterpaul.morebiomes.objects.blocks.simpleblocks;

import de.cheaterpaul.morebiomes.objects.blocks.ColoredBlockBase;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;

public class ColoredBlock extends ColoredBlockBase implements IHasModel{

	public ColoredBlock(String name) {
		super(name, Material.IRON);
	}

}

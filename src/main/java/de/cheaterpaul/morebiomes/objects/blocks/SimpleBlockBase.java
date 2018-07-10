package de.cheaterpaul.morebiomes.objects.blocks;

import de.cheaterpaul.morebiomes.Main;
import de.cheaterpaul.morebiomes.Reference;
import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.init.ItemInit;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class SimpleBlockBase extends Block implements IHasModel {
	
	protected String color;
	
	public SimpleBlockBase(String name, Material material, String color) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MoreBiomesBlocksTab);
		this.color = color;

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}

package de.cheaterpaul.morebiomes.objects.blocks;

import de.cheaterpaul.morebiomes.Main;
import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.init.ItemInit;
import de.cheaterpaul.morebiomes.util.etc.ItemBlockVariants;
import de.cheaterpaul.morebiomes.util.handlers.EnumHandler;
import de.cheaterpaul.morebiomes.util.handlers.EnumHandler.EnumType;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ColoredFlower extends BlockFlower implements IHasModel{

	public static final PropertyEnum<EnumHandler.EnumFlowerColor> VARIANT = PropertyEnum.<EnumHandler.EnumFlowerColor>create("variant", EnumHandler.EnumFlowerColor.class);
	private EnumFlowerColor type;
	private String name;

	public ColoredFlower(String name, EnumFlowerColor type){
		this.type = type;
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MoreBiomesBlocksTab);
		setDefaultState(this.blockState.getBaseState());
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels() {
		for(int i = 0; i < EnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, name + "_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}

	@Override
	public EnumFlowerColor getBlockType() {
		return type;
	}

}

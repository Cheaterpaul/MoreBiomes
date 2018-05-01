package de.cheaterpaul.morebiomes.objects.blocks;


import de.cheaterpaul.morebiomes.Main;
import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.init.ItemInit;
import de.cheaterpaul.morebiomes.util.etc.ItemBlockVariants;
import de.cheaterpaul.morebiomes.util.handlers.EnumHandler;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import de.cheaterpaul.morebiomes.util.interfaces.IMetaName;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ColoredFlower extends BlockBush implements IHasModel, IMetaName{

public static final PropertyEnum<EnumHandler.EnumFlowerType> TYPE = PropertyEnum.<EnumHandler.EnumFlowerType>create("type", EnumHandler.EnumFlowerType.class);
	
	private String name;
	
	public ColoredFlower(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MoreBiomesBlocksTab);
		setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumHandler.EnumFlowerType.Cornflower));
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
		this.name = name;
	}

	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumHandler.EnumFlowerType)state.getValue(TYPE)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumHandler.EnumFlowerType)state.getValue(TYPE)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(TYPE, EnumHandler.EnumFlowerType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(EnumHandler.EnumFlowerType variant : EnumHandler.EnumFlowerType.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {TYPE});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return EnumHandler.EnumFlowerType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < EnumHandler.EnumFlowerType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, name + "_" + EnumHandler.EnumFlowerType.values()[i].getName(), "inventory");
		}
	}
}

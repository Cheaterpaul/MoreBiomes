package de.cheaterpaul.morebiomes.util.etc.coloredfurnace;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import de.cheaterpaul.morebiomes.init.BlockInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ColoredFurnaceRecipes 
{	
	public static final ColoredFurnaceRecipes INSTANCE = new ColoredFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	private final Map<ItemStack, ItemStack> smeltingList2 = Maps.<ItemStack, ItemStack>newHashMap();
	private final FurnaceRecipes vanillarecipes = FurnaceRecipes.instance();
	
	public static ColoredFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private ColoredFurnaceRecipes() 
	{
		// Double Recipe
		
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 11), new ItemStack(Blocks.STONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 0), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 4), new ItemStack(Blocks.STONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 1), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 1), new ItemStack(Blocks.STONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 3), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 2), new ItemStack(Blocks.STONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 2), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 11), new ItemStack(Blocks.COBBLESTONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 0), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 4), new ItemStack(Blocks.COBBLESTONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 1), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 1), new ItemStack(Blocks.COBBLESTONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 3), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 2), new ItemStack(Blocks.COBBLESTONE), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 2), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 11), new ItemStack(Blocks.STONEBRICK), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stonebrick), 1, 0), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 4), new ItemStack(Blocks.STONEBRICK), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stonebrick), 1, 1), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 1), new ItemStack(Blocks.STONEBRICK), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stonebrick), 1, 3), 5.0F);
				addColoredFurnaceRecipe(new ItemStack(Items.DYE, 1 , 2), new ItemStack(Blocks.STONEBRICK), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stonebrick), 1, 2), 5.0F);
				
				// Solo Recipe
				
				addColoredFurnaceRecipe(new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 0), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 0), 5.0f);
				addColoredFurnaceRecipe(new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 1), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 1), 5.0f);
				addColoredFurnaceRecipe(new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 3), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 3), 5.0f);
				addColoredFurnaceRecipe(new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Cobblestone), 1, 0), new ItemStack(Item.getItemFromBlock(BlockInit.Colored_Stone), 1, 2), 5.0f);
				
	}

	
	public void addColoredFurnaceRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getColorFurnaceResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public void addColoredFurnaceRecipe(ItemStack input1, ItemStack result, float experience) 
	{
		if(getColorFurnaceResult(input1, result) != ItemStack.EMPTY) return;
		this.smeltingList2.put(input1, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
		
	
	public ItemStack getColorFurnaceResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
			if(this.compareItemStacks(input2, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input1, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	public ItemStack getColorFurnaceResult(ItemStack input) 
	{
		for(Entry<ItemStack, ItemStack> entry : this.smeltingList2.entrySet()) 
		{
			if(this.compareItemStacks(input, (ItemStack)entry.getKey())) 
			{
				return (ItemStack)entry.getValue();
			}
		}
		for(Entry<ItemStack,ItemStack> entry : vanillarecipes.getSmeltingList().entrySet())
		{
			if(this.compareItemStacks(input, (ItemStack)entry.getKey()))
			{
				return (ItemStack)entry.getValue();
			}
		}
				
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getColoredFurnaceExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return vanillarecipes.getSmeltingExperience(stack);
	}
}
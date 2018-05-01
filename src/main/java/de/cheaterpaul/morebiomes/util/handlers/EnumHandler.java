package de.cheaterpaul.morebiomes.util.handlers;

import de.cheaterpaul.morebiomes.Reference;
import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.common.util.EnumHelper;

public class EnumHandler
{
	public static final ToolMaterial TOOL_YELLOW = EnumHelper.addToolMaterial("tool_yellow", 3, 300, 6.0f, 2.0f, 14);
	public static final ToolMaterial TOOL_RED = EnumHelper.addToolMaterial("tool_red", 3, 300, 6.0f, 2.0f, 14);
	public static final ToolMaterial TOOL_BLUE = EnumHelper.addToolMaterial("tool_blue", 3, 300, 6.0f, 2.0f, 14);
	public static final ToolMaterial TOOL_GREEN = EnumHelper.addToolMaterial("tool_green", 3, 300, 6.0f, 2.0f, 14);
	public static final ArmorMaterial ARMOUR_YELLOW = EnumHelper.addArmorMaterial("armor_yellow", Reference.MODID + ":yellow", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_RED = EnumHelper.addArmorMaterial("armor_red", Reference.MODID + ":red", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_BLUE = EnumHelper.addArmorMaterial("armor_blue", Reference.MODID + ":blue", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_GREEN = EnumHelper.addArmorMaterial("armor_green", Reference.MODID + ":green", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
			
	public static enum EnumType implements IStringSerializable
	{
		YELLOW(0, "yellow"),
		BLUE(1, "blue"),
		GREEN(2, "green"),
		RED(3, "red");
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private EnumType(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocializedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocializedName() 
		{
			return this.unlocializedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
		
		
	}
	
	public static enum EnumFlowerType implements IStringSerializable
	{
		Cornflower(0, "cornflower", "blue"),
		IcyIris(1, "icyiris", "blue"),
		BlueHydrangea(2, "bluehydrangea", "blue"),
		bromeliad(3, "bromeliad", "red"),
		Marigold(4, "marigold", "red"),
		Zinnia(5, "zinnia", "green"),
		Hydrangea(6, "hydragea", "green"),
		Daylily(7, "daylily", "green"),
		Kelp(8, "kelp", "yellow"),
		Goldenrod(9, "goldenrod", "yellow");
		
		private static final EnumFlowerType[] META_LOOKUP = new EnumFlowerType[values().length];
		private final int meta;
		private final String name, unlocializedName, color;
		
		private EnumFlowerType(int meta, String name, String color) 
		{
			this(meta, name, name, color);
		}
		
		private EnumFlowerType(int meta, String name, String unlocializedName, String color) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
			this.color = color;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocializedName() 
		{
			return this.unlocializedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumFlowerType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumFlowerType enumflowertype : values())
			{
				META_LOOKUP[enumflowertype.getMeta()] = enumflowertype;
			}
		}
		
	}
}
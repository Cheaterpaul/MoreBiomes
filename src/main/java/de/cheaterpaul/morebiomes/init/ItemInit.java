package de.cheaterpaul.morebiomes.init;

import java.util.ArrayList;
import java.util.List;

import de.cheaterpaul.morebiomes.objects.items.ItemBase;
import de.cheaterpaul.morebiomes.objects.items.ToolAxe;
import de.cheaterpaul.morebiomes.objects.items.ToolHoe;
import de.cheaterpaul.morebiomes.objects.items.ToolPickaxe;
import de.cheaterpaul.morebiomes.objects.items.ToolShovel;
import de.cheaterpaul.morebiomes.objects.items.ToolSword;
import de.cheaterpaul.morebiomes.objects.items.armour.ArmourBase;
import de.cheaterpaul.morebiomes.util.handlers.EnumHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Smelting
	
	public static final Item YELLOW_INGOT = new ItemBase("ingot_yellow");
	public static final Item RED_INGOT = new ItemBase("ingot_red");
	public static final Item BLUE_INGOT = new ItemBase("ingot_blue");
	public static final Item GREEN_INGOT = new ItemBase("ingot_green");
	
	// Tools
	
		//Yellow
	
		public static final Item AXE_YELLOW = new ToolAxe("axe_yellow", EnumHandler.TOOL_YELLOW);
		public static final Item HOE_YELLOW = new ToolHoe("hoe_yellow", EnumHandler.TOOL_YELLOW);
		public static final Item PICKAXE_YELLOW = new ToolPickaxe("pickaxe_yellow", EnumHandler.TOOL_YELLOW);
		public static final Item SHOVEL_YELLOW = new ToolShovel("shovel_yellow", EnumHandler.TOOL_YELLOW);
		public static final Item SWORD_YELLOW = new ToolSword("sword_yellow", EnumHandler.TOOL_YELLOW);
		
		//Red
		
		public static final Item AXE_RED = new ToolAxe("axe_red", EnumHandler.TOOL_RED);
		public static final Item HOE_RED = new ToolHoe("hoe_red", EnumHandler.TOOL_RED);
		public static final Item PICKAXE_RED = new ToolPickaxe("pickaxe_red", EnumHandler.TOOL_RED);
		public static final Item SHOVEL_RED = new ToolShovel("shovel_red", EnumHandler.TOOL_RED);
		public static final Item SWORD_RED = new ToolSword("sword_red", EnumHandler.TOOL_RED);
		
		//Blue
		
		public static final Item AXE_BLUE = new ToolAxe("axe_blue", EnumHandler.TOOL_BLUE);
		public static final Item HOE_BLUE = new ToolHoe("hoe_blue", EnumHandler.TOOL_BLUE);
		public static final Item PICKAXE_BLUE = new ToolPickaxe("pickaxe_blue", EnumHandler.TOOL_BLUE);
		public static final Item SHOVEL_BLUE = new ToolShovel("shovel_blue", EnumHandler.TOOL_BLUE);
		public static final Item SWORD_BLUE = new ToolSword("sword_blue", EnumHandler.TOOL_BLUE);
		
		//Green
		
		public static final Item AXE_GREEN = new ToolAxe("axe_green", EnumHandler.TOOL_GREEN);
		public static final Item HOE_GREEN = new ToolHoe("hoe_green", EnumHandler.TOOL_GREEN);
		public static final Item PICKAXE_GREEN = new ToolPickaxe("pickaxe_green", EnumHandler.TOOL_GREEN);
		public static final Item SHOVEL_GREEN = new ToolShovel("shovel_green", EnumHandler.TOOL_GREEN);
		public static final Item SWORD_GREEN = new ToolSword("sword_green", EnumHandler.TOOL_GREEN);
	
	// Armor
		
		//Yellow
		
		public static final Item HELMET_YELLOW = new ArmourBase("helmet_yellow", EnumHandler.ARMOUR_YELLOW, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_YELLOW = new ArmourBase("chestplate_yellow", EnumHandler.ARMOUR_YELLOW, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINS_YELLOW = new ArmourBase("leggins_yellow", EnumHandler.ARMOUR_YELLOW, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_YELLOW = new ArmourBase("boots_yellow", EnumHandler.ARMOUR_YELLOW, 1, EntityEquipmentSlot.FEET);
		
		//Red
		
		public static final Item HELMET_RED = new ArmourBase("helmet_red", EnumHandler.ARMOUR_RED, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_RED = new ArmourBase("chestplate_red", EnumHandler.ARMOUR_RED, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINS_RED = new ArmourBase("leggins_red", EnumHandler.ARMOUR_RED, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_RED = new ArmourBase("boots_red", EnumHandler.ARMOUR_RED, 1, EntityEquipmentSlot.FEET);
		
		//Blue
		
		public static final Item HELMET_BLUE = new ArmourBase("helmet_blue", EnumHandler.ARMOUR_BLUE, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_BLUE = new ArmourBase("chestplate_blue", EnumHandler.ARMOUR_BLUE, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINS_BLUE = new ArmourBase("leggins_blue", EnumHandler.ARMOUR_BLUE, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_BLUE = new ArmourBase("boots_blue", EnumHandler.ARMOUR_BLUE, 1, EntityEquipmentSlot.FEET);
		
		//Green
		
		public static final Item HELMET_GREEN = new ArmourBase("helmet_green", EnumHandler.ARMOUR_GREEN, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_GREEN = new ArmourBase("chestplate_green", EnumHandler.ARMOUR_GREEN, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINS_GREEN = new ArmourBase("leggins_green", EnumHandler.ARMOUR_GREEN, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_GREEN = new ArmourBase("boots_green", EnumHandler.ARMOUR_GREEN, 1, EntityEquipmentSlot.FEET);
}

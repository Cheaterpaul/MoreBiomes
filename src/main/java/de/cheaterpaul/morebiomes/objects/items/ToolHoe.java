package de.cheaterpaul.morebiomes.objects.items;

import de.cheaterpaul.morebiomes.Main;
import de.cheaterpaul.morebiomes.Reference;
import de.cheaterpaul.morebiomes.init.ItemInit;
import de.cheaterpaul.morebiomes.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel{

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MoreBiomesItemsTab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

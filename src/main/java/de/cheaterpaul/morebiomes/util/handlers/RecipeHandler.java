package de.cheaterpaul.morebiomes.util.handlers;

import de.cheaterpaul.morebiomes.init.BlockInit;
import de.cheaterpaul.morebiomes.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerSmelting() {
		GameRegistry.addSmelting(new ItemStack(BlockInit.Colored_Ore,1,0), new ItemStack(ItemInit.YELLOW_INGOT), 5.0f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.Colored_Ore,1,1), new ItemStack(ItemInit.BLUE_INGOT), 5.0f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.Colored_Ore,1,2), new ItemStack(ItemInit.GREEN_INGOT), 5.0f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.Colored_Ore,1,3), new ItemStack(ItemInit.RED_INGOT), 5.0f);
	}
}

package com.Brumock.crafting;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDamage;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.Brumock.armor.GArmors;
import com.Brumock.tools.GTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager 
{
	public static void mainRegistry()
	{
		addCraftingRec();
		addSmeltingRec();
	}
	
	public static void addCraftingRec()
	{
			GameRegistry.addShapelessRecipe(new ItemStack(GTools.stunKnife, 1), new ItemStack(Items.iron_ingot));	
	}
	
	public static void addSmeltingRec()
	{}
}

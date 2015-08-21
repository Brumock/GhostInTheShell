package com.Brumock.armor;

import com.Brumock.creativetabs.GCreativeTabs;
import com.Brumock.ghostintheshellmod.MainRegistry;
import com.Brumock.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class GArmors 
{
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static ArmorMaterial ghostArmorMat = EnumHelper.addArmorMaterial("ghost", 40, new int[]{3, 8, 6, 3}, 10);
	//Items are created here!
	public static Item ghostHelmet;
	public static Item ghostChest;
	public static Item ghostLegs;
	public static Item ghostBoots;
	//Items are identifed here!
	public static void initializeItem()
	{
		ghostHelmet = new GhostArmor(ghostArmorMat, MainRegistry.proxyServer.addArmor("GhostArmor"), 0)
		.setUnlocalizedName("ghostHelmet").setCreativeTab(GCreativeTabs.armorTab).setTextureName(RefStrings.MODID + ":ghostHelmet");
		
		ghostChest = new GhostArmor(ghostArmorMat, MainRegistry.proxyServer.addArmor("GhostArmor"), 1)
		.setUnlocalizedName("ghostChest").setCreativeTab(GCreativeTabs.armorTab).setTextureName(RefStrings.MODID + ":ghostChest");
		
		ghostLegs = new GhostArmor(ghostArmorMat, MainRegistry.proxyServer.addArmor("GhostArmor"), 2)
		.setUnlocalizedName("ghostLegs").setCreativeTab(GCreativeTabs.armorTab).setTextureName(RefStrings.MODID + ":ghostLegs");
		
		ghostBoots = new GhostArmor(ghostArmorMat, MainRegistry.proxyServer.addArmor("GhostArmor"), 3)
		.setUnlocalizedName("ghostBoots").setCreativeTab(GCreativeTabs.armorTab).setTextureName(RefStrings.MODID + ":ghostBoots");
	}
	
	public static void registerItem()
	{
		GameRegistry.registerItem(ghostHelmet, ghostHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ghostChest, ghostChest.getUnlocalizedName());
		GameRegistry.registerItem(ghostLegs, ghostLegs.getUnlocalizedName());
		GameRegistry.registerItem(ghostBoots, ghostBoots.getUnlocalizedName());
	}
}

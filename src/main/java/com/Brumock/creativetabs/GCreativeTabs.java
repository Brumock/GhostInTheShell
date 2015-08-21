package com.Brumock.creativetabs;

import net.minecraft.creativetab.CreativeTabs;


public class GCreativeTabs 
{
	public static CreativeTabs armorTab;
	public static CreativeTabs toolsTab;
	
	public static void initialiseTabs()
	{
		armorTab = new CreativeTabArmor("armorTab");
		toolsTab = new CreativeTabTools("toolsTab");
	}
}

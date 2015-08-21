package com.Brumock.creativetabs;

import com.Brumock.armor.GArmors;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabArmor extends CreativeTabs 
{
	public CreativeTabArmor(String name) 
	{
		super(name);
	}

	@Override
	public Item getTabIconItem() 
	{
		return GArmors.ghostHelmet;
	}

}

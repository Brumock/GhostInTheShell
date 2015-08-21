package com.Brumock.creativetabs;

import com.Brumock.tools.GTools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTools extends CreativeTabs 
{
	public CreativeTabTools(String name) 
	{
		super(name);
	}

	@Override
	public Item getTabIconItem() 
	{
		return GTools.stunKnife;
	}

}

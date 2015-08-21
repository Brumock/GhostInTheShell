package com.Brumock.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.Brumock.lib.RefStrings;

public class GhostArmor extends ItemArmor
{
	public GhostArmor(ArmorMaterial material, int durability, int enchantability) 
	{
		super(material, durability, enchantability);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == GArmors.ghostHelmet || stack.getItem() == GArmors.ghostChest || stack.getItem() == GArmors.ghostBoots)
		{
			return RefStrings.MODID + ":textures/models/armor/ghost1.png";
		}
		
		else if(stack.getItem() == GArmors.ghostLegs)
		{
			return RefStrings.MODID + ":textures/models/armor/ghost2.png";
		}
		else
		{
			return null;
		}
	}
}

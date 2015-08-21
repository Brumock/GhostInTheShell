package com.Brumock.tools;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.Brumock.creativetabs.GCreativeTabs;
import com.Brumock.lib.RefStrings;

public class StunKnife extends ItemSword
{
	public StunKnife(ToolMaterial material) 
	{
		super(material);
		
		this.setFull3D();
		this.setUnlocalizedName("stunKnife");
		this.setTextureName(RefStrings.MODID + ":stunKnife");
		this.setCreativeTab(GCreativeTabs.toolsTab);
	}
	
	@Override
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entity, EntityLivingBase player)
    {
		itemStack.damageItem(1, player);
		entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 140, 10));
		
        return true;
    }
}

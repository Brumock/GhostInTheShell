package com.Brumock.tools;

import com.Brumock.creativetabs.GCreativeTabs;
import com.Brumock.lib.RefStrings;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class GTools 
{
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial ghostToolMaterial;
	
	public static Item stunKnife;
	
	public static void initializeItem()
	{
		// Swords will always hit for 4 more damage than stated in this
		if(RefStrings.DEBUG)
		{
			ghostToolMaterial = EnumHelper.addToolMaterial("GhostTools", 4, -1, 10.0f, 0f, 10);
		}
		else
		{
			ghostToolMaterial = EnumHelper.addToolMaterial("GhostTools", 4, 5004, 10.0f, 0f, 10);
		}
		
		stunKnife = new StunKnife(ghostToolMaterial);
	}
	
	public static void registerItem()
	{
		GameRegistry.registerItem(stunKnife, stunKnife.getUnlocalizedName());
	}
}

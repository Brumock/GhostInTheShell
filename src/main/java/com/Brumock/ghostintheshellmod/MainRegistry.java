package com.Brumock.ghostintheshellmod;

import com.Brumock.crafting.CraftingManager;
import com.Brumock.armor.GArmors;
import com.Brumock.creativetabs.GCreativeTabs;
import com.Brumock.lib.RefStrings;
import com.Brumock.tools.GTools;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry 
{
	@Mod.Instance(RefStrings.MODID)
	
	public static MainRegistry gitsm;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxyServer;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		GCreativeTabs.initialiseTabs();
		
		GTools.mainRegistry();
		GArmors.mainRegistry();
		
		CraftingManager.mainRegistry();
		
		proxyServer.registerRenderInfo();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event)
	{}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent)
	{}
}

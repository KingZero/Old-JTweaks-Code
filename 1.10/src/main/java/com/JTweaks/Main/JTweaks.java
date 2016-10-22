package com.JTweaks.Main;

import java.util.EventListener;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.JTweaks.Main.Blocks.*;
import com.JTweaks.Main.Crops.*;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Util.*;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.registry.*;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class JTweaks {

//References
    @Mod.Instance(Reference.MODID)
    public static JTweaks instance;
    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static CommonProxy Proxy;
    
//Tabs ---------------------------------------------------------------------
    public static CreativeTabs tabJBlocks = new JMisc(CreativeTabs.getNextID(), "tabJBlocks");
    
    public static CreativeTabs tabJCrops = new JMisc(CreativeTabs.getNextID(), "tabJCrops");
    
    public static CreativeTabs tabJItems = new JMisc(CreativeTabs.getNextID(), "tabJItems");

    public static CreativeTabs tabJMisc = new JMisc(CreativeTabs.getNextID(), "tabJMisc");
    
	//Material
	public static ToolMaterial MaterialNether =  EnumHelper.addToolMaterial("Nether", 3, 2000, 15.0F, 40.0F, 50);
	//WOOD(0, 59, 2.0F, 0.0F, 15),  STONE(1, 131, 4.0F, 1.0F, 5),  IRON(2, 250, 6.0F, 2.0F, 14),  EMERALD(3, 1561, 8.0F, 3.0F, 10),  GOLD(0, 32, 12.0F, 0.0F, 22);
		
//GUI ----------------------------------------------------------------------
	public static int ItemGuiIndex = 0;
    public static final int ItemBackpackGui = ItemGuiIndex;
    
	public static int BlockGuiIndex = 1;
    public static final int BlockForgeGui = BlockGuiIndex;
	
	
/*-------------------------------------------------------------------------------------------*/  
	
    //Pre Registry Start
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Proxy.preInit(event);
		}
	
/*-------------------------------------------------------------------------------------------*/
	
    //Registry Start
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
		Proxy.init(event);		
    }
    
/*-------------------------------------------------------------------------------------------*/
    
    //Post Registry Start
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	Proxy.postInit(event);
    }
}
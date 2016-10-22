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

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

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
	public void preInit(FMLPreInitializationEvent event)
	{
//		Dimensions.init();
		JBlocks.init();
		JCrops.init();
		JItems.init();
		ItemStaffs.init();
		ItemScythes.init();
		}
	
/*-------------------------------------------------------------------------------------------*/
	
    //Registry Start
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	MinecraftForge.EVENT_BUS.register(this);
    	
    	FMLCommonHandler.instance().bus().register(new JAchievements());
    	FMLCommonHandler.instance().bus().register(this);
    	
		GameRegistry.registerFuelHandler(new Fuel());
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		
		AchievementPage.registerAchievementPage(JAchievements.achievementPage);
		JAchievements.achievement.registerStat();
		
    	Proxy.registerRender();
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonProxy());
    }
    
/*-------------------------------------------------------------------------------------------*/
    
    //Post Registry Start
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
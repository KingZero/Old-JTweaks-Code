package com.JTweaks.Main.Util;

import com.JTweaks.Main.JAchievements;
import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Blocks.Forge.*;
import com.JTweaks.Main.Crops.JCrops;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Items.Backpack.*;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
	
    //Pre Registry Start
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		JCrops.init();
		JRegistery.init();
		JRegistery.recipes();
		
//		NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonProxy());
		}

    //Registry Start
	
    @EventHandler
	public void init(FMLInitializationEvent event) {
    	
    	MinecraftForge.EVENT_BUS.register(JTweaks.instance);
    	
    	FMLCommonHandler.instance().bus().register(new JAchievements());
    	FMLCommonHandler.instance().bus().register(JTweaks.instance);
		
		AchievementPage.registerAchievementPage(JAchievements.achievementPage);
		JAchievements.achievement.registerStat();
    }
    
    //Post Registry Start
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
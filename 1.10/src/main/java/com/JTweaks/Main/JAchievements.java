package com.JTweaks.Main;

import com.JTweaks.Main.Util.Reference;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.*;

public class JAchievements {
	
	public static Achievement achievement = (new Achievement("0", Reference.MODID + "." + "Achievement",
			-1, -1, Blocks.WOOL, AchievementList.OPEN_INVENTORY));
	
	public static AchievementPage achievementPage = new AchievementPage("J Achievements", achievement, achievement);
	
	public void crafting(ItemCraftedEvent event) {
		if(event.crafting.getItem() == Items.GOLDEN_APPLE) {
			event.player.addStat(this.achievement, 1);
			}
		}
	public void smelting(ItemSmeltedEvent event) {
		if(event.smelting.getItem() == Items.GOLD_INGOT) {
			event.player.addStat(this.achievement, 1);
			}
		}
	public void pickup(ItemPickupEvent event) {
		if(event.pickedUp.getEntityItem().getItem() == Items.GOLD_INGOT) {
			event.player.addStat(this.achievement, 1);
			}
		}
}

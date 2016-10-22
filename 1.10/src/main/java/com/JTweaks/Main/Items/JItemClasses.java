package com.JTweaks.Main.Items;

import com.JTweaks.Main.JTweaks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class JItemClasses {

	static class ItemScytheHead extends Item{
		
		public ItemScytheHead(Item.ToolMaterial par1) {
			super();
			maxStackSize = 1;
			setMaxDamage(par1.getMaxUses());
			setCreativeTab(JTweaks.tabJItems);
		}
	}
	
	static class ItemStaffs extends ItemSword {
		    
		public ItemStaffs() {
			super(ToolMaterial.WOOD);
			setCreativeTab(JTweaks.tabJItems);
		}
	}

	static class ItemScythes extends ItemSword{
		
		protected float field_150934_a;
	    public Item.ToolMaterial field_150933_b;

		public ItemScythes(Item.ToolMaterial par1, int par2, int par3) {
			super(par1);
			setItemEnchantability(par2);
			setMaxDamage(getMaxDamage() + par3);
	        field_150933_b = par1;
	        maxStackSize = 1;
	        field_150934_a = 6.0F + par1.getDamageVsEntity();
			setCreativeTab(JTweaks.tabJItems);
			}
		
		public int setItemEnchantability(int i)
	    {
			return (this.getItemEnchantability() + i);
	    }
		
	/*	public int setOblink()
	    {
			return (this.getMaxDamage() + 45);
	    }
		
		public int setObsidian()
	    {
			return (this.getMaxDamage() + 500);
	    } */
	}
}
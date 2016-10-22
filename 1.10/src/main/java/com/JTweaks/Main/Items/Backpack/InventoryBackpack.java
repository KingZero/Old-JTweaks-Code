package com.JTweaks.Main.Items.Backpack;

import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.Constants;

public class InventoryBackpack implements IInventory
{
	private String name = "Inventory Backpack";
	
	private final ItemStack invItem;

	public static final int INV_SIZE = 8;

	private ItemStack[] inventory = new ItemStack[INV_SIZE];

	public InventoryBackpack(ItemStack stack){
		invItem = stack;
		if (!stack.hasTagCompound()) {
			stack.setTagCompound(new NBTTagCompound());
		}
		readFromNBT(stack.getTagCompound());
	}
	
	@Override
	public String getName(){
		return name;
	}

	@Override
	public boolean hasCustomName(){
		return name.length() > 0;
	}

	@Override
	public ITextComponent getDisplayName() {
		// TODO
		return null;
	}
	
	@Override
	public int getSizeInventory(){
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot){
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount){
		ItemStack stack = getStackInSlot(slot);
		if(stack != null)
		{
			if(stack.stackSize > amount)
			{
				stack = stack.splitStack(amount);
				markDirty();
			}
			else
			{
				setInventorySlotContents(slot, null);
			}
		}
		return stack;
	}

	@Override
	public ItemStack removeStackFromSlot(int slot){
		ItemStack stack = getStackInSlot(slot);
		setInventorySlotContents(slot, null);
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack){
		inventory[slot] = stack;

		if (stack != null && stack.stackSize > getInventoryStackLimit())
		{
			stack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}

	@Override
	public int getInventoryStackLimit(){
		return 64;
	}

	@Override
	public void markDirty()
	{
		for (int i = 0; i < getSizeInventory(); ++i)
		{
			if (getStackInSlot(i) != null && getStackInSlot(i).stackSize == 0) {
				inventory[i] = null;
			}
		}
		writeToNBT(invItem.getTagCompound());
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer){
		return true;
	}

	@Override
	public void openInventory(EntityPlayer player) {
	}

	@Override
	public void closeInventory(EntityPlayer player) {
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack){
		return !(itemstack.getItem() instanceof ItemBackpack);
	}

	@Override
	public int getField(int id) {
	    return 0;
	}

	@Override
	public void setField(int id, int value) {
	}

	@Override
	public int getFieldCount() {
	    return 0;
	}

	@Override
	public void clear() {
	    for (int i = 0; i < this.getSizeInventory(); i++)
	        this.setInventorySlotContents(i, null);
	}
	
	public void readFromNBT(NBTTagCompound compound)
	{
		NBTTagList items = compound.getTagList("InventoryBackpack", Constants.NBT.TAG_COMPOUND);

		for (int i = 0; i < items.tagCount(); ++i)
		{
			NBTTagCompound item = (NBTTagCompound) items.getCompoundTagAt(i);
			int slot = item.getInteger("Slot");
			if (slot >= 0 && slot < getSizeInventory()) {
				inventory[slot] = ItemStack.loadItemStackFromNBT(item);
			}
		}
	}

	public void writeToNBT(NBTTagCompound tagcompound)
	{
		NBTTagList items = new NBTTagList();

		for (int i = 0; i < getSizeInventory(); ++i)
		{
			if (getStackInSlot(i) != null)
			{
				NBTTagCompound item = new NBTTagCompound();
				item.setInteger("Slot", i);
				getStackInSlot(i).writeToNBT(item);
				items.appendTag(item);
			}
		}
		tagcompound.setTag("InventoryBackpack", items);
	}
}
package com.JTweaks.Main.Items.Backpack;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ContainerBackpack extends Container {
	
	public final InventoryBackpack inventory;
	
	private InventoryBackpack te;
	
/*	public ContainerBackpack(IInventory playerInv, InventoryBackpack te) {
	    this.te = te;

	    // Tile Entity, Slot 0-8, Slot IDs 0-8
	    for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 3; ++x) {
	            this.addSlotToContainer(new Slot(te, x + y * 3, 62 + x * 18, 17 + y * 18));
	        }
	    }

	    // Player Inventory, Slot 9-35, Slot IDs 9-35
	    for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x) {
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
	        }
	    }

	    // Player Inventory, Slot 0-8, Slot IDs 36-44
	    for (int x = 0; x < 9; ++x) {
	        this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 142));
	    }
	}
	*/
	
	private static final int 
	INV_START = InventoryBackpack.INV_SIZE, INV_END = INV_START+26,
	HOTBAR_START = INV_END+1, HOTBAR_END = HOTBAR_START+8
			
			;

	public ContainerBackpack(EntityPlayer par1Player, InventoryPlayer inventoryPlayer, InventoryBackpack inventorybackpack)
	{
		this.inventory = inventorybackpack;

		int i;
		for (i = 0; i < InventoryBackpack.INV_SIZE; ++i)
		{
			this.addSlotToContainer(new JSlots(this.inventory, i, 80 + (18 * (int)(i/4)), 8 + (18*(i%4))));
		}
		//Vanilla Inventory
		for (i = 0; i < 3; ++i)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for (i = 0; i < 9; ++i)
		{
			this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
		}
	}

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.te.isUseableByPlayer(playerIn);
    }
	
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();

            if (fromSlot < 9) {
                // From TE Inventory to Player Inventory
                if (!this.mergeItemStack(current, 9, 45, true))
                    return null;
            } else {
                // From Player Inventory to TE Inventory
                if (!this.mergeItemStack(current, 0, 9, false))
                    return null;
            }

            if (current.stackSize == 0)
                slot.putStack((ItemStack) null);
            else
                slot.onSlotChanged();

            if (current.stackSize == previous.stackSize)
                return null;
            slot.onPickupFromSlot(playerIn, current);
        }
        return previous;
    }

	public ItemStack slotClick(int slot, int button, ClickType flag, EntityPlayer player) {
		if (slot >= 0 && getSlot(slot) != null && getSlot(slot).getStack() == player.getHeldItemMainhand()) {
			return null;
		}
		return super.func_184996_a(slot, button, flag, player);
	}

/*	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return inventory.isUseableByPlayer(entityplayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int index)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (index < INV_START)
			{
				if (!this.mergeItemStack(itemstack1, INV_START, HOTBAR_END+1, true))
				{
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			}
			else
			{
				if (index >= INV_START)
				{
					if (!this.mergeItemStack(itemstack1, 0, INV_START, false))
					{
						return null;
					}
				}
				if (index >= INV_START && index < HOTBAR_START)
				{
					if (!this.mergeItemStack(itemstack1, HOTBAR_START, HOTBAR_END+1, false))
					{
						return null;
					}
				}
				else if (index >= HOTBAR_START && index < HOTBAR_END+1)
				{
					if (!this.mergeItemStack(itemstack1, INV_START, INV_END+1, false))
					{
						return null;
					}
				}
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack) null);
			}
			else
			{
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize)
			{
				return null;
			}

			slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
		}

		return itemstack;
	}*/
}
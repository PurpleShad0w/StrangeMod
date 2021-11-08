package net.purple_shadow.strangemod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VioletiteHammer extends Item {
    public VioletiteHammer(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        if(container.hurt(1, random, null)) {
            return ItemStack.EMPTY;
        } else {
            return container;
        }
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}

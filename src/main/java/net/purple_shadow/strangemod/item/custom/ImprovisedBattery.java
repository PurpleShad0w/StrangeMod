package net.purple_shadow.strangemod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ImprovisedBattery extends Item {
    public ImprovisedBattery(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        return container;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}

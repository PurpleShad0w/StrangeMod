package net.purple_shadow.strangemod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.purple_shadow.strangemod.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup STRANGE_MOD = new ItemGroup("strangemod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VIOLETITE_INGOT.get());
        }
    };

    public static final ItemGroup STRANGE_MOD_BLOCKS = new ItemGroup("strangemodblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.VIOLETITE_BLOCK.get());
        }
    };

    public static final ItemGroup ELEMENTS = new ItemGroup("elements") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemsElements.HYDROGEN.get());
        }
    };

}

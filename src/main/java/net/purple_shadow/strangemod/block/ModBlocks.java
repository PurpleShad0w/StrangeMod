package net.purple_shadow.strangemod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.purple_shadow.strangemod.StrangeMod;
import net.purple_shadow.strangemod.item.ModItemGroup;
import net.purple_shadow.strangemod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, StrangeMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.STRANGE_MOD_BLOCKS)));
    }

    public static final RegistryObject<Block> VIOLETITE_BLOCK = registerBlock("violetite_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SIFTER = registerBlock("sifter",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .harvestLevel(1).harvestTool(ToolType.AXE).strength(1f).noOcclusion()));


}

package net.purple_shadow.strangemod.item;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.purple_shadow.strangemod.StrangeMod;

public class ModItemsElements {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, StrangeMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> HYDROGEN = ITEMS.register("hydrogen",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS)));

}

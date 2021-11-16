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
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> HELIUM = ITEMS.register("helium",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> BERYLLIUM = ITEMS.register("beryllium",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> NITROGEN = ITEMS.register("nitrogen",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> OXYGEN = ITEMS.register("oxygen",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));

    public static final RegistryObject<Item> SODIUM = ITEMS.register("sodium",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ELEMENTS).stacksTo(1000000)));
}

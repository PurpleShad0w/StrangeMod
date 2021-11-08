package net.purple_shadow.strangemod.item;

import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.purple_shadow.strangemod.StrangeMod;
import net.purple_shadow.strangemod.item.custom.ImprovisedBattery;
import net.purple_shadow.strangemod.item.custom.VioletiteHammer;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, StrangeMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> VIOLETITE_INGOT = ITEMS.register("violetite_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<SwordItem> VIOLETITE_SWORD = ITEMS.register("violetite_sword",
            () -> new SwordItem(ModItemTier.VIOLETITE, 1, -1.5f, (new Item.Properties()).tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<AxeItem> VIOLETITE_AXE = ITEMS.register("violetite_axe",
            () -> new AxeItem(ModItemTier.VIOLETITE, 4, -3f, (new Item.Properties()).tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<PickaxeItem> VIOLETITE_PICKAXE = ITEMS.register("violetite_pickaxe",
            () -> new PickaxeItem(ModItemTier.VIOLETITE, -1, -2f, (new Item.Properties()).tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<ShovelItem> VIOLETITE_SHOVEL = ITEMS.register("violetite_shovel",
            () -> new ShovelItem(ModItemTier.VIOLETITE, -1, -2f, (new Item.Properties()).tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<HoeItem> VIOLETITE_HOE = ITEMS.register("violetite_hoe",
            () -> new HoeItem(ModItemTier.VIOLETITE, -3, 0f, (new Item.Properties()).tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> STRING_NET = ITEMS.register("string_net",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> VIOLETITE_HAMMER = ITEMS.register("violetite_hammer",
            () -> new VioletiteHammer(new Item.Properties().tab(ModItemGroup.STRANGE_MOD).durability(100)));

    public static final RegistryObject<Item> RED_IRON_INGOT = ITEMS.register("red_iron_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> RED_GOLD_INGOT = ITEMS.register("red_gold_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> RED_IRON_STRIP = ITEMS.register("red_iron_strip",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> RED_GOLD_STRIP = ITEMS.register("red_gold_strip",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> SALINE_WATER_BOTTLE = ITEMS.register("saline_water_bottle",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> IMPROVISED_BATTERY = ITEMS.register("improvised_battery",
            () -> new ImprovisedBattery(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));

    public static final RegistryObject<Item> BOWL_OF_CAUSTIC_SODA = ITEMS.register("bowl_of_caustic_soda",
            () -> new Item(new Item.Properties().tab(ModItemGroup.STRANGE_MOD)));
}

// For tools - first value is Attack Power (ATK = 1.0 + AttackPower + Tier)
// For tools - second value is Attack Speed (SPD = 4.0 + AttackSpeed)
// For items with a custom class call the class' name instead of Item

package net.purple_shadow.strangemod.item;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

@MethodsReturnNonnullByDefault
public enum ModItemTier implements IItemTier {
    VIOLETITE(3, 750, 7F, 4.0F, 10, () -> Ingredient.of(ModItems.VIOLETITE_INGOT.get()));

    private final Supplier<Ingredient> repairmaterial;
    private final int enchantability;
    private final float attackDamage;
    private final float efficiency;
    private final int maxUses;
    private final int harvestLevel;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairmaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairmaterial = repairmaterial;
    }
    @Override
    public int getUses() {
        return maxUses;
    }
    @Override
    public float getSpeed() {
        return efficiency;
    }
    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }
    @Override
    public int getLevel() {
        return harvestLevel;
    }
    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return repairmaterial.get();
    }
}
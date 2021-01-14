package elisis.anpm.common.item.tool;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterials implements IItemTier {
    FLINT(1, 47, 2.0f),
    CRUDE_COPPER(2, 259, 1.5f), // from soft native copper
    INGOT_COPPER(2, 259, 2.0f), // from (hot) copper ingot
    CRUDE_TIN(2, 119, 1.3f ), // from soft native tin
    INGOT_TIN(2, 249, 1.8f), // from (hot) tin ingot
    CRUDE_BRONZE(2, 159, 1.7f), // from crude cuprostan alloy
    INGOT_BRONZE(2, 349, 2.3f), // from (hot) bronze ingot
    WROUGHT_IRON(3, 379, 2.0f),
    COATED_STEEL(3,479, 2.6f)
    ;
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    
    private ToolMaterials(int harvestLevel, int maxUses, float efficiency) {
        
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() { //These are axes smh, not swords
        return 0.0f;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return 0; //Can't enchant these
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null; //Nor repair them
    }

}

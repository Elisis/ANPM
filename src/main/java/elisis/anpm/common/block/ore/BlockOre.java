package elisis.anpm.common.block.ore;

import elisis.anpm.ANPM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class BlockOre extends Block {

    public BlockOre(OreType TYPE) {
        
        super(
            AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(TYPE.hardness, TYPE.resistance)
                .sound(SoundType.STONE)
                .harvestLevel(TYPE.harvestLevel)
                .harvestTool(ToolType.PICKAXE)
                
            );
    }
    
    public final BlockItem returnBlockItem() {
        
        return new BlockItem(this, new Item.Properties().group(ANPM.creativeTab));
        
    }
    
    @SuppressWarnings("unused")
    public enum OreType {
        
        CHALCOCITE(0, "chalcocite", 3.0f, 5.0f, 1),
        CASSITERITE(1, "cassiterite", 2.8f, 4.5f, 1),
        ;
        
        
        private final int metadata;
        private final String name;
        
        private final float hardness;
        private final float resistance;
        private final int harvestLevel;
        
        OreType(int metadata, String name, float hardness, float resistance, int harvestLevel) {
            
            this.metadata = metadata;
            this.name = name;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
            
        }
        
    }
    
}

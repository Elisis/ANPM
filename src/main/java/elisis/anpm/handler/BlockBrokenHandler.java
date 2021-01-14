package elisis.anpm.handler;

import elisis.anpm.ANPM;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockBrokenHandler {
    
    @SubscribeEvent
    public void blockBroken(PlayerEvent.HarvestCheck event) {
        
        ANPM.LOGGER.warn("entered blockBroken");
        
        ItemStack toolUsed = event.getPlayer().getHeldItem(Hand.MAIN_HAND);
        
        if (event.getTargetBlock().getMaterial() == Material.WOOD)
            if (!toolUsed.getToolTypes().contains(ToolType.get("axe"))) {
                
                ANPM.LOGGER.warn("Incorrect tool used");
                event.setCanHarvest(false);
            
            }
    
        
    }

}

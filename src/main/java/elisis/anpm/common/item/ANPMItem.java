package elisis.anpm.common.item;

import elisis.anpm.ANPM;
import net.minecraft.item.Item;

public abstract class ANPMItem extends Item {

    public ANPMItem() {
        
        super(new Properties().group(ANPM.creativeTab));
        
    }

}

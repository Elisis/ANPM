package elisis.anpm.common.item.tool;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AxeFlintSmall extends AxeItem {

    public AxeFlintSmall() {
        
        super(ToolMaterials.FLINT, 0.0f, 0.0f, new Item.Properties().group(ItemGroup.TOOLS));
        
    }

}

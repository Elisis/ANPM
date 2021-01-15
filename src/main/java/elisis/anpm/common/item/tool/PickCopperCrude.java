package elisis.anpm.common.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class PickCopperCrude extends PickaxeItem {
    
    public PickCopperCrude() {
        
        super(ToolMaterials.SOFT_NATIVE_COPPER, 0, 0.0f, new Item.Properties().group(ItemGroup.TOOLS));
        
    }

}

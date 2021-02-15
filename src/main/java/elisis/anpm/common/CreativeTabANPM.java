package elisis.anpm.common;

import elisis.anpm.ANPM;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CreativeTabANPM extends ItemGroup {

    public CreativeTabANPM() {
        
        super(ANPM.MODID);
        
    }

    @Override
    public ItemStack createIcon() {
        
        //Because Minecraft decides to fucking crash when this is undefined
        return new ItemStack(Items.ACACIA_BOAT);
    }

}

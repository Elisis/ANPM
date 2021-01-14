package elisis.anpm.setup;

import elisis.anpm.ANPM;
import elisis.anpm.common.item.AxeFlintSmall;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistration {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ANPM.MODID);
    
    public static final RegistryObject<Item> AXE_FLINT_SMALL = ITEMS.register("axe_flint_small", AxeFlintSmall::new);
    
    public static void init() {
        
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        
    }

}

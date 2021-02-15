package elisis.anpm.setup;

import java.util.function.Supplier;

import elisis.anpm.ANPM;
import elisis.anpm.common.block.ore.OreCassiterite;
import elisis.anpm.common.block.ore.OreChalcocite;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistration {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ANPM.MODID);
    
    
    public static final RegistryObject<OreChalcocite> ORE_CHALCOCITE = register("ore_chalcocite", OreChalcocite::new);
    
    
    public static final RegistryObject<OreCassiterite> ORE_CASSITERITE = register("ore_cassiterite", OreCassiterite::new);
    
    
    
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> supplier) {
        
        return BLOCKS.register(name, supplier);
        
    }
    
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier) {
        
        RegistryObject<T> ret = registerNoItem(name, supplier);
        ItemRegistration.ITEMS.register(name, () -> new BlockItem(supplier.get(), new Item.Properties().group(ANPM.creativeTab)));
        
        return ret;
        
    }
    
    
    public static void init() {
        
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        
    }

}

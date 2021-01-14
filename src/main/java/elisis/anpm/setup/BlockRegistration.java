package elisis.anpm.setup;

import elisis.anpm.ANPM;
import net.minecraft.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistration {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ANPM.MODID);
    
    public static void init() {
        
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        
    }

}

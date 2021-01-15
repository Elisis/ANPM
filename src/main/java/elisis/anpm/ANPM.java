package elisis.anpm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import elisis.anpm.handler.BlockBrokenHandler;
import elisis.anpm.setup.ItemRegistration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ANPM.MODID)
public class ANPM {
    
    public static final String MODID = "anpm";
    
    public static final Logger LOGGER = LogManager.getLogger();

    public ANPM() {
        
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
        MinecraftForge.EVENT_BUS.register(new BlockBrokenHandler());
        
        ItemRegistration.init();
        
    }

    private void setup(final FMLCommonSetupEvent event) {}
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}

}

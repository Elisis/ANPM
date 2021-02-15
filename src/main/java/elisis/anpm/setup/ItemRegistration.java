package elisis.anpm.setup;

import elisis.anpm.ANPM;
import elisis.anpm.common.item.ChunkRawNativeCopper;
import elisis.anpm.common.item.ChunkRawNativeIron;
import elisis.anpm.common.item.ChunkRawNativeTin;
import elisis.anpm.common.item.EarthMineralCopper;
import elisis.anpm.common.item.EarthMineralIron;
import elisis.anpm.common.item.EarthMineralTin;
import elisis.anpm.common.item.IngotCopper;
import elisis.anpm.common.item.IngotHotCopper;
import elisis.anpm.common.item.SoftNativeCopper;
import elisis.anpm.common.item.tool.AxeCopperCrude;
import elisis.anpm.common.item.tool.AxeFlintSmall;
import elisis.anpm.common.item.tool.PickCopperCrude;
import elisis.anpm.common.item.tool.ToolheadAxeCopper;
import elisis.anpm.common.item.tool.ToolheadPickCopper;
import elisis.anpm.common.item.tool.ToolheadShovelCopper;
import elisis.anpm.common.item.tool.ToolheadSwordCopper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistration {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ANPM.MODID);
    
    // public static final RegistryObject<T> AAA = ITEMS.register("aaa", T::new)
    
    //Raw material (TYPE_DESCRIPTORS_MATERIAL)
    // Copper
    public static final RegistryObject<ChunkRawNativeCopper> CHUNK_RAW_NATIVE_COPPER = ITEMS.register("chunk_raw_native_copper", ChunkRawNativeCopper::new);
    public static final RegistryObject<EarthMineralCopper> EARTH_MINERAL_COPPER = ITEMS.register("earth_mineral_copper", EarthMineralCopper::new);
    
    
    // Iron
    public static final RegistryObject<ChunkRawNativeIron> CHUNK_RAW_NATIVE_IRON = ITEMS.register("chunk_raw_native_iron", ChunkRawNativeIron::new);
    public static final RegistryObject<EarthMineralIron> EARTH_MINERAL_IRON = ITEMS.register("earth_mineral_iron", EarthMineralIron::new);
    
    // Tin
    public static final RegistryObject<ChunkRawNativeTin> CHUNK_RAW_NATIVE_TIN = ITEMS.register("chunk_raw_native_tin", ChunkRawNativeTin::new);
    public static final RegistryObject<EarthMineralTin> EARTH_MINERAL_TIN = ITEMS.register("earth_mineral_tin", EarthMineralTin::new);
    
    
    
    //Refined material (TYPE_DESCRIPTORS_MATERIAL)
    // Copper
    public static final RegistryObject<SoftNativeCopper> SOFT_NATIVE_COPPER = ITEMS.register("soft_native_copper", SoftNativeCopper::new); 
    public static final RegistryObject<IngotHotCopper> INGOT_HOT_COPPER = ITEMS.register("ingot_hot_copper", IngotHotCopper::new);
    public static final RegistryObject<IngotCopper> INGOT_COPPER = ITEMS.register("ingot_copper", IngotCopper::new);
    
    //Iron
    
    
    //Tool head
    // Copper
    public static final RegistryObject<ToolheadPickCopper> TOOLHEAD_PICK_COPPER = ITEMS.register("toolhead_pick_copper", ToolheadPickCopper::new);
    public static final RegistryObject<ToolheadAxeCopper> TOOLHEAD_AXE_COPPER = ITEMS.register("toolhead_axe_copper", ToolheadAxeCopper::new);
    public static final RegistryObject<ToolheadShovelCopper> TOOLHEAD_SHOVEL_COPPER = ITEMS.register("toolhead_shovel_copper", ToolheadShovelCopper::new);
    public static final RegistryObject<ToolheadSwordCopper> TOOLHEAD_SWORD_COPPER = ITEMS.register("toolhead_sword_copper", ToolheadSwordCopper::new);
    
    
    //Tool (TYPE_MATERIAL_DESCRIPTORS)
    // Copper
    public static final RegistryObject<PickCopperCrude> PICK_COPPER_CRUDE = ITEMS.register("pick_copper_crude", PickCopperCrude::new);
    public static final RegistryObject<AxeCopperCrude> AXE_COPPER_CRUDE = ITEMS.register("axe_copper_crude", AxeCopperCrude::new);
    
    // Flint
    public static final RegistryObject<Item> AXE_FLINT_SMALL = ITEMS.register("axe_flint_small", AxeFlintSmall::new);
    
    public static void init() {
        
        //ANPM.LOGGER.warn("in Item init");
        
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        
    }

}

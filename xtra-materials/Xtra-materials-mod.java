package xtra-materials;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

@Mod(modid="Xtra-materials", name="Xtra-materials-mod", version="0.1 Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Xtra-materials-mod{
  @Instance("xtra materials mod")
  public static Xtra-materials-mod instance;
  
  //items
  public static final Item titaniumIngot = new TitaniumIngot(8451).setUnlocalizedName("titaniumIngot");
  public static final Item oreTransmuttater = new OreTransmuttater(8450).setUnlocalizedName("oreTransmuttater");
  public static final Item matterialTransmuttater = new MatterialTransmuttater(8450).setUnlocalizedName("matterialTransmuttater");
  
  //blocks
  public static final Block titaniumOre = new TitaniumOre(9451, "titanium_ore").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setUnlocalizedName("titaniumOre");
  
  //commands
  public static final CommandBase getTitanium = new GetTitanium();
  
  @SidedProxy(clientSide="Xtra-materials-mod.client.ClientProxy", serverSide="Xtra-materials.CommonProxy")
  public static CommonProxy proxy;
  
  //preInit
  @EventHandler
  public void preInit(FMLPreInitializationEvent event){
  }
  
  //Init (names and recipies)
  @EventHandler
	public void load(FMLInitializationEvent event){
	  proxy.registerRenderers();
	  //names
	  LanguageRegistry.addName(titaniumOre, "Titanium Ore");
	  LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
	  LanguageRegistry.addName(oreTransmuttater, "Ore Transmuttater");
	  
	  //Recipies
	  
	  //call items to be used
	  ItemStack titaniumOreS = new ItemStack(titaniumOre, 1, 0);
	  
	  //recipe formatting
	  GameRegistry.addShapedRecipie(titaniumIngot);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}

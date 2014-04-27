package xtramaterials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Xtramaterials", name="Xtramaterials", version="0.1 Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)

public class Xtramaterials {
	
	public static final String modid = "Xtramaterials";
	
	@Instance("Xtramaterials")
	public static Xtramaterials instance;
	//items
	  public static final Item titaniumIngot = new TitaniumIngot(8461).setUnlocalizedName("titaniumIngot");
	  public static final Item TitaniumUnsmelted = new TitaniumUnsmelted(8460).setUnlocalizedName("TitaniumUnsmelted");
	  public static final Item oreTransmuttater = new OreTransmuttater(8450).setUnlocalizedName("oreTransmuttater");
	  public static final Item matterialTransmuttater = new MatterialTransmuttater(8451).setUnlocalizedName("matterialTransmuttater");
	  //public static final Item <itemName> = new <class>(<id>).setUnlocalizedName("<commandrelatedname>");
	  
	  //blocks
	  public static Block titaniumOre = new TitaniumOre(9451, Material.rock).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setUnlocalizedName("titaniumOre");
	  //public static Block <blockName> = new <class>(<id>, <Material>).setHardness(<time to destroy (stone is 1.5F)>).setStepSound(<Sound>).setResistance(<blast resistance (stone is 10.0D)>).setUnlocalizedName("<commandrelatedname>");
	  
	  //commands
	  //public static final CommandBase <commandname> = new <class>();
	  
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
		  LanguageRegistry.addName(TitaniumUnsmelted, "Unsmelted Titanium");

		  //Recipies

		  //call items to be used
		  ItemStack titaniumIngotS = new ItemStack(titaniumIngot, 1, 0);
		  ItemStack ingotIronS = new ItemStack(Item.ingotIron, 1, 0);
		  ItemStack matterialTM = new ItemStack(matterialTransmuttater, 1, 0);
		  ItemStack TitaniumUnsmeltedS = new ItemStack(TitaniumUnsmelted);

		  //recipe formatting
		  GameRegistry.addRecipe(matterialTM, "lil", "iri", "sis", 'l', Block.lever, 'i', titaniumIngot, 'r', Item.redstone, 's', Block.stone);
		  GameRegistry.addShapelessRecipe(TitaniumUnsmeltedS, Item.ingotIron, Item.ingotIron, matterialTransmuttater);
		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent event){
		}
}

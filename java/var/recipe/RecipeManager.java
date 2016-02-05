package var.recipe;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import var.base.BaseManager;
import var.item.BrassManager;
import var.item.PlatinumManager;
import var.item.SteelManager;
import var.item.TitaniumManager;

public class RecipeManager extends BaseManager{

	private static CraftingManager craftingManager = net.minecraft.item.crafting.CraftingManager.getInstance();
	
	public RecipeManager()
	{	init();}
	
	public void init()
	{	}
	public static void addFullSet(Item ingot, Item sword, Item hoe, Item pick, Item axe, Item spade, Item helm, Item chest, Item legs, Item boots, Block block)
	{	addSword(sword, ingot);
		addHoe(hoe, ingot);
		addPick(pick, ingot);
		addAxe(axe, ingot);
		addSpade(spade, ingot);
		addIngotBlock(block, ingot);
		addBlockToIngot(ingot, block);
		addHelmet(helm, ingot);
		addChestplate(chest, ingot);
		addLeggings(legs, ingot);
		addBoots(boots, ingot);
	}
	
	public static void addSword(Item sword, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(sword, 1), "#","#","s",'#',ingot,'s',Items.stick);}
	
	public static void addHoe(Item hoe, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(hoe, 1), "##"," s"," s",'#',ingot,'s',Items.stick);
		craftingManager.addRecipe(new ItemStack(hoe, 1), "##","s ","s ",'#',ingot,'s',Items.stick);
	}
	
	public static void addPick(Item pick, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(pick, 1), "###"," s "," s ",'#',ingot,'s',Items.stick);}
	
	public static void addAxe(Item axe, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(axe, 1), "##","#s"," s",'#',ingot,'s',Items.stick);
		craftingManager.addRecipe(new ItemStack(axe, 1), "##","s#","s ",'#',ingot,'s',Items.stick);
	}
	
	public static void addSpade(Item spade, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(spade, 1), "#", "s", "s",'#',ingot,'s',Items.stick);}
	
	public static void addIngotBlock(Block block, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(block, 1), "###", "###", "###",'#',ingot);}
	
	public static void addBlockToIngot(Item ingot, Block block)
	{	craftingManager.addShapelessRecipe(new ItemStack(ingot, 9), block);}
	
	public static void addHelmet(Item helmet, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(helmet, 1), "###", "# #",'#',ingot);}
	
	public static void addChestplate(Item chest, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(chest, 1), "# #", "###", "###",'#',ingot);}
	
	public static void addLeggings(Item legs, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(legs, 1), "###", "# #", "# #",'#',ingot);}
	
	public static void addBoots(Item boots, Item ingot)
	{	craftingManager.addRecipe(new ItemStack(boots, 1), "# #", "# #",'#',ingot);}
}

package var.main;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import var.block.BlockManager;
import var.item.ItemManager;

public class TextureHandler {
	public static Item[] items= new Item[1000];
	public static Block[] blocks= new Block[1000];
	
	public static HashMap itemToTexture = new HashMap<Item, String>();
	public static HashMap blockToTexture = new HashMap<Block, String>();
	
	public static void addItemTexture(Item item, String path)
	{	String name = item.getUnlocalizedName().replaceAll("item.", "");
		itemToTexture.put(item, name);
		items[ItemManager.resNum()] = item;
	}
	
	public static void addBlockTexture(Block block, String path)
	{	String name = block.getUnlocalizedName().replaceAll("tile.", "");
		blockToTexture.put(block, name);
		blocks[BlockManager.resNum()] = block;
	}
	
}
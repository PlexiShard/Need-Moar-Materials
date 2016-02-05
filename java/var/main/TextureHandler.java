package var.main;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import var.block.BlockManager;
import var.item.ItemManager;

public class TextureHandler {
	public static ArrayList<Item> items= new ArrayList<Item>();
	public static ArrayList<Block> blocks= new ArrayList<Block>();
	
	public static HashMap itemToTexture = new HashMap<Item, String>();
	public static HashMap blockToTexture = new HashMap<Block, String>();

	public static void addItemTexture(Item item, String path)
	{	if(item != null){
			itemToTexture.put(item, path);
			items.add(item);
		}
	}
	
	public static void addBlockTexture(Block block, String path)
	{	if(block != null){
			blockToTexture.put(block, path);
			blocks.add(block);
		}
	}
	
}
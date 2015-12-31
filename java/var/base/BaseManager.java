package var.base;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import var.main.TextureHandler;

public class BaseManager{
	public static int regNum = 0;
	
	public void init() {
	}

	public void register() {
	}

	
	
	public void regItem(Item item) {
		String name = item.getUnlocalizedName().replaceAll("item.", "");
		GameRegistry.registerItem(item, name);
		TextureHandler.addItemTexture(item, name);
	}
	
	public void regBlock(Block block) {
		String name = block.getUnlocalizedName().replaceAll("tile.", "");
		GameRegistry.registerBlock(block, name);
		TextureHandler.addBlockTexture(block, name);
	}
}
package var.main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMap.Builder;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import var.block.BlockManager;

public class ClientProxy extends var.main.ServerProxy{
	/**Used in the {@link #textureItems} and {@link #textureBlocks} methods, as just calling itemMesher makes my life easier*/
	ItemModelMesher itemMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	
	/**Does nothing for now*/
	public void registerRenderThings() 
	{	/*RenderingRegistry.registerEntityRenderingHandler(<Mob>.class, new Render<Mob>(new Render<Mob>(), 0));*/	}
	
	/**For every entry in {@link TextureHandler#items items} and {@link TextureHandler#blocks blocks}, run {@link #textureItems} and {@link #textureBlocks} respectively*/
	public void addTextures() 
	{	for(Item i : TextureHandler.items)
		{	textureItems(i);}
		for(Block b : TextureHandler.blocks)
		{	textureBlocks(b);	}
		LogHelper.logInfo("Textures Registered");
	}
	
	/**Adds a texture location to an {@link Item}, based on the value associated with the item in {@link TextureHandler#items}*/
	public void textureItems(Item item) 
	{	String texture = TextureHandler.itemToTexture.get(item).toString().replaceAll("item.", "");
        itemMesher.register(item, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + texture, "inventory"));
	}
	
	/**Adds a texture location to a {@link Block}, based on the value associated with the item in {@link TextureHandler#blocks}*/
	public void textureBlocks(Block block) 
	{	String texture = TextureHandler.blockToTexture.get(block).toString().replaceAll("tile.", "");
        itemMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MainRegistry.MODID + ":" + texture, "inventory"));
	}
}

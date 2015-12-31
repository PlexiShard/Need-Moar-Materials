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
	ItemModelMesher itemMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	
	public void registerRenderThings() 
	{	/*RenderingRegistry.registerEntityRenderingHandler(<Mob>.class, new Render<Mob>(new Render<Mob>(), 0));*/	}
	
	public void addTextures() 
	{	for(int i=1; i<TextureHandler.itemToTexture.size()+1;i++)
		{	textureItems(TextureHandler.items[i]);	}
		for(int i=1; i<TextureHandler.blockToTexture.size()+1;i++)
		{	textureBlocks(TextureHandler.blocks[i]);	}
		LogHelper.logInfo("Textures Registered");
	}
	
	public void textureItems(Item item) 
	{	String texture = TextureHandler.itemToTexture.get(item).toString().replaceAll("item.", "");
        itemMesher.register(item, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + texture, "inventory"));
	}
	
	public void textureBlocks(Block block) 
	{	String texture = TextureHandler.blockToTexture.get(block).toString().replaceAll("tile.", "");
        itemMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MainRegistry.MODID + ":" + texture, "inventory"));
	}
}

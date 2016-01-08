package var.main;

import var.block.BlockManager;
import var.creative.NMMTabManager;
import var.item.ItemManager;

public class PreInit 
{	public PreInit() 
	{	LogHelper.logInfo("Begining PreInit phase...");
		
		new NMMTabManager();
		LogHelper.logInfo("Creative Tabs Registered");
		new ItemManager();
		LogHelper.logInfo("Items Registered");
		new BlockManager();
		LogHelper.logInfo("Blocks Registered");
		
		NMMTabManager.registerIcons();
		LogHelper.logInfo("Creative Tab Icons Registered");
		
		//entities
		//recipies
		LogHelper.logInfo("Recipies Registered");
		//render mobs
		
		LogHelper.logInfo("PreInit Complete. Starting Init...");
	}

}

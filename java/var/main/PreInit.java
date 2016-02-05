package var.main;

import var.block.BlockManager;
import var.creative.NMMTabManager;
import var.item.ItemManager;

public class PreInit 
{	public PreInit() 
	{	LogHelper.logInfo("Begining PreInit phase...");
		
		//Creative Tab registry
		new NMMTabManager();
		LogHelper.logInfo("Creative Tabs Registered");
		
		//Item registry
		new ItemManager();
		LogHelper.logInfo("Items Registered");
		
		//Block registry
		new BlockManager();
		LogHelper.logInfo("Blocks Registered");
		
		//Creative Tab icons registry (Tabs must be before Items, and Icons after Items)
		NMMTabManager.registerIcons();
		LogHelper.logInfo("Creative Tab Icons Registered");
		
		/*TODO put entity registry here*/
		
		//Crafting registry
		//new CraftingRegistry();
		//LogHelper.logInfo("Recipies Registered");
		
		LogHelper.logInfo("PreInit Complete. Starting Init...");
	}

}

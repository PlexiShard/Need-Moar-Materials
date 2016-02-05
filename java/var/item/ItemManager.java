package var.item;

import var.base.BaseManager;

public class ItemManager extends BaseManager{
	public ItemManager()
	{	init();}
	
	public static int regNum() 
	{	return regNum;}
	
	public static int resNum() 
	{	regNum++;
		return regNum;
	}
	
	public void init()
	{	new BrassManager();
		new TitaniumManager();
		new SteelManager();
		new PlatinumManager();
		new ElementalManager();
	}
}

package var.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import var.base.BaseBlock;
import var.base.BaseManager;
import var.creative.NMMTabManager;
import var.dimension.sky.HighConsintrationFire;
import var.dimension.sky.SkyPortal;

public class BlockManager extends BaseManager{
	public BlockManager()
	{	init();
		register();
	}
	public static int regNum = 0;
	public static int regNum() 
	{	return regNum;}
	
	public static int resNum() 
	{	regNum++;
		return regNum;
	}
	
	public static BaseBlock titaniumOre;
	public static BaseBlock titaniumBlock;
	public static BaseBlock platinumOre;
	public static BaseBlock platinumBlock;
	public static BaseBlock steelOre;
	public static BaseBlock steelBlock;
	public static BaseBlock copperOre;
	public static BaseBlock copperBlock;
	public static Block skyPortal;
	public static Block highFire;
	public static BaseBlock superBlock;
	
	@Override
	public void init()
	{	//titanium
		titaniumOre = new BaseBlock(Material.rock, "titaniumOre", NMMTabManager.nmmBlocks, "titaniumOre", 10.0F, 4.5F);
		titaniumBlock = new BaseBlock(Material.rock, "titaniumBlock", NMMTabManager.nmmBlocks, "titaniumBlock", 100.0F, 9.0F);
		//platinum
		platinumOre = new BaseBlock(Material.rock, "platinumOre", NMMTabManager.nmmBlocks, "platinumOre", 10.0F, 4.5F);
		platinumBlock = new BaseBlock(Material.rock, "platinumBlock", NMMTabManager.nmmBlocks, "platinumBlock", 100.0F, 9.0F);
		//steel
		steelOre = new BaseBlock(Material.rock, "steelOre", NMMTabManager.nmmBlocks, "steelOre", 10.0F, 4.5F);
		steelBlock = new BaseBlock(Material.rock, "steelBlock", NMMTabManager.nmmBlocks, "steelBlock", 100.0F, 9.0F);
		//copper
		copperOre = new BaseBlock(Material.rock, "copperOre", NMMTabManager.nmmBlocks, "copperOre", 10.0F, 4.5F);
		copperBlock = new BaseBlock(Material.rock, "copperBlock", NMMTabManager.nmmBlocks, "copperBlock", 90.0F, 9.0F);
		
		skyPortal = new SkyPortal().setUnlocalizedName("skyPortal");
		superBlock = new SuperBlock(Material.rock, "superBlock", NMMTabManager.nmmBlocks, "superBlock", 90.0F, 9.0F);
		highFire = new HighConsintrationFire().setUnlocalizedName("highFire");
	}
	@Override
	public void register() {
		regBlock(titaniumOre);
		regBlock(titaniumBlock);
		regBlock(platinumOre);
		regBlock(platinumBlock);
		regBlock(steelBlock);
		regBlock(steelOre);
		regBlock(copperOre);
		regBlock(copperBlock);
		regBlock(skyPortal);
		regBlock(highFire);
		regBlock(superBlock);
	}
}

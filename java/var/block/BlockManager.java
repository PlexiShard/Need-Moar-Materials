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
	
	public static Block titaniumOre;
	public static Block titaniumBlock;
	public static Block platinumOre;
	public static Block platinumBlock;
	public static Block steelOre;
	public static Block steelBlock;
	public static Block copperOre;
	public static Block copperBlock;
	public static Block skyPortal;
	public static Block highFire;
	public static Block superBlock;
	
	@Override
	public void init()
	{	//titanium
		titaniumOre = new BaseBlock(Material.rock).setup("TitaniumOre", NMMTabManager.nmmBlocks, "titaniumOre", 10.0F, 4.5F);
		titaniumBlock = new BaseBlock(Material.rock).setup("TitaniumBlock", NMMTabManager.nmmBlocks, "titaniumBlock", 100.0F, 9.0F);
		//platinum
		platinumOre = new BaseBlock(Material.rock).setup("PlatinumOre", NMMTabManager.nmmBlocks, "platinumOre", 10.0F, 4.5F);
		platinumBlock = new BaseBlock(Material.rock).setup("PlatinumBlock", NMMTabManager.nmmBlocks, "platinumBlock", 100.0F, 9.0F);
		//steel
		steelOre = new BaseBlock(Material.rock).setup("SteelOre", NMMTabManager.nmmBlocks, "steelOre", 10.0F, 4.5F);
		steelBlock = new BaseBlock(Material.rock).setup("SteelBlock", NMMTabManager.nmmBlocks, "steelBlock", 100.0F, 9.0F);
		//copper
		copperOre = new BaseBlock(Material.rock).setup("CopperOre", NMMTabManager.nmmBlocks, "copperOre", 10.0F, 4.5F);
		copperBlock = new BaseBlock(Material.rock).setup("CopperBlock", NMMTabManager.nmmBlocks, "copperBlock", 90.0F, 9.0F);
		
		skyPortal = new SkyPortal().setUnlocalizedName("skyPortal");
		superBlock = new SuperBlock(Material.rock).setup("SuperBlock", NMMTabManager.nmmBlocks, "superBlock", 90.0F, 9.0F);
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

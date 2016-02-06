package var.dimension.sky;

import java.awt.Color;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.WeightedRandom;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeEndDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenMutated;
import net.minecraft.world.biome.BiomeGenBase.FlowerEntry;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenDoublePlant;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.event.terraingen.DeferredBiomeDecorator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SkyBiome extends BiomeGenBase {

	private static final Logger logger = LogManager.getLogger();
    private static final BiomeGenBase[] biomeList = new BiomeGenBase[256];

    public String biomeName;

    /** Is true (default) if the biome support rain (desert and nether can't have rain) */
    protected boolean enableRain;
    /** The id number to this biome, and its index in the biomeList array. */
    public final int biomeID;
	
	private static final String __OBFID = "CL_00000187";

    /*public SkyBiome(int p_i1990_1_, boolean register)
    {	super(p_i1990_1_, register);
    	this.fillerBlock = Blocks.dirt.getDefaultState();
    	this.topBlock = Blocks.grass.getStateFromMeta(1);
    	this.waterColorMultiplier = 0x00ACE6;
        this.theBiomeDecorator.generateLakes = true;
    }*/

    public SkyBiome(int p_i1971_1_)
    {
        this(p_i1971_1_, true);
    }
    public SkyBiome(int p_i1971_1_, boolean register)
    {
    	super(p_i1971_1_, register);
        this.topBlock = Blocks.grass.getDefaultState();
        this.fillerBlock = Blocks.dirt.getDefaultState();
        this.fillerBlockMetadata = 5169201;
        this.minHeight = height_Default.rootHeight;
        this.maxHeight = height_Default.variation;
        this.temperature = 0.5F;
        this.rainfall = 0.5F;
        this.waterColorMultiplier = 16777215;
        this.spawnableMonsterList = Lists.newArrayList();
        this.spawnableCreatureList = Lists.newArrayList();
        this.spawnableWaterCreatureList = Lists.newArrayList();
        this.spawnableCaveCreatureList = Lists.newArrayList();
        this.enableRain = true;
        this.worldGeneratorTrees = new WorldGenTrees(true);
        this.worldGeneratorBigTree = new WorldGenBigTree(true);
        this.biomeID = p_i1971_1_;
        if (register)
        biomeList[p_i1971_1_] = this;
        this.theBiomeDecorator = this.createBiomeDecorator();
        this.spawnableCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.addDefaultFlowers();
    }

    /**
     * Allocate a new BiomeDecorator for this BiomeGenBase
     */
    public BiomeDecorator createBiomeDecorator()
    {
        return getModdedBiomeDecorator(new BiomeDecorator());
    }

    public WorldGenAbstractTree genBigTreeChance(Random p_150567_1_)
    {
        return (WorldGenAbstractTree)(p_150567_1_.nextInt(10) == 0 ? this.worldGeneratorBigTree : this.worldGeneratorTrees);
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForGrass(Random p_76730_1_)
    {
        return new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }

    public BlockFlower.EnumFlowerType pickRandomFlower(Random p_180623_1_, BlockPos p_180623_2_)
    {
        return p_180623_1_.nextInt(3) > 0 ? BlockFlower.EnumFlowerType.DANDELION : BlockFlower.EnumFlowerType.POPPY;
    }

    /**
     * sets enableSnow to true during biome initialization. returns BiomeGenBase.
     */
    public BiomeGenBase setEnableSnow()
    {
        this.enableSnow = true;
        return this;
    }

    public BiomeGenBase setBiomeName(String p_76735_1_)
    {
        this.biomeName = p_76735_1_;
        return this;
    }

    public BiomeGenBase setFillerBlockMetadata(int p_76733_1_)
    {
        this.fillerBlockMetadata = p_76733_1_;
        return this;
    }

    public BiomeGenBase setColor(int p_76739_1_)
    {
        this.func_150557_a(p_76739_1_, false);
        return this;
    }

    public BiomeGenBase func_150563_c(int p_150563_1_)
    {
        this.field_150609_ah = p_150563_1_;
        return this;
    }

    public BiomeGenBase func_150557_a(int p_150557_1_, boolean p_150557_2_)
    {
        this.color = p_150557_1_;

        if (p_150557_2_)
        {
            this.field_150609_ah = (p_150557_1_ & 16711422) >> 1;
        }
        else
        {
            this.field_150609_ah = p_150557_1_;
        }

        return this;
    }


    /**
     * Returns true if the biome have snowfall instead a normal rain.
     */
    public boolean getEnableSnow()
    {
        return this.isSnowyBiome();
    }

    /**
     * Return true if the biome supports lightning bolt spawn, either by have the bolts enabled and have rain enabled.
     */
    public boolean canSpawnLightningBolt()
    {
        return this.isSnowyBiome() ? false : this.enableRain;
    }

    /**
     * Checks to see if the rainfall level of the biome is extremely high
     */
    public boolean isHighHumidity()
    {
        return this.rainfall > 0.85F;
    }

    /**
     * returns the chance a creature has to spawn.
     */
    public float getSpawningChance()
    {
        return 0.0F;
    }

    public void decorate(World worldIn, Random p_180624_2_, BlockPos p_180624_3_)
    {
        this.theBiomeDecorator.decorate(worldIn, p_180624_2_, this, p_180624_3_);
    }

    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos p_180627_1_)
    {
        double d0 = (double)MathHelper.clamp_float(this.getFloatTemperature(p_180627_1_), 0.0F, 1.0F);
        double d1 = (double)MathHelper.clamp_float(this.getFloatRainfall(), 0.0F, 1.0F);
        return getModdedBiomeGrassColor(ColorizerGrass.getGrassColor(d0, d1));
    }

    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos p_180625_1_)
    {
        double d0 = (double)MathHelper.clamp_float(this.getFloatTemperature(p_180625_1_), 0.0F, 1.0F);
        double d1 = (double)MathHelper.clamp_float(this.getFloatRainfall(), 0.0F, 1.0F);
        return getModdedBiomeFoliageColor(ColorizerFoliage.getFoliageColor(d0, d1));
    }

    public boolean isSnowyBiome()
    {
        return this.enableSnow;
    }

    public void genTerrainBlocks(World worldIn, Random p_180622_2_, ChunkPrimer p_180622_3_, int p_180622_4_, int p_180622_5_, double p_180622_6_)
    {
        this.generateBiomeTerrain(worldIn, p_180622_2_, p_180622_3_, p_180622_4_, p_180622_5_, p_180622_6_);
    }

    /**
     * Creates a mutated version of the biome and places it into the biomeList with an index equal to the original plus
     * 128
     */
    public BiomeGenBase createMutation()
    {
        return this.createMutatedBiome(this.biomeID + 128);
    }

    public BiomeGenBase createMutatedBiome(int p_180277_1_)
    {
        return new BiomeGenMutated(p_180277_1_, this);
    }

    public Class getBiomeClass()
    {
        return this.getClass();
    }

    /**
     * returns true if the biome specified is equal to this biome
     */
    public boolean isEqualTo(BiomeGenBase p_150569_1_)
    {
        return p_150569_1_ == this ? true : (p_150569_1_ == null ? false : this.getBiomeClass() == p_150569_1_.getBiomeClass());
    }

    public BiomeGenBase.TempCategory getTempCategory()
    {
        return (double)this.temperature < 0.2D ? BiomeGenBase.TempCategory.COLD : ((double)this.temperature < 1.0D ? BiomeGenBase.TempCategory.MEDIUM : BiomeGenBase.TempCategory.WARM);
    }

    public static BiomeGenBase[] getBiomeGenArray()
    {
        /** An array of all the biomes, indexed by biome id. */
        return biomeList;
    }

    /**
     * return the biome specified by biomeID, or 0 (ocean) if out of bounds
     */
    public static BiomeGenBase getBiome(int p_150568_0_)
    {
        return getBiomeFromBiomeList(p_150568_0_, (BiomeGenBase)null);
    }

    public static BiomeGenBase getBiomeFromBiomeList(int p_180276_0_, BiomeGenBase p_180276_1_)
    {
        if (p_180276_0_ >= 0 && p_180276_0_ <= biomeList.length)
        {
            BiomeGenBase biomegenbase1 = biomeList[p_180276_0_];
            return biomegenbase1 == null ? p_180276_1_ : biomegenbase1;
        }
        else
        {
            logger.warn("Biome ID is out of bounds: " + p_180276_0_ + ", defaulting to 0 (Ocean)");
            return ocean;
        }
    }

    /* ========================================= FORGE START ======================================*/
    protected List<FlowerEntry> flowers = new java.util.ArrayList<FlowerEntry>();

    public BiomeDecorator getModdedBiomeDecorator(BiomeDecorator original)
    {
        return new DeferredBiomeDecorator(original);
    }

    public int getWaterColorMultiplier()
    {
        BiomeEvent.GetWaterColor event = new BiomeEvent.GetWaterColor(this, waterColorMultiplier);
        MinecraftForge.EVENT_BUS.post(event);
        return event.newColor;
    }

    public int getModdedBiomeGrassColor(int original)
    {
        BiomeEvent.GetGrassColor event = new BiomeEvent.GetGrassColor(this, original);
        MinecraftForge.EVENT_BUS.post(event);
        return event.newColor;
    }

    public int getModdedBiomeFoliageColor(int original)
    {
        BiomeEvent.GetFoliageColor event = new BiomeEvent.GetFoliageColor(this, original);
        MinecraftForge.EVENT_BUS.post(event);
        return event.newColor;
    }

    /**
     * Weighted random holder class used to hold possible flowers
     * that can spawn in this biome when bonemeal is used on grass.
     */
    public static class FlowerEntry extends WeightedRandom.Item
    {
        public final net.minecraft.block.state.IBlockState state;
        public FlowerEntry(net.minecraft.block.state.IBlockState state, int weight)
        {
            super(weight);
            this.state = state;
        }
    }

    /**
     * Adds the default flowers, as of 1.7, it is 2 yellow, and 1 red. I chose 10 to allow some wiggle room in the numbers.
     */
    public void addDefaultFlowers()
    {
        addFlower(Blocks.yellow_flower.getDefaultState().withProperty(Blocks.yellow_flower.getTypeProperty(), BlockFlower.EnumFlowerType.DANDELION), 20);
        addFlower(Blocks.red_flower.getDefaultState().withProperty(Blocks.red_flower.getTypeProperty(), BlockFlower.EnumFlowerType.POPPY), 20);
    }


    public void plantFlower(World world, Random rand, BlockPos pos)
    {
        FlowerEntry flower = (FlowerEntry)WeightedRandom.getRandomItem(rand, flowers);
        if (flower == null || flower.state == null ||
            (flower.state.getBlock() instanceof net.minecraft.block.BlockBush &&
              !((net.minecraft.block.BlockBush)flower.state.getBlock()).canBlockStay(world, pos, flower.state)))
        {
            return;
        }

        world.setBlockState(pos, flower.state, 3);
    }

    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float p_76731_1_)
    {
        return 0;
    }
    
    public static int getEmptyBiomeID(){
        int i;
        int lastBiomeID = 0;
        BiomeGenBase[] array = BiomeGenBase.getBiomeGenArray();
        //loop through biome array to find an empty id.
        for(i = lastBiomeID; i < array.length; i++){
            if( array[i] == null){
                lastBiomeID = i;
                return i;
            }
        }
        // didn't find an empty spot
        return -1;
    }
    
    public void generateTerrain(World worldIn, Random p_180628_2_, ChunkPrimer p_180628_3_, int p_180628_4_, int p_180628_5_, double p_180628_6_)
    {
        boolean flag = true;
        IBlockState iblockstate = this.topBlock;
        IBlockState iblockstate1 = this.fillerBlock;
        int k = -1;
        int l = (int)(p_180628_6_ / 3.0D + 3.0D + p_180628_2_.nextDouble() * 0.25D);
        int i1 = p_180628_4_ & 15;
        int j1 = p_180628_5_ & 15;

        for (int k1 = 255; k1 >= 0; --k1)
        {
            {
                IBlockState iblockstate2 = p_180628_3_.getBlockState(j1, k1, i1);

                if (iblockstate2.getBlock().getMaterial() == Material.air)
                {
                    k = -1;
                }
                else if (iblockstate2.getBlock() == Blocks.stone)
                {
                    if (k == -1)
                    {
                        if (l <= 0)
                        {
                            iblockstate = null;
                            iblockstate1 = Blocks.stone.getDefaultState();
                        }
                        else if (k1 >= 59 && k1 <= 64)
                        {
                            iblockstate = this.topBlock;
                            iblockstate1 = this.fillerBlock;
                        }

                        if (k1 < 63 && (iblockstate == null || iblockstate.getBlock().getMaterial() == Material.air))
                        {
                            if (this.getFloatTemperature(new BlockPos(p_180628_4_, k1, p_180628_5_)) < 0.15F)
                            {
                                iblockstate = Blocks.ice.getDefaultState();
                            }
                            else
                            {
                                iblockstate = Blocks.water.getDefaultState();
                            }
                        }

                        k = l;

                        if (k1 >= 62)
                        {
                            p_180628_3_.setBlockState(j1, k1, i1, iblockstate);
                        }
                        else if (k1 < 56 - l)
                        {
                            iblockstate = null;
                            iblockstate1 = Blocks.stone.getDefaultState();
                            p_180628_3_.setBlockState(j1, k1, i1, Blocks.gravel.getDefaultState());
                        }
                        else
                        {
                            p_180628_3_.setBlockState(j1, k1, i1, iblockstate1);
                        }
                    }
                    else if (k > 0)
                    {
                        --k;
                        p_180628_3_.setBlockState(j1, k1, i1, iblockstate1);

                        if (k == 0 && iblockstate1.getBlock() == Blocks.sand)
                        {
                            k = p_180628_2_.nextInt(4) + Math.max(0, k1 - 63);
                            iblockstate1 = iblockstate1.getValue(BlockSand.VARIANT) == BlockSand.EnumType.RED_SAND ? Blocks.red_sandstone.getDefaultState() : Blocks.sandstone.getDefaultState();
                        }
                    }
                }
            }
        }
    }
}

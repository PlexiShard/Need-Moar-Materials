package var.dimension.sky;

import java.util.List;
import java.util.Random;

import var.block.BlockManager;
import var.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
 
public class SkyChunkProvider implements IChunkProvider
{
	private Random endRNG;
    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;
    public NoiseGeneratorOctaves noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    private World endWorld;
    private double[] densities;
    private BiomeGenBase[] biomesForGeneration;
    private BiomeGenBase biomeForGen = MainRegistry.skyBiome;
    private BiomeGenBase[] biomesForGen = new BiomeGenBase[] {biomeForGen};
    double[] noiseData1;
    double[] noiseData2;
    double[] noiseData3;
    double[] noiseData4;
    double[] noiseData5;
    private boolean spawned =  false;
    private static final String __OBFID = "CL_00000397";

    public SkyChunkProvider(World worldIn, long p_i2007_2_)
    {
        this.endWorld = worldIn;
        this.endRNG = new Random(p_i2007_2_);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.endRNG, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.endRNG, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.endRNG, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.endRNG, 10);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.endRNG, 16);

        NoiseGenerator[] noiseGens = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5};
        noiseGens = TerrainGen.getModdedNoiseGenerators(worldIn, this.endRNG, noiseGens);
        this.noiseGen1 = (NoiseGeneratorOctaves)noiseGens[0];
        this.noiseGen2 = (NoiseGeneratorOctaves)noiseGens[1];
        this.noiseGen3 = (NoiseGeneratorOctaves)noiseGens[2];
        this.noiseGen4 = (NoiseGeneratorOctaves)noiseGens[3];
        this.noiseGen5 = (NoiseGeneratorOctaves)noiseGens[4];
    }
    public void setBlocks(int chunkX, int chunkZ, ChunkPrimer chunkPrimer)
    {	byte b0 = 2;
        int k = b0 + 1;
        byte b1 = 33;
        int l = b0 + 1;
        this.densities = this.initializeNoiseField(this.densities, chunkX * b0, 0, chunkZ * b0, k, b1, l);

        for (int x1 = 0; x1 < b0; ++x1)
        {	for (int z1 = 0; z1 < b0; ++z1)
            {	for (int y2 = 0; y2 < 32; ++y2)
                {	double d0 = 0.25D;
                    double d1 = this.densities[((x1 + 0) * l + z1 + 0) * b1 + y2 + 0];
                    double d2 = this.densities[((x1 + 0) * l + z1 + 1) * b1 + y2 + 0];
                    double d3 = this.densities[((x1 + 1) * l + z1 + 0) * b1 + y2 + 0];
                    double d4 = this.densities[((x1 + 1) * l + z1 + 1) * b1 + y2 + 0];
                    double d5 = (this.densities[((x1 + 0) * l + z1 + 0) * b1 + y2 + 1] - d1) * d0;
                    double d6 = (this.densities[((x1 + 0) * l + z1 + 1) * b1 + y2 + 1] - d2) * d0;
                    double d7 = (this.densities[((x1 + 1) * l + z1 + 0) * b1 + y2 + 1] - d3) * d0;
                    double d8 = (this.densities[((x1 + 1) * l + z1 + 1) * b1 + y2 + 1] - d4) * d0;

                    for (int y1 = 0; y1 < 4; ++y1)
                    {	double d9 = 0.125D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;
                        for (int x2 = 0; x2 < 8; ++x2)
                        {	double d14 = 0.125D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            for (int z2 = 0; z2 < 8; ++z2)
                            {	IBlockState iblockstate = null;
                            	if (d15 > 0.0D)
                                {	iblockstate = Blocks.stone.getDefaultState();
                                }
                            	int x = x2 + x1 * 8;
                                int y = y1 + y2 * 4;
                                int z = z2 + z1 * 8;
                                chunkPrimer.setBlockState(x, y, z, iblockstate);
                                d15 += d16;
                            }
                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
    }	}	}	}	}
    
    public void overwriteBlocks(ChunkPrimer chunkPrimer)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, chunkX, chunkZ, chunkPrimer, this.endWorld);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return;
        for (int x = 0; x < 16; ++x)
        {
            for (int z = 0; z < 16; ++z)
            {
                byte b0 = 1;
                int k = -1;
                IBlockState iblockstate = Blocks.grass.getDefaultState();
                IBlockState iblockstate1 = Blocks.dirt.getDefaultState();
                IBlockState iblockstate3 = Blocks.stone.getDefaultState();

                for (int y = 127; y >= 0; --y)
                {
                    IBlockState iblockstate2 = chunkPrimer.getBlockState(x, y, z);
                    if (iblockstate2.getBlock().getMaterial() == Material.air)
                    {	k = -1;	}
                    else if (iblockstate2.getBlock() == Blocks.stone)
                    {	if (k == -1)
                        {	if (b0 <= 0)
                            {	iblockstate = Blocks.grass.getDefaultState();
                                iblockstate1 = Blocks.dirt.getDefaultState();
                                iblockstate3 = Blocks.stone.getDefaultState();
                            }
                        	k = b0;
                        	if (y >= 0)
                            {	chunkPrimer.setBlockState(x, y, z, iblockstate);	}
                            else
                            {	chunkPrimer.setBlockState(x, y, z, iblockstate1);	}
                        }
                        else if (k > 0)
                        {	--k;	chunkPrimer.setBlockState(x, y, z, iblockstate1);	}
                    

    }	}	}	}	}

    private int chunkX=0, chunkZ=0;
    public Chunk provideChunk(int x, int z)
    {	chunkX = x; chunkZ = z;
        this.endRNG.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
        ChunkPrimer chunkprimer = new ChunkPrimer();
        this.biomesForGeneration = this.endWorld.getWorldChunkManager().loadBlockGeneratorData(biomesForGen, x * 16, z * 16, 16, 16);
        this.setBlocks(x, z, chunkprimer);
        this.overwriteBlocks(chunkprimer);
        Chunk chunk = new Chunk(this.endWorld, chunkprimer, x, z);
        byte[] abyte = chunk.getBiomeArray();

        for (int k = 0; k < abyte.length; ++k)
        {	abyte[k] = (byte) MainRegistry.skyBiome.biomeID;	}

        chunk.generateSkylightMap();
        return chunk;
    }

    private double[] initializeNoiseField(double[] noiseArray, int posX, int posY, int posZ, int scaleX, int scaleY, int scaleZ)
    {	ChunkProviderEvent.InitNoiseField event = new ChunkProviderEvent.InitNoiseField(this, noiseArray, posX, posY, posZ, scaleX, scaleY, scaleZ);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return event.noisefield;
        if (noiseArray == null)
        {	noiseArray = new double[scaleX * scaleY * scaleZ];	}

        double d0 = 684.412D;
        double d1 = 684.412D;
        this.noiseData4 = this.noiseGen4.generateNoiseOctaves(this.noiseData4, posX, posZ, scaleX, scaleZ, 1.121D, 1.121D, 0.5D);
        this.noiseData5 = this.noiseGen5.generateNoiseOctaves(this.noiseData5, posX, posZ, scaleX, scaleZ, 200.0D, 200.0D, 0.5D);
        d0 *= 2.0D;
        this.noiseData1 = this.noiseGen3.generateNoiseOctaves(this.noiseData1, posX, posY, posZ, scaleX, scaleY, scaleZ, d0 / 80.0D, d1 / 160.0D, d0 / 80.0D);
        this.noiseData2 = this.noiseGen1.generateNoiseOctaves(this.noiseData2, posX, posY, posZ, scaleX, scaleY, scaleZ, d0, d1, d0);
        this.noiseData3 = this.noiseGen2.generateNoiseOctaves(this.noiseData3, posX, posY, posZ, scaleX, scaleY, scaleZ, d0, d1, d0);
        int k1 = 0;

        for (int l1 = 0; l1 < scaleX; ++l1)
        {	for (int i2 = 0; i2 < scaleZ; ++i2)
            {	float f = (float)(l1 + posX) / 1.0F;
                float f1 = (float)(i2 + posZ) / 1.0F;
                float f2 = 100.0F - MathHelper.sqrt_float(f * f + f1 * f1) * 8.0F;

                if (f2 > 80.0F)
                {	f2 = 80.0F;	}

                if (f2 < -100.0F)
                {	f2 = -100.0F;	}

                for (int j2 = 0; j2 < scaleY; ++j2)
                {	double d2 = 0.0D;
                    double d3 = this.noiseData2[k1] / 512.0D;
                    double d4 = this.noiseData3[k1] / 512.0D;
                    double d5 = (this.noiseData1[k1] / 10.0D + 1.0D) / 2.0D;
                    if (d5 < 0.0D)
                    {	d2 = d3;	}
                    else if (d5 > 1.0D)
                    {	d2 = d4;	}
                    else
                    {	d2 = d3 + (d4 - d3) * d5;	}
                    d2 -= 8.0D;
                    d2 += (double)f2;
                    byte b0 = 2;
                    double d6;
                    if (j2 > scaleY / 2 - b0)
                    {	d6 = (double)((float)(j2 - (scaleY / 2 - b0)) / 64.0F);
                        d6 = MathHelper.clamp_double(d6, 0.0D, 1.0D);
                        d2 = d2 * (1.0D - d6) + -3000.0D * d6;
                    }
                    b0 = 8;
                    if (j2 < b0)
                    {	d6 = (double)((float)(b0 - j2) / ((float)b0 - 1.0F));
                        d2 = d2 * (1.0D - d6) + -30.0D * d6;
                    }
                    noiseArray[k1] = d2;
                    ++k1;
        }	}	}
        return noiseArray;
    }

    public boolean chunkExists(int x, int z)
    {	return true;	}
    public void populate(IChunkProvider iChunkProvider, int posX, int posZ)
    {
        BlockFalling.fallInstantly = true;

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(iChunkProvider, endWorld, endWorld.rand, posX, posZ, false));

        BlockPos blockpos = new BlockPos(posX * 16, 0, posZ * 16);
        this.endWorld.getBiomeGenForCoords(blockpos.add(16, 0, 16)).decorate(this.endWorld, this.endWorld.rand, blockpos);

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(iChunkProvider, endWorld, endWorld.rand, posX, posZ, false));

        BlockFalling.fallInstantly = false;
    }

    public boolean func_177460_a(IChunkProvider iChunkProvider, Chunk chunk, int posX, int posZ)
    {	return false;	}

    public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_)
    {	return true;	}

    public void saveExtraData() {}

    public boolean unloadQueuedChunks()
    {	return false;	}

    public boolean canSave()
    {	return true;	}
    
    public String makeString()
    {
        return "RandomLevelSource";
    }

    public List func_177458_a(EnumCreatureType creatureType, BlockPos pos)
    {
        return this.endWorld.getBiomeGenForCoords(pos).getSpawnableList(creatureType);
    }

    public BlockPos getStrongholdGen(World worldIn, String p_180513_2_, BlockPos pos)
    {	return null;	}

    public int getLoadedChunkCount()
    {	return 0;	}

    public void recreateStructures(Chunk p_180514_1_, int p_180514_2_, int p_180514_3_) {}

    public Chunk provideChunk(BlockPos blockPosIn)
    {	return this.provideChunk(blockPosIn.getX() >> 4, blockPosIn.getZ() >> 4);	}
}
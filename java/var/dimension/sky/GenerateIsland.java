package var.dimension.sky;

import java.util.Random;

import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

public class GenerateIsland {
	
	/*public Random endRNG;
	
	public NoiseGeneratorOctaves noiseGen1;
    public NoiseGeneratorOctaves noiseGen2;
    public NoiseGeneratorOctaves noiseGen3;
    public NoiseGeneratorOctaves noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    private double[] densities;
    
	public GenerateIsland(World world, Long seed) {
	
	this.endRNG = new Random();
	
    this.noiseGen1 = new NoiseGeneratorOctaves(this.endRNG, 16);
    this.noiseGen2 = new NoiseGeneratorOctaves(this.endRNG, 16);
    this.noiseGen3 = new NoiseGeneratorOctaves(this.endRNG, 8);
    this.noiseGen4 = new NoiseGeneratorOctaves(this.endRNG, 10);
    this.noiseGen5 = new NoiseGeneratorOctaves(this.endRNG, 16);
    
    NoiseGenerator[] noiseGens = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5};
    noiseGens = TerrainGen.getModdedNoiseGenerators(world, this.endRNG, noiseGens);
    this.noiseGen1 = (NoiseGeneratorOctaves)noiseGens[0];
    this.noiseGen2 = (NoiseGeneratorOctaves)noiseGens[1];
    this.noiseGen3 = (NoiseGeneratorOctaves)noiseGens[2];
    this.noiseGen4 = (NoiseGeneratorOctaves)noiseGens[3];
    this.noiseGen5 = (NoiseGeneratorOctaves)noiseGens[4];
	}   
	public GenerateIsland() {
		this.densities = this.initializeNoiseField(this.densities, tempX * b0, 0, tempZ * b0, k, b1, l);
	
		double d0 = 0.25D;
		double d1 = this.densities[((x1 + 0) * l + z1 + 0) * b1 + y2 + 0];
		double d2 = this.densities[((x1 + 0) * l + z1 + 1) * b1 + y2 + 0];
		double d3 = this.densities[((x1 + 1) * l + z1 + 0) * b1 + y2 + 0];
		double d4 = this.densities[((x1 + 1) * l + z1 + 1) * b1 + y2 + 0];
		double d5 = (this.densities[((x1 + 0) * l + z1 + 0) * b1 + y2 + 1] - d1) * d0;
		double d6 = (this.densities[((x1 + 0) * l + z1 + 1) * b1 + y2 + 1] - d2) * d0;
		double d7 = (this.densities[((x1 + 1) * l + z1 + 0) * b1 + y2 + 1] - d3) * d0;
    double d8 = (this.densities[((x1 + 1) * l + z1 + 1) * b1 + y2 + 1] - d4) * d0;
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
    }*/
}

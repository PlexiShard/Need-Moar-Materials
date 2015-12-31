package var.dimension.sky;

import var.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SkyWorldProvider extends WorldProvider
{  
	@Override
    public IChunkProvider createChunkGenerator()
    {	return new SkyChunkProvider(this.worldObj, this.worldObj.getSeed());	}

	@Override
    public String getDimensionName()
    {	return "Sky World";	}

	@Override
    public String getInternalNameSuffix()
    {	return "_sky";	}

	public IChunkProvider func_76555_c() 
	{	return new SkyChunkProvider(this.worldObj, 2);	}
	
    public int getRespawnDimension(EntityPlayerMP player) {
        return 0;
    }
}
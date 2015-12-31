package var.dimension.sky;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import var.main.MainRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

public class SkyWorldChunkManager extends WorldChunkManager {
    private BiomeGenBase biomeGenerator = MainRegistry.skyBiome;

    public boolean func_76940_a(int i, int j, int k, List list) {
        return list.contains((Object)this.biomeGenerator);
    }

    public BiomeGenBase[] func_76931_a(BiomeGenBase[] abiomegenbase, int i, int j, int k, int l, boolean flag) {
        return this.func_76933_b(abiomegenbase, i, j, k, l);
    }

    public BiomeGenBase func_76935_a(int i, int j) {
        return this.biomeGenerator;
    }

    public float[] func_76936_a(float[] af, int i, int j, int k, int l) {
        if (af == null || af.length < k * l) {
            af = new float[k * l];
        }
        Arrays.fill(af, 0, k * l, 0.0f);
        return af;
    }

    public BiomeGenBase[] func_76933_b(BiomeGenBase[] abiomegenbase, int i, int j, int k, int l) {
        if (abiomegenbase == null || abiomegenbase.length < k * l) {
            abiomegenbase = new BiomeGenBase[k * l];
        }
        Arrays.fill((Object[])abiomegenbase, 0, k * l, (Object)MainRegistry.skyBiome);
        return abiomegenbase;
    }
}


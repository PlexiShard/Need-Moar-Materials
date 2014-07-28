package var.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {

	public static void mainRegistry() {
		registerEntity();
		spawnEntity();
	}
	public static void spawnEntity() {
		addSpawn(Ogre.class, 1000, 1, 3, EnumCreatureType.monster);
	}
	public static void addSpawn(Class entityClass, int probability, int min, int max, EnumCreatureType type) {
		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
			if (BiomeGenBase.getBiomeGenArray()[i] == BiomeGenBase.icePlains) {
				EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
			} else if (BiomeGenBase.getBiomeGenArray()[i] == BiomeGenBase.coldTaiga) {
				EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
			} else if (BiomeGenBase.getBiomeGenArray()[i] == BiomeGenBase.coldTaigaHills) {
				EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
			} else if (BiomeGenBase.getBiomeGenArray()[i] == BiomeGenBase.extremeHillsPlus) {
				EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
			} else if (BiomeGenBase.getBiomeGenArray()[i] == BiomeGenBase.frozenRiver) {
				EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
			} else if (BiomeGenBase.getBiomeGenArray()[i] == BiomeGenBase.iceMountains){
				EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
			} else {
				if (BiomeGenBase.getBiomeGenArray()[i] == null) {
					
				}
			}
		}
	}
	
	public static void registerEntity() {
		createEntity(Ogre.class, "Ogre", 0xffffff, 0xC2B151);
	}
	
	public static void createEntity(Class classfile, String name, int solidColor, int spotColor) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
	    EntityRegistry.registerGlobalEntityID(classfile, name, entityId);
	    EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, solidColor, spotColor));
	}
}

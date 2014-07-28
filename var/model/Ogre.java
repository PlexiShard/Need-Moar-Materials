package var.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Ogre extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Right_Leg_part_1;
    ModelRenderer Left_Leg_part_1;
    ModelRenderer Left_forearm;
    ModelRenderer Right_Forearm;
  
  public Ogre()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 36);
      Head.addBox(-4F, -4F, -4F, 8, 8, 8);
      Head.setRotationPoint(-1.5F, -17.7F, -2F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0.2956814F, 0F, 0F);
      Body = new ModelRenderer(this, 40, 0);
      Body.addBox(0F, 0F, 0F, 8, 11, 4);
      Body.setRotationPoint(-5.5F, -14F, -2F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0.4730869F, 0F, 0F);
      Right_Leg_part_1 = new ModelRenderer(this, 48, 44);
      Right_Leg_part_1.addBox(0F, 0F, 0F, 4, 13, 4);
      Right_Leg_part_1.setRotationPoint(-5.7F, -7F, 2F);
      Right_Leg_part_1.setTextureSize(64, 64);
      Right_Leg_part_1.mirror = true;
      setRotation(Right_Leg_part_1, 0F, 0F, 0F);
      Left_Leg_part_1.mirror = true;
      Left_Leg_part_1 = new ModelRenderer(this, 32, 32);
      Left_Leg_part_1.addBox(0F, 0F, 0F, 4, 13, 4);
      Left_Leg_part_1.setRotationPoint(-1.3F, -7F, 2F);
      Left_Leg_part_1.setTextureSize(64, 64);
      Left_Leg_part_1.mirror = true;
      setRotation(Left_Leg_part_1, 0F, 0F, 0F);
      Left_Leg_part_1.mirror = false;
      Left_forearm = new ModelRenderer(this, 12, 52);
      Left_forearm.addBox(0F, 0F, 0F, 3, 9, 3);
      Left_forearm.setRotationPoint(2F, -14F, -1F);
      Left_forearm.setTextureSize(64, 64);
      Left_forearm.mirror = true;
      setRotation(Left_forearm, -0.3843831F, 0F, -0.0872665F);
      Right_Forearm = new ModelRenderer(this, 24, 52);
      Right_Forearm.addBox(0F, 0F, 0F, 3, 9, 3);
      Right_Forearm.setRotationPoint(-8F, -14.14667F, -1F);
      Right_Forearm.setTextureSize(64, 64);
      Right_Forearm.mirror = true;
      setRotation(Right_Forearm, -0.3843913F, 0F, 0.0872665F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Body.render(f5);
    Right_Leg_part_1.render(f5);
    Left_Leg_part_1.render(f5);
    Left_forearm.render(f5);
    Right_Forearm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}

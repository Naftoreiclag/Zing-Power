package naftoreiclag.mightycarpenters.things.mech;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class PartEntity extends Entity
{
	protected MechControllerEntity controller;
	protected Part part;
	
	// This is if it is constructed incorrectly
	public PartEntity(World world)
	{
		super(world);
		System.out.println("WHAT");
		this.kill();
	}
	
	// Correct constructor
	public PartEntity(MechControllerEntity controller, Part part)
	{
		super(controller.getWorld());
		
		this.noClip = true;
		
		this.controller = controller;
		this.part = part;
	}

	@Override
	public void entityInit()
	{
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound var1)
	{
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound var1)
	{
	}
	
}

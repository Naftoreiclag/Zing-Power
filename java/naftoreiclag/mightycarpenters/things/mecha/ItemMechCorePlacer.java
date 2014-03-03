package naftoreiclag.mightycarpenters.things.mecha;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import naftoreiclag.mightycarpenters.MightyCarpentersMod;
import naftoreiclag.mightycarpenters.things.multipart.EntityArbolRoot;
import naftoreiclag.mightycarpenters.util.MyStaticStrings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemMechCorePlacer extends Item
{
	public ItemMechCorePlacer()
	{
		super();
		this.setUnlocalizedName(MyStaticStrings.UNLOCALIZED_MECH_CORE_PLACER);
		
		this.setCreativeTab(CreativeTabs.tabTransport);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(MyStaticStrings.TEXTURE_DEBUG_0);
	}
	
	public boolean onItemUse(ItemStack item, EntityPlayer user, World world, int x, int y, int z, int side, float par8, float par9, float par10)
    {
		// No clients allowed
		if(world.isRemote) { return false; }
		
		EntityArbolRoot d = new EntityArbolRoot(world);
		d.setPosition(x, y + 1, z);
		world.spawnEntityInWorld(d);
		
        return true;
    }
}
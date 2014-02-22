package naftoreiclag.zingpower;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import naftoreiclag.zingpower.block.BlockCopperOre;
import naftoreiclag.zingpower.item.ItemCopperIngot;
import naftoreiclag.zingpower.util.MyStaticStrings;
import naftoreiclag.zingpower.world.WorldGenManager;

@Mod(modid = MyStaticStrings.MOD_ID, version = MyStaticStrings.MOD_VER)
public class ZingpowerMod
{
	public static Block block_copperOre;
	
	public static Item item_copperIngot;
	
	WorldGenManager ev = new WorldGenManager();
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		block_copperOre = new BlockCopperOre();
		GameRegistry.registerBlock(block_copperOre, block_copperOre.getUnlocalizedName());
		OreDictionary.registerOre("oreCopper", block_copperOre);
		
		item_copperIngot = new ItemCopperIngot();
		GameRegistry.registerItem(item_copperIngot, item_copperIngot.getUnlocalizedName());
		OreDictionary.registerOre("ingotCopper", item_copperIngot);
    
		GameRegistry.registerWorldGenerator(ev, 1);
    }
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
	}
}

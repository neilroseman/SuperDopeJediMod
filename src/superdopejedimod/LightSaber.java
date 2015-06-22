package superdopesquad.superdopejedimod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LightSaber extends BaseItem {
	
	String color;
	

	public LightSaber(String unlocalizedName, String colorInput) {
		
		super(unlocalizedName);
		
		this.setMaxStackSize(1);
		
		this.color = colorInput;
		
		this.setCreativeTab(CreativeTabs.tabCombat);
		//this.setMaxStackSize(64);
		//this.setCreativeTab(CreativeTabs.tabMisc);
		//this.setUnlocalizedName(unlocalizedName);
		
		
	}
	
	
	public void registerRecipe() {
		
		if (this.PowerCrystal == "Red")
		
		// Recipe for creating a LightSaber.
    	ItemStack powerCrystalStack = new ItemStack(SuperDopeJediMod.redPowerCrystal);
    	ItemStack ironIngotStack = new ItemStack(Items.iron_ingot);
    	GameRegistry.addRecipe(new ItemStack(this), "x", " y", " x", 'x', powerCrystalStack, 'y', ironIngotStack);
	}

}

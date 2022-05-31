package com.Loaphs.jehvnar;

import com.Loaphs.jehvnar.init.BlockInit;
import com.Loaphs.jehvnar.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("jehvnar")
public class Jehvnar {
	
	public static final String MOD_ID = "jehvnar";
	
	public static final CreativeModeTab JEHVNAR_TAB = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.COPPER_SHOVEL.get());
		}
	};
	
	public Jehvnar() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
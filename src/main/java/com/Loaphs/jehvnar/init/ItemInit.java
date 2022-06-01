package com.Loaphs.jehvnar.init;

import com.Loaphs.jehvnar.Jehvnar;
import com.Loaphs.jehvnar.item.Beer;
import com.Loaphs.jehvnar.item.CopperIngot;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Jehvnar.MOD_ID);
	
	//COPPER SHOVEL
	public static final RegistryObject<Item> COPPER_SHOVEL = register("copper_shovel",
			() -> new Item(new Item.Properties().tab(Jehvnar.JEHVNAR_TAB).stacksTo(1)));
	
	//COPPER INGOT
	public static final RegistryObject<Item> COPPER_INGOT = register("copper_ingot",
			() -> new CopperIngot(new Item.Properties().tab(Jehvnar.JEHVNAR_TAB).stacksTo(64)));
	
	//BEER
	public static final RegistryObject<Item> BEER = register("beer", 
			() -> new Beer(new Item.Properties().tab(Jehvnar.JEHVNAR_TAB).stacksTo(16)));
	
	
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}

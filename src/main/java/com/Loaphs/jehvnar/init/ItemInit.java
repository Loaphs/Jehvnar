package com.Loaphs.jehvnar.init;

import com.Loaphs.jehvnar.Jehvnar;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Jehvnar.MOD_ID);
	
	public static final RegistryObject<Item> COPPER_SHOVEL = register("copper_shovel", () -> new Item(new Item.Properties().tab(Jehvnar.JEHVNAR_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}

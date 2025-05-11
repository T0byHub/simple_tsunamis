
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.chaos.simpletsunamis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.chaos.simpletsunamis.item.Voidfluidtype2Item;
import net.chaos.simpletsunamis.item.Voidfluidtype1Item;
import net.chaos.simpletsunamis.item.TsunamiWaterItem;
import net.chaos.simpletsunamis.item.TsunamiLavaItem;
import net.chaos.simpletsunamis.SimpleTsunamisMod;

import java.util.function.Function;

public class SimpleTsunamisModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SimpleTsunamisMod.MODID);
	public static final DeferredItem<Item> TSUNAMI_WATER_BUCKET = register("tsunami_water_bucket", TsunamiWaterItem::new);
	public static final DeferredItem<Item> TSUNAMI_LAVA_BUCKET = register("tsunami_lava_bucket", TsunamiLavaItem::new);
	public static final DeferredItem<Item> VOIDFLUIDTYPE_1_BUCKET = register("voidfluidtype_1_bucket", Voidfluidtype1Item::new);
	public static final DeferredItem<Item> VOIDFLUIDTYPE_2_BUCKET = register("voidfluidtype_2_bucket", Voidfluidtype2Item::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}


package net.chaos.simpletsunamis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.chaos.simpletsunamis.init.SimpleTsunamisModFluids;

public class TsunamiWaterItem extends BucketItem {
	public TsunamiWaterItem(Item.Properties properties) {
		super(SimpleTsunamisModFluids.TSUNAMI_WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

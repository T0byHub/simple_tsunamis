
package net.chaos.simpletsunamis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.chaos.simpletsunamis.init.SimpleTsunamisModFluids;

public class Voidfluidtype1Item extends BucketItem {
	public Voidfluidtype1Item(Item.Properties properties) {
		super(SimpleTsunamisModFluids.VOIDFLUIDTYPE_1.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

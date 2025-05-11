package net.chaos.simpletsunamis.procedures;

import net.minecraft.world.entity.Entity;

public class TsunamiLavaMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(15);
	}
}

package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public class KnockJudge {

	public static void add(Entity entity) {
		entity.setVelocity(new Vector().zero().subtract(entity.getLocation().getDirection()));
	}
	
}

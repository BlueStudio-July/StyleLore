package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Entity;

public class LightJudge {

	public static void add(Entity entity) {
	    entity.getWorld().strikeLightning(entity.getLocation());
	}
	
}

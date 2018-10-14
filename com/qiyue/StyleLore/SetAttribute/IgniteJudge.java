package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Entity;

import com.qiyue.StyleLore.Main;

public class IgniteJudge {

	public static void add(Entity entity) {
		entity.setFireTicks(Main.config.getInt("Attribute.IgniteJudge.time"));
	}
	
}

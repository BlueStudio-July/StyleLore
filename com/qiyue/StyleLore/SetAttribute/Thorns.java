package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;

public class Thorns {

	public static void add(Entity damger , double damage , double b) {
	      Damageable dg = (Damageable)damger;
	      dg.damage(damage * b);
	}
	
}

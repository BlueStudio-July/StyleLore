package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;

public class HealthSteal {

	public static void add(Entity damger , Entity entity , double d) {
       Damageable dg = (Damageable)damger;
       Damageable ey = (Damageable)entity;
       Double health = ey.getHealth() * d;
       if(dg.getHealth() + health > dg.getMaxHealth()) {
    	   dg.setHealth(dg.getMaxHealth());
    	   return;
       }
       dg.setHealth(dg.getHealth() + health);
	}
	
	
}

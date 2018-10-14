package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;

public class Pro {

	public static Entity get(Entity e) {
		if(e instanceof Projectile) {
			Projectile p = (Projectile)e;
			return p.getShooter();		
		}
		return e;
	}
	
	
}

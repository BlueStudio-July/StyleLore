package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;

public class BacyPlayer {

	public static boolean byPVP(Entity en1, Entity en2) {
		return (en1 instanceof Player && en2 instanceof Player);
	}
	
	public static boolean byPVE(Entity en1,Entity en2) {
		return (en1 instanceof Player && !(en2 instanceof Player));
	}
	
	public static boolean byPro(Entity en1) {
		return (en1 instanceof Projectile);
	}
	
}

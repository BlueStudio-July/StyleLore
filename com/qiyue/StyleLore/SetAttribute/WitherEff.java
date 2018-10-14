package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.qiyue.StyleLore.Main;

public class WitherEff {

	public static void add(Entity entity) {
		if(entity instanceof Player) {
			PotionEffect Effect = new PotionEffect(PotionEffectType.getById(20),Main.instance.getConfig().getInt("Attribute.WitherEff.time"),Main.instance.getConfig().getInt("Attribute.WitherEff.level"), false);
			((Player) entity).addPotionEffect(Effect);
		}
	}
}

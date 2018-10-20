package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import com.qiyue.StyleLore.Main;
import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;
@SuppressWarnings("all")
public class Skills {

	public static boolean byPVP(Entity en1, Entity en2) {
		return (en1 instanceof Player && en2 instanceof Player);
	}
	
	public static boolean byPVE(Entity en1,Entity en2) {
		return (en1 instanceof Player && !(en2 instanceof Player));
	}
	
	public static boolean byPro(Entity en1) {
		return (en1 instanceof Projectile);
	}
	
	public static void addBindEff(Entity entity) {
		if(entity instanceof Player) {
			PotionEffect Effect = new PotionEffect(PotionEffectType.getById(15),Main.instance.getConfig().getInt("Attribute.BlindEff.time"),Main.instance.getConfig().getInt("Attribute.BlindEff.level"), false);
			((Player) entity).addPotionEffect(Effect);
		}
	}
	
	public static void addHealthSteal(Entity damger , Entity entity , double d) {
	       Damageable dg = (Damageable)damger;
	       Damageable ey = (Damageable)entity;
	       Double health = ey.getHealth() * d;
	       if(dg.getHealth() + health > dg.getMaxHealth()) {
	    	   dg.setHealth(dg.getMaxHealth());
	    	   return;
	       }
	       dg.setHealth(dg.getHealth() + health);
		}
	
	
	public static void addIgniteJudge(Entity entity) {
		entity.setFireTicks(Main.config.getInt("Attribute.IgniteJudge.time"));
	}
	
	public static void addKnockJudge(Entity entity) {
		entity.setVelocity(new Vector().zero().subtract(entity.getLocation().getDirection()));
	}
	
	public static void addLightJudge(Entity entity) {
	    entity.getWorld().strikeLightning(entity.getLocation());
	}
	
	public static void addThorns(Entity damger , double damage , double b) {
	      Damageable dg = (Damageable)damger;
	      dg.damage(damage * b);
	}
	
	public static void addWitherEff(Entity entity) {
		if(entity instanceof Player) {
			PotionEffect Effect = new PotionEffect(PotionEffectType.getById(20),Main.instance.getConfig().getInt("Attribute.WitherEff.time"),Main.instance.getConfig().getInt("Attribute.WitherEff.level"), false);
			((Player) entity).addPotionEffect(Effect);
		}
	}
	
	public static Entity getEntity(Entity e) {
		if(e instanceof Projectile) {
			Projectile p = (Projectile)e;
			return p.getShooter();		
		}
		return e;
	}
	
	public static double getAttribute(AttributeMaterial att) {
		return AttributeEvent.Attributes.get(att);
	}
	
	
}

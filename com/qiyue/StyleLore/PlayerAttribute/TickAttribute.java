package com.qiyue.StyleLore.PlayerAttribute;

import org.bukkit.Bukkit;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class TickAttribute {

	
	public static double ofs(double d) {
		if(d > 1.0) {
			return 1.0;
		}
		return d;
	}
	
	public static double of(Player p,double d2) {
		if(p.getWalkSpeed() + d2 > 1.0) {
			return 1.0;
		}
		return d2;
	}
	
	public static void up() {
		   TickAttribute.resultAll();
		   for(Player p : Bukkit.getOnlinePlayers()) {
	       Bukkit.getServer().getPluginManager().callEvent(new TickAttributeEvent(p));
	       if(TickAttributeEvent.maxhealth.containsKey(p.getName())) {
	       p.setMaxHealth(((Damageable)p).getMaxHealth() + TickAttributeEvent.maxhealth.get(p.getName()));
	       }
	       if(TickAttributeEvent.speed.containsKey(p.getName())) {
	       p.setWalkSpeed((float) ((float)  p.getWalkSpeed() + TickAttribute.of(p,TickAttributeEvent.speed.get(p.getName()))));
	       }
		   }
	 }

	
	
	public static void resultAll() {
		 for(String name : TickAttributeEvent.maxhealth.keySet()) {
			        Player p = Bukkit.getPlayer(name);
	                p.setMaxHealth(((Damageable)p).getMaxHealth() - TickAttributeEvent.maxhealth.get(name));
		 }
		 for(String name : TickAttributeEvent.speed.keySet()) {
		        Player p = Bukkit.getPlayer(name);
                p.setWalkSpeed((float) ((float)p.getWalkSpeed() - TickAttributeEvent.speed.get(name)));
	     }
	
	}
	
	public static void result(Player p) {
		if(TickAttributeEvent.maxhealth.containsKey(p.getName())){
			p.setMaxHealth(((Damageable)p).getMaxHealth() - TickAttributeEvent.maxhealth.get(p.getName()));
			TickAttributeEvent.maxhealth.remove(p.getName());
		}
		if(TickAttributeEvent.speed.containsKey(p.getName())){
			p.setWalkSpeed((float) ((float)p.getWalkSpeed() - TickAttributeEvent.speed.get(p.getName())));
			TickAttributeEvent.speed.remove(p.getName());
		}
	}
	
	
}


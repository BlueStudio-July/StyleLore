package com.qiyue.StyleLore.PlayerAttribute;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.qiyue.StyleLore.AttributeVac;
import com.qiyue.StyleLore.Main;
import com.qiyue.StyleLore.Utils;

public class Attribute {

	public static void add(TickAttributeEvent event) {
		Player p = event.getPlayer();
		for(ItemStack item : Utils.getEq(p)) {
		String lore = Utils.get(item,Main.config.getString("PlayerAttribute.MaximumLife.lore"));

		if(lore != null && lore.contains(" ")) {
			String s =  lore.replace(Main.config.getString("PlayerAttribute.MaximumLife.lore"), "");
			double data = AttributeVac.get(s);
			if(data != -2.0) {
                event.setMaxHealth(event.getMaxHelath() + data);
	       }
		  
		}		
		 
		}
		for(ItemStack item : Utils.getEq(p)) {
		String lore = Utils.get(item,Main.config.getString("PlayerAttribute.Speed.lore"));
		if(lore != null && lore.contains(" ")) {
			String s =  lore.replace(Main.config.getString("PlayerAttribute.Speed.lore"), "");
			double data = AttributeVac.get(s);
			if(data != -2.0) {
                event.setSpeed(event.getSpeed() + data);
	       }
		
		}
		}
		}

	
	
	
}

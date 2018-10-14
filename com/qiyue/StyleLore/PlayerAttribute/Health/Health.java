package com.qiyue.StyleLore.PlayerAttribute.Health;
import java.util.List;
import java.util.jar.Attributes;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.qiyue.StyleLore.AttributeVac;
import com.qiyue.StyleLore.EntityItem;
import com.qiyue.StyleLore.Lore;
import com.qiyue.StyleLore.Main;

public class Health {

	public static void updata(Player p , int slot , int type , ItemStack item) {

         if(type == 0 && slot == 39) {
        	 System.out.print("原头盔的血量: "+Health.getMaxHealth(p, slot));
        	 System.out.print("现在的头盔血量: " + Health.getMaxHealths(item, p));
        	 p.setMaxHealth(((Damageable)p).getHealth() - Health.getMaxHealth(p, slot));
        	 p.setMaxHealth(((Damageable)p).getHealth() + Health.getMaxHealths(item, p));

         }
		
		
	}
	
	public static double getMaxHealths(ItemStack item, Player p) {
		String s = Lore.get(item, Main.instance.getConfig().getString("PlayerAttribute.MaximumLife.lore"));
		if(s != null && s.contains(" ")) {
			String a = s.replace( Main.instance.getConfig().getString("PlayerAttribute.MaximumLife.lore"), "");
			double data = AttributeVac.get(a);
			if(data != -2.0) {
				return data;
			}
		}
		return 0;
	}
	
	public static double getMaxHealth(Player p , int slot) {
		ItemStack item = p.getInventory().getItem(slot);
		String s = Lore.get(item, Main.instance.getConfig().getString("PlayerAttribute.MaximumLife.lore"));
		if(s != null && s.contains(" ")) {
			String a = s.replace( Main.instance.getConfig().getString("PlayerAttribute.MaximumLife.lore"), "");
			double data = AttributeVac.get(a);
			if(data != -2.0) {
				return data;
			}
		}
		return 0;
	}
	
}

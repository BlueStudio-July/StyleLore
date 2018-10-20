package com.qiyue.StyleLore.PlayerAttribute;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.inventory.ItemStack;

import com.qiyue.StyleLore.AttributeVac;
import com.qiyue.StyleLore.Main;
import com.qiyue.StyleLore.Utils;

public class MoreExp {

	public static void add(PlayerExpChangeEvent event) {
		Player p = event.getPlayer();
		double b = 0.0;
		for(ItemStack item : Utils.getEq(p)) {
			b = b + MoreExp.getMoreExp(item, p);
		}
		event.setAmount((int) Math.ceil(event.getAmount() * b));
	}
	
	public static double getMoreExp(ItemStack item, Player p) {
		String s = Utils.get(item, Main.instance.getConfig().getString("PlayerAttribute.MoreExp.lore"));
		if(s != null && s.contains(" ")) {
			String a = s.replace( Main.instance.getConfig().getString("PlayerAttribute.MoreExp.lore"), "");
			double data = AttributeVac.get(a);
			if(data != -2.0) {
				return data;
			}
		}
		return 0.0;
	}

}

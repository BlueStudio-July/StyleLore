package com.qiyue.StyleLore.LoreAttribute;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.inventory.ItemStack;

import com.qiyue.StyleLore.AttributeVac;
import com.qiyue.StyleLore.EntityItem;
import com.qiyue.StyleLore.Lore;
import com.qiyue.StyleLore.Main;

public class MoreExp {

	public MoreExp(PlayerExpChangeEvent event) {
		Player p = event.getPlayer();
		double b = 0.0;
		for(ItemStack item : EntityItem.getEq(p)) {
			b = b + this.getMoreExp(item, p);
		}
		event.setAmount((int) Math.ceil(event.getAmount() * b));
	}
	
	public double getMoreExp(ItemStack item, Player p) {
		String s = Lore.get(item, Main.instance.getConfig().getString("PlayerAttribute.MoreExp.lore"));
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

package com.qiyue.StyleLore;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;



public class Lore {

	//д�����Һ��йؼ��ֵ�LORE�ķ���
	public static String get(ItemStack item , String s) {
		if(item != null && item.getType() != Material.AIR && item.getItemMeta().hasLore()) {
		   List<String> lore = item.getItemMeta().getLore();
		   for(String l : lore) {
			   if(ChatColor.stripColor(l).contains(s)) {
				   return ChatColor.stripColor(l);
			   }
		   }
		}
		return null;
	}
	
}

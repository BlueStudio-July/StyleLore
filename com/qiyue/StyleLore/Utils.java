package com.qiyue.StyleLore;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class Utils {
	
	public static boolean isNum(String str){
		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}
	
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
	
	public static List<ItemStack> getEq(Entity entity) {
		List<ItemStack> items = new ArrayList<>();
		items.add(((LivingEntity)entity).getEquipment().getItemInHand());
		for(ItemStack item : ((LivingEntity)entity).getEquipment().getArmorContents()) {
			items.add(item);
		}
		return items;
	}
	
	public static boolean of(double vau) {
		int random = (int)(1+Math.random()*(100-1+1));
		double randoms = random / 100.0;
		vau = vau / 100.0;
		if( vau >= randoms ){
			return true;
		}
		else{
			return false;
			   }
	}
}

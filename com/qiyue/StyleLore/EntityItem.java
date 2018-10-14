package com.qiyue.StyleLore;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;



public class EntityItem {

	public static List<ItemStack> getEq(Entity entity) {
		List<ItemStack> items = new ArrayList<>();
		items.add(((LivingEntity)entity).getEquipment().getItemInHand());
		for(ItemStack item : ((LivingEntity)entity).getEquipment().getArmorContents()) {
			items.add(item);
		}
		return items;
	}
	
}

package com.qiyue.StyleLore;

import org.bukkit.inventory.ItemStack;

import com.qiyue.StyleLore.SetAttribute.AttributeEvent;
import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;

public class TheadAttributes {


	public static void run(AttributeEvent event) {
			for(AttributeMaterial attribute : AttributeMaterial.values()) {
				for(ItemStack item : Utils.getEq(Main.returnEntity(event, attribute))) {
				String lore = Utils.get(item, StyleAPI.getByName(attribute));
				if(lore != null && lore.contains(" ")) {
					String s =  lore.replace(StyleAPI.getByName(attribute), "");
					double data = AttributeVac.get(s);
					if(data != -2.0) {
	                    event.setAttribute(attribute,event.getAttribute(attribute) + data);
			       }
				  
				}
			
			}
			}	

	}
}

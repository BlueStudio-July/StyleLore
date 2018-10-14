package com.qiyue.StyleLore.PlayerAttribute.Health;

import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MaxHealth {

	public MaxHealth(InventoryClickEvent event) {
		if(event.getAction().toString().equals("PLACE_ALL") || event.getAction().toString().equals("SWAP_WITH_CURSOR") || event.getAction().toString().equals("PICKUPALL")) {
			Health.updata((Player)event.getWhoClicked(),event.getSlot(), Actions.vof(event.getAction().toString()), event.getCursor());
		}
	}
	
	
	
}

package com.qiyue.StyleLore;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;

import com.qiyue.StyleLore.LoreAttribute.MoreExp;
import com.qiyue.StyleLore.PlayerAttribute.Health.MaxHealth;
import com.qiyue.StyleLore.SetAttribute.AttributeEvent;

public class HandEvent implements Listener {

	@EventHandler
	public void Attribute(AttributeEvent event) {
		Ther.updata(event);
	}
	
	//@EventHandler
	public void PlayerClick(InventoryClickEvent event) {
		new MaxHealth(event);
	}
	
	@EventHandler
	public void PlayerExp(PlayerExpChangeEvent event) {
		new MoreExp(event);
	}
	
}

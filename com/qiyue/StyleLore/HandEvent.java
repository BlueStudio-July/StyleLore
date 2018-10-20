package com.qiyue.StyleLore;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.qiyue.StyleLore.PlayerAttribute.Attribute;
import com.qiyue.StyleLore.PlayerAttribute.MoreExp;
import com.qiyue.StyleLore.PlayerAttribute.TickAttribute;
import com.qiyue.StyleLore.PlayerAttribute.TickAttributeEvent;
import com.qiyue.StyleLore.SetAttribute.AttributeEvent;

public class HandEvent implements Listener {

	@EventHandler
	public void Attribute(AttributeEvent event) {
		TheadAttributes.run(event);
	}
	
	@EventHandler
	public void PlayerExp(PlayerExpChangeEvent event) {
		MoreExp.add(event);
	}
	
	@EventHandler
	public void TickAttribute(TickAttributeEvent event) {
		Attribute.add(event);
	}
	
	@EventHandler
	public void PlayerKick(PlayerKickEvent event) {
		TickAttribute.result(event.getPlayer());
	}
	
	@EventHandler
	public void PlayerLeave(PlayerQuitEvent event) {
		TickAttribute.result(event.getPlayer());
	}
	
	
	
}

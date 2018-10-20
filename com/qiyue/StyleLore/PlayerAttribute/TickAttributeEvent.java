package com.qiyue.StyleLore.PlayerAttribute;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class TickAttributeEvent extends Event implements Cancellable{

	static HashMap<String, Double> maxhealth = new HashMap<String, Double>();
	static HashMap<String, Double> speed = new HashMap<String, Double>();
	private static final HandlerList handlers = new HandlerList();
	private static boolean cancelled = false;
	private Player p;
	
	public TickAttributeEvent(Player p) {
		this.p = p;
		this.maxhealth.put(p.getName(),0.0);
		this.speed.put(p.getName(), 0.0);
	}
	
	
	
	public Player getPlayer() {
		return p;
	}
	
	public void setMaxHealth(double d) {
		this.maxhealth.put(p.getName(), d);
	}	
	
	public double getMaxHelath() {
		return this.maxhealth.get(p.getName());
	}
	
	public double getSpeed() {
		return this.speed.get(p.getName());
    }
	
	public void setSpeed(double d) {
		this.speed.put(p.getName(), d);
	}	
	
	public HandlerList getHandlers()
	{
	   return handlers;
    }
	
	static HandlerList getHandlerList() {
	    return handlers;
	 }

	public boolean isCancelled() {
	    return this.cancelled;
	 }
	
	 public void setCancelled(boolean cancel) {
	    this.cancelled = cancel;
	 }
}

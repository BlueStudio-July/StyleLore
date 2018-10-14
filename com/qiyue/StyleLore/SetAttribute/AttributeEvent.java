package com.qiyue.StyleLore.SetAttribute;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;

@SuppressWarnings("all")
public class AttributeEvent extends Event implements Cancellable {
	
	 private static final HandlerList handlers = new HandlerList();
	 private static boolean cancelled = false;
	 public static HashMap<AttributeMaterial,Double> Attributes = new HashMap<AttributeMaterial,Double>();
	 private static Entity damger;
	 private static Entity entity;

	 
	public AttributeEvent(Entity damger , Entity entity) {
		for(AttributeMaterial att : AttributeMaterial.values()) {
			this.Attributes.put(att,0.0);
		}
		this.damger = damger;
		this.entity = entity;
	}

	public Entity getDamger() {
		return damger;
	}
	
	public Entity getEntity() {
		return entity;
	}
	
	public void setAttribute(AttributeMaterial att,Double d) {
		this.Attributes.put(att,d);
	}
	
	public double getAttribute(AttributeMaterial att) {
		return this.Attributes.get(att);
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

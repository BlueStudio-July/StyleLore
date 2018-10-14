package com.qiyue.StyleLore;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class Message {

	
	
	public static void create() {
		Main.instance.saveResource("message.yml", false);
		Main.message = new File(Main.instance.getDataFolder(),"message.yml").exists() ? YamlConfiguration.loadConfiguration( new File(Main.instance.getDataFolder(),"message.yml")) : new YamlConfiguration();
	}
	
	public static void damage(Entity damger , Entity entity , double damage){
		if(!(damger instanceof Player) && !(entity instanceof Player)){
			return;
		}
		
		if(damger instanceof Player) {
			if (entity instanceof Player) {
				((Player) damger).sendMessage(Main.message.getString("Message1").replace("&", "¡ì").replace("{entity_name}",  ((Player) entity).getName()).replace("{damage}",damage+""));	
			}else {
				((Player) damger).sendMessage(Main.message.getString("Message1").replace("&", "¡ì").replace("{entity_name}",  entity.getType().getName()).replace("{damage}",damage+""));	
			}
		} 	
		
		
		if(entity instanceof Player) {
			if (damger instanceof Player) {
				((Player) entity).sendMessage(Main.message.getString("Message2").replace("&", "¡ì").replace("{entity_name}",  ((Player) damger).getName()).replace("{damage}",damage+""));	
			}else {
				((Player) entity).sendMessage(Main.message.getString("Message2").replace("&", "¡ì").replace("{entity_name}",  damger.getType().getName()).replace("{damage}",damage+""));	
			}
		} 
		
		
	}
	
	public static void blindeff(Entity damger , Entity entity) {
		if(!(damger instanceof Player) && !(entity instanceof Player)){
			return;
		}
		
		if(damger instanceof Player) {
			if (entity instanceof Player) {
				((Player) damger).sendMessage(Main.message.getString("Message6").replace("&", "¡ì").replace("{entity_name}",  ((Player) entity).getName()));	
			}else {
				((Player) damger).sendMessage(Main.message.getString("Message6").replace("&", "¡ì").replace("{entity_name}",  entity.getType().getName()));	
			}
		} 
		
		
		if(entity instanceof Player) {
			if (damger instanceof Player) {
				((Player) entity).sendMessage(Main.message.getString("Message5").replace("&", "¡ì").replace("{entity_name}",  ((Player) damger).getName()));	
			}else {
				((Player) entity).sendMessage(Main.message.getString("Message5").replace("&", "¡ì").replace("{entity_name}",  damger.getType().getName()));	
			}
		} 
		
		
	}
	
	public static void dodge(Entity damger , Entity entity) {
		if(!(damger instanceof Player) && !(entity instanceof Player)){
			return;
		}
		
		if(damger instanceof Player) {
			if (entity instanceof Player) {
				((Player) damger).sendMessage(Main.message.getString("Message3").replace("&", "¡ì").replace("{entity_name}",  ((Player) entity).getName()));	
			}else {
				((Player) damger).sendMessage(Main.message.getString("Message3").replace("&", "¡ì").replace("{entity_name}",  entity.getType().getName()));	
			}
		} 
		
		
		if(entity instanceof Player) {
			if (damger instanceof Player) {
				((Player) entity).sendMessage(Main.message.getString("Message4").replace("&", "¡ì").replace("{entity_name}",  ((Player) damger).getName()));	
			}else {
				((Player) entity).sendMessage(Main.message.getString("Message4").replace("&", "¡ì").replace("{entity_name}",  damger.getType().getName()));	
			}
		} 
		
		
	}
	
	
}

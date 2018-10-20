package com.qiyue.StyleLore;

import java.io.File;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.avaje.ebean.enhance.asm.Attribute;
import com.qiyue.StyleLore.Commands.CommandsMain;
import com.qiyue.StyleLore.PlayerAttribute.TickAttribute;
import com.qiyue.StyleLore.SetAttribute.AttributeCalculation;
import com.qiyue.StyleLore.SetAttribute.AttributeEvent;
import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;
import net.minecraft.util.org.apache.commons.io.monitor.FileAlterationListener;
@SuppressWarnings("all")
public class Main extends JavaPlugin{

	public static FileConfiguration config;
	public static FileConfiguration message;
	public static JavaPlugin instance;
	public static File file;
	
	
	public void onDisable() {
       TickAttribute.resultAll();
	}
	
	
	public void onEnable() {
		instance = this;
		this.run();
		this.file = new File(this.getDataFolder(),"config.yml");
		com.qiyue.StyleLore.ConfigStats.create();
		com.qiyue.StyleLore.Message.create();
	    getServer().getPluginManager().registerEvents(new HandEvent(),this);
		getServer().getPluginManager().registerEvents(new AttributeCalculation(), this);
		this.getCommand("Stl").setExecutor(new CommandsMain());
		this.getServer().getConsoleSender().sendMessage("[StyleLore] §aLore属性插件已加载.");
	} 
	
	public static Entity returnEntity(AttributeEvent event,AttributeMaterial att) {
		if(att.equals(AttributeMaterial.Armor)) {
			return event.getEntity();
		} if (att.equals(AttributeMaterial.DodgeJudge)) {
			return event.getEntity();
		} if (att.equals(AttributeMaterial.Thorns)) {
			return event.getEntity();
		}
		return event.getDamger();
	}
	
	public static void run() {

	
			   Bukkit.getScheduler().runTaskTimer(Main.instance, new BukkitRunnable() {
				@Override
				public void run() {
					TickAttribute.up();
				}
				   
			   }, 1, 1);
				
				
	
			
		
	}

}

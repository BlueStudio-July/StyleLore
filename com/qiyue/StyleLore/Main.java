package com.qiyue.StyleLore;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.qiyue.Commands.CommandsMain;
@SuppressWarnings("all")
public class Main extends JavaPlugin{

	public static FileConfiguration config;
	public static FileConfiguration message;
	public static JavaPlugin instance;
	public static File file;
	
	public void onEnable() {
		instance = this;
		this.file = new File(this.getDataFolder(),"config.yml");
		com.qiyue.StyleLore.ConfigStats.create();
		com.qiyue.StyleLore.Message.create();
		RegListener.start();
		this.getCommand("Stl").setExecutor(new CommandsMain());
		this.getServer().getConsoleSender().sendMessage("[StyleLore] ¡ìaStyleLore is Loding....");
	} 
	
	
}

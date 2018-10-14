package com.qiyue.StyleLore;

public class ConfigStats {

	public static void create() {
		if(!Main.instance.getDataFolder().exists()) {
			Main.instance.getDataFolder().mkdirs();
		} if (!Main.file.exists())  {
			 Main.instance.saveDefaultConfig();
			 Main.instance.reloadConfig();
		}
		Main.config = Main.instance.getConfig();
	}
	
	
}

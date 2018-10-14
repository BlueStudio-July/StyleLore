package com.qiyue.StyleLore;

import com.qiyue.StyleLore.SetAttribute.AttributeCalculation;

public class RegListener {
    
	public static void start() {
		Main.instance.getServer().getPluginManager().registerEvents(new AttributeCalculation(), Main.instance);
	    Main.instance.getServer().getPluginManager().registerEvents(new HandEvent(), Main.instance);
	}
	
}

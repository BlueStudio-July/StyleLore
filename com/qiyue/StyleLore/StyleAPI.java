package com.qiyue.StyleLore;

import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;

public class StyleAPI {

	public static String getByName(AttributeMaterial att) {
		return Main.config.getString("Attribute."+att.getName()+".lore");
	}
	
	
	
}


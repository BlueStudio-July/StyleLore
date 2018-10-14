package com.qiyue.Commands;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class CommandAttribute {

	public static void send(Player p) {
	p.sendMessage("§4§l§m               §f[ Your-Stats ]§4§l§m               ");
	p.sendMessage("§f§l最大生命值: §c"+ ((Damageable)p).getMaxHealth());
	p.sendMessage("§f§l当前速度: §a"+p.getWalkSpeed());
	}
	
}

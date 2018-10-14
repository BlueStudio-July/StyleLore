package com.qiyue.Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHelp {

	public static void send(CommandSender sender)  {
		sender.sendMessage("§4§l§m               §f[ StyleLore ]§4§l§m               ");
		sender.sendMessage("§7/Stl stats  §f查看自身属性");
		if(sender.isOp()) {
		sender.sendMessage("§7/Stl reload §f重载插件");
		}
	}
	
}

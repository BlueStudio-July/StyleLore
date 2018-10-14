package com.qiyue.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandsMain implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender , Command cmd, String lable, String[] args) {
		if(lable.equalsIgnoreCase("stl")) {
			if(args.length == 0) {
			   CommandHelp.send(sender);
			   return true;
			}
			if(args[0].equalsIgnoreCase("stats") && args.length == 1) {
				if(sender instanceof Player) {
				  CommandAttribute.send((Player)sender);
				  return true;
				}
			}
			if(args[0].equalsIgnoreCase("reload") && args.length == 1) {
				com.qiyue.StyleLore.ConfigStats.create();
				com.qiyue.StyleLore.Message.create();
				sender.sendMessage("[StyleLore] §4插件已重载");
				return true;
			}
			
			sender.sendMessage("§f[StyleLore] §c请输入正确的节点");
			return true;
		}
		return false;
	}

}

package com.qiyue.StyleLore.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

import com.qiyue.StyleLore.PlayerAttribute.TickAttribute;

public class CommandsMain implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender , Command cmd, String lable, String[] args) {
		if(lable.equalsIgnoreCase("stl")) {
			if(args.length == 0) {
				sender.sendMessage("��4��l��m               ��f[ StyleLore ]��4��l��m               ");
				sender.sendMessage("��7/Stl stats  ��f�鿴��������");
				if(sender.isOp()) {
				sender.sendMessage("��7/Stl reload ��f���ز��");
				sender.sendMessage("��7/Stl max <player> <health> ��f�������Ѫ��");
				sender.sendMessage("��7/Stl spend <player> <spend> ��f�����ٶ�");
				}
			   return true;
			}
			if(args[0].equalsIgnoreCase("max")  && args.length == 3 && sender.isOp()) {
				Player p = Bukkit.getPlayer(args[1]);
				if(p == null) { return true; }
				p.setMaxHealth(Double.parseDouble(args[2]));
				return true;
			}
			if(args[0].equalsIgnoreCase("spend")  && args.length == 3 && sender.isOp()) {
				Player p = Bukkit.getPlayer(args[1]);
				if(p == null) { return true; }
				p.setWalkSpeed((float) TickAttribute.ofs(Double.parseDouble(args[2])));
				return true;
			}
			if(args[0].equalsIgnoreCase("stats") && args.length == 1) {
				if(sender instanceof Player) {
					Player p = (Player) sender;
					p.sendMessage("��4��l��m               ��f[ Your-Stats ]��4��l��m               ");
					p.sendMessage("��f��l�������ֵ: ��c"+ ((Damageable)p).getMaxHealth());
					p.sendMessage("��f��l��ǰ�ٶ�: ��a"+p.getWalkSpeed());
				  return true;
				}
			}
			if(args[0].equalsIgnoreCase("reload") && args.length == 1 && sender.isOp()) {
				com.qiyue.StyleLore.ConfigStats.create();
				com.qiyue.StyleLore.Message.create();
				sender.sendMessage("[StyleLore] ��4���������");
				return true;
			}
			
			sender.sendMessage("��f[StyleLore] ��c��������ȷ�Ľڵ�");
			return true;
		}
		return false;
	}

}

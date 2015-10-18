package me.pitkes22.stargate;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class a implements CommandExecutor{
	private Plugin plugin;
	public a(Plugin plugin){
		this.plugin = plugin;
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player){
		animation.chvronShift(new Stargate(new Location(((Player) sender).getWorld(), 200, 90, 200)),plugin);
		}
		return true;
		
	}
	
	

}

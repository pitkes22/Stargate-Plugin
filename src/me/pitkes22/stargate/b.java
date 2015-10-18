package me.pitkes22.stargate;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class b implements CommandExecutor{
	private Plugin plugin;
	public b(Plugin plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player){
		
		animation.chevronLightUp(new Stargate(new Location(((Player) sender).getWorld(), 200, 90, 200)), Integer.parseInt(args[0]));
		}
		return true;
		
	}
	
	

}

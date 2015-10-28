package me.pitkes22.stargate;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class d implements CommandExecutor{
	private Plugin plugin;
	private char[] addresses = new char[9];
	
	//private Symbol[] addresses;
	public d(Plugin plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player){
		Bukkit.broadcastMessage("vola sa to !!!");
		
		Bukkit.broadcastMessage(""+args[0].charAt(0));

		
		addresses[0] = (args[0].charAt(0));
		Bukkit.broadcastMessage("za chybou");
		addresses[1] = args[0].charAt(1);
		addresses[2] = args[0].charAt(2);
		addresses[3] = args[0].charAt(3);
		addresses[4] = args[0].charAt(4);
		addresses[5] = args[0].charAt(5);
		addresses[6] = args[0].charAt(6);
		
		if(args[0].length() > 7 ){
			Bukkit.broadcastMessage("Mal 6");
		addresses[7] = args[0].charAt(7);
		}
		if(args[0].length() > 8 ){
			Bukkit.broadcastMessage("Mal 7");
		addresses[8] = args[0].charAt(8);
		}
		
		Call.call(plugin, new Stargate(new Location(((Player) sender).getWorld(), 200, 90, 200,((Player) sender).getLocation().getYaw(),((Player) sender).getLocation().getPitch())), addresses,(Player) sender);
		
		//animation.ringTurn(new Stargate(new Location(((Player) sender).getWorld(), 200, 90, 200)),Symbol.ANDROMEDA,plugin);
		
		}
		return true;
		
	}
	
	

}

package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

public class animation extends BukkitPlugin {
	
	public boolean chevron(Location loc, int ch) {
		//Bukkit.getScheduler().runTaskLater(this, arg1, arg2)
		Bukkit.getScheduler().runTaskLater((Plugin) this, new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				
			}
			
		}, 20);
		
		return false;
		
	}
}

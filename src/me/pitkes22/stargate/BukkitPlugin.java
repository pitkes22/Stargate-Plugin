package me.pitkes22.stargate;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {
	
	@Override
    public void onEnable() {
		
		//getCommand("autodestruction").setExecutor(new AutodestructionCommandExecutor());
		//getCommand("stargate").setExecutor(new Stargate());
		getCommand("a").setExecutor((CommandExecutor) new a(this));
		getCommand("b").setExecutor((CommandExecutor) new b(this));
		getCommand("c").setExecutor((CommandExecutor) new c(this));
		getCommand("d").setExecutor((CommandExecutor) new d(this));
		//getCommand("dhdinv").setExecutor(new DhdInvCommandExecutor());
		getServer().getPluginManager().registerEvents(new StargateListener(), this);
		getServer().getPluginManager().registerEvents(new DhdListener(this), this);
		
	
		
		

   }

}


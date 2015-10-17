package me.pitkes22.stargate;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {
	
	@Override
    public void onEnable() {
		
		//getCommand("autodestruction").setExecutor(new AutodestructionCommandExecutor());
		//getCommand("stargate").setExecutor(new Stargate());
		//getCommand("dhd").setExecutor(new DhdCommandExecutor());
		//getCommand("dhdinv").setExecutor(new DhdInvCommandExecutor());
		getServer().getPluginManager().registerEvents(new StargateListener(), this);
		

   }

}


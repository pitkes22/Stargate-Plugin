package me.pitkes22.stargate;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.EulerAngle;



public class Call {
	
	private static int id;
	private static int direction = 1;
	private StargateAddress adresa;
	
	
	
	public Call(Plugin plugin,Stargate stargate,StargateAddress address,Player player) {
		this.adresa= address;
		Bukkit.broadcastMessage("Zavolalo sa call");
		
		Bukkit.broadcastMessage("Dlzka addresi je: "+address.getAddress().size());
		Bukkit.broadcastMessage("Symbol 0 je : "+address.getAddress().get(0));
	
		Bukkit.broadcastMessage("Dlzka addresi je: "+this.adresa.getAddress().size());
		Bukkit.broadcastMessage("Symbol 0 je : "+this.adresa.getAddress().get(0));
		
		StargateAddress addr = address;
		
		setId(Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
		
			
			Bukkit.broadcastMessage("Je to dnu v RUN");
			Bukkit.broadcastMessage("Dlzka addresi je: "+addr.getAddress().size());
			Bukkit.broadcastMessage("Symbol 0 je : "+addr.getAddress().get(0));	
			
			if(stargate.isAnimating() == false){
			if(stargate.getChevron9().getItemInHand().getType() == Material.RECORD_5 &&
					stargate.getChevron8().getItemInHand().getType() == Material.RECORD_5 ){
				Bukkit.broadcastMessage("Dlzka addresi je: "+address.getAddress().size());
				Bukkit.broadcastMessage("Symbol 0 je : "+address.getAddress().get(0));
				animation.ringTurn(stargate, address.getAddress().get(0), direction, 9, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron9().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron8().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.getAddress().get(1), direction, 8, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron8().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron7().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.getAddress().get(2), direction, 7, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron7().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron4().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.getAddress().get(3), direction, 4, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron4().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron3().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.getAddress().get(4), direction, 3, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron3().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron2().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.getAddress().get(5), direction, 2, plugin, player);
				direction = direction*-1;
				
			}
			//Bukkit.broadcastMessage("address[7] ma hodnotu:"+address[7]+"Pred 1");
			//Bukkit.broadcastMessage("address[8] ma hodnotu:"+address[8]+"Pred 1");
			if(address.getAddress().size() == 7){
				if(stargate.getChevron2().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron1Base().getItemInHand().getType() != Material.RECORD_6){
					animation.ringTurn(stargate, address.getAddress().get(6), direction, 1, plugin, player);
					direction = direction*-1;
					Bukkit.broadcastMessage("zabija ho prve");
					Bukkit.getScheduler().cancelTask(getId());
				}
				
				
			}
			//Bukkit.broadcastMessage("address[7] ma hodnotu:"+address[7]+"Pred 2");
			//Bukkit.broadcastMessage("address[8] ma hodnotu:"+address[8]+"Pred 2");
			if(address.getAddress().size() == 8){
				if(stargate.getChevron2().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron6().getItemInHand().getType() == Material.RECORD_5){
					animation.ringTurn(stargate, address.getAddress().get(6), direction, 6, plugin, player);
					direction = direction*-1;
					
				}
				if(stargate.getChevron6().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron1Base().getItemInHand().getType() != Material.RECORD_6){
					animation.ringTurn(stargate, address.getAddress().get(7), direction, 1, plugin, player);
					direction = direction*-1;
					Bukkit.broadcastMessage("zabija ho druhe");
					Bukkit.getScheduler().cancelTask(getId());
				}
				
				
			}
			//Bukkit.broadcastMessage("address[8] ma hodnotu:"+address[8]+"Pred 3");
			if(address.getAddress().size() == 9){
				
				if(stargate.getChevron2().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron6().getItemInHand().getType() == Material.RECORD_5){
					
					animation.ringTurn(stargate, address.getAddress().get(6), direction, 6, plugin, player);
					direction = direction*-1;
					
				}
				if(stargate.getChevron6().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron5().getItemInHand().getType() == Material.RECORD_5){
					animation.ringTurn(stargate, address.getAddress().get(7), direction, 5, plugin, player);
					direction = direction*-1;
					
				}
				if(stargate.getChevron5().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron1Base().getItemInHand().getType() != Material.RECORD_6){
					
					animation.ringTurn(stargate, address.getAddress().get(8), direction, 1, plugin, player);
					direction = direction*-1;
					Bukkit.broadcastMessage("zabija ho tretie");
					Bukkit.getScheduler().cancelTask(getId());
					
				}
				
			}
			}
				
		}, 0, 1));
		
		
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Call.id = id;
	}

}

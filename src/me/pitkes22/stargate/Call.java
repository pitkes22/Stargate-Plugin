package me.pitkes22.stargate;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.EulerAngle;



public class Call {
	
	public static int id;
	private static int direction = 1;
	
	
	public Call(Plugin plugin,Stargate stargate,ArrayList<Symbol> address,Player player) {
		
		Bukkit.broadcastMessage("Zavolalo sa call");
		
		Bukkit.broadcastMessage("Dlzka addresi je: "+address.size());
		
		id  = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
			
			
			if(animation.isAnimating() == false){
			if(stargate.getChevron9().getItemInHand().getType() == Material.RECORD_5 &&
					stargate.getChevron8().getItemInHand().getType() == Material.RECORD_5 ){
				animation.ringTurn(stargate, address.get(0), direction, 9, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron9().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron8().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.get(1), direction, 8, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron8().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron7().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.get(2), direction, 7, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron7().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron4().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.get(3), direction, 4, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron4().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron3().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.get(4), direction, 3, plugin, player);
				direction = direction*-1;
				
			}
			if(stargate.getChevron3().getItemInHand().getType() == Material.RECORD_6 &&
					stargate.getChevron2().getItemInHand().getType() == Material.RECORD_5){
				animation.ringTurn(stargate, address.get(5), direction, 2, plugin, player);
				direction = direction*-1;
				
			}
			//Bukkit.broadcastMessage("address[7] ma hodnotu:"+address[7]+"Pred 1");
			//Bukkit.broadcastMessage("address[8] ma hodnotu:"+address[8]+"Pred 1");
			if(address.size() == 7){
				if(stargate.getChevron2().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron1Base().getItemInHand().getType() != Material.RECORD_6){
					animation.ringTurn(stargate, address.get(6), direction, 1, plugin, player);
					direction = direction*-1;
					Bukkit.broadcastMessage("zabija ho prve");
					Bukkit.getScheduler().cancelTask(id);
				}
				
				
			}
			//Bukkit.broadcastMessage("address[7] ma hodnotu:"+address[7]+"Pred 2");
			//Bukkit.broadcastMessage("address[8] ma hodnotu:"+address[8]+"Pred 2");
			if(address.size() == 8){
				if(stargate.getChevron2().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron6().getItemInHand().getType() == Material.RECORD_5){
					animation.ringTurn(stargate, address.get(6), direction, 6, plugin, player);
					direction = direction*-1;
					
				}
				if(stargate.getChevron6().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron1Base().getItemInHand().getType() != Material.RECORD_6){
					animation.ringTurn(stargate, address.get(7), direction, 1, plugin, player);
					direction = direction*-1;
					Bukkit.broadcastMessage("zabija ho druhe");
					Bukkit.getScheduler().cancelTask(id);
				}
				
				
			}
			//Bukkit.broadcastMessage("address[8] ma hodnotu:"+address[8]+"Pred 3");
			if(address.size() == 9){
				
				if(stargate.getChevron2().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron6().getItemInHand().getType() == Material.RECORD_5){
					
					animation.ringTurn(stargate, address.get(6), direction, 6, plugin, player);
					direction = direction*-1;
					
				}
				if(stargate.getChevron6().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron5().getItemInHand().getType() == Material.RECORD_5){
					animation.ringTurn(stargate, address.get(7), direction, 5, plugin, player);
					direction = direction*-1;
					
				}
				if(stargate.getChevron5().getItemInHand().getType() == Material.RECORD_6 &&
						stargate.getChevron1Base().getItemInHand().getType() != Material.RECORD_6){
					
					animation.ringTurn(stargate, address.get(8), direction, 1, plugin, player);
					direction = direction*-1;
					Bukkit.broadcastMessage("zabija ho tretie");
					Bukkit.getScheduler().cancelTask(id);
					
				}
				
			}
			}
				
		}, 0, 1);
		
		
	}

}

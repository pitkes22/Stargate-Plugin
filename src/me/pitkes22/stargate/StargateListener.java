package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;




public class StargateListener implements Listener {
	
	public Location obracac(Location loc, double x, double y, double z){
		if (loc.getYaw() <= 135 && loc.getYaw() > 45 || loc.getYaw() <= 315 && loc.getYaw() > 225) {
		loc.setX(loc.getX()+z);
		loc.setY(loc.getY()+y);
		loc.setZ(loc.getZ()+x);
		//Bukkit.broadcastMessage("Obraciam X:"+x+" Y:"+y+" Z:"+z+" X:"+loc.getX()+" Y:"+loc.getY()+" Z:"+loc.getZ());
		}
		else{
			loc.setX(loc.getX()+x);
			loc.setY(loc.getY()+y);
			loc.setZ(loc.getZ()+z);
		}
		
		return loc;
		
	}
	@EventHandler
	private void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent event1) {
		org.bukkit.Location loc = event1.getRightClicked().getLocation();
		loc.setY(loc.getY()-2);
		//loc.setZ(loc.getZ()-2);
		((Player) event1.getPlayer()).sendMessage(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
				+ "stargate_base");
		
		if (event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
				+ "stargate_base") || 
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "stargate_ring") ||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron1_base") ||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron1_bottom") ||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron1_up") ||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron2")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron2")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron3")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron4")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron5")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron6")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron7")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron8")||
				event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
						+ "chevron9")) {
			((Player) event1.getPlayer()).sendMessage("prezilo to prvu podmienku");
			if (event1.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
				((Player) event1.getPlayer()).sendMessage("Tukol si na armorstand ale nenen ziadne menenenie sa nekona :D buheheehehe");
				
				event1.setCancelled(true);
			}
		}
	}
	@EventHandler
	private void onBlockPlace (BlockPlaceEvent event) { 
		if(event.getBlock().getType().equals(Material.BEDROCK)) {
			((Player)event.getPlayer()).sendMessage("Brana bola polozena !");
			((Player)event.getPlayer()).sendMessage(Float.toString(event.getPlayer().getLocation().getYaw()));
			float yaw = event.getPlayer().getLocation().getYaw();
			((Player)event.getPlayer()).sendMessage(Float.toString(yaw));
				if (yaw < 0){
					yaw+= 360;
				}
				yaw = yaw / 90 * 90;
			((Player)event.getPlayer()).sendMessage(Float.toString(yaw));
			Location loc = event.getBlock().getLocation();
			loc.setYaw(yaw);
			((Player)event.getPlayer()).sendMessage(Float.toString(loc.getYaw()));
			loc.setPitch(event.getPlayer().getLocation().getPitch());
			if(		//obracac(loc.clone(),-1,0,0).getBlock().getType().isSolid() == false &&
					//obracac(loc.clone(),-2,0,0).getBlock().getType().isSolid() == false &&
					//obracac(loc.clone(),1,0,0).getBlock().getType().isSolid() == false &&
					//obracac(loc.clone(),2,0,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-2,1,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-3,1,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),2,1,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),3,1,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),3,2,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-3,2,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),3,3,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-3,3,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),3,4,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-3,4,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-2,5,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-3,5,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),2,5,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),3,5,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),0,6,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-1,6,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),-2,6,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),1,6,0).getBlock().getType().isSolid() == false &&
					obracac(loc.clone(),2,6,0).getBlock().getType().isSolid() == false 
					
					){
				StargateFactory.createStargate(loc);
				}
			else{
				((Player)event.getPlayer()).sendMessage("Brana nemohla byť polozena!(Zavadzia jej nejaky block)");
				event.setCancelled(true);
				}
			
			
			
		
			
			
			}
			
		}

}

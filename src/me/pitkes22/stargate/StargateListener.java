package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;




public class StargateListener implements Listener {
	
	public Location obracac(Location loc, double x, double y, double z){
		if (loc.getYaw() <= 135 && loc.getYaw() > 45 || loc.getYaw() <= 315 && loc.getYaw() > 225) {
		loc.setX(loc.getX()+z);
		loc.setY(loc.getY()+y);
		loc.setZ(loc.getZ()+x);
		Bukkit.broadcastMessage("Obraciam X:"+x+" Y:"+y+" Z:"+z+" X:"+loc.getX()+" Y:"+loc.getY()+" Z:"+loc.getZ());
		}
		else{
			loc.setX(loc.getX()+x);
			loc.setY(loc.getY()+y);
			loc.setZ(loc.getZ()+z);
		}
		
		return loc;
		
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
					
					){new StargateFactory(loc);}
			else{((Player)event.getPlayer()).sendMessage("Brana nemohla byť polozena!(Zavadzia jej nejaky block)");}
			
			
			
		
			
			
			}
			
		}

}

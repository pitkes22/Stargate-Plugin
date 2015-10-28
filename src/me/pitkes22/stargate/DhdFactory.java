package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class DhdFactory  {
	
	public static Location rot(Location loc, double shiftX, double shiftY, double shiftZ) {

		double temp;

		if (loc.getYaw() <= 45 || loc.getYaw() > 315) {
			loc.setYaw(0);
			loc.setX(loc.getX()+0.16);

		}

		else if (loc.getYaw() <= 135 & loc.getYaw() > 45) {
			loc.setYaw(90);

			temp = shiftZ;
			shiftZ = shiftX;
			shiftX = (temp * -1);
			loc.setX(loc.getX()+1);
			loc.setZ(loc.getZ()+0.16);

		}

		else if (loc.getYaw() <= 225 & loc.getYaw() > 135) {
			loc.setYaw(180);

			shiftX = shiftX * -1;
			shiftZ = shiftZ * -1;
			//loc.setX(loc.getX()+0.34);
			loc.setX(loc.getX()+0.84);
			loc.setZ(loc.getZ()+1);

		}

		else if (loc.getYaw() <= 315 & loc.getYaw() > 225) {
			loc.setYaw(270);

			temp = shiftX;
			shiftX = shiftZ;
			shiftZ = (temp * -1);
			loc.setZ(loc.getZ()+0.84);

		} else {
			return null;
		}

		loc.setX(loc.getX() + shiftX);
		loc.setY(loc.getY() + shiftY);
		loc.setZ(loc.getZ() + shiftZ);
		return loc;

	}
	
	public static void createDhd(Block block,Player player) {
		
		
			 
			 
			 float yaw = player.getLocation().getYaw();
				player.sendMessage(Float.toString(yaw));
					if (yaw < 0){
						yaw+= 360;
					}
					yaw = yaw / 90 * 90;
					player.sendMessage(Float.toString(yaw));
				Location loc = block.getLocation();
				loc.setYaw(yaw);
				player.sendMessage(Float.toString(loc.getYaw()));
				loc.setPitch(player.getLocation().getPitch());
			
		
			
			
			 
			 ArmorStand dhdbottom = (ArmorStand) block.getWorld().spawnEntity(rot(loc.clone(),0.75,-1.4,0.1), EntityType.ARMOR_STAND);
			 dhdbottom.setCustomName("DHD");
			 dhdbottom.setItemInHand(new ItemStack(Material.RECORD_4,1));
			 dhdbottom.setGravity(false);
			 dhdbottom.setVisible(false);
			 dhdbottom.setRightArmPose(new EulerAngle(3.1415926536,3.1415926536,0));
			 dhdbottom.setArms(true);
			 dhdbottom.setBodyPose(new EulerAngle(0,3.1415926536,0));
			 dhdbottom.setCustomName(rot(loc.clone(),0.75,-1.4,0.1).getBlockX()+","+rot(loc.clone(),0.75,-1.4,0.1).getBlockY()+","+rot(loc.clone(),0.75,-1.4,0.1).getBlockZ()+","+"dhd_bottom");
			 
			 ArmorStand dhdup = (ArmorStand) block.getWorld().spawnEntity(rot(loc.clone(),0.75,-1.0,0.1), EntityType.ARMOR_STAND);
			 dhdup.setCustomName("DHD");
			 dhdup.setItemInHand(new ItemStack(Material.MONSTER_EGGS,1));
			 dhdup.setGravity(false);
			 dhdup.setVisible(false);
			 dhdup.setRightArmPose(new EulerAngle(3.1415926536,3.1415926536,0));
			 dhdup.setArms(true);
			 dhdup.setBodyPose(new EulerAngle(0,3.1415926536,0));
			 dhdup.setCustomName(rot(loc.clone(),0.75,-1.0,0.1).getBlockX()+","+rot(loc.clone(),0.75,-1.0,0.1).getBlockY()+","+rot(loc.clone(),0.75,-1.0,0.1).getBlockZ()+","+"dhd_up");
			 
			 loc.getBlock().setType(Material.BARRIER);
			 
			 
		}
		
	
		
	}
	



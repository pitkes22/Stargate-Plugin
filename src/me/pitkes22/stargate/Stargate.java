package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class Stargate {

	public Location rot(Location loc, double shiftX, double shiftY, double shiftZ) {

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
	public Stargate(Location loc) {
				
		
		
				// TODO Auto-generated method stub
				
					
					 loc.setPitch(0);
					
					 ArmorStand stargate_base = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.0,0.5), EntityType.ARMOR_STAND);
					 stargate_base.setItemInHand(new ItemStack(Material.BEDROCK,1));
					 stargate_base.setGravity(false);
					 stargate_base.setVisible(false);
					 stargate_base.setRightArmPose(new EulerAngle(1.5707963268,0,0));
					 stargate_base.setArms(true);
					 stargate_base.setBodyPose(new EulerAngle(0,0,0));
					 stargate_base.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"stargate_base");
					 
					 
					 
					 ArmorStand stargate_ring = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.0,0.5), EntityType.ARMOR_STAND);
					 stargate_ring.setItemInHand(new ItemStack(Material.ENDER_PORTAL_FRAME,1));
					 stargate_ring.setGravity(false);
					 stargate_ring.setVisible(false);
					 stargate_ring.setRightArmPose(new EulerAngle(1.5707963268,0,0));
					 stargate_ring.setArms(true);
					 stargate_ring.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"stargate_ring");
					 
					 ArmorStand chevron1_base = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.07,0.5), EntityType.ARMOR_STAND);
					 chevron1_base.setItemInHand(new ItemStack(Material.RECORD_7,1));
					 chevron1_base.setGravity(false);
					 chevron1_base.setVisible(false);
					 chevron1_base.setRightArmPose(new EulerAngle(0,0,0));
					 chevron1_base.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron1_base");
					 
					 ArmorStand chevron1_bottom = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.07,0.5), EntityType.ARMOR_STAND);
					 chevron1_bottom.setItemInHand(new ItemStack(Material.RECORD_10,1));
					 chevron1_bottom.setGravity(false);
					 chevron1_bottom.setVisible(false);
					 chevron1_bottom.setRightArmPose(new EulerAngle(0,0,0));
					 chevron1_bottom.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron1_bottom");
					 
					 ArmorStand chevron1_up = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.07,0.5), EntityType.ARMOR_STAND);
					 chevron1_up.setItemInHand(new ItemStack(Material.RECORD_8,1));
					 chevron1_up.setGravity(false);
					 chevron1_up.setVisible(false);
					 chevron1_up.setRightArmPose(new EulerAngle(0,0,0));
					 chevron1_up.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron1_up");
					 
					 
					 ArmorStand chevron2 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.05,0.5), EntityType.ARMOR_STAND);
					 chevron2.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron2.setGravity(false);
					 chevron2.setVisible(false);
					 chevron2.setRightArmPose(new EulerAngle(0,0,0.6981317008));
					 chevron2.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron2");
					 
					 ArmorStand chevron3 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.7,2,0.5), EntityType.ARMOR_STAND);
					 chevron3.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron3.setGravity(false);
					 chevron3.setVisible(false);
					 chevron3.setRightArmPose(new EulerAngle(0,0,1.3962634016));
					 chevron3.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron3");
					 
					 ArmorStand chevron4 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.68,2,0.5), EntityType.ARMOR_STAND);
					 chevron4.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron4.setGravity(false);
					 chevron4.setVisible(false);
					 chevron4.setRightArmPose(new EulerAngle(0,0,2.0943951024));
					 chevron4.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron4");
					 
					 ArmorStand chevron5 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.629,2.04,0.5), EntityType.ARMOR_STAND);
					 chevron5.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron5.setGravity(false);
					 chevron5.setVisible(false);
					 chevron5.setRightArmPose(new EulerAngle(0,0,2.7925268032));
					 chevron5.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron5");
					 
					 ArmorStand chevron6 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.65,2.1,0.5), EntityType.ARMOR_STAND);
					 chevron6.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron6.setGravity(false);
					 chevron6.setVisible(false);
					 chevron6.setRightArmPose(new EulerAngle(0,0,3.490658504));
					 chevron6.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron6");
					 
					 ArmorStand chevron7 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.68,2.15,0.5), EntityType.ARMOR_STAND);
					 chevron7.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron7.setGravity(false);
					 chevron7.setVisible(false);
					 chevron7.setRightArmPose(new EulerAngle(0,0,4.1887902048));
					 chevron7.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron7");

					 ArmorStand chevron8 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.739,2.15,0.5), EntityType.ARMOR_STAND);
					 chevron8.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron8.setGravity(false);
					 chevron8.setVisible(false);
					 chevron8.setRightArmPose(new EulerAngle(0,0,4.8869219056));
					 chevron8.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron8");
					 
					 ArmorStand chevron9 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.755,2.15,0.5), EntityType.ARMOR_STAND);
					 chevron9.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 chevron9.setGravity(false);
					 chevron9.setVisible(false);
					 chevron9.setRightArmPose(new EulerAngle(0,0,5.5850536064));
					 chevron9.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron9");
					 
					 			
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 if (obracac(loc.clone(),-1,0,0).getBlock().getType().isSolid() == true ||
					 					obracac(loc.clone(),-2,0,0).getBlock().getType().isSolid() == true ||
					 					obracac(loc.clone(),1,0,0).getBlock().getType().isSolid() == true ||
					 					obracac(loc.clone(),2,0,0).getBlock().getType().isSolid() == true) {
					 				obracac(loc.clone(),0,0,0).getBlock().setType(Material.AIR);
					 			}
					 			else{
						 		obracac(loc.clone(),0,0,0).getBlock().setType(Material.BARRIER);}
					 			if (obracac(loc.clone(),-1,0,0).getBlock().getType().isSolid() == false){
					 			obracac(loc.clone(),-1,0,0).getBlock().setType(Material.BARRIER);}
					 			if (obracac(loc.clone(),-2,0,0).getBlock().getType().isSolid() == false){
					 			obracac(loc.clone(),-2,0,0).getBlock().setType(Material.BARRIER);}
					 			if (obracac(loc.clone(),1,0,0).getBlock().getType().isSolid() == false){
					 			obracac(loc.clone(),1,0,0).getBlock().setType(Material.BARRIER);}
					 			if (obracac(loc.clone(),2,0,0).getBlock().getType().isSolid() == false){
					 			obracac(loc.clone(),2,0,0).getBlock().setType(Material.BARRIER);}
								
								obracac(loc.clone(),-2,1,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-3,1,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),2,1,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),3,1,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),3,2,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-3,2,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),3,3,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-3,3,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),3,4,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-3,4,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-2,5,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-3,5,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),2,5,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),3,5,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),0,6,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-1,6,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),-2,6,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),1,6,0).getBlock().setType(Material.BARRIER);
								obracac(loc.clone(),2,6,0).getBlock().setType(Material.BARRIER);
					 //loc.getBlock().setType(arg0);
					 
					 
		}			 
					
				
}





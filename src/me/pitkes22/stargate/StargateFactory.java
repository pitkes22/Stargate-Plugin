package me.pitkes22.stargate;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class StargateFactory {

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
	public static Location obracac(Location loc, double x, double y, double z){
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
	public StargateFactory(Location loc) {
				
		
		
				// TODO Auto-generated method stub
				
					
					 loc.setPitch(0);
					
					 ArmorStand StargateBase = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.0,0.5), EntityType.ARMOR_STAND);
					 StargateBase.setItemInHand(new ItemStack(Material.BEDROCK,1));
					 StargateBase.setGravity(false);
					 StargateBase.setVisible(false);
					 StargateBase.setRightArmPose(new EulerAngle(1.5707963268,0,0));
					 StargateBase.setArms(true);
					 StargateBase.setBodyPose(new EulerAngle(0,0,0));
					 StargateBase.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"stargate_base");
					 
					 
					 
					 ArmorStand StargateRing = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.0,0.5), EntityType.ARMOR_STAND);
					 StargateRing.setItemInHand(new ItemStack(Material.ENDER_PORTAL_FRAME,1));
					 StargateRing.setGravity(false);
					 StargateRing.setVisible(false);
					 StargateRing.setRightArmPose(new EulerAngle(1.5707963268,0,0));
					 StargateRing.setArms(true);
					 StargateRing.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"stargate_ring");
					 
					 ArmorStand Chevron1Base = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.07,0.5), EntityType.ARMOR_STAND);
					 Chevron1Base.setItemInHand(new ItemStack(Material.RECORD_7,1));
					 Chevron1Base.setGravity(false);
					 Chevron1Base.setVisible(false);
					 Chevron1Base.setRightArmPose(new EulerAngle(0,0,0));
					 Chevron1Base.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron1_base");
					 
					 ArmorStand Chevron1Bottom = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.07,0.5), EntityType.ARMOR_STAND);
					 Chevron1Bottom.setItemInHand(new ItemStack(Material.RECORD_10,1));
					 Chevron1Bottom.setGravity(false);
					 Chevron1Bottom.setVisible(false);
					 Chevron1Bottom.setRightArmPose(new EulerAngle(0,0,0));
					 Chevron1Bottom.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron1_bottom");
					 
					 ArmorStand Chevron1Up = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.07,0.5), EntityType.ARMOR_STAND);
					 Chevron1Up.setItemInHand(new ItemStack(Material.RECORD_8,1));
					 Chevron1Up.setGravity(false);
					 Chevron1Up.setVisible(false);
					 Chevron1Up.setRightArmPose(new EulerAngle(0,0,0));
					 Chevron1Up.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron1_up");
					 
					 
					 ArmorStand Chevron2 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.75,2.05,0.5), EntityType.ARMOR_STAND);
					 Chevron2.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron2.setGravity(false);
					 Chevron2.setVisible(false);
					 Chevron2.setRightArmPose(new EulerAngle(0,0,0.6981317008));
					 Chevron2.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron2");
					 
					 ArmorStand Chevron3 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.7,2,0.5), EntityType.ARMOR_STAND);
					 Chevron3.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron3.setGravity(false);
					 Chevron3.setVisible(false);
					 Chevron3.setRightArmPose(new EulerAngle(0,0,1.3962634016));
					 Chevron3.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron3");
					 
					 ArmorStand Chevron4 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.68,2,0.5), EntityType.ARMOR_STAND);
					 Chevron4.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron4.setGravity(false);
					 Chevron4.setVisible(false);
					 Chevron4.setRightArmPose(new EulerAngle(0,0,2.0943951024));
					 Chevron4.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron4");
					 
					 ArmorStand Chevron5 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.629,2.04,0.5), EntityType.ARMOR_STAND);
					 Chevron5.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron5.setGravity(false);
					 Chevron5.setVisible(false);
					 Chevron5.setRightArmPose(new EulerAngle(0,0,2.7925268032));
					 Chevron5.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron5");
					 
					 ArmorStand Chevron6 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.65,2.1,0.5), EntityType.ARMOR_STAND);
					 Chevron6.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron6.setGravity(false);
					 Chevron6.setVisible(false);
					 Chevron6.setRightArmPose(new EulerAngle(0,0,3.490658504));
					 Chevron6.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron6");
					 
					 ArmorStand Chevron7 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.68,2.15,0.5), EntityType.ARMOR_STAND);
					 Chevron7.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron7.setGravity(false);
					 Chevron7.setVisible(false);
					 Chevron7.setRightArmPose(new EulerAngle(0,0,4.1887902048));
					 Chevron7.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron7");

					 ArmorStand Chevron8 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.739,2.15,0.5), EntityType.ARMOR_STAND);
					 Chevron8.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron8.setGravity(false);
					 Chevron8.setVisible(false);
					 Chevron8.setRightArmPose(new EulerAngle(0,0,4.8869219056));
					 Chevron8.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron8");
					 
					 ArmorStand Chevron9 = (ArmorStand) loc.getWorld().spawnEntity(rot(loc.clone(),0.755,2.15,0.5), EntityType.ARMOR_STAND);
					 Chevron9.setItemInHand(new ItemStack(Material.RECORD_5,1));
					 Chevron9.setGravity(false);
					 Chevron9.setVisible(false);
					 Chevron9.setRightArmPose(new EulerAngle(0,0,5.5850536064));
					 Chevron9.setCustomName(loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+","+"chevron9");
					 
					 			
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
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





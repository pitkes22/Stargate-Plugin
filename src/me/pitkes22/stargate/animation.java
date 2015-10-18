package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class animation {

	public static void chevronLightUp(Stargate stargate,int id) {
		if(id == 1) {
			stargate.getChevron1Base().setItemInHand(new ItemStack(Material.RECORD_6));
			stargate.getChevron1Up().setItemInHand(new ItemStack(Material.AIR));
			stargate.getChevron1Bottom().setItemInHand(new ItemStack(Material.AIR));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
			
		}
		if(id == 2) {
			stargate.getChevron2().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 3) {
			stargate.getChevron3().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 4) {
			stargate.getChevron4().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 5) {
			stargate.getChevron5().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 6) {
			stargate.getChevron6().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 7) {
			stargate.getChevron7().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 8) {
			stargate.getChevron8().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
		}
		if(id == 9) {
			stargate.getChevron9().setItemInHand(new ItemStack(Material.RECORD_6));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
				}
			}
	
		}

	}

	public static void chvronShift(Stargate stargate, Plugin plugin) {
		for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
			if(e instanceof Player){
				((Player) e).playSound(stargate.getOriginBlockLocation(), "Chevron7Lock", 1, 1);
				}
		}
		Bukkit.broadcastMessage(stargate.getChevron1Base().getLocation()+"");
		stargate.getChevron1Up().teleport(stargate.getChevron1Up().getLocation().add(0, 0.12, 0));
		stargate.getChevron1Bottom().teleport(stargate.getChevron1Bottom().getLocation().add(0, -0.12, 0));
		Bukkit.getScheduler().runTaskLater(plugin, () -> {
			stargate.getChevron1Up().setItemInHand(new ItemStack(Material.RECORD_9));
			stargate.getChevron1Bottom().setItemInHand(new ItemStack(Material.RECORD_12));
		}, 5);
		
		Bukkit.getScheduler().runTaskLater(plugin, () -> {
			stargate.getChevron1Up().teleport(stargate.getChevron1Up().getLocation().add(0, -0.12, 0));
			stargate.getChevron1Bottom().teleport(stargate.getChevron1Bottom().getLocation().add(0, 0.12, 0));
		}, 12);
		Bukkit.getScheduler().runTaskLater(plugin, () -> {
			stargate.getChevron1Up().setItemInHand(new ItemStack(Material.RECORD_8));
			stargate.getChevron1Bottom().setItemInHand(new ItemStack(Material.RECORD_10));
		}, 18);
		

	}

	public static void ringTurn(Stargate stargateint, int symbol) {

	}

	public static void Kawosh(Stargate stargate) {

	}

	public static void StargateClose(Stargate stargate) {

	}

	public static void reset(Stargate stargate) {
		stargate.getChevron1Up().setItemInHand(new ItemStack(Material.RECORD_8));
		stargate.getChevron1Bottom().setItemInHand(new ItemStack(Material.RECORD_10));
		stargate.getChevron1Base().setItemInHand(new ItemStack(Material.RECORD_7));
		stargate.getChevron2().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron3().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron4().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron5().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron6().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron7().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron8().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getChevron9().setItemInHand(new ItemStack(Material.RECORD_5));
		stargate.getStargateRing().getLocation().setYaw(0);
		
		

	}
}

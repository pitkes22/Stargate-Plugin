package me.pitkes22.stargate;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.craftbukkit.libs.jline.internal.ShutdownHooks.Task;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.EulerAngle;

import com.avaje.ebeaninternal.server.subclass.GetterSetterMethods;

public class animation {
	//private static BukkitTask taskId;
	private static int id;
	private static boolean animating;
	private static int PlayRingTurnSoundSchedulers;
	private static int PlayRingTurnSoundSchedulerPart1;
	private static int PlayRingTurnSoundSchedulerPart2;
	private static int PlayRingTurnSoundSchedulerPart3;
	private static int PlayRingTurnSoundSchedulerPart4;
	private static int PlayRingTurnSoundSchedulerPart5;
	private static int PlayRingTurnSoundSchedulerPart6;
	private static int resetCheduler;
	
	
	

	public static boolean isAnimating() {
		return animating;
	}

	public static void setAnimating(boolean animating) {
		animation.animating = animating;
	}

	public static void chevronLightUp(Stargate stargate,int id,Player player,Plugin plugin) {
		
		if(id == 1) {
			stargate.getChevron1Base().setItemInHand(new ItemStack(Material.RECORD_6));
			stargate.getChevron1Up().setItemInHand(new ItemStack(Material.AIR));
			stargate.getChevron1Bottom().setItemInHand(new ItemStack(Material.AIR));
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "ChevronLock", 1, 1);
					animation.Kawosh(stargate, player, plugin);
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
		animation.setAnimating(false);
	}

	public static void chvronShift(Stargate stargate,int chevron, Plugin plugin,Player player) {
		for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
			if(e instanceof Player){
				((Player) e).playSound(stargate.getOriginBlockLocation(), "Chevron7Lock", 1, 1);
				}
		}
		
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
			if(chevron != 0) {
				animation.chevronLightUp(stargate, chevron,player,plugin);
			}
		}, 18);
		
		
		
		
		

	}

	public static void PlayRingTurnSound(Player player, Stargate stargate, Plugin plugin) {
		PlayRingTurnSoundSchedulers = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
			
		
				PlayRingTurnSoundSchedulerPart1 = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
					player.playSound(stargate.getOriginBlockLocation(), "RingTurnPart1", 1, 1);
				}, 0);
				PlayRingTurnSoundSchedulerPart2 = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
					player.playSound(stargate.getOriginBlockLocation(), "RingTurnPart2", 1, 1);
				}, 10);
				PlayRingTurnSoundSchedulerPart3 = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
					player.playSound(stargate.getOriginBlockLocation(), "RingTurnPart3", 1, 1);
				}, 20);
				PlayRingTurnSoundSchedulerPart4 = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
					player.playSound(stargate.getOriginBlockLocation(), "RingTurnPart4", 1, 1);
				}, 30);
				PlayRingTurnSoundSchedulerPart5 = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
					player.playSound(stargate.getOriginBlockLocation(), "RingTurnPart5", 1, 1);
				}, 40);
				PlayRingTurnSoundSchedulerPart6 = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
					player.playSound(stargate.getOriginBlockLocation(), "RingTurnPart6", 1, 1);
				}, 50);
		}, 27, 60);
				
			
	
	}
	
	public static boolean ringTurn(Stargate stargate, Symbol symbol,int direction ,int chevron, Plugin plugin,Player player) {
		Bukkit.getScheduler().cancelTask(id);
		animation.setAnimating(true);
		double symbolRot = (float) ((symbol.getId()-1)*0.16110731556);
		Bukkit.broadcastMessage("ringTurn vytaca symbol:"+symbol.getName());
	
		
		player.playSound(stargate.getOriginBlockLocation(), "StartRingTurn", 1, 1);
		
			animation.PlayRingTurnSound(player, stargate, plugin);	
		
		id  = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
			double ringRot = stargate.getStargateRing().getHeadPose().getZ();
			if (ringRot >= 6.2831853072) {
				stargate.getStargateRing().setHeadPose(new EulerAngle(1.5707963268,0,stargate.getStargateRing().getHeadPose().getZ() - 6.2831853072)); 
				}
			if (ringRot < 0) {
				stargate.getStargateRing().setHeadPose(new EulerAngle(1.5707963268,0,stargate.getStargateRing().getHeadPose().getZ() + 6.2831853072)); 
				}
			if(ringRot-0.00872664625 <= symbolRot && ringRot+0.00872664625 > symbolRot ||
					ringRot-0.00872664625 >= 6.27445866095 && ringRot+0.00872664625 > symbolRot) {
				stargate.getStargateRing().setHeadPose(new EulerAngle(1.5707963268,0,symbolRot));	
				if(chevron != 0) {
					animation.chvronShift(stargate, chevron, plugin, player);
				}
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulers);	
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart1);
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart2);
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart3);
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart4);
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart5);
				Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart6);
				Bukkit.getScheduler().cancelTask(id);
				
			}else{
				stargate.getStargateRing().setHeadPose(stargate.getStargateRing().getHeadPose().add(0, 0, 0.0174532925*direction));
			
			}
			
			//stargate.getStargateRing().getHeadPose().setZ(symbolRot);
				}, 0, 1);
		
		return true;		

	}

	public static void Kawosh(Stargate stargate, Player player,Plugin plugin) {
		player.playSound(stargate.getOriginBlockLocation(), "Kawoosh", 1, 1);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getEventHorizon().setItemInHand(new ItemStack(Material.GOLD_RECORD));
		}, 20);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getEventHorizon().setItemInHand(new ItemStack(Material.COMMAND));
		}, 30);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_BOOTS));
		}, 30);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		}, 35);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_HELMET));
		}, 40);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		}, 45);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.RECORD_11));
		}, 50);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		}, 62);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_HELMET));
		}, 65);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		}, 78);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.CHAINMAIL_BOOTS));
		}, 83);
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
			stargate.getKawoosh().setItemInHand(new ItemStack(Material.AIR));
		}, 84);
		
		
	}

	public static void StargateClose(Stargate stargate) {

	}

	public static void reset(Stargate stargate, Plugin plugin,Player player) {
		int d = 0;
		if(stargate.getEventHorizon().getItemInHand().getType() == Material.AIR) {
		for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
			if(e instanceof Player){
				((Player) e).playSound(stargate.getOriginBlockLocation(), "GateDialAbort", 1, 1);
				
				
			}
			d = 0;
		}
		}else {
			for(Entity e : stargate.getOriginBlockLocation().getWorld().getNearbyEntities(stargate.getOriginBlockLocation(), 16, 16, 16)){
				if(e instanceof Player){
					((Player) e).playSound(stargate.getOriginBlockLocation(), "GateClose", 1, 1);
					
					
				}
				
			d = 42;
		}
		}
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
				
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
		stargate.getEventHorizon().setItemInHand(new ItemStack(Material.AIR));
		stargate.getKawoosh().setItemInHand(new ItemStack(Material.AIR));
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulers);
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart1);
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart2);
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart3);
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart4);
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart5);
		Bukkit.getScheduler().cancelTask(PlayRingTurnSoundSchedulerPart6);
		Bukkit.getScheduler().cancelTask(id);
		Bukkit.getScheduler().cancelTask(Call.id);
		
		if(stargate.getStargateRing().getHeadPose().getZ() != 0.0) {
		resetCheduler = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
		animation.ringTurn(stargate, Symbol.EARTH, 1, 0, plugin, player);
		//stargate.getStargateRing().setHeadPose(new EulerAngle(1.5707963268,0,0));
		
		}, 200);
		}
			}, d);
		
		
		
		
		
		
		

	}
}

package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.util.EulerAngle;

public class Stargate {

	
	private  boolean animating;
	private  boolean reseting;
	private Location originBlockLocation;
	private ArmorStand eventHorizon;
	private ArmorStand kawoosh;
	private ArmorStand stargateBase;
	private ArmorStand stargateRing;
	private ArmorStand chevron1Base;
	private ArmorStand chevron1Up;
	private ArmorStand chevron1Bottom;
	private ArmorStand chevron2;
	private ArmorStand chevron3;
	private ArmorStand chevron4;
	private ArmorStand chevron5;
	private ArmorStand chevron6;
	private ArmorStand chevron7;
	private ArmorStand chevron8;
	private ArmorStand chevron9;
	private int resetCheduler;



	public Stargate(ArmorStand stargateBase, ArmorStand stargateRing, ArmorStand chevron1Base, ArmorStand chevron1Up,
			ArmorStand chevron1Bottom, ArmorStand chevron2, ArmorStand chevron3, ArmorStand chevron4,
			ArmorStand chevron5, ArmorStand chevron6, ArmorStand chevron7, ArmorStand chevron8, ArmorStand chevron9, ArmorStand EventHorizon, ArmorStand kawoosh) {
		// TODO Auto-generated constructor stub

		this.stargateBase = stargateBase;
		this.stargateRing = stargateRing;
		this.eventHorizon = EventHorizon;
		this.chevron1Base = chevron1Base;
		this.chevron1Up = chevron1Up;
		this.chevron1Bottom = chevron1Bottom;
		this.chevron2 = chevron2;
		this.chevron3 = chevron3;
		this.chevron4 = chevron4;
		this.chevron5 = chevron5;
		this.chevron6 = chevron6;
		this.chevron7 = chevron7;
		this.chevron8 = chevron8;
		this.chevron9 = chevron9;
		this.kawoosh = kawoosh;

	}

	public Stargate(Location loc) {
		 this.originBlockLocation = loc;
		 this.stargateBase = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "stargate_base", loc);
		 this.stargateRing = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "stargate_ring", loc);
		 this.eventHorizon = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "eventHorizon", loc);
		 Bukkit.broadcastMessage("Kavoosh je na :"+StargateFactory.rot(loc.clone(),0.75,2.0,-3.4).getBlockX() + "," + StargateFactory.rot(loc.clone(),0.75,2.0,-3.4).getBlockY() + "," + StargateFactory.rot(loc.clone(),0.75,2.0,-3.4).getBlockZ() + ","
					+ "kawoosh");
		  this.kawoosh = getArmorStandByName(StargateFactory.rot(loc.clone(),0.75,2.0,-3.4).getBlockX() + "," + StargateFactory.rot(loc.clone(),0.75,2.0,-3.4).getBlockY() + "," + StargateFactory.rot(loc.clone(),0.75,2.0,-3.4).getBlockZ() + ","
					+ "kawoosh", StargateFactory.rot(loc.clone(),0.75,2.0,-3.4));
		
		 this.chevron1Base = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron1_base", loc);
		 this.chevron1Bottom = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron1_bottom", loc);
		 this.chevron1Up = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron1_up", loc);
		 this.chevron2 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron2", loc);
		 this.chevron3 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron3", loc);
		 this.chevron4 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron4", loc);
		 this.chevron5 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron5", loc);
		 this.chevron6 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron6", loc);
		 this.chevron7 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron7", loc);
		 this.chevron8 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron8", loc);
		 this.chevron9 = getArmorStandByName(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
					+ "chevron9", loc);
	}
	
	
	
	public ArmorStand getKawoosh() {
		return kawoosh;
	}

	public void setKawoosh(ArmorStand kawoosh) {
		this.kawoosh = kawoosh;
	}

	public ArmorStand getEventHorizon() {
		return eventHorizon;
	}

	public void setEventHorizon(ArmorStand eventHorizon) {
		this.eventHorizon = eventHorizon;
	}

	public static ArmorStand getArmorStandByName(String name, Location loc) {
		
		for (Entity e : loc.getWorld().getNearbyEntities(loc, 2, 7, 2)) {
			if (e.getCustomName().equals(name)) {
				//Bukkit.broadcastMessage(e.getCustomName()+"");
				return (ArmorStand) e;
			}
		}
		return null;
		
	}
	public Location getOriginBlockLocation() {
		return originBlockLocation;
	}

	public void setOriginBlockLocation(Location originBlock) {
		this.originBlockLocation = originBlock;
	}
	public ArmorStand getStargateBase() {
		return stargateBase;
	}

	public void setStargateBase(ArmorStand stargateBase) {
		this.stargateBase = stargateBase;
	}

	public ArmorStand getStargateRing() {
		return stargateRing;
	}

	public void setStargateRing(ArmorStand stargateRing) {
		
		this.stargateRing = stargateRing;
	}

	public ArmorStand getChevron1Base() {
		return chevron1Base;
	}

	public void setChevron1Base(ArmorStand chevron1Base) {
		this.chevron1Base = chevron1Base;
	}

	public ArmorStand getChevron1Up() {
		return chevron1Up;
	}

	public void setChevron1Up(ArmorStand chevron1Up) {
		this.chevron1Up = chevron1Up;
	}

	public ArmorStand getChevron1Bottom() {
		return chevron1Bottom;
	}

	public void setChevron1Bottom(ArmorStand chevron1Bottom) {
		this.chevron1Bottom = chevron1Bottom;
	}

	public ArmorStand getChevron2() {
		return chevron2;
	}

	public void setChevron2(ArmorStand chevron2) {
		this.chevron2 = chevron2;
	}

	public ArmorStand getChevron3() {
		return chevron3;
	}

	public void setChevron3(ArmorStand chevron3) {
		this.chevron3 = chevron3;
	}

	public ArmorStand getChevron4() {
		return chevron4;
	}

	public void setChevron4(ArmorStand chevron4) {
		this.chevron4 = chevron4;
	}

	public ArmorStand getChevron5() {
		return chevron5;
	}

	public void setChevron5(ArmorStand chevron5) {
		this.chevron5 = chevron5;
	}

	public ArmorStand getChevron6() {
		return chevron6;
	}

	public void setChevron6(ArmorStand chevron6) {
		this.chevron6 = chevron6;
	}

	public ArmorStand getChevron7() {
		return chevron7;
	}

	public void setChevron7(ArmorStand chevron7) {
		this.chevron7 = chevron7;
	}

	public ArmorStand getChevron8() {
		return chevron8;
	}

	public void setChevron8(ArmorStand chevron8) {
		this.chevron8 = chevron8;
	}

	public ArmorStand getChevron9() {
		return chevron9;
	}

	public void setChevron9(ArmorStand chevron9) {
		this.chevron9 = chevron9;
	}

	public boolean isAnimating() {
		return animating;
	}

	public void setAnimating(boolean animating) {
		this.animating = animating;
	}

	public boolean isReseting() {
		return reseting;
	}

	public void setReseting(boolean reseting) {
		this.reseting = reseting;
		if(reseting == false) {
			Bukkit.getScheduler().cancelTask(resetCheduler);
		}
	}
	public int getResetCheduler() {
		return resetCheduler;
	}

	public void setResetCheduler(int resetCheduler) {
		this.resetCheduler = resetCheduler;
	}
}

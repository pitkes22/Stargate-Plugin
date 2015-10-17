package me.pitkes22.stargate;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;

public class Stargate {

	private Location originBlock;
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

	public Stargate(ArmorStand stargateBase, ArmorStand stargateRing, ArmorStand chevron1Base, ArmorStand chevron1Up,
			ArmorStand chevron1Bottom, ArmorStand chevron2, ArmorStand chevron3, ArmorStand chevron4,
			ArmorStand chevron5, ArmorStand chevron6, ArmorStand chevron7, ArmorStand chevron8, ArmorStand chevron9) {
		// TODO Auto-generated constructor stub

		this.stargateBase = stargateBase;
		this.stargateRing = stargateRing;
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

	}

	public Stargate(Location loc) {
		String stargateBaseName = loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
				+ "stargate_base";

		// this.stargateBase =
	}

	public static ArmorStand getArmorStandByName(String name, Location loc) {
		for (Entity e : loc.getWorld().getNearbyEntities(loc, 1, 5, 1)) {
			if (e.getCustomName().equals(name)) {
				return (ArmorStand) e;
			}
		}
		return null;
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

}

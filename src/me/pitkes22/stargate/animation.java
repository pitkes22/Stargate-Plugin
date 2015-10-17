package me.pitkes22.stargate;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class animation {

	public static void chevronLightUp(Stargate stargate,int id) {
		if(id == 1) {
			stargate.getChevron1Base().setItemInHand(new ItemStack(Material.RECORD_6));
			stargate.getChevron1Up().setItemInHand(new ItemStack(Material.AIR));
			stargate.getChevron1Bottom().setItemInHand(new ItemStack(Material.AIR));
		}
		if(id == 2) {
			stargate.getChevron2().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 3) {
			stargate.getChevron3().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 4) {
			stargate.getChevron4().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 5) {
			stargate.getChevron5().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 6) {
			stargate.getChevron6().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 7) {
			stargate.getChevron7().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 8) {
			stargate.getChevron8().setItemInHand(new ItemStack(Material.RECORD_6));
		}
		if(id == 9) {
			stargate.getChevron9().setItemInHand(new ItemStack(Material.RECORD_6));
	
}
			
	}

	public static void chvronShift(Stargate stargate) {

	}

	public static void ringTurn(Stargate stargateint, int symbol) {

	}

	public static void Kawosh(Stargate stargate) {

	}

	public static void StargateClose(Stargate stargate) {

	}

	public static void reset(Stargate stargate) {

	}
}

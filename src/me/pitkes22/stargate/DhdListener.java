
package me.pitkes22.stargate;

import java.util.ArrayList;
import java.util.List;

import javax.tools.DocumentationTool.Location;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.io.BukkitObjectInputStream;

public class DhdListener implements Listener {
	private Plugin plugin;

	public DhdListener(Plugin plugin) {
		this.plugin = plugin;
	}

	//public Call call;
	public dhd dhd;
	//public Stargate stargate;
	
	
	public static org.bukkit.Location rot(org.bukkit.Location loc, double shiftX, double shiftY, double shiftZ) {

		double temp;

		if (loc.getYaw() <= 45 || loc.getYaw() > 315) {
			loc.setYaw(0);
			loc.setX(loc.getX() + 0.16);

		}

		else if (loc.getYaw() <= 135 & loc.getYaw() > 45) {
			loc.setYaw(90);

			temp = shiftZ;
			shiftZ = shiftX;
			shiftX = (temp * -1);
			loc.setX(loc.getX() + 1);
			loc.setZ(loc.getZ() + 0.16);

		}

		else if (loc.getYaw() <= 225 & loc.getYaw() > 135) {
			loc.setYaw(180);

			shiftX = shiftX * -1;
			shiftZ = shiftZ * -1;
			// loc.setX(loc.getX()+0.34);
			loc.setX(loc.getX() + 0.84);
			loc.setZ(loc.getZ() + 1);

		}

		else if (loc.getYaw() <= 315 & loc.getYaw() > 225) {
			loc.setYaw(270);

			temp = shiftX;
			shiftX = shiftZ;
			shiftZ = (temp * -1);
			loc.setZ(loc.getZ() + 0.84);

		} else {
			return null;
		}

		loc.setX(loc.getX() + shiftX);
		loc.setY(loc.getY() + shiftY);
		loc.setZ(loc.getZ() + shiftZ);
		return loc;

	}

	@EventHandler
	private void onPlayerInteract(PlayerInteractEvent event) {//Najde DHD po kliknuti na block a otvori INV
		if (event.getClickedBlock() != null) {
		org.bukkit.Location loc = event.getClickedBlock().getLocation();	
		loc.getWorld().getNearbyEntities(loc, 1, 1, 1);
		
		for (Entity e : loc.getWorld().getNearbyEntities(loc, 1, 1, 1)) {
			
			if (e.getType() == EntityType.ARMOR_STAND && e.getCustomName().equals(loc.getBlockX() + "," + (loc.getBlockY() - 1) + "," + loc.getBlockZ() + "," + "dhd_up")) {
				this.dhd = new dhd((Player) event.getPlayer(), event.getClickedBlock().getLocation(),plugin);
				event.setCancelled(true);
			}
		}
		}
	}

	@EventHandler
	private void onBlockPlace(BlockPlaceEvent event) {//Spawne DHD ak hrac poloci MONSTER_EGGS
		if (event.getBlock().getType().equals(Material.MONSTER_EGGS)) {		
			DhdFactory.createDhd(event.getBlock(), event.getPlayer());
		}
	}

	@EventHandler
	private void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent event1) {//Najde DHD po kliknuti na armorstand a otvori INV

		org.bukkit.Location loc = event1.getRightClicked().getLocation();		
		if (event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + "," + "dhd_bottom")|| event1.getRightClicked().getCustomName().equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + "," + "dhd_up")) {
			if (event1.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
				this.dhd = new dhd((Player) event1.getPlayer(), event1.getRightClicked().getLocation(),plugin);
				event1.setCancelled(true);
			}
		}
	}

	

}

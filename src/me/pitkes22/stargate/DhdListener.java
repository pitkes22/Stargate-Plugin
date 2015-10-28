
package me.pitkes22.stargate;

import java.util.ArrayList;
import java.util.List;

import javax.tools.DocumentationTool.Location;

import java.util.Arrays;

import org.bukkit.Bukkit;
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

	public Call call;
	public dhd dhds;

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
	private void onPlayerInteract(PlayerInteractEvent event) {

		org.bukkit.Location loc = event.getClickedBlock().getLocation();
		loc.getWorld().getNearbyEntities(loc, 1, 1, 1);

		for (Entity e : loc.getWorld().getNearbyEntities(loc, 1, 1, 1)) {

			if (e.getCustomName()
					.equals(loc.getBlockX() + "," + (loc.getBlockY() - 1) + "," + loc.getBlockZ() + "," + "dhd_up")) {
				dhds = new dhd((Player) event.getPlayer(), event.getClickedBlock().getLocation());
				event.setCancelled(true);
			}
		}

	}

	@EventHandler
	private void onBlockPlace(BlockPlaceEvent event) {
		if (event.getBlock().getType().equals(Material.MONSTER_EGGS)) {
			((Player) event.getPlayer()).sendMessage("Brana bola polozena !");

			DhdFactory.createDhd(event.getBlock(), event.getPlayer());

		}

	}

	@EventHandler
	private void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent event1) {

		org.bukkit.Location loc = event1.getRightClicked().getLocation();
		Bukkit.broadcastMessage("" + loc);
		Bukkit.broadcastMessage("" + event1.getRightClicked().getCustomName());
		if (event1.getRightClicked().getCustomName()
				.equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + "," + "dhd_bottom")
				|| event1.getRightClicked().getCustomName()
						.equals(loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + "," + "dhd_up")) {

			if (event1.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
				((Player) event1.getPlayer()).sendMessage("Tukol si na armorstand");
				dhds = new dhd((Player) event1.getPlayer(), event1.getRightClicked().getLocation());
				event1.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onClick(InventoryClickEvent event2) {

		if (event2.getInventory().getTitle().equalsIgnoreCase("DHD")) {

			List<String> lore = event2.getCurrentItem().getItemMeta().getLore();

			if (lore != null) {

				((Player) event2.getWhoClicked())
						.sendMessage("" + event2.getInventory().getItem(event2.getSlot()).getType());
				((Player) event2.getWhoClicked()).sendMessage("" + new ItemStack(Material.RECORD_3));

				if (event2.getInventory().getItem(event2.getSlot())
						.getType() != (new ItemStack(Material.RECORD_3).getType())) {
					((Player) event2.getWhoClicked()).sendMessage("je to dnu");
					event2.getWhoClicked().sendMessage(lore.get(1).substring(lore.get(1).length() - 1));
					// Symbol symbol = null;
					// symbol.getByCharacter(symbolChar.charAt(0));
					event2.getInventory().setItem(event2.getSlot(),
							new ItemStack(dhd.createItem(new ItemStack(Material.RECORD_3),
									event2.getInventory().getItem(event2.getSlot()).getItemMeta().getDisplayName(),
									new String[] { "§8"
											+ event2.getInventory().getItem(event2.getSlot()).getItemMeta().getLore()
											+ "§8" })));

					((Player) event2.getWhoClicked()).playSound(event2.getWhoClicked().getLocation(), "DHDGlyphHit1",
							1F, 1F);

					dhds.address.add(Symbol.getByCharacter(lore.get(1).substring(lore.get(1).length() - 1).charAt(0)));
					event2.setCancelled(true);
				} else {

					event2.setCancelled(true);
				}

				event2.setCancelled(true);

			}
			if (event2.getCurrentItem().getItemMeta().getDisplayName() == "§4§lSTART") {

				Bukkit.broadcastMessage("Klikol si na start");
				for (Entity e : event2.getWhoClicked().getNearbyEntities(16, 16, 16)) {
					Bukkit.broadcastMessage("Zacina to prechadzat entity");
					Bukkit.broadcastMessage("Hladane" + e.getCustomName());
					Bukkit.broadcastMessage(
							"Najdene" + e.getLocation().getBlockX() + "," + (e.getLocation().getBlockY() - 2) + ","
									+ e.getLocation().getBlockZ() + "," + "stargate_base");
					if (e.getCustomName().equals(e.getLocation().getBlockX() + "," + (e.getLocation().getBlockY() - 2)
							+ "," + e.getLocation().getBlockZ() + "," + "stargate_base")) {
						Bukkit.broadcastMessage("Našla sa brana");
						org.bukkit.Location loc = e.getLocation().clone().add(0, -2, 0);
						Stargate stargate = new Stargate(loc);
						if (stargate.getEventHorizon().getItemInHand().getType() == Material.AIR
								&& stargate.isAnimating() == false) {
							if (stargate.getChevron9().getItemInHand().getType() == Material.RECORD_6) {
								Bukkit.getScheduler().cancelTask(call.id);
								animation.reset(stargate, plugin, (Player) event2.getWhoClicked());
								event2.getWhoClicked().closeInventory();
								dhds.getAddress().clear();
								event2.setCancelled(true);

							} else {
								Bukkit.getScheduler().cancelTask(animation.getResetCheduler());
								stargate.setReseting(false);
								call = new Call(plugin, stargate, (ArrayList<Symbol>) dhds.address.clone(),
										(Player) event2.getWhoClicked());
								
								event2.getWhoClicked().closeInventory();
								dhds.getAddress().clear();
								event2.setCancelled(true);
							}

						} else {
							Bukkit.getScheduler().cancelTask(call.id);
							animation.reset(stargate, plugin, (Player) event2.getWhoClicked());
							event2.getWhoClicked().closeInventory();
							dhds.getAddress().clear();
							event2.setCancelled(true);
						}
						event2.getWhoClicked().closeInventory();
						dhds.getAddress().clear();
						event2.setCancelled(true);
						Bukkit.broadcastMessage("Breakne sa to");
						break;
					}

				}

				Bukkit.broadcastMessage("Adrasunka je" + dhds.address.get(0));

				// Call.call(plugin, new Stargate(new Location(((Player)
				// sender).getWorld(), 200, 90, 200,((Player)
				// sender).getLocation().getYaw(),((Player)
				// sender).getLocation().getPitch())), addresses,(Player)
				// sender);
				event2.setCancelled(true);
			} else {
				event2.setCancelled(true);
			}

		}
		// ch = -1;
	}

}

package me.pitkes22.stargate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class dhd implements Listener {
	private Inventory inv;
	private Location loc;
	private static ArrayList<Symbol> tempAddress = new ArrayList<Symbol>();
	private Stargate stargate;
	private Call call;
	//public static ArrayList<Symbol> address = new ArrayList<Symbol>();
	
	private Plugin plugin;
	

	public static ItemStack createItem(ItemStack item, String name, String[] lore) {
	    
		ItemMeta im = item.getItemMeta();
	    im.setDisplayName(name);
	    if(lore.length != 0) {
	    	
	    im.setLore(Arrays.asList(lore));
	    }
	    item.setItemMeta(im);
	    return item;
	}
	
	public dhd(Player player, Location loc,Plugin plugin) {
		this.loc = loc;
		
		if(player instanceof Player) {
			
			this.plugin = plugin;
			
			this.inv = Bukkit.getServer().createInventory(null, 6*9, "DHD");
			
			
			this.inv.setItem(11,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)1), "§0. ", new String[] {}));
			this.inv.setItem(15,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)2), "§0. ", new String[] {}));
			this.inv.setItem(38,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)4), "§0. ", new String[] {}));
			this.inv.setItem(42,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)5), "§0. ", new String[] {}));
			this.inv.setItem(12,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(13,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(14,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(21,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(22,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(23,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(30,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(31,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			this.inv.setItem(32,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			
			this.inv.setItem(9,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Earth", new String[] { "§8Glyph: §71", "§8character: §7A"}));
			this.inv.setItem(40,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Crater", new String[] { "§8Glyph: §72", "§8character: §7B"}));
			this.inv.setItem(48,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Virgo", new String[] { "§8Glyph: §73", "§8character: §7C"}));
			this.inv.setItem(47,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Boötes", new String[] { "§8Glyph: §74", "§8character: §7D"}));
			this.inv.setItem(27,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Centaurus", new String[] { "§8Glyph: §75", "§8character: §7E"}));
			this.inv.setItem(17,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Libra", new String[] { "§8Glyph: §76", "§8character: §7F"}));
			this.inv.setItem(7,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Serpens Caput", new String[] { "§8Glyph: §77", "§8character: §7G"}));
			this.inv.setItem(29,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Norma", new String[] { "§8Glyph: §78", "§8character: §7H"}));
			this.inv.setItem(36,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Scorpius", new String[] { "§8Glyph: §79", "§8character: §7I"}));
			this.inv.setItem(5,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Corona Australis", new String[] { "§8Glyph: §710", "§8character: §7J"}));
			this.inv.setItem(50,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Scutum", new String[] { "§8Glyph: §711", "§8character: §7K"}));
			this.inv.setItem(52,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Sagittarius", new String[] { "§8Glyph: §712", "§8character: §7L"}));
			this.inv.setItem(41,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Aquila", new String[] { "§8Glyph: §713", "§8character: §7M"}));
			this.inv.setItem(33,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Microscopium", new String[] { "§8Glyph: §714", "§8character: §7N"}));
			this.inv.setItem(20,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Capricornus", new String[] { "§8Glyph: §715", "§8character: §7O"}));
			this.inv.setItem(3,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Piscis Austrinus", new String[] { "§8Glyph: §716", "§8character: §7P"}));
			this.inv.setItem(43,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Equuleus", new String[] { "§8Glyph: §717", "§8character: §7R"}));
			this.inv.setItem(34,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Aquarius", new String[] { "§8Glyph: §718", "§8character: §7S"}));
			this.inv.setItem(0,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Pegasus", new String[] { "§8Glyph: §719", "§8character: §7T"}));
			this.inv.setItem(46,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Sculptor", new String[] { "§8Glyph: §720", "§8character: §7U"}));
			this.inv.setItem(49,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Pisces", new String[] { "§8Glyph: §721", "§8character: §7V"}));
			this.inv.setItem(1,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Andromeda", new String[] { "§8Glyph: §722", "§8character: §7W"}));
			this.inv.setItem(25,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Triangulum", new String[] { "§8Glyph: §723", "§8character: §7X"}));
			this.inv.setItem(8,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Aries", new String[] { "§8Glyph: §724", "§8character: §7Y"}));
			this.inv.setItem(39,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Perseus", new String[] { "§8Glyph: §725", "§8character: §7Z"}));
			this.inv.setItem(24,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Cetus", new String[] { "§8Glyph: §726", "§8character: §71"}));
			this.inv.setItem(28,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Taurus", new String[] { "§8Glyph: §727", "§8character: §72"}));
			this.inv.setItem(4,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Auriga", new String[] { "§8Glyph: §728", "§8character: §73"}));
			this.inv.setItem(26,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Eridanus", new String[] { "§8Glyph: §729", "§8character: §74"}));
			this.inv.setItem(2,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Orion", new String[] { "§8Glyph: §730", "§8character: §75"}));
			this.inv.setItem(19,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Canis Minor", new String[] { "§8Glyph: §731", "§8character: §76"}));
			this.inv.setItem(18,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Monoceros", new String[] { "§8Glyph: §732", "§8character: §77"}));
			this.inv.setItem(6,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Gemini", new String[] { "§8Glyph: §733", "§8character: §78"}));
			this.inv.setItem(44,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Hydra", new String[] { "§8Glyph: §734", "§8character: §79"}));
			this.inv.setItem(10,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Lynx", new String[] { "§8Glyph: §735", "§8character: §7*"}));
			this.inv.setItem(37,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Cancer", new String[] { "§8Glyph: §736", "§8character: §7#"}));
			this.inv.setItem(51,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Sextans", new String[] { "§8Glyph: §737", "§8character: §7-"}));
			this.inv.setItem(35,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Leo Minor", new String[] { "§8Glyph: §738", "§8character: §7+"}));
			this.inv.setItem(16,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Leo", new String[] { "§8Glyph: §739", "§8character: §7/"}));
			
			Bukkit.broadcastMessage("getinvPred: "+this.inv);
			
			
			//Bukkit.getServer().getPluginManager().UnregisterEvents(new dhd(plugin), this);
			Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
			((Player) player).openInventory(inv);
			
			
			
		}
		
		
		
	}
		
	@EventHandler
	public void onClick(InventoryClickEvent event2) {//Spracuvava klikanie hraca v DHD inventari
		
		Bukkit.broadcastMessage("clickedINV"+event2.getClickedInventory());
		Bukkit.broadcastMessage("INV"+event2.getInventory());
		Bukkit.broadcastMessage("getinvd"+this.getInv());
		Bukkit.broadcastMessage("getinv"+inv);
		if (event2.getClickedInventory().equals(this.inv)) {
			if (event2.getInventory().getTitle().equalsIgnoreCase("DHD")) {
	
				List<String> lore = event2.getCurrentItem().getItemMeta().getLore();
	
				if (lore != null) {
	
					if (event2.getInventory().getItem(event2.getSlot()).getType() != (new ItemStack(Material.RECORD_3).getType())) {									
						event2.getInventory().setItem(event2.getSlot(),new ItemStack(dhd.createItem(new ItemStack(Material.RECORD_3),event2.getInventory().getItem(event2.getSlot()).getItemMeta().getDisplayName(),new String[] { "§8"+ event2.getInventory().getItem(event2.getSlot()).getItemMeta().getLore()+ "§8" })));
						((Player) event2.getWhoClicked()).playSound(event2.getWhoClicked().getLocation(), "DHDGlyphHit1",1F, 1F);
						tempAddress.add(Symbol.getByCharacter(lore.get(1).substring(lore.get(1).length() - 1).charAt(0)));
						event2.setCancelled(true);
					} 
					event2.setCancelled(true);
				}
				
				
				if (event2.getCurrentItem().getItemMeta().getDisplayName() == "§4§lSTART") {
	
					for (Entity e : event2.getWhoClicked().getNearbyEntities(16, 16, 16)) {
						if (e.getCustomName().equals(e.getLocation().getBlockX() + "," + (e.getLocation().getBlockY() - 2)
								+ "," + e.getLocation().getBlockZ() + "," + "stargate_base")) {
							org.bukkit.Location loc = e.getLocation().clone().add(0, -2, 0);
							stargate = new Stargate(loc);
							
							if (stargate.getEventHorizon().getItemInHand().getType() == Material.AIR && stargate.isAnimating() == false) {//Overi ci je brana vypnuta(Nema event horizont) a ze sa neanimuje
									
									if (stargate.getChevron9().getItemInHand().getType() == Material.RECORD_6) { //Overi ci chevron 1 je zapnuty a ak ano zrusi vytacanie
										Bukkit.getScheduler().cancelTask(call.getId());
										animation.reset(stargate, plugin, (Player) event2.getWhoClicked());
										event2.getWhoClicked().closeInventory();
										tempAddress.clear();
										event2.setCancelled(true);
		
									} else {//Brana vytoci adresu lebo vsetk oje OK
										Bukkit.getScheduler().cancelTask(stargate.getResetCheduler());
										stargate.setReseting(false);
										//adresa = new StargateAddress(tempAddress, event2.getWhoClicked().getLocation());
										
										if (tempAddress.size() > 6) {
										call = new Call(plugin, stargate, new StargateAddress(tempAddress, event2.getWhoClicked().getLocation()),(Player) event2.getWhoClicked());
										}else {
											animation.reset(stargate, plugin, (Player) event2.getWhoClicked());
											
										}
										
										event2.getWhoClicked().closeInventory();
										tempAddress.clear();
										event2.setCancelled(true);
									}
	
							} else { //Zrusi vytacanie lebo sa brana animuje alebo je zapnuta
								Bukkit.getScheduler().cancelTask(call.getId());
								animation.reset(stargate, plugin, (Player) event2.getWhoClicked());
								event2.getWhoClicked().closeInventory();
								tempAddress.clear();
								event2.setCancelled(true);
							}
							
							event2.getWhoClicked().closeInventory();//Vsetko zrusi preto ze sa to dostalo tam kam nemalo
							tempAddress.clear();
							event2.setCancelled(true);
							break;
						}
	
					}				
					event2.setCancelled(true);
				} else {
					event2.setCancelled(true);
				}
	
			}
		}
		
	}
	
	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	
	

	/*public static ArrayList<Symbol> getAddress() {
		return address;
	}

	public static void setAddress(ArrayList<Symbol> address) {
		dhd.address = address;
	}*/

}

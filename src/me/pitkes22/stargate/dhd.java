package me.pitkes22.stargate;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class dhd  {
	
	public static ItemStack createItem(ItemStack item, String name, String[] lore) {
	    
		ItemMeta im = item.getItemMeta();
	    im.setDisplayName(name);
	    if(lore.length != 0) {
	    im.setLore(Arrays.asList(lore));
	    }
	    item.setItemMeta(im);
	    return item;
	}
	
	public static boolean openInventory(Player player) {
		
		if(player instanceof Player) {
			
			Inventory inv = Bukkit.getServer().createInventory(null, 6*9, "DHD");
			
			
			inv.setItem(11,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)1), "§0. ", new String[] {}));
			inv.setItem(15,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)2), "§0. ", new String[] {}));
			inv.setItem(38,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)4), "§0. ", new String[] {}));
			inv.setItem(42,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)5), "§0. ", new String[] {}));
			inv.setItem(12,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(13,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(14,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(21,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(22,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(23,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(30,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(31,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			inv.setItem(32,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "§4§lSTART", new String[] {}));
			
			inv.setItem(9,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Earth", new String[] { "§8Glyph: §71", "§8character: §7A"}));
			inv.setItem(40,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Crater", new String[] { "§8Glyph: §72", "§8character: §7B"}));
			inv.setItem(48,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Virgo", new String[] { "§8Glyph: §73", "§8character: §7C"}));
			inv.setItem(47,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Boötes", new String[] { "§8Glyph: §74", "§8character: §7D"}));
			inv.setItem(27,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Centaurus", new String[] { "§8Glyph: §75", "§8character: §7E"}));
			inv.setItem(17,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Libra", new String[] { "§8Glyph: §76", "§8character: §7F"}));
			inv.setItem(7,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Serpens Caput", new String[] { "§8Glyph: §77", "§8character: §7G"}));
			inv.setItem(29,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Norma", new String[] { "§8Glyph: §78", "§8character: §7H"}));
			inv.setItem(36,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Scorpius", new String[] { "§8Glyph: §79", "§8character: §7I"}));
			inv.setItem(5,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Corona Australis", new String[] { "§8Glyph: §710", "§8character: §7J"}));
			inv.setItem(50,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Scutum", new String[] { "§8Glyph: §711", "§8character: §7K"}));
			inv.setItem(52,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Sagittarius", new String[] { "§8Glyph: §712", "§8character: §7L"}));
			inv.setItem(41,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Aquila", new String[] { "§8Glyph: §713", "§8character: §7M"}));
			inv.setItem(33,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Microscopium", new String[] { "§8Glyph: §714", "§8character: §7N"}));
			inv.setItem(20,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Capricornus", new String[] { "§8Glyph: §715", "§8character: §7O"}));
			inv.setItem(3,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Piscis Austrinus", new String[] { "§8Glyph: §716", "§8character: §7P"}));
			inv.setItem(43,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Equuleus", new String[] { "§8Glyph: §717", "§8character: §7R"}));
			inv.setItem(34,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Aquarius", new String[] { "§8Glyph: §718", "§8character: §7S"}));
			inv.setItem(0,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Pegasus", new String[] { "§8Glyph: §719", "§8character: §7T"}));
			inv.setItem(46,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Sculptor", new String[] { "§8Glyph: §720", "§8character: §7U"}));
			inv.setItem(49,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Pisces", new String[] { "§8Glyph: §721", "§8character: §7V"}));
			inv.setItem(1,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Andromeda", new String[] { "§8Glyph: §722", "§8character: §7W"}));
			inv.setItem(25,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Triangulum", new String[] { "§8Glyph: §723", "§8character: §7X"}));
			inv.setItem(8,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Aries", new String[] { "§8Glyph: §724", "§8character: §7Y"}));
			inv.setItem(39,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Perseus", new String[] { "§8Glyph: §725", "§8character: §7Z"}));
			inv.setItem(24,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Cetus", new String[] { "§8Glyph: §726", "§8character: §71"}));
			inv.setItem(28,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Taurus", new String[] { "§8Glyph: §727", "§8character: §72"}));
			inv.setItem(4,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Auriga", new String[] { "§8Glyph: §728", "§8character: §73"}));
			inv.setItem(26,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Eridanus", new String[] { "§8Glyph: §729", "§8character: §74"}));
			inv.setItem(2,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Orion", new String[] { "§8Glyph: §730", "§8character: §75"}));
			inv.setItem(19,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Canis Minor", new String[] { "§8Glyph: §731", "§8character: §76"}));
			inv.setItem(18,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Monoceros", new String[] { "§8Glyph: §732", "§8character: §77"}));
			inv.setItem(6,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Gemini", new String[] { "§8Glyph: §733", "§8character: §78"}));
			inv.setItem(44,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Hydra", new String[] { "§8Glyph: §734", "§8character: §79"}));
			inv.setItem(10,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Lynx", new String[] { "§8Glyph: §735", "§8character: §7*"}));
			inv.setItem(37,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Cancer", new String[] { "§8Glyph: §736", "§8character: §7#"}));
			inv.setItem(51,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Sextans", new String[] { "§8Glyph: §737", "§8character: §7-"}));
			inv.setItem(35,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Leo Minor", new String[] { "§8Glyph: §738", "§8character: §7+"}));
			inv.setItem(16,createItem(new ItemStack(Material.MONSTER_EGGS,1, (short)3), "Leo", new String[] { "§8Glyph: §739", "§8character: §7/"}));
			
			
			
			
	
			
			
			((Player) player).openInventory(inv);
			
		}
		return false;
	}

}

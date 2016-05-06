package me.pitkes22.stargate;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;

public class StargateAddress{
	
	private ArrayList<Symbol> address = new ArrayList<Symbol>();
	private Location location;
	private int[] symbolValues;
	
	
	
	
	public StargateAddress(ArrayList<Symbol> address, Location loc) {
		this.address = address;
		this.location = loc;
		
		Bukkit.broadcastMessage(ChatColor.AQUA + "Pred FOR");
		symbolValues = new int[address.size()];  
		for  (int i = 0; i < address.size() ; i++) {
			Bukkit.broadcastMessage(ChatColor.AQUA + "Dnu v FOR");
			Bukkit.broadcastMessage(ChatColor.AQUA + "Hodnota address.get" + address.get(i).getId());
			symbolValues[i] = (address.get(i).getId()) - 1;
			Bukkit.broadcastMessage(ChatColor.AQUA + "Hodnota symbolvalue" + symbolValues[i]);
			
		}
		
		for  (int i = 0; i < address.size() &&  i < 7; i++) {
			for  (int in = i+1;  in < address.size(); in++) {
				if (symbolValues[in] > symbolValues[i]) {
					symbolValues[in] = symbolValues[in]-1;
				}
			}
		}
		
		double x7;
		double y7;
		if (symbolValues[6] > 8) {
			x7 = (161.248624011*symbolValues[6])-1289.98899209;
			y7 = (351.0001638);
		}
		else if (symbolValues[6] > 16) {
			x7 = (161.248624011*symbolValues[6])-2*1289.98899209;
			y7 = (2*351.0001638);
		}
		else if (symbolValues[6] > 24) {
			x7 = (161.248624011*symbolValues[6])-3*1289.98899209;
			y7 = (3*351.0001638);
		}
		else {
			x7 = (161.248624011*symbolValues[6]);
			y7 = 0;
		}
		
		/*Bukkit.broadcastMessage(ChatColor.AQUA + "Toto je vypocet X: + 29999984-((" + symbolValues[0] +" *1578946.52632)+(" + symbolValues[2] +"*43859.6257311)+(" + symbolValues[4] +"*1289.98899209)+( "+ x7 +"))");
		Bukkit.broadcastMessage(ChatColor.AQUA + "Toto je vypocet Y: + 29999984-((" + symbolValues[1] +" *1621620.75676)+(" + symbolValues[3] +"*46332.0216217)+(" + symbolValues[5] +"*1404.0006552)+( "+ y7 +"))");*/
		double x = 29999984-((symbolValues[0]*1578946.52632)+(symbolValues[2]*43859.6257311)+(symbolValues[4]*1289.98899209)+(x7));
		double y = 29999984-((symbolValues[1]*1621620.75676)+(symbolValues[3]*46332.0216217)+(symbolValues[5]*1404.0006552)+(y7));
		this.location = new Location(loc.getWorld(), x, 0, y);
		Bukkit.broadcastMessage(ChatColor.AQUA + "Toto je adresa brany: X=" + location.getX()+" Z="+ location.getZ());
		
	}
	
	public StargateAddress(Location loc) {
		this.location = loc;
	}
	
	public Location getLocation() {
		return location;
	}

	public ArrayList<Symbol> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Symbol> address) {
		this.address = address;
	}

	public int[] getSymbolValues() {
		return symbolValues;
	}

	public void setSymbolValues(int[] symbolValues) {
		this.symbolValues = symbolValues;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	



	
}

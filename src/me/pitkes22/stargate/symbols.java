package me.pitkes22.stargate;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum symbols {
	EARTH("Earth",1,'a'),
	CRATER("Crater",2,'b'),
	VIRGO("Virgo",3,'c'),
	BOOTES("Boötes",4,'d'),
	CENTAURUS("Centaurus",5,'e'),
	LIBRA("Libra",6,'f'),
	SERPENS_CAPUT("Serpens Caput",7,'g'),
	NORMA("Norma",8,'h'),
	SCORPIUS("Scorpius",9,'i'),
	CORONA_AUSRALIS("Corona Australis",10,'j'),
	SCUTUM("Scutum",11,'k'),
	SAGITTARIUS("Sagittarius",12,'l'),
	AQUILA("Aquila",13,'m'),
	MICROSCOPIUM("Microscopium",14,'n'),
	CAPRICORNUS("Capricornus",15,'o'),
	PISCIS_AUSTRINUS("Piscis Austrinus",16,'p'),
	EQUULEUS("Equuleus",17,'r'),
	AQUARIUS("Aquarius",18,'s'),
	PEGASUS("Pegasus",19,'t'),
	SCULPTOR("Sculptor",20,'u'),
	PISCES("Pisces",21,'v'),
	ANDROMEDA("Andromeda",22,'w'),
	TRIANGULUM("Triangulum",23,'x'),
	ARIES("Aries",24,'y'),
	PERSEUS("Perseus",25,'z'),
	CETUS("Cetus",26,'1'),
	TAURUS("Taurus",27,'2'),
	AURIGA("Auriga",28,'3'),
	ERIDANUS("Eridanus",29,'4'),
	ORION("Orion",30,'5'),
	CANIS_MINOR("Canis Minor",31,'6'),
	MONOCEROS("Monoceros",32,'7'),
	GEMINI("Gemini",33,'8'),
	HYDRA("Hydra",34,'9'),
	LYNX("Lynx",35,'*'),
	CANCER("Cancer",36,'#'),
	SEXTANS("Sextans",37,'-'),
	LEO_MINOR("Leo Minor",38,'+'),
	LEO("Leo",39,'/');
	
	private final String name;
	private final int id;
	private final char character;
	
	
	symbols(String name, int id, char character) {
		this.name = name;
		this.id = id;
		this.character = character;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public char getCharacter() {
		return character;
	}
	

}

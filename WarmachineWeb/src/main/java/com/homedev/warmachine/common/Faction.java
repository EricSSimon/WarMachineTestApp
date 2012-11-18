package com.homedev.warmachine.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class representing the available factions.
 */
public enum Faction {
	
	CIRCLE_OF_OBEROS("Circle of Oberos"),
	CRYX("Cryx"),
	CYGNAR("Cygnar"),
	LEGION_OF_EVERBLIGHT("Legion of Everblight"),
	KHADOR("Khador"),
	MERCENARIES("Mercenaries"),
	MINIONS("Minions"),
	PROTECTORATE_OF_MENOTH("Protectorate of Menoth"),
	RETRIBUTION_OF_SYCATH("Retribution of Sycath"),
	SKORNE("Skorne"),
	TROLLKIN("Trollkin");
	
	private String description;
	private static List<Faction> allValues;
	private static Map<Integer, Faction> ordinalMap;
	
	static {
		allValues = new ArrayList<Faction>();
		ordinalMap = new HashMap<Integer, Faction>();
		for(Faction faction : values()) {
			allValues.add(faction);
			ordinalMap.put(faction.ordinal(), faction);
		}
	}
	
	/**
	 * Constructor.
	 */
	private Faction(String pDescription) {
		description = pDescription;
	}
	
	/**
	 * @return the description
	 */
	public static List<Faction> getAllValues() {
		return allValues;
	}
	
	/**
	 * Get a faction from it's ordinal position.
	 * @param ordinal - int
	 * @return Faction
	 */
	public static Faction getFactionFromOrdinal(int ordinal) {
		return ordinalMap.get(ordinal);
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param pDescription the description to set
	 */
	public void setDescription(String pDescription) {
		description = pDescription;
	}
}

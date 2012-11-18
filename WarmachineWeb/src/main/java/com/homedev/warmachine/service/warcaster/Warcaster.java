package com.homedev.warmachine.service.warcaster;

import com.homedev.warmachine.common.Faction;

/**
 * Class representing a warcaster.
 */
public interface Warcaster {
	
	/**
	 * @return the name
	 */
	String getName();
	
	/**
	 * @return the faction
	 */
	 Faction getFaction();
}

package com.homedev.warmachine.service;

import java.util.List;

import com.homedev.warmachine.common.Faction;

/**
 * Class containing services for an army.
 */
public interface ArmyService {
	
	/**
	 * Create an army of the requested type.
	 * @parm army -  the army to create;
	 */
	void createArmy(Army army);
	
	/**
	 * Get the warcasters for a faction.
	 * @parm faction -  {@link Faction};
	 * @return {@link List<Warcaster}
	 */
	List<Warcaster> getWarcastersForFaction(Faction faction);

}

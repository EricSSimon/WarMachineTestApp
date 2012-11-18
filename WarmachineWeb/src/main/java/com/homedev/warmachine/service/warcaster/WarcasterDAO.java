package com.homedev.warmachine.service.warcaster;

import java.util.List;

import com.homedev.warmachine.common.Faction;

/**
 * Class for getting data accesses on a warcaster.
 */
interface WarcasterDAO {
	
	/**
	 * Get the warcasters for a faction.
	 * @parm faction -  {@link Faction};
	 * @return {@link List<Warcaster}
	 */
	List<Warcaster> getWarcastersForFaction(Faction faction);
}

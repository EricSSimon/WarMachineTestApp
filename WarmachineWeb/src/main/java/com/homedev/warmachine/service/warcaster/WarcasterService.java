package com.homedev.warmachine.service.warcaster;

import java.util.List;

import com.homedev.warmachine.common.Faction;

public interface WarcasterService {

	/**
	 * Get the warcasters for a faction.
	 * @parm faction -  {@link Faction};
	 * @return {@link List<Warcaster}
	 */
	List<Warcaster> getWarcastersForFaction(Faction faction);
	
}

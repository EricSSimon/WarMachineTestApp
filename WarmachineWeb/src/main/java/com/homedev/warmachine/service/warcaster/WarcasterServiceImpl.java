package com.homedev.warmachine.service.warcaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homedev.warmachine.common.Faction;

@Service
class WarcasterServiceImpl implements WarcasterService {
	
	@Autowired
	private WarcasterDAO warcasterDAO;
	
	@Override
	@Transactional
	public List<Warcaster> getWarcastersForFaction(Faction faction) {
		return warcasterDAO.getWarcastersForFaction(faction);
	}

}

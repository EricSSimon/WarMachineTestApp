package com.homedev.warmachine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.homedev.warmachine.common.Faction;

class ArmyServiceImpl implements ArmyService {
	
	@Autowired
	private ArmyDAO armyDAO;

	@Autowired
	private WarcasterDAO warcasterDAO;
	
	@Override
	@Transactional
	public void createArmy(Army pArmy) {
		//TODO need validation;
		armyDAO.persistArmy(pArmy);
	}
	
	@Override
	@Transactional
	public List<Warcaster> getWarcastersForFaction(Faction faction) {
		return warcasterDAO.getWarcastersForFaction(faction);
	}

	/**
	 * @param pArmyDAO the armyDAO to set
	 */
	public void setArmyDAO(ArmyDAO pArmyDAO) {
		armyDAO = pArmyDAO;
	}

	/**
	 * @param pWarcasterDAO the warcasterDAO to set
	 */
	public void setWarcasterDAO(WarcasterDAO pWarcasterDAO) {
		warcasterDAO = pWarcasterDAO;
	}
}

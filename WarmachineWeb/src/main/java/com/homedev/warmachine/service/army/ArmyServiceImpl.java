package com.homedev.warmachine.service.army;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class ArmyServiceImpl implements ArmyService {
	
	@Autowired
	private ArmyDAO armyDAO;
	
	@Override
	@Transactional
	public void createArmy(Army pArmy) {
		//TODO need validation;
		armyDAO.persistArmy(pArmy);
	}
	

	/**
	 * @param pArmyDAO the armyDAO to set
	 */
	public void setArmyDAO(ArmyDAO pArmyDAO) {
		armyDAO = pArmyDAO;
	}
}

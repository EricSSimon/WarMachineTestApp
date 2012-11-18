package com.homedev.warmachine.service;

/**
 * Class containing data accesses for an army.
 */
interface ArmyDAO {
	
	/**
	 * Persist the passed army;
	 */
	void persistArmy(Army army);

}

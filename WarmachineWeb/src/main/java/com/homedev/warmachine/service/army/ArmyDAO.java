package com.homedev.warmachine.service.army;

/**
 * Class containing data accesses for an army.
 */
interface ArmyDAO {
	
	/**
	 * Persist the passed army;
	 */
	void persistArmy(Army army);

}

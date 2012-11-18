package com.homedev.warmachine.service.army;


/**
 * Class containing services for an army.
 */
public interface ArmyService {
	
	/**
	 * Create an army of the requested type.
	 * @parm army -  the army to create;
	 */
	void createArmy(Army army);
}

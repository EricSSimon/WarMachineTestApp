package com.homedev.warmachine.service.army;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * Services for dealing with an army.
 */
@Repository
class ArmyHibernateDAO implements ArmyDAO {
	
    @PersistenceContext
    private EntityManager em;
    
    
	@Override
	public void persistArmy(Army army) {
		em.persist(army);
	}

	/**
	 * @param pEm the em to set
	 */
	public void setEm(EntityManager pEm) {
		em = pEm;
	}
}

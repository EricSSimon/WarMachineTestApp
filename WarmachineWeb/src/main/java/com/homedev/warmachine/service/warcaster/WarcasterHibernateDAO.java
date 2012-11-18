package com.homedev.warmachine.service.warcaster;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.homedev.warmachine.common.Faction;

/**
 * Class for getting data accesses on a warcaster.
 */
@Repository
class WarcasterHibernateDAO implements WarcasterDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Warcaster> getWarcastersForFaction(Faction faction) {
		final Query query = em.createNamedQuery("getAllWarcastersForFaction");
		query.setParameter("faction", faction);
		return (List<Warcaster>) query.getResultList();
	}

	/**
	 * @param pEm the em to set
	 */
	public void setEm(EntityManager pEm) {
		em = pEm;
	}
}

package com.homedev.warmachine.service.warcaster;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.homedev.warmachine.common.Faction;

/**
 * Class representing an army.
 */
@Entity
@Table(name="warcaster")
@NamedQuery(name="getAllWarcastersForFaction", query="Select war from WarcasterImpl war where war.faction = :faction")
public class WarcasterImpl implements Warcaster {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	@Enumerated(EnumType.ORDINAL) 
	private Faction faction;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param pId the id to set
	 */
	public void setId(int pId) {
		id = pId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param pName the name to set
	 */
	public void setName(String pName) {
		name = pName;
	}
	/**
	 * @return the faction
	 */
	public Faction getFaction() {
		return faction;
	}
	/**
	 * @param pFaction the faction to set
	 */
	public void setFaction(Faction pFaction) {
		faction = pFaction;
	}
}

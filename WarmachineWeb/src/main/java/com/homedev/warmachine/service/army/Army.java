package com.homedev.warmachine.service.army;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.homedev.warmachine.common.Faction;

@Entity
@Table(name="army")
@NamedQuery(name="getAllArmies", query="Select a from Army a")
/**
 * Class representing an army.
 */
public class Army {
	
	@Id
	@Column
	private int id;
	
	@Column
	@NotBlank
	private String name;
	
	@Column(name="factionId") 
	@Enumerated(EnumType.ORDINAL) 
	@NotNull
	private Faction faction;
	
	@Column
	@NotNull
	@Min(value=1)
	private int numberOfPoints;
	
	@Column
	@NotNull
	@Min(value=1)
	private int numberOfWarcasters;

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
	 * @return the numberOfPoints
	 */
	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	/**
	 * @param pNumberOfPoints the numberOfPoints to set
	 */
	public void setNumberOfPoints(int pNumberOfPoints) {
		numberOfPoints = pNumberOfPoints;
	}

	/**
	 * @return the numberOfWarcasters
	 */
	public int getNumberOfWarcasters() {
		return numberOfWarcasters;
	}

	/**
	 * @param pNumberOfWarcasters the numberOfWarcasters to set
	 */
	public void setNumberOfWarcasters(int pNumberOfWarcasters) {
		numberOfWarcasters = pNumberOfWarcasters;
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

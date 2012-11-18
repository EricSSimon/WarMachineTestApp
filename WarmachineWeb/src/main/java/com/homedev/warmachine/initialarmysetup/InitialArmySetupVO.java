package com.homedev.warmachine.initialarmysetup;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.homedev.warmachine.common.Faction;
import com.homedev.warmachine.common.ViewObject;
import com.homedev.warmachine.util.KeyValueTO;

/**
 * View object for selection factions.
 */
public class InitialArmySetupVO implements ViewObject {
	
	private List<KeyValueTO> factions;
	
	@NotNull(message="Please select a faction")
	private Integer selectedFaction;
	
	@NotNull(message="Number of points must be positive.")
	@Min(value=1, message="Number of points must be positive.")
	private Integer numberOfPoints;
	
	@NotNull(message="Number of warcasters must be positive.")
	@Min(value=1, message="Number of warcasters must be positive.")
	private Integer numberOfWarcasters = 1;
	
	@NotBlank(message="Please give the list a name.")
	private String listName;
	
	/**
	 * Default constructor.
	 */
	public InitialArmySetupVO() {
	}
	
	/**
	 * Builds the dropdowns for the view object.
	 */
	protected void buildDropdowns() {
		factions = new ArrayList<KeyValueTO>();
		factions.add(new KeyValueTO("", ""));
		for(Faction faction : Faction.getAllValues()) {
			factions.add(new KeyValueTO(String.valueOf(faction.ordinal()), faction.getDescription()));
		}
	}
	
	/**
	 * @return the factions
	 */
	public List<KeyValueTO> getFactions() {
		return factions;
	}

	/**
	 * @param pFactions the factions to set
	 */
	public void setFactions(List<KeyValueTO> pFactions) {
		factions = pFactions;
	}

	/**
	 * @return the selectedFaction
	 */
	public Integer getSelectedFaction() {
		return selectedFaction;
	}

	/**
	 * @param pSelectedFaction the selectedFaction to set
	 */
	public void setSelectedFaction(Integer pSelectedFaction) {
		selectedFaction = pSelectedFaction;
	}

	/**
	 * @return the numberOfPoints
	 */
	public Integer getNumberOfPoints() {
		return numberOfPoints;
	}

	/**
	 * @param pNumberOfPoints the numberOfPoints to set
	 */
	public void setNumberOfPoints(Integer pNumberOfPoints) {
		numberOfPoints = pNumberOfPoints;
	}

	/**
	 * @return the numberOfWarcasters
	 */
	public Integer getNumberOfWarcasters() {
		return numberOfWarcasters;
	}

	/**
	 * @param pNumberOfWarcasters the numberOfWarcasters to set
	 */
	public void setNumberOfWarcasters(Integer pNumberOfWarcasters) {
		numberOfWarcasters = pNumberOfWarcasters;
	}

	/**
	 * @return the listName
	 */
	public String getListName() {
		return listName;
	}

	/**
	 * @param pListName the listName to set
	 */
	public void setListName(String pListName) {
		listName = pListName;
	}
}

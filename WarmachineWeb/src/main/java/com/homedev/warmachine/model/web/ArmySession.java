package com.homedev.warmachine.model.web;

import java.util.ArrayList;
import java.util.List;

import com.homedev.warmachine.common.Faction;
import com.homedev.warmachine.initialarmysetup.InitialArmySetupVO;
import com.homedev.warmachine.selectwarcaster.SelectWarcasterVO;

/**
 * Class representing an army that is stored in session.
 */
public class ArmySession {
	
	private Faction selectedFaction;
	private int numberOfPoints;
	private int numberOfWarcasters;
	private String listName;
	private List<String> selectedWarcasters;
	
	public ArmySession() {
		selectedWarcasters = new ArrayList<String>();
	}
	
	public void fillSessionFromInitialArmySetupVO(InitialArmySetupVO vo) {
		selectedFaction = Faction.getFactionFromOrdinal(vo.getSelectedFaction());
		numberOfPoints = vo.getNumberOfPoints();
		numberOfWarcasters = vo.getNumberOfWarcasters();
		listName = vo.getListName();
	}
	
	public void fillSessionFromWarcasterSelectionVO(SelectWarcasterVO vo) {
		selectedWarcasters.clear();
		selectedWarcasters.addAll(vo.getSelectedWarcasters());
	}
	
	
	/**
	 * @return the selectedFaction
	 */
	public Faction getSelectedFaction() {
		return selectedFaction;
	}

	/**
	 * @return the numberOfPoints
	 */
	public Integer getNumberOfPoints() {
		return numberOfPoints;
	}

	/**
	 * @return the numberOfWarcasters
	 */
	public Integer getNumberOfWarcasters() {
		return numberOfWarcasters;
	}

	/**
	 * @return the listName
	 */
	public String getListName() {
		return listName;
	}

	/**
	 * @return the selectedWarcasters
	 */
	public List<String> getSelectedWarcasters() {
		return selectedWarcasters;
	}
}

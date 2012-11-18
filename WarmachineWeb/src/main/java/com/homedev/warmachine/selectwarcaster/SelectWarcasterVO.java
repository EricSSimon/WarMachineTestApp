package com.homedev.warmachine.selectwarcaster;

import java.util.ArrayList;
import java.util.List;

import com.homedev.warmachine.common.ViewObject;
import com.homedev.warmachine.service.Warcaster;
import com.homedev.warmachine.util.KeyValueTO;

public class SelectWarcasterVO implements ViewObject {
	
	private List<KeyValueTO> availableWarcasters;
	private List<String> selectedWarcasters;
	private int numberOfWarcasters;
	
	public SelectWarcasterVO() {
		availableWarcasters = new ArrayList<KeyValueTO>();
		selectedWarcasters = new ArrayList<String>();
	}
	
	public SelectWarcasterVO(int pNumberOfWarcasters) {
		this();
		numberOfWarcasters = pNumberOfWarcasters;
	}
	
	
	/**
	 * Builds the dropdowns for the view object.
	 */
	protected void buildDropdowns(List<Warcaster> warcasters) {
		availableWarcasters.clear();
		for(Warcaster warcaster : warcasters) {
			availableWarcasters.add(new KeyValueTO(warcaster.getName(), warcaster.getName()));
		}
	}
	
	/**
	 * @return the availableWarcasters
	 */
	public List<KeyValueTO> getAvailableWarcasters() {
		return availableWarcasters;
	}
	/**
	 * @param pAvailableWarcasters the availableWarcasters to set
	 */
	public void setAvailableWarcasters(List<KeyValueTO> pAvailableWarcasters) {
		availableWarcasters = pAvailableWarcasters;
	}
	/**
	 * @return the selectedWarcasters
	 */
	public List<String> getSelectedWarcasters() {
		return selectedWarcasters;
	}
	/**
	 * @param pSelectedWarcasters the selectedWarcasters to set
	 */
	public void setSelectedWarcasters(List<String> pSelectedWarcasters) {
		selectedWarcasters = pSelectedWarcasters;
	}

	/**
	 * @return the numberOfWarcasters
	 */
	public int getNumberOfWarcasters() {
		return numberOfWarcasters;
	}
}

package com.homedev.warmachine.startpage;

import java.util.ArrayList;
import java.util.List;

import com.homedev.warmachine.util.KeyValueTO;

/**
 * Actions available from the start page.
 */
public enum StartPageAction {
	
	NEW_LIST("Build a New List"),
	LOAD_LIST("Load an Existing List");
	
	private String description;
	
	/**
	 * Build the enums.
	 */
	private StartPageAction(String pDescription) {
		description = pDescription;
	}
	
	/**
	 * @return all values as KeyValueTO
	 */
	public static List<KeyValueTO> asKeyValueTOList() {
		List<KeyValueTO> keyValues = new ArrayList<KeyValueTO>();
		for (StartPageAction action : StartPageAction.values()) {
			keyValues.add(action.asKeyValueTO());
		}
		return keyValues;
	}
	
	/**
	 * @return the object as key value to
	 */
	public KeyValueTO asKeyValueTO() {
		return new KeyValueTO(name(), description);
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}

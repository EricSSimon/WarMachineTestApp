package com.homedev.warmachine.startpage;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.homedev.warmachine.common.ViewObject;
import com.homedev.warmachine.util.KeyValueTO;

/**
 * View object for the start page.
 */
public class StartPageVO implements ViewObject {
	
	private List<KeyValueTO> availableActions;
	
	@NotNull(message = "Please select an action")
	private StartPageAction selectedAction;
	
	/**
	 * Builds the dropdowns for the view object.
	 */
	public void buildDropdowns() {
		availableActions = StartPageAction.asKeyValueTOList();
	}

	/**
	 * @return the availableActions
	 */
	public List<KeyValueTO> getAvailableActions() {
		return availableActions;
	}

	/**
	 * @param pAvailableActions the availableActions to set
	 */
	public void setAvailableActions(List<KeyValueTO> pAvailableActions) {
		availableActions = pAvailableActions;
	}

	/**
	 * @return the selectedAction
	 */
	public StartPageAction getSelectedAction() {
		return selectedAction;
	}

	/**
	 * @param pSelectedAction the selectedAction to set
	 */
	public void setSelectedAction(StartPageAction pSelectedAction) {
		selectedAction = pSelectedAction;
	}
}

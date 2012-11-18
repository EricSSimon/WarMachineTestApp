package com.homedev.warmachine.initialarmysetup;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homedev.warmachine.common.ArmySetupController;
import com.homedev.warmachine.common.NavigationConstants;
import com.homedev.warmachine.common.ViewObject;

/**
 * Select which factions will be played.
 */
@Controller
@RequestMapping(value=NavigationConstants.INITIAL_ARMY_SETUP)
public class InitialArmySetupController extends ArmySetupController {

	/**
	 * Constructor.
	 */
	public InitialArmySetupController() {
		super("initialArmySetup", "initialArmySetupVO");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("initialArmySetupVO") InitialArmySetupVO initialArmySetupVO, BindingResult result) {
        
		if (hasErrors(initialArmySetupVO, result)) {
			buildDropdowns(initialArmySetupVO);
        	return pageJSP;
		}
		
		army.fillSessionFromInitialArmySetupVO(initialArmySetupVO);
		
		return "redirect:" + NavigationConstants.SELECT_WARCASTER;
	}
	
	/**
	 * Instantiate a view object.
	 */
	protected ViewObject instantiateViewObject() {
		return new InitialArmySetupVO();
	}
	
	/**
	 * Builds the dropdowns for the page.
	 */
	protected void buildDropdowns(ViewObject viewObject) {
		((InitialArmySetupVO) viewObject).buildDropdowns();
	}
}

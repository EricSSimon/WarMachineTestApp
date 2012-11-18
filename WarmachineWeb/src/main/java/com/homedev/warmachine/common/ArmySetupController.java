package com.homedev.warmachine.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.homedev.warmachine.model.web.ArmySession;


public abstract class ArmySetupController extends DefaultController {
	
	@Autowired
	protected ArmySession army;
	
	
	/**
	 * Constructor.
	 * @param pPageJSP - the jsp for this page.
	 * @param pViewObjectParameterName - the parameter to be used to hold the view object.
	 */
	public ArmySetupController(String pPageJSP, String pViewObjectParameterName) {
		super(pPageJSP, pViewObjectParameterName);
	}	
}

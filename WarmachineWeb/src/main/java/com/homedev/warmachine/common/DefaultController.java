package com.homedev.warmachine.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Functionality for controllers.
 */
public abstract class DefaultController {
	
	protected String pageJSP;
	protected String viewObjectParameterName;
	
	@Autowired
	private Validator validator;
	
	/**
	 * Constructor.
	 * @param pPageJSP - the jsp for this page.
	 * @param pViewObjectParameterName - the parameter to be used to hold the view object.
	 */
	public DefaultController(String pPageJSP, String pViewObjectParameterName) {
		pageJSP = pPageJSP;
		viewObjectParameterName = pViewObjectParameterName;
	}
	
	/**
	 * Get information to display on the page.
	 */
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView showForm() {
		ViewObject viewObject = instantiateViewObject();
		buildDropdowns(viewObject);
		return new ModelAndView(pageJSP, viewObjectParameterName, viewObject);
	}
	
	/**
	 * Determine if the view object is valid.
	 */
	protected boolean hasErrors(ViewObject viewObject, BindingResult result) {
	    validator.validate(viewObject, result);
	    return result.hasErrors();
	}
	
	/**
	 * Instantiate a view object.
	 */
	protected abstract ViewObject instantiateViewObject();
	
	/**
	 * Builds the dropdowns for the page.
	 */
	protected abstract void buildDropdowns(ViewObject viewObject);
	
	
	/**
	 * @param pValidator the validator to set
	 */
	public void setValidator(Validator pValidator) {
		validator = pValidator;
	}
}

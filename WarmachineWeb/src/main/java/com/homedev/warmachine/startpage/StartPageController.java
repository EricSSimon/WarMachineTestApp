package com.homedev.warmachine.startpage;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homedev.warmachine.common.DefaultController;
import com.homedev.warmachine.common.NavigationConstants;
import com.homedev.warmachine.common.ViewObject;

/**
 * Controller for the start page of the app.
 */
@Controller
@RequestMapping(value=NavigationConstants.START_PAGE)
public class StartPageController extends DefaultController {
	
	/**
	 * Constructor.
	 */
	public StartPageController() {
		super("startPage", "startPageVO");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@Transactional
	public String onSubmit(@ModelAttribute("startPageVO") StartPageVO startPageVO, BindingResult result) {
		
        if (hasErrors(startPageVO, result)) { 
        	buildDropdowns(startPageVO);
        	return pageJSP;
		}
		
		switch (startPageVO.getSelectedAction()) {
			case NEW_LIST:
				return "redirect:" + NavigationConstants.INITIAL_ARMY_SETUP;
			default: throw new IllegalArgumentException("The requested action isn't yet supported");
		}
	}
	
	/**
	 * Instantiate a view object.
	 */
	protected ViewObject instantiateViewObject() {
		return new StartPageVO();
	}
	
	/**
	 * Builds the dropdowns for the page.
	 */
	protected void buildDropdowns(ViewObject viewObject) {
		((StartPageVO) viewObject).buildDropdowns();
	}
	
	/**
	 * Builds the view object for the page.
	 */
	protected StartPageVO buildViewObjectForRead() {	
		return new StartPageVO();
	}
}

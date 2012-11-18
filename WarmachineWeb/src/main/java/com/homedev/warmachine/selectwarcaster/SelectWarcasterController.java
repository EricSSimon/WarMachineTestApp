package com.homedev.warmachine.selectwarcaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homedev.warmachine.common.ArmySetupController;
import com.homedev.warmachine.common.NavigationConstants;
import com.homedev.warmachine.common.ViewObject;
import com.homedev.warmachine.service.warcaster.Warcaster;
import com.homedev.warmachine.service.warcaster.WarcasterService;

/**
 * Select which warcasters will be used.
 */
@Controller
@RequestMapping(value=NavigationConstants.SELECT_WARCASTER)
public class SelectWarcasterController extends ArmySetupController {
	 
	@Autowired
	private WarcasterService warcasterService;
	
	/**
	 * Constructor.
	 */
	public SelectWarcasterController() {
		super("selectWarcaster", "selectWarcasterVO");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("selectWarcasterVO") SelectWarcasterVO selectWarcasterVO, BindingResult result) {
        
		//TODO do validation
		if (hasErrors(selectWarcasterVO, result)) {
			buildDropdowns(selectWarcasterVO);
        	return pageJSP;
		}
		
		army.fillSessionFromWarcasterSelectionVO(selectWarcasterVO);
		
		return "redirect:" + NavigationConstants.START_PAGE;
	}
	
	/**
	 * Instantiate a view object.
	 */
	protected ViewObject instantiateViewObject() {
		return new SelectWarcasterVO(army.getNumberOfWarcasters());
	}
	
	/**
	 * Builds the dropdowns for the page.
	 */
	protected void buildDropdowns(ViewObject viewObject) {
		List<Warcaster> warcasters = warcasterService.getWarcastersForFaction(army.getSelectedFaction());
		((SelectWarcasterVO) viewObject).buildDropdowns(warcasters);
	}
}

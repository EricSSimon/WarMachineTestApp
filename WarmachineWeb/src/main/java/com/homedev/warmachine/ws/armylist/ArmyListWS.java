package com.homedev.warmachine.ws.armylist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.homedev.warmachine.service.Army;

/**
 * Web services dealing with army lists.
 */
@Controller
@RequestMapping(value = "/armyService")
public class ArmyListWS {

	/**
	 * Constructor.
	 */
	public ArmyListWS() {
	}
	
	@ResponseBody
	@RequestMapping(value = "/getAllArmyLists", method=RequestMethod.GET, produces = "application/json")
	public List<Army> getArmyListAsJson() {
		List<Army> armies = new ArrayList<Army>();
		Army army = new Army();
		army.setName("what");
		armies.add(army);
		return armies;
	}
	

	@RequestMapping(value = "/getAllArmyLists", method=RequestMethod.GET, produces = "text/html")
	public ModelAndView getArmyListAsHtml() {
		List<Army> armies = new ArrayList<Army>();
		Army army = new Army();
		army.setName("what");
		armies.add(army);
		return new ModelAndView("allArmies", "armies", armies);
	}
}
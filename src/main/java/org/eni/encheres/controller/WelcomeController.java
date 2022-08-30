package org.eni.encheres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String connecterUtilisateur(ModelMap map) {
		map.addAttribute("user","X");
		System.out.println("coucou");
	
		return "welcome";		
	}
	
	
	

}

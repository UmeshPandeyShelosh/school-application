package com.school_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginSecurityController {
			
	/*
	 * @RequestMapping(value="/home",method = RequestMethod.GET) public String
	 * loginNamaste(HttpServletRequest req ){ return"welcome"; }
	 */
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String welcomNamaste(){
	    return"login";
	}
	
	
	  @RequestMapping(value="/welcome",method = RequestMethod.GET) 
	  public String showWelcome(Model model){ 
		  return"welcome"; 
	  }
	 
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginLogin(Model model) {
        return "welcome";
    }
	
	/*
	 * @RequestMapping(value="/logout",method = RequestMethod.POST) public String
	 * logoutValidate(HttpServletRequest req ){ return "welcome"; }
	 */
	

}

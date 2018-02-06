package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.in28minutes.jee.userValidation;


@Controller
public class LoginController {
	userValidation service = new userValidation();
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(){
		return "login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password, ModelMap model ){
		model.put("password", password);
		model.put("name", name);
		if(service.isVAlid(name, password)){
			return "welcome";			
		}
		model.put("error", "Wrong Username or Password");
		return "login";
	}	
}

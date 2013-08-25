package org.sunil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.sunil.model.User;
import org.sunil.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginPage(){
		User user = new User();
		ModelAndView modelAndView = new ModelAndView("user/login");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
